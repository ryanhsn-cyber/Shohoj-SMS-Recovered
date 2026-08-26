package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
/* loaded from: classes12.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable t);

    void onSuccess(@ParametricNullness V result);
}
