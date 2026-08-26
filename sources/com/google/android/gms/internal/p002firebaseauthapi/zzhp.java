package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
abstract class zzhp {
    int[] zza;
    private final int zzb;

    abstract int zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zza(byte[] bArr, int i) {
        int[] zza = zza(zzhl.zza(bArr), i);
        int[] iArr = (int[]) zza.clone();
        zzhl.zza(iArr);
        for (int i2 = 0; i2 < zza.length; i2++) {
            zza[i2] = zza[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }

    abstract int[] zza(int[] iArr, int i);

    public zzhp(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhl.zza(bArr);
        this.zzb = i;
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer zza = zza(bArr, this.zzb + i2);
            if (i2 == i - 1) {
                zzwh.zza(byteBuffer, byteBuffer2, zza, remaining % 64);
            } else {
                zzwh.zza(byteBuffer, byteBuffer2, zza, 64);
            }
        }
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
