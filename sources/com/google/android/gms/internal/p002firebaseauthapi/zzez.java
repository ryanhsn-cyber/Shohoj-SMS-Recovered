package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzez extends zzcw {
    private final String zza;
    private final zza zzb;

    public final int hashCode() {
        return Objects.hash(zzez.class, this.zza, this.zzb);
    }

    public final zza zzb() {
        return this.zzb;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("NO_PREFIX");
        private final String zzc;

        public final String toString() {
            return this.zzc;
        }

        private zza(String str) {
            this.zzc = str;
        }
    }

    public static zzez zza(String str, zza zzaVar) {
        return new zzez(str, zzaVar);
    }

    public final String zzc() {
        return this.zza;
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + String.valueOf(this.zzb) + ")";
    }

    private zzez(String str, zza zzaVar) {
        this.zza = str;
        this.zzb = zzaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzez)) {
            return false;
        }
        zzez zzezVar = (zzez) obj;
        return zzezVar.zza.equals(this.zza) && zzezVar.zzb.equals(this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzb != zza.zzb;
    }
}
