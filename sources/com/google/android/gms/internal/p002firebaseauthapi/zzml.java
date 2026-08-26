package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzml {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i = 2; i < 10; i += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[0] * jArr3[1]) + (jArr2[1] * jArr3[0]);
        jArr[2] = (jArr2[1] * 2 * jArr3[1]) + (jArr2[0] * jArr3[2]) + (jArr2[2] * jArr3[0]);
        jArr[3] = (jArr2[1] * jArr3[2]) + (jArr2[2] * jArr3[1]) + (jArr2[0] * jArr3[3]) + (jArr2[3] * jArr3[0]);
        jArr[4] = (jArr2[2] * jArr3[2]) + (((jArr2[1] * jArr3[3]) + (jArr2[3] * jArr3[1])) * 2) + (jArr2[0] * jArr3[4]) + (jArr2[4] * jArr3[0]);
        jArr[5] = (jArr2[2] * jArr3[3]) + (jArr2[3] * jArr3[2]) + (jArr2[1] * jArr3[4]) + (jArr2[4] * jArr3[1]) + (jArr2[0] * jArr3[5]) + (jArr2[5] * jArr3[0]);
        jArr[6] = (((jArr2[3] * jArr3[3]) + (jArr2[1] * jArr3[5]) + (jArr2[5] * jArr3[1])) * 2) + (jArr2[2] * jArr3[4]) + (jArr2[4] * jArr3[2]) + (jArr2[0] * jArr3[6]) + (jArr2[6] * jArr3[0]);
        jArr[7] = (jArr2[3] * jArr3[4]) + (jArr2[4] * jArr3[3]) + (jArr2[2] * jArr3[5]) + (jArr2[5] * jArr3[2]) + (jArr2[1] * jArr3[6]) + (jArr2[6] * jArr3[1]) + (jArr2[0] * jArr3[7]) + (jArr2[7] * jArr3[0]);
        jArr[8] = (jArr2[4] * jArr3[4]) + (((jArr2[3] * jArr3[5]) + (jArr2[5] * jArr3[3]) + (jArr2[1] * jArr3[7]) + (jArr2[7] * jArr3[1])) * 2) + (jArr2[2] * jArr3[6]) + (jArr2[6] * jArr3[2]) + (jArr2[0] * jArr3[8]) + (jArr2[8] * jArr3[0]);
        jArr[9] = (jArr2[4] * jArr3[5]) + (jArr2[5] * jArr3[4]) + (jArr2[3] * jArr3[6]) + (jArr2[6] * jArr3[3]) + (jArr2[2] * jArr3[7]) + (jArr2[7] * jArr3[2]) + (jArr2[1] * jArr3[8]) + (jArr2[8] * jArr3[1]) + (jArr2[0] * jArr3[9]) + (jArr2[9] * jArr3[0]);
        jArr[10] = (((jArr2[5] * jArr3[5]) + (jArr2[3] * jArr3[7]) + (jArr2[7] * jArr3[3]) + (jArr2[1] * jArr3[9]) + (jArr2[9] * jArr3[1])) * 2) + (jArr2[4] * jArr3[6]) + (jArr2[6] * jArr3[4]) + (jArr2[2] * jArr3[8]) + (jArr2[8] * jArr3[2]);
        jArr[11] = (jArr2[5] * jArr3[6]) + (jArr2[6] * jArr3[5]) + (jArr2[4] * jArr3[7]) + (jArr2[7] * jArr3[4]) + (jArr2[3] * jArr3[8]) + (jArr2[8] * jArr3[3]) + (jArr2[2] * jArr3[9]) + (jArr2[9] * jArr3[2]);
        jArr[12] = (jArr2[6] * jArr3[6]) + (((jArr2[5] * jArr3[7]) + (jArr2[7] * jArr3[5]) + (jArr2[3] * jArr3[9]) + (jArr2[9] * jArr3[3])) * 2) + (jArr2[4] * jArr3[8]) + (jArr2[8] * jArr3[4]);
        jArr[13] = (jArr2[6] * jArr3[7]) + (jArr2[7] * jArr3[6]) + (jArr2[5] * jArr3[8]) + (jArr2[8] * jArr3[5]) + (jArr2[4] * jArr3[9]) + (jArr2[9] * jArr3[4]);
        jArr[14] = (((jArr2[7] * jArr3[7]) + (jArr2[5] * jArr3[9]) + (jArr2[9] * jArr3[5])) * 2) + (jArr2[6] * jArr3[8]) + (jArr2[8] * jArr3[6]);
        jArr[15] = (jArr2[7] * jArr3[8]) + (jArr2[8] * jArr3[7]) + (jArr2[6] * jArr3[9]) + (jArr2[9] * jArr3[6]);
        jArr[16] = (jArr2[8] * jArr3[8]) + (((jArr2[7] * jArr3[9]) + (jArr2[9] * jArr3[7])) * 2);
        jArr[17] = (jArr2[8] * jArr3[9]) + (jArr2[9] * jArr3[8]);
        jArr[18] = jArr2[9] * 2 * jArr3[9];
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i] / 67108864;
            jArr[i] = jArr[i] - (j << 26);
            int i2 = i + 1;
            jArr[i2] = jArr[i2] + j;
            long j2 = jArr[i2] / 33554432;
            jArr[i2] = jArr[i2] - (j2 << 25);
            i += 2;
            jArr[i] = jArr[i] + j2;
        }
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
        jArr[10] = 0;
        long j3 = jArr[0] / 67108864;
        jArr[0] = jArr[0] - (j3 << 26);
        jArr[1] = jArr[1] + j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(long[] jArr) {
        jArr[8] = jArr[8] + (jArr[18] << 4);
        jArr[8] = jArr[8] + (jArr[18] << 1);
        jArr[8] = jArr[8] + jArr[18];
        jArr[7] = jArr[7] + (jArr[17] << 4);
        jArr[7] = jArr[7] + (jArr[17] << 1);
        jArr[7] = jArr[7] + jArr[17];
        jArr[6] = jArr[6] + (jArr[16] << 4);
        jArr[6] = jArr[6] + (jArr[16] << 1);
        jArr[6] = jArr[6] + jArr[16];
        jArr[5] = jArr[5] + (jArr[15] << 4);
        jArr[5] = jArr[5] + (jArr[15] << 1);
        jArr[5] = jArr[5] + jArr[15];
        jArr[4] = jArr[4] + (jArr[14] << 4);
        jArr[4] = jArr[4] + (jArr[14] << 1);
        jArr[4] = jArr[4] + jArr[14];
        jArr[3] = jArr[3] + (jArr[13] << 4);
        jArr[3] = jArr[3] + (jArr[13] << 1);
        jArr[3] = jArr[3] + jArr[13];
        jArr[2] = jArr[2] + (jArr[12] << 4);
        jArr[2] = jArr[2] + (jArr[12] << 1);
        jArr[2] = jArr[2] + jArr[12];
        jArr[1] = jArr[1] + (jArr[11] << 4);
        jArr[1] = jArr[1] + (jArr[11] << 1);
        jArr[1] = jArr[1] + jArr[11];
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long[] jArr, long[] jArr2, long j) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(long[] jArr, long[] jArr2) {
        zze(new long[]{jArr2[0] * jArr2[0], jArr2[0] * 2 * jArr2[1], ((jArr2[1] * jArr2[1]) + (jArr2[0] * jArr2[2])) * 2, ((jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3])) * 2, (jArr2[2] * jArr2[2]) + (jArr2[1] * 4 * jArr2[3]) + (jArr2[0] * 2 * jArr2[4]), ((jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5])) * 2, ((jArr2[3] * jArr2[3]) + (jArr2[2] * jArr2[4]) + (jArr2[0] * jArr2[6]) + (jArr2[1] * 2 * jArr2[5])) * 2, ((jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7])) * 2, (jArr2[4] * jArr2[4]) + (((jArr2[2] * jArr2[6]) + (jArr2[0] * jArr2[8]) + (((jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5])) * 2)) * 2), ((jArr2[4] * jArr2[5]) + (jArr2[3] * jArr2[6]) + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9])) * 2, ((jArr2[5] * jArr2[5]) + (jArr2[4] * jArr2[6]) + (jArr2[2] * jArr2[8]) + (((jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9])) * 2)) * 2, ((jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9])) * 2, (jArr2[6] * jArr2[6]) + (((jArr2[4] * jArr2[8]) + (((jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9])) * 2)) * 2), ((jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9])) * 2, ((jArr2[7] * jArr2[7]) + (jArr2[6] * jArr2[8]) + (jArr2[5] * 2 * jArr2[9])) * 2, ((jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9])) * 2, (jArr2[8] * jArr2[8]) + (jArr2[7] * 4 * jArr2[9]), jArr2[8] * 2 * jArr2[9], jArr2[9] * 2 * jArr2[9]}, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            int i3 = 0;
            while (i3 < 9) {
                int i4 = -((int) ((copyOf[i3] & (copyOf[i3] >> 31)) >> zzd[i3 & 1]));
                copyOf[i3] = copyOf[i3] + (i4 << zzd[r13]);
                i3++;
                copyOf[i3] = copyOf[i3] - i4;
            }
            int i5 = -((int) (((copyOf[9] >> 31) & copyOf[9]) >> 25));
            copyOf[9] = copyOf[9] + (i5 << 25);
            copyOf[0] = copyOf[0] - (i5 * 19);
            i2++;
        }
        int i6 = -((int) ((copyOf[0] & (copyOf[0] >> 31)) >> 26));
        copyOf[0] = copyOf[0] + (i6 << 26);
        copyOf[1] = copyOf[1] - i6;
        int i7 = 0;
        for (i = 2; i7 < i; i = 2) {
            int i8 = 0;
            while (i8 < 9) {
                int i9 = (int) (copyOf[i8] >> zzd[i8 & 1]);
                copyOf[i8] = zzc[r15] & copyOf[i8];
                i8++;
                copyOf[i8] = copyOf[i8] + i9;
            }
            i7++;
        }
        int i10 = (int) (copyOf[9] >> 25);
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[0] = copyOf[0] + (i10 * 19);
        int i11 = ~((((int) copyOf[0]) - 67108845) >> 31);
        for (int i12 = 1; i12 < 10; i12++) {
            int i13 = ~(((int) copyOf[i12]) ^ zzc[i12 & 1]);
            int i14 = i13 & (i13 << 16);
            int i15 = i14 & (i14 << 8);
            int i16 = i15 & (i15 << 4);
            int i17 = i16 & (i16 << 2);
            i11 &= (i17 & (i17 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i11);
        long j = 33554431 & i11;
        copyOf[1] = copyOf[1] - j;
        for (int i18 = 2; i18 < 10; i18 += 2) {
            copyOf[i18] = copyOf[i18] - (67108863 & i11);
            int i19 = i18 + 1;
            copyOf[i19] = copyOf[i19] - j;
        }
        for (int i20 = 0; i20 < 10; i20++) {
            copyOf[i20] = copyOf[i20] << zzb[i20];
        }
        byte[] bArr = new byte[32];
        for (int i21 = 0; i21 < 10; i21++) {
            bArr[zza[i21]] = (byte) (bArr[r4] | (copyOf[i21] & 255));
            bArr[zza[i21] + 1] = (byte) (bArr[r4] | ((copyOf[i21] >> 8) & 255));
            bArr[zza[i21] + 2] = (byte) (bArr[r4] | ((copyOf[i21] >> 16) & 255));
            bArr[zza[i21] + 3] = (byte) (bArr[r4] | ((copyOf[i21] >> 24) & 255));
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            jArr[i] = (((((bArr[zza[i]] & 255) | ((bArr[zza[i] + 1] & 255) << 8)) | ((bArr[zza[i] + 2] & 255) << 16)) | ((bArr[zza[i] + 3] & 255) << 24)) >> zzb[i]) & zzc[i & 1];
        }
        return jArr;
    }
}
