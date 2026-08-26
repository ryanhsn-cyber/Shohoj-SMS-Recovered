package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzamr extends zzamo {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamr.zza(java.lang.String, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    final int zza(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                i2 = i4;
            } else {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i4 >= i3 - 1) {
                        return zzamn.zza(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i2 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (i4 >= i3 - 2) {
                    return zzamn.zza(bArr, i4, i3);
                }
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 <= -65 && (((b << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                    int i7 = i6 + 1;
                    if (bArr[i6] <= -65) {
                        int i8 = i7 + 1;
                        if (bArr[i7] <= -65) {
                            i2 = i8;
                        }
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final String zza(byte[] bArr, int i, int i2) throws zzajk {
        boolean z;
        boolean z2;
        boolean z3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                break;
            }
            i++;
            zzamp.zza(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (b2 < 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i7 = i5 + 1;
                zzamp.zza(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
                    if (b3 < 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        break;
                    }
                    i6++;
                    zzamp.zza(b3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw zzajk.zzd();
                }
                zzamp.zza(b2, bArr[i6], cArr, i5);
                i = i6 + 1;
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw zzajk.zzd();
                }
                int i8 = i6 + 1;
                zzamp.zza(b2, bArr[i6], bArr[i8], cArr, i5);
                i = i8 + 1;
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzajk.zzd();
                }
                int i9 = i6 + 1;
                byte b4 = bArr[i6];
                int i10 = i9 + 1;
                zzamp.zza(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                i = i10 + 1;
                i5 = i5 + 1 + 1;
            }
        }
        return new String(cArr, 0, i5);
    }
}
