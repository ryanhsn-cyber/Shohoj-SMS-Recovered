package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzamn {
    private static final zzamo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                if (b > -12) {
                    return -1;
                }
                return b;
            case 1:
                byte b2 = bArr[i];
                if (b > -12 || b2 > -65) {
                    return -1;
                }
                return (b2 << 8) ^ b;
            case 2:
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return (b4 << Ascii.DLE) ^ ((b3 << 8) ^ b);
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(String str, byte[] bArr, int i, int i2) {
        return zza.zza(str, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new zzamq(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(byte[] bArr, int i, int i2) throws zzajk {
        return zza.zza(bArr, i, i2);
    }

    static {
        if (!zzamm.zzc() || zzamm.zzd()) {
        }
        zza = new zzamr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(byte[] bArr, int i, int i2) {
        return zza.zzb(bArr, i, i2);
    }
}
