package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class ServerInterceptors {
    private ServerInterceptors() {
    }

    public static ServerServiceDefinition interceptForward(ServerServiceDefinition serviceDef, ServerInterceptor... interceptors) {
        return interceptForward(serviceDef, (List<? extends ServerInterceptor>) Arrays.asList(interceptors));
    }

    public static ServerServiceDefinition interceptForward(BindableService bindableService, ServerInterceptor... interceptors) {
        return interceptForward(bindableService.bindService(), (List<? extends ServerInterceptor>) Arrays.asList(interceptors));
    }

    public static ServerServiceDefinition interceptForward(ServerServiceDefinition serviceDef, List<? extends ServerInterceptor> interceptors) {
        List<? extends ServerInterceptor> copy = new ArrayList<>(interceptors);
        Collections.reverse(copy);
        return intercept(serviceDef, copy);
    }

    public static ServerServiceDefinition interceptForward(BindableService bindableService, List<? extends ServerInterceptor> interceptors) {
        return interceptForward(bindableService.bindService(), interceptors);
    }

    public static ServerServiceDefinition intercept(ServerServiceDefinition serviceDef, ServerInterceptor... interceptors) {
        return intercept(serviceDef, (List<? extends ServerInterceptor>) Arrays.asList(interceptors));
    }

    public static ServerServiceDefinition intercept(BindableService bindableService, ServerInterceptor... interceptors) {
        Preconditions.checkNotNull(bindableService, "bindableService");
        return intercept(bindableService.bindService(), (List<? extends ServerInterceptor>) Arrays.asList(interceptors));
    }

    public static ServerServiceDefinition intercept(ServerServiceDefinition serviceDef, List<? extends ServerInterceptor> interceptors) {
        Preconditions.checkNotNull(serviceDef, "serviceDef");
        if (interceptors.isEmpty()) {
            return serviceDef;
        }
        ServerServiceDefinition.Builder serviceDefBuilder = ServerServiceDefinition.builder(serviceDef.getServiceDescriptor());
        for (ServerMethodDefinition<?, ?> method : serviceDef.getMethods()) {
            wrapAndAddMethod(serviceDefBuilder, method, interceptors);
        }
        return serviceDefBuilder.build();
    }

    public static ServerServiceDefinition intercept(BindableService bindableService, List<? extends ServerInterceptor> interceptors) {
        Preconditions.checkNotNull(bindableService, "bindableService");
        return intercept(bindableService.bindService(), interceptors);
    }

    public static ServerServiceDefinition useInputStreamMessages(ServerServiceDefinition serviceDef) {
        MethodDescriptor.Marshaller<InputStream> marshaller = new MethodDescriptor.Marshaller<InputStream>() { // from class: io.grpc.ServerInterceptors.1
            @Override // io.grpc.MethodDescriptor.Marshaller
            public InputStream stream(InputStream value) {
                return value;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.grpc.MethodDescriptor.Marshaller
            public InputStream parse(InputStream stream) {
                if (stream.markSupported()) {
                    return stream;
                }
                if (stream instanceof KnownLength) {
                    return new KnownLengthBufferedInputStream(stream);
                }
                return new BufferedInputStream(stream);
            }
        };
        return useMarshalledMessages(serviceDef, marshaller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public static final class KnownLengthBufferedInputStream extends BufferedInputStream implements KnownLength {
        KnownLengthBufferedInputStream(InputStream in) {
            super(in);
        }
    }

    public static <T> ServerServiceDefinition useMarshalledMessages(ServerServiceDefinition serviceDef, MethodDescriptor.Marshaller<T> marshaller) {
        return useMarshalledMessages(serviceDef, marshaller, marshaller);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <ReqT, RespT> ServerServiceDefinition useMarshalledMessages(ServerServiceDefinition serviceDef, MethodDescriptor.Marshaller<ReqT> marshaller, MethodDescriptor.Marshaller<RespT> marshaller2) {
        List<ServerMethodDefinition<?, ?>> wrappedMethods = new ArrayList<>();
        List<MethodDescriptor<?, ?>> wrappedDescriptors = new ArrayList<>();
        for (ServerMethodDefinition<?, ?> definition : serviceDef.getMethods()) {
            MethodDescriptor<?, ?> originalMethodDescriptor = definition.getMethodDescriptor();
            MethodDescriptor<?, ?> build = originalMethodDescriptor.toBuilder(marshaller, marshaller2).build();
            wrappedDescriptors.add(build);
            wrappedMethods.add(wrapMethod(definition, build));
        }
        ServiceDescriptor.Builder serviceDescriptorBuilder = ServiceDescriptor.newBuilder(serviceDef.getServiceDescriptor().getName()).setSchemaDescriptor(serviceDef.getServiceDescriptor().getSchemaDescriptor());
        for (MethodDescriptor<?, ?> wrappedDescriptor : wrappedDescriptors) {
            serviceDescriptorBuilder.addMethod(wrappedDescriptor);
        }
        ServerServiceDefinition.Builder serviceBuilder = ServerServiceDefinition.builder(serviceDescriptorBuilder.build());
        Iterator<ServerMethodDefinition<?, ?>> it = wrappedMethods.iterator();
        while (it.hasNext()) {
            serviceBuilder.addMethod((ServerMethodDefinition) it.next());
        }
        return serviceBuilder.build();
    }

    private static <ReqT, RespT> void wrapAndAddMethod(ServerServiceDefinition.Builder serviceDefBuilder, ServerMethodDefinition<ReqT, RespT> method, List<? extends ServerInterceptor> interceptors) {
        ServerCallHandler<ReqT, RespT> callHandler = method.getServerCallHandler();
        for (ServerInterceptor interceptor : interceptors) {
            callHandler = InterceptCallHandler.create(interceptor, callHandler);
        }
        serviceDefBuilder.addMethod(method.withServerCallHandler(callHandler));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes12.dex */
    public static final class InterceptCallHandler<ReqT, RespT> implements ServerCallHandler<ReqT, RespT> {
        private final ServerCallHandler<ReqT, RespT> callHandler;
        private final ServerInterceptor interceptor;

        public static <ReqT, RespT> InterceptCallHandler<ReqT, RespT> create(ServerInterceptor interceptor, ServerCallHandler<ReqT, RespT> callHandler) {
            return new InterceptCallHandler<>(interceptor, callHandler);
        }

        private InterceptCallHandler(ServerInterceptor interceptor, ServerCallHandler<ReqT, RespT> callHandler) {
            this.interceptor = (ServerInterceptor) Preconditions.checkNotNull(interceptor, "interceptor");
            this.callHandler = callHandler;
        }

        @Override // io.grpc.ServerCallHandler
        public ServerCall.Listener<ReqT> startCall(ServerCall<ReqT, RespT> call, Metadata headers) {
            return this.interceptor.interceptCall(call, headers, this.callHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <OReqT, ORespT, WReqT, WRespT> ServerMethodDefinition<WReqT, WRespT> wrapMethod(ServerMethodDefinition<OReqT, ORespT> definition, MethodDescriptor<WReqT, WRespT> wrappedMethod) {
        ServerCallHandler<WReqT, WRespT> wrappedHandler = wrapHandler(definition.getServerCallHandler(), definition.getMethodDescriptor(), wrappedMethod);
        return ServerMethodDefinition.create(wrappedMethod, wrappedHandler);
    }

    private static <OReqT, ORespT, WReqT, WRespT> ServerCallHandler<WReqT, WRespT> wrapHandler(final ServerCallHandler<OReqT, ORespT> originalHandler, final MethodDescriptor<OReqT, ORespT> originalMethod, final MethodDescriptor<WReqT, WRespT> wrappedMethod) {
        return new ServerCallHandler<WReqT, WRespT>() { // from class: io.grpc.ServerInterceptors.2
            @Override // io.grpc.ServerCallHandler
            public ServerCall.Listener<WReqT> startCall(final ServerCall<WReqT, WRespT> call, Metadata headers) {
                final ServerCall.Listener startCall = originalHandler.startCall(new PartialForwardingServerCall<OReqT, ORespT>() { // from class: io.grpc.ServerInterceptors.2.1
                    @Override // io.grpc.PartialForwardingServerCall
                    protected ServerCall<WReqT, WRespT> delegate() {
                        return call;
                    }

                    @Override // io.grpc.ServerCall
                    public void sendMessage(ORespT orespt) {
                        delegate().sendMessage(wrappedMethod.parseResponse(MethodDescriptor.this.streamResponse(orespt)));
                    }

                    @Override // io.grpc.ServerCall
                    public MethodDescriptor<OReqT, ORespT> getMethodDescriptor() {
                        return MethodDescriptor.this;
                    }
                }, headers);
                return new PartialForwardingServerCallListener<WReqT>() { // from class: io.grpc.ServerInterceptors.2.2
                    @Override // io.grpc.PartialForwardingServerCallListener
                    protected ServerCall.Listener<OReqT> delegate() {
                        return startCall;
                    }

                    @Override // io.grpc.ServerCall.Listener
                    public void onMessage(WReqT message) {
                        InputStream is = wrappedMethod.streamRequest(message);
                        delegate().onMessage(MethodDescriptor.this.parseRequest(is));
                    }
                };
            }
        };
    }
}
