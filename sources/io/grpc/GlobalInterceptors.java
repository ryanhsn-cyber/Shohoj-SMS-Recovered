package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ServerStreamTracer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
final class GlobalInterceptors {
    private static boolean isGlobalInterceptorsTracersGet;
    private static boolean isGlobalInterceptorsTracersSet;
    private static List<ClientInterceptor> clientInterceptors = null;
    private static List<ServerInterceptor> serverInterceptors = null;
    private static List<ServerStreamTracer.Factory> serverStreamTracerFactories = null;

    private GlobalInterceptors() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setInterceptorsTracers(List<ClientInterceptor> clientInterceptorList, List<ServerInterceptor> serverInterceptorList, List<ServerStreamTracer.Factory> serverStreamTracerFactoryList) {
        synchronized (GlobalInterceptors.class) {
            if (isGlobalInterceptorsTracersGet) {
                throw new IllegalStateException("Set cannot be called after any get call");
            }
            if (isGlobalInterceptorsTracersSet) {
                throw new IllegalStateException("Global interceptors and tracers are already set");
            }
            Preconditions.checkNotNull(clientInterceptorList);
            Preconditions.checkNotNull(serverInterceptorList);
            Preconditions.checkNotNull(serverStreamTracerFactoryList);
            clientInterceptors = Collections.unmodifiableList(new ArrayList(clientInterceptorList));
            serverInterceptors = Collections.unmodifiableList(new ArrayList(serverInterceptorList));
            serverStreamTracerFactories = Collections.unmodifiableList(new ArrayList(serverStreamTracerFactoryList));
            isGlobalInterceptorsTracersSet = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized List<ClientInterceptor> getClientInterceptors() {
        List<ClientInterceptor> list;
        synchronized (GlobalInterceptors.class) {
            isGlobalInterceptorsTracersGet = true;
            list = clientInterceptors;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized List<ServerInterceptor> getServerInterceptors() {
        List<ServerInterceptor> list;
        synchronized (GlobalInterceptors.class) {
            isGlobalInterceptorsTracersGet = true;
            list = serverInterceptors;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized List<ServerStreamTracer.Factory> getServerStreamTracerFactories() {
        List<ServerStreamTracer.Factory> list;
        synchronized (GlobalInterceptors.class) {
            isGlobalInterceptorsTracersGet = true;
            list = serverStreamTracerFactories;
        }
        return list;
    }
}
