package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjv;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzln {
    public static final byte[] zza = zza(1, 0);
    private static final byte[] zzm = zza(1, 2);
    public static final byte[] zzb = zza(2, 32);
    public static final byte[] zzc = zza(2, 16);
    public static final byte[] zzd = zza(2, 17);
    public static final byte[] zze = zza(2, 18);
    public static final byte[] zzf = zza(2, 1);
    public static final byte[] zzg = zza(2, 2);
    public static final byte[] zzh = zza(2, 3);
    public static final byte[] zzi = zza(2, 1);
    public static final byte[] zzj = zza(2, 2);
    public static final byte[] zzk = zza(2, 3);
    public static final byte[] zzl = new byte[0];
    private static final byte[] zzn = "KEM".getBytes(zzph.zza);
    private static final byte[] zzo = "HPKE".getBytes(zzph.zza);
    private static final byte[] zzp = "HPKE-v1".getBytes(zzph.zza);

    public static int zza(zzjv.zzd zzdVar) throws GeneralSecurityException {
        if (zzdVar == zzjv.zzd.zzd || zzdVar == zzjv.zzd.zza) {
            return 32;
        }
        if (zzdVar == zzjv.zzd.zzb) {
            return 48;
        }
        if (zzdVar == zzjv.zzd.zzc) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzjv.zzd zzdVar) throws GeneralSecurityException {
        if (zzdVar == zzjv.zzd.zzd) {
            return 32;
        }
        if (zzdVar == zzjv.zzd.zza) {
            return 65;
        }
        if (zzdVar == zzjv.zzd.zzb) {
            return 97;
        }
        if (zzdVar == zzjv.zzd.zzc) {
            return 133;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzwq zzc(zzjv.zzd zzdVar) throws GeneralSecurityException {
        if (zzdVar == zzjv.zzd.zza) {
            return zzwq.NIST_P256;
        }
        if (zzdVar == zzjv.zzd.zzb) {
            return zzwq.NIST_P384;
        }
        if (zzdVar == zzjv.zzd.zzc) {
            return zzwq.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzwh.zza(zzo, bArr, bArr2, bArr3);
    }

    private static byte[] zza(int i, int i2) {
        if (i > 4 || i < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i2 < 0 || (i < 4 && i2 >= (1 << (i << 3)))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (i2 >> (((i - i3) - 1) * 8));
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return zzwh.zza(zzn, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zza(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzwh.zza(zzp, bArr2, str.getBytes(zzph.zza), bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzwh.zza(zza(2, i), zzp, bArr2, str.getBytes(zzph.zza), bArr);
    }
}
