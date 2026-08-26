package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaej extends zzafy {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzafb zzd;
    private final String zze;

    public final int hashCode() {
        return ((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (this.zzb == null ? 0 : this.zzb.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafy
    public final zzafb zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafy
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafy
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafy
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafy
    public final String zzf() {
        return this.zzc;
    }

    public final String toString() {
        return "RevokeTokenRequest{providerId=" + this.zza + ", tenantId=" + this.zzb + ", token=" + this.zzc + ", tokenType=" + String.valueOf(this.zzd) + ", idToken=" + this.zze + "}";
    }

    private zzaej(String str, String str2, String str3, zzafb zzafbVar, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzafbVar;
        this.zze = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzafy)) {
            return false;
        }
        zzafy zzafyVar = (zzafy) obj;
        return this.zza.equals(zzafyVar.zzd()) && (this.zzb != null ? this.zzb.equals(zzafyVar.zze()) : zzafyVar.zze() == null) && this.zzc.equals(zzafyVar.zzf()) && this.zzd.equals(zzafyVar.zzb()) && this.zze.equals(zzafyVar.zzc());
    }
}
