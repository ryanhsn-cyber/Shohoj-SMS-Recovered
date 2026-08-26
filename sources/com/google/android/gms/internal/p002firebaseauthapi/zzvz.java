package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzvz implements zzxk {
    private static final zzig.zza zza = zzig.zza.zzb;
    private static final ThreadLocal<Cipher> zzb = new zzwb();
    private final SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    public zzvz(byte[] bArr, int i) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzxq.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
        this.zze = zzb.get().getBlockSize();
        if (i < 12 || i > this.zze) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzd = i;
    }

    private final void zza(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = zzb.get();
        byte[] bArr4 = new byte[this.zze];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzd);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.zzc, ivParameterSpec);
        } else {
            cipher.init(2, this.zzc, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxk
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length < this.zzd) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[this.zzd];
        System.arraycopy(bArr, 0, bArr2, 0, this.zzd);
        byte[] bArr3 = new byte[bArr.length - this.zzd];
        zza(bArr, this.zzd, bArr.length - this.zzd, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxk
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - this.zzd) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.zzd));
        }
        byte[] bArr2 = new byte[this.zzd + bArr.length];
        byte[] zza2 = zzow.zza(this.zzd);
        System.arraycopy(zza2, 0, bArr2, 0, this.zzd);
        zza(bArr, 0, bArr.length, bArr2, this.zzd, zza2, true);
        return bArr2;
    }
}
