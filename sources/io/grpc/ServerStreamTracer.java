package io.grpc;

import javax.annotation.Nullable;

/* loaded from: classes12.dex */
public abstract class ServerStreamTracer extends StreamTracer {

    /* loaded from: classes12.dex */
    public static abstract class Factory {
        public abstract ServerStreamTracer newServerStreamTracer(String str, Metadata metadata);
    }

    /* loaded from: classes12.dex */
    public static abstract class ServerCallInfo<ReqT, RespT> {
        public abstract Attributes getAttributes();

        @Nullable
        public abstract String getAuthority();

        public abstract MethodDescriptor<ReqT, RespT> getMethodDescriptor();
    }

    public Context filterContext(Context context) {
        return context;
    }

    public void serverCallStarted(ServerCallInfo<?, ?> callInfo) {
        serverCallStarted(ReadOnlyServerCall.create(callInfo));
    }

    @Deprecated
    public void serverCallStarted(ServerCall<?, ?> call) {
    }

    @Deprecated
    /* loaded from: classes12.dex */
    private static final class ReadOnlyServerCall<ReqT, RespT> extends ForwardingServerCall<ReqT, RespT> {
        private final ServerCallInfo<ReqT, RespT> callInfo;

        /* JADX INFO: Access modifiers changed from: private */
        public static <ReqT, RespT> ReadOnlyServerCall<ReqT, RespT> create(ServerCallInfo<ReqT, RespT> callInfo) {
            return new ReadOnlyServerCall<>(callInfo);
        }

        private ReadOnlyServerCall(ServerCallInfo<ReqT, RespT> callInfo) {
            this.callInfo = callInfo;
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.ServerCall
        public MethodDescriptor<ReqT, RespT> getMethodDescriptor() {
            return this.callInfo.getMethodDescriptor();
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public Attributes getAttributes() {
            return this.callInfo.getAttributes();
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public boolean isReady() {
            return false;
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public boolean isCancelled() {
            return false;
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public String getAuthority() {
            return this.callInfo.getAuthority();
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall
        protected ServerCall<ReqT, RespT> delegate() {
            throw new UnsupportedOperationException();
        }
    }
}
