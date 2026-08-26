package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzajo<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzajp> zza;

    public final zzajp zza() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzajp.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzakp)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zza.getValue().zza((zzakp) obj);
    }

    private zzajo(Map.Entry<K, zzajp> entry) {
        this.zza = entry;
    }
}
