package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzxw {
    private final zzxv zza;

    public final int zza() {
        return this.zza.zza();
    }

    public static zzxw zza(byte[] bArr, zzcn zzcnVar) {
        if (zzcnVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return new zzxw(zzxv.zza(bArr));
    }

    public static zzxw zza(int i) {
        return new zzxw(zzxv.zza(zzow.zza(i)));
    }

    private zzxw(zzxv zzxvVar) {
        this.zza = zzxvVar;
    }

    public final byte[] zza(zzcn zzcnVar) {
        if (zzcnVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.zza.zzb();
    }
}
