package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzat<K, V> {
    zzaw zza;
    private Object[] zzb;
    private int zzc;
    private boolean zzd;

    public final zzat<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzaj.zza(key, value);
            this.zzb[this.zzc * 2] = key;
            this.zzb[(this.zzc * 2) + 1] = value;
            this.zzc++;
        }
        return this;
    }

    public final zzau<K, V> zza() {
        if (this.zza != null) {
            throw this.zza.zza();
        }
        int i = this.zzc;
        Object[] objArr = this.zzb;
        this.zzd = true;
        zzax zza = zzax.zza(i, objArr, this);
        if (this.zza != null) {
            throw this.zza.zza();
        }
        return zza;
    }

    public zzat() {
        this(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzat(int i) {
        this.zzb = new Object[i * 2];
        this.zzc = 0;
        this.zzd = false;
    }

    private final void zza(int i) {
        int i2 = i << 1;
        if (i2 > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, zzan.zza(this.zzb.length, i2));
            this.zzd = false;
        }
    }
}
