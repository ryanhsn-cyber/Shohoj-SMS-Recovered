package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzhl {
    private static final int[] zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private static int zza(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private static void zza(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = zza(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = zza(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = zza(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = zza(iArr[i2] ^ iArr[i3], 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(int[] iArr, int[] iArr2) {
        System.arraycopy(zza, 0, iArr, 0, zza.length);
        System.arraycopy(iArr2, 0, iArr, zza.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        int[] zzb = zzb(zza(bArr), zza(bArr2));
        ByteBuffer order = ByteBuffer.allocate(zzb.length << 2).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb);
        return order.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] zzb(int[] iArr, int[] iArr2) {
        zza(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        zza(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] zza(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
