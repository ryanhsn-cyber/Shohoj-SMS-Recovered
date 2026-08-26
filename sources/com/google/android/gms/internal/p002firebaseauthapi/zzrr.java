package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzrr {
    private final zzrk zza;
    private final List<zzrt> zzb;

    @Nullable
    private final Integer zzc;

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }

    private zzrr(zzrk zzrkVar, List<zzrt> list, Integer num) {
        this.zza = zzrkVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrr)) {
            return false;
        }
        zzrr zzrrVar = (zzrr) obj;
        return this.zza.equals(zzrrVar.zza) && this.zzb.equals(zzrrVar.zzb) && Objects.equals(this.zzc, zzrrVar.zzc);
    }
}
