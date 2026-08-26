package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzbx implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzby zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbx(zzby zzbyVar) {
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        boolean zzb;
        zzan zzanVar;
        if (z) {
            this.zza.zzc = true;
            this.zza.zza();
            return;
        }
        this.zza.zzc = false;
        zzb = this.zza.zzb();
        if (zzb) {
            zzanVar = this.zza.zzb;
            zzanVar.zzc();
        }
    }
}
