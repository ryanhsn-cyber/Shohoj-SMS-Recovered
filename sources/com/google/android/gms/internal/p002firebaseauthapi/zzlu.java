package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzlu implements zzlh {
    private final zzwq zza;
    private final zzlb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlu zza(zzwq zzwqVar) throws GeneralSecurityException {
        switch (zzwqVar) {
            case NIST_P256:
                return new zzlu(new zzlb("HmacSha256"), zzwq.NIST_P256);
            case NIST_P384:
                return new zzlu(new zzlb("HmacSha384"), zzwq.NIST_P384);
            case NIST_P521:
                return new zzlu(new zzlb("HmacSha512"), zzwq.NIST_P521);
            default:
                throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzwqVar));
        }
    }

    private zzlu(zzlb zzlbVar, zzwq zzwqVar) {
        this.zzb = zzlbVar;
        this.zza = zzwqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza(byte[] bArr, zzlk zzlkVar) throws GeneralSecurityException {
        return this.zzb.zza(null, zzwr.zza(zzwr.zza(this.zza, zzlkVar.zza().zzb()), zzwr.zza(this.zza, zzwt.UNCOMPRESSED, bArr)), "eae_prk", zzwh.zza(bArr, zzlkVar.zzb().zzb()), "shared_secret", zzln.zza(zza()), this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza() throws GeneralSecurityException {
        switch (this.zza) {
            case NIST_P256:
                return zzln.zzc;
            case NIST_P384:
                return zzln.zzd;
            case NIST_P521:
                return zzln.zze;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KEM ID");
        }
    }
}
