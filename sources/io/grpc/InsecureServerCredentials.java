package io.grpc;

/* loaded from: classes12.dex */
public final class InsecureServerCredentials extends ServerCredentials {
    public static ServerCredentials create() {
        return new InsecureServerCredentials();
    }

    private InsecureServerCredentials() {
    }
}
