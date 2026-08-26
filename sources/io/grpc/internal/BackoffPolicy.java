package io.grpc.internal;

/* loaded from: classes12.dex */
public interface BackoffPolicy {

    /* loaded from: classes12.dex */
    public interface Provider {
        BackoffPolicy get();
    }

    long nextBackoffNanos();
}
