package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzrk {
    public static final zzrk zza = new zzrn().zza();
    private final Map<String, String> zzb;

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }

    private zzrk(Map<String, String> map) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrk)) {
            return false;
        }
        return this.zzb.equals(((zzrk) obj).zzb);
    }
}
