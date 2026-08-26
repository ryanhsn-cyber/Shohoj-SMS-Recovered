package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzpe {
    private final Class<?> zza;
    private final Class<? extends zzox> zzb;

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with serialization type: " + this.zzb.getSimpleName();
    }

    private zzpe(Class<?> cls, Class<? extends zzox> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpe)) {
            return false;
        }
        zzpe zzpeVar = (zzpe) obj;
        return zzpeVar.zza.equals(this.zza) && zzpeVar.zzb.equals(this.zzb);
    }
}
