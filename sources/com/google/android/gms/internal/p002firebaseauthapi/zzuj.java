package com.google.android.gms.internal.p002firebaseauthapi;

import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public enum zzuj implements zzajg {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);

    private static final zzajj<zzuj> zzf = new zzajj<zzuj>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzum
    };
    private final int zzh;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
    public final int zza() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.zzh;
    }

    public static zzuj zza(int i) {
        switch (i) {
            case 0:
                return KDF_UNKNOWN;
            case 1:
                return HKDF_SHA256;
            case 2:
                return HKDF_SHA384;
            case 3:
                return HKDF_SHA512;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=").append(zza());
        }
        return sb.append(" name=").append(name()).append(Typography.greater).toString();
    }

    zzuj(int i) {
        this.zzh = i;
    }
}
