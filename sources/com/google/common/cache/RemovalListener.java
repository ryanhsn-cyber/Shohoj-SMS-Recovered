package com.google.common.cache;

@ElementTypesAreNonnullByDefault
/* loaded from: classes11.dex */
public interface RemovalListener<K, V> {
    void onRemoval(RemovalNotification<K, V> notification);
}
