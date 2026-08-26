package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaeg extends zzafx {
    private final String zza;
    private final String zzb;

    public final int hashCode() {
        return (((this.zza == null ? 0 : this.zza.hashCode()) ^ 1000003) * 1000003) ^ (this.zzb != null ? this.zzb.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafx
    final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafx
    final String zzb() {
        return this.zza;
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaeg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzafx)) {
            return false;
        }
        zzafx zzafxVar = (zzafx) obj;
        if (this.zza != null ? this.zza.equals(zzafxVar.zzb()) : zzafxVar.zzb() == null) {
            if (this.zzb != null ? this.zzb.equals(zzafxVar.zza()) : zzafxVar.zza() == null) {
                return true;
            }
        }
        return false;
    }
}
