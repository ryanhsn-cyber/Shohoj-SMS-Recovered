package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.primitives.SignedBytes;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzxt {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        copyOf[0] = (byte) (copyOf[0] & 248);
        copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
        copyOf[31] = (byte) (copyOf[31] | SignedBytes.MAX_POWER_OF_TWO);
        zzmg.zza(jArr, copyOf, bArr2);
        return zzml.zzc(jArr);
    }

    public static byte[] zza(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return zza(bArr, bArr2);
    }
}
