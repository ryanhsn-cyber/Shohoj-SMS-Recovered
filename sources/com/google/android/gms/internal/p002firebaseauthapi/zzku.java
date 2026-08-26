package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzku implements zzle {
    private final int zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final int zzb() {
        return 12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzku(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
        }
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final byte[] zzc() throws GeneralSecurityException {
        switch (this.zza) {
            case 16:
                return zzln.zzi;
            case 32:
                return zzln.zzj;
            default:
                throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != this.zza) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
        }
        return new zzhk(bArr).zza(bArr2, bArr3, bArr4);
    }
}
