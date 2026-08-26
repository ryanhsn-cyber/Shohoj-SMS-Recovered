package com.google.firebase.auth.internal;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
final class zzj extends zzf {
    private String zza;
    private String zzb;

    @Override // com.google.firebase.auth.internal.zzf
    public final zzf zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzf
    public final zzf zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzf
    public final zzg zza() {
        return new zzk(this.zza, this.zzb);
    }
}
