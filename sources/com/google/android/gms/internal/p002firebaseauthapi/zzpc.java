package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzpc {
    private final Class<? extends zzox> zza;
    private final zzxv zzb;

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(this.zzb);
    }

    private zzpc(Class<? extends zzox> cls, zzxv zzxvVar) {
        this.zza = cls;
        this.zzb = zzxvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpc)) {
            return false;
        }
        zzpc zzpcVar = (zzpc) obj;
        return zzpcVar.zza.equals(this.zza) && zzpcVar.zzb.equals(this.zzb);
    }
}
