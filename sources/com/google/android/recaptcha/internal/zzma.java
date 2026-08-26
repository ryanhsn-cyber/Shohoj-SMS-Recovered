package com.google.android.recaptcha.internal;

import com.google.common.base.Ascii;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzma {
    private static final zzlx zza;

    static {
        if (zzlv.zzx() && zzlv.zzy()) {
            int i = zzgi.zza;
        }
        zza = new zzly();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        switch (i3) {
            case 0:
                if (b <= -12) {
                    return b;
                }
                return -1;
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
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0102, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new zzlz(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(byte[] bArr, int i, int i2) throws zzje {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!zzlw.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (zzlw.zzd(b2)) {
                cArr[i5] = (char) b2;
                i = i6;
                i5++;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (zzlw.zzd(b3)) {
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else if (b2 < -32) {
                if (i6 < i3) {
                    zzlw.zzc(b2, bArr[i6], cArr, i5);
                    i5++;
                    i = i6 + 1;
                } else {
                    throw zzje.zzd();
                }
            } else if (b2 < -16) {
                if (i6 < i3 - 1) {
                    int i7 = i6 + 1;
                    zzlw.zzb(b2, bArr[i6], bArr[i7], cArr, i5);
                    i5++;
                    i = i7 + 1;
                } else {
                    throw zzje.zzd();
                }
            } else if (i6 < i3 - 2) {
                int i8 = i6 + 1;
                byte b4 = bArr[i6];
                int i9 = i8 + 1;
                zzlw.zza(b2, b4, bArr[i8], bArr[i9], cArr, i5);
                i5 += 2;
                i = i9 + 1;
            } else {
                throw zzje.zzd();
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(byte[] bArr, int i, int i2) {
        return zza.zzb(bArr, i, i2);
    }
}
