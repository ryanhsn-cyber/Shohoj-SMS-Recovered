package com.google.android.gms.internal.p002firebaseauthapi;

import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public enum zzui implements zzajg {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);

    private static final zzajj<zzui> zzf = new zzajj<zzui>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzuk
    };
    private final int zzh;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
    public final int zza() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.zzh;
    }

    public static zzui zza(int i) {
        switch (i) {
            case 0:
                return AEAD_UNKNOWN;
            case 1:
                return AES_128_GCM;
            case 2:
                return AES_256_GCM;
            case 3:
                return CHACHA20_POLY1305;
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

    zzui(int i) {
        this.zzh = i;
    }
}
