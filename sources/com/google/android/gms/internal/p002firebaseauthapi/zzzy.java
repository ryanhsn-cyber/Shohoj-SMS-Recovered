package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzzy implements zzadm<zzafm> {
    final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzy(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zza.zza(zzal.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        zzadk zzadkVar;
        zzaep zzaepVar = new zzaep(zzafmVar.zzc());
        zzadkVar = this.zzb.zza;
        zzadkVar.zza(zzaepVar, new zzzx(this, this));
    }
}
