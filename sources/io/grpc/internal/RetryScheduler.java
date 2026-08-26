package io.grpc.internal;

/* loaded from: classes12.dex */
public interface RetryScheduler {
    void reset();

    void schedule(Runnable runnable);
}
