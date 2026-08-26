package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzxu {
    private final BigInteger zza;

    public static zzxu zza(BigInteger bigInteger, zzcn zzcnVar) {
        if (zzcnVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return new zzxu(bigInteger);
    }

    public final BigInteger zza(zzcn zzcnVar) {
        if (zzcnVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.zza;
    }

    private zzxu(BigInteger bigInteger) {
        this.zza = bigInteger;
    }
}
