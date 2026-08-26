package com.google.android.gms.internal.p002firebaseauthapi;

import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public enum zztw implements zzajg {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    private static final zzajj<zztw> zzg = new zzajj<zztw>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzty
    };
    private final int zzi;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
    public final int zza() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.zzi;
    }

    public static zztw zza(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CURVE;
            case 1:
            default:
                return null;
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            case 5:
                return CURVE25519;
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

    zztw(int i) {
        this.zzi = i;
    }
}
