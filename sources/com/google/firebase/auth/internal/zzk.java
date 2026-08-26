package com.google.firebase.auth.internal;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
final class zzk extends zzg {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public final int hashCode() {
        return (((((this.zza == null ? 0 : this.zza.hashCode()) ^ 1000003) * 1000003) ^ (this.zzb == null ? 0 : this.zzb.hashCode())) * 1000003) ^ (this.zzc != null ? this.zzc.hashCode() : 0);
    }

    @Override // com.google.firebase.auth.internal.zzg
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.internal.zzg
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.internal.zzg
    public final String zzc() {
        return this.zza;
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.zza + ", playIntegrityToken=" + this.zzb + ", recaptchaEnterpriseToken=" + this.zzc + "}";
    }

    private zzk(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        if (this.zza != null ? this.zza.equals(zzgVar.zzc()) : zzgVar.zzc() == null) {
            if (this.zzb != null ? this.zzb.equals(zzgVar.zza()) : zzgVar.zza() == null) {
                if (this.zzc != null ? this.zzc.equals(zzgVar.zzb()) : zzgVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
