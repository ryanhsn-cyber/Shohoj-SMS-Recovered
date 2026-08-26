package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzxv {
    private final byte[] zza;

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final int zza() {
        return this.zza.length;
    }

    public static zzxv zza(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzxv(bArr, 0, length);
    }

    public final String toString() {
        return "Bytes(" + zzxl.zza(this.zza) + ")";
    }

    private zzxv(byte[] bArr, int i, int i2) {
        this.zza = new byte[i2];
        System.arraycopy(bArr, 0, this.zza, 0, i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxv)) {
            return false;
        }
        return Arrays.equals(((zzxv) obj).zza, this.zza);
    }

    public final byte[] zzb() {
        byte[] bArr = new byte[this.zza.length];
        System.arraycopy(this.zza, 0, bArr, 0, this.zza.length);
        return bArr;
    }
}
