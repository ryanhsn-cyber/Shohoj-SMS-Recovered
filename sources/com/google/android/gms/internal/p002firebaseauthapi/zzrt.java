package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzrt {
    private final zzbw zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    private zzrt(zzbw zzbwVar, int i, String str, String str2) {
        this.zza = zzbwVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrt)) {
            return false;
        }
        zzrt zzrtVar = (zzrt) obj;
        return this.zza == zzrtVar.zza && this.zzb == zzrtVar.zzb && this.zzc.equals(zzrtVar.zzc) && this.zzd.equals(zzrtVar.zzd);
    }
}
