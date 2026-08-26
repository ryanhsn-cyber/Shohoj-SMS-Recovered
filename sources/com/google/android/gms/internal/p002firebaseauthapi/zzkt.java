package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzkt implements zzle {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final byte[] zzc() {
        return zzln.zzk;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzle
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (zzhq.zza()) {
            return zzhq.zza(bArr).zza(bArr2, bArr3, bArr4);
        }
        return new zzho(bArr).zza(bArr2, bArr3, bArr4);
    }
}
