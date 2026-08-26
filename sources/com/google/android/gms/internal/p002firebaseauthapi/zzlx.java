package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzlx {
    private final zzbh zza;
    private final zzbq zzb;

    public zzlx(zzbh zzbhVar) {
        this.zza = zzbhVar;
        this.zzb = null;
    }

    public zzlx(zzbq zzbqVar) {
        this.zza = null;
        this.zzb = zzbqVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zza != null) {
            return this.zza.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
