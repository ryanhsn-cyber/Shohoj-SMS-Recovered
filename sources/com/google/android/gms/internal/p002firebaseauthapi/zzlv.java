package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzlv implements zzlh {
    private final zzlb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlv(zzlb zzlbVar) {
        this.zza = zzlbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza(byte[] bArr, zzlk zzlkVar) throws GeneralSecurityException {
        return this.zza.zza(null, zzxt.zza(zzlkVar.zza().zzb(), bArr), "eae_prk", zzwh.zza(bArr, zzlkVar.zzb().zzb()), "shared_secret", zzln.zza(zzln.zzb), this.zza.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzln.zzf)) {
            return zzln.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
