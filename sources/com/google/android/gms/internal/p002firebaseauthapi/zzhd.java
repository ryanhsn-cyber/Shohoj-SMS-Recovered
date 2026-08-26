package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzhd implements zzbh {
    private static final zzig.zza zza = zzig.zza.zza;
    private static final byte[] zzb = zzxl.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] zzc = zzxl.zza("070000004041424344454647");
    private static final byte[] zzd = zzxl.zza("a0784d7a4716f3feb4f64e7f4b39bf04");
    private static final ThreadLocal<Cipher> zze = new zzhc();
    private final SecretKey zzf;
    private final byte[] zzg;

    public static zzbh zza(zzem zzemVar) throws GeneralSecurityException {
        return new zzhd(zzemVar.zzd().zza(zzbr.zza()), zzemVar.zzc().zzb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Cipher zza() {
        return zze.get();
    }

    private zzhd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zzb()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zzf = new SecretKeySpec(bArr, "ChaCha20");
        this.zzg = bArr2;
    }

    public static boolean zzb() {
        return zze.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(zzc);
            cipher.init(2, new SecretKeySpec(zzb, "ChaCha20"), ivParameterSpec);
            if (cipher.doFinal(zzd).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(zzb, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(zzd).length == 0;
        } catch (GeneralSecurityException e) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        if (bArr.length < this.zzg.length + 12 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzph.zza(this.zzg, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArr, this.zzg.length, bArr3, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher cipher = zze.get();
        cipher.init(2, this.zzf, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, this.zzg.length + 12, (bArr.length - this.zzg.length) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza2 = zzow.zza(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(zza2);
        Cipher cipher = zze.get();
        cipher.init(1, this.zzf, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        if (outputSize <= (Integer.MAX_VALUE - this.zzg.length) - 12) {
            byte[] copyOf = Arrays.copyOf(this.zzg, this.zzg.length + 12 + outputSize);
            System.arraycopy(zza2, 0, copyOf, this.zzg.length, 12);
            if (cipher.doFinal(bArr, 0, bArr.length, copyOf, this.zzg.length + 12) != outputSize) {
                throw new GeneralSecurityException("not enough data written");
            }
            return copyOf;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
