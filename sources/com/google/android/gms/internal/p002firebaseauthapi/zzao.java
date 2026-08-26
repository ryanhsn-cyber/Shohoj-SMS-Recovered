package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
class zzao<E> extends zzan<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzao<E> zza(E e) {
        zzz.zza(e);
        int i = this.zzb + 1;
        if (this.zza.length < i) {
            this.zza = Arrays.copyOf(this.zza, zza(this.zza.length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) this.zza.clone();
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = e;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(int i) {
        zzaj.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }
}
