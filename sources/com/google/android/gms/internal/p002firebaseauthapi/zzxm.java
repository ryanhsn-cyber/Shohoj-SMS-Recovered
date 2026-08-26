package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzxm implements zzru {
    private static final zzig.zza zza = zzig.zza.zzb;
    private final ThreadLocal<Mac> zzb = new zzxp(this);
    private final String zzc;
    private final Key zzd;
    private final int zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzxm(String str, Key key) throws GeneralSecurityException {
        char c;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.zze = 20;
                break;
            case 1:
                this.zze = 28;
                break;
            case 2:
                this.zze = 32;
                break;
            case 3:
                this.zze = 48;
                break;
            case 4:
                this.zze = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        this.zzb.get();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzru
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i);
    }
}
