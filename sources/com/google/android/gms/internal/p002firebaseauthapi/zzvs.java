package com.google.android.gms.internal.p002firebaseauthapi;

import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public enum zzvs implements zzajg {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final zzajj<zzvs> zzg = new zzajj<zzvs>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzvr
    };
    private final int zzi;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
    public final int zza() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.zzi;
    }

    public static zzvs zza(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            case 4:
                return CRUNCHY;
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

    zzvs(int i) {
        this.zzi = i;
    }
}
