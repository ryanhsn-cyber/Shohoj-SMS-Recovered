package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzld {
    private static final byte[] zza = new byte[0];
    private final zzle zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    public static zzld zza(byte[] bArr, zzlk zzlkVar, zzlh zzlhVar, zzli zzliVar, zzle zzleVar, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzlhVar.zza(bArr, zzlkVar);
        byte[] bArr3 = zzln.zza;
        byte[] zza3 = zzln.zza(zzlhVar.zza(), zzliVar.zzb(), zzleVar.zzc());
        byte[] zza4 = zzwh.zza(bArr3, zzliVar.zza(zzln.zzl, zza, "psk_id_hash", zza3), zzliVar.zza(zzln.zzl, bArr2, "info_hash", zza3));
        byte[] zza5 = zzliVar.zza(zza2, zza, "secret", zza3);
        byte[] zza6 = zzliVar.zza(zza5, zza4, "key", zza3, zzleVar.zza());
        byte[] zza7 = zzliVar.zza(zza5, zza4, "base_nonce", zza3, zzleVar.zzb());
        zzleVar.zzb();
        return new zzld(bArr, zza6, zza7, BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzleVar);
    }

    private zzld(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzle zzleVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzleVar;
    }

    private final synchronized byte[] zza() throws GeneralSecurityException {
        byte[] zza2;
        zza2 = zzwh.zza(this.zze, zzmd.zza(this.zzg, this.zzb.zzb()));
        if (this.zzg.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzg = this.zzg.add(BigInteger.ONE);
        return zza2;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zza(this.zzd, zza(), bArr, bArr2);
    }
}
