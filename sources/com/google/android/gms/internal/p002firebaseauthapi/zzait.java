package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzait {
    private final Object zza;
    private final int zzb;

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzait(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzait)) {
            return false;
        }
        zzait zzaitVar = (zzait) obj;
        return this.zza == zzaitVar.zza && this.zzb == zzaitVar.zzb;
    }
}
