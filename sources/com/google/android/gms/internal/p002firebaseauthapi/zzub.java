package com.google.android.gms.internal.p002firebaseauthapi;

import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public enum zzub implements zzajg {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private static final zzajj<zzub> zzh = new zzajj<zzub>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzua
    };
    private final int zzj;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
    public final int zza() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.zzj;
    }

    public static zzub zza(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 2:
                return SHA384;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
            case 5:
                return SHA224;
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

    zzub(int i) {
        this.zzj = i;
    }
}
