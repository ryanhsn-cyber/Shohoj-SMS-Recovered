package io.grpc;

import io.grpc.ServerInterceptors;

/* loaded from: classes12.dex */
public final class InternalServerInterceptors {
    public static <OrigReqT, OrigRespT, WrapReqT, WrapRespT> ServerMethodDefinition<WrapReqT, WrapRespT> wrapMethod(ServerMethodDefinition<OrigReqT, OrigRespT> definition, MethodDescriptor<WrapReqT, WrapRespT> wrappedMethod) {
        return ServerInterceptors.wrapMethod(definition, wrappedMethod);
    }

    public static <ReqT, RespT> ServerCallHandler<ReqT, RespT> interceptCallHandlerCreate(ServerInterceptor interceptor, ServerCallHandler<ReqT, RespT> callHandler) {
        return ServerInterceptors.InterceptCallHandler.create(interceptor, callHandler);
    }

    private InternalServerInterceptors() {
    }
}
