package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzby {
    private volatile int zza;
    private final zzan zzb;
    private volatile boolean zzc;

    public zzby(FirebaseApp firebaseApp) {
        this(firebaseApp.getApplicationContext(), new zzan(firebaseApp));
    }

    private zzby(Context context, zzan zzanVar) {
        this.zzc = false;
        this.zza = 0;
        this.zzb = zzanVar;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zzbx(this));
    }

    public final void zza() {
        this.zzb.zzb();
    }

    public final void zza(int i) {
        if (i > 0 && this.zza == 0) {
            this.zza = i;
            if (zzb()) {
                this.zzb.zzc();
            }
        } else if (i == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i;
    }

    public final void zza(zzafm zzafmVar) {
        if (zzafmVar == null) {
            return;
        }
        long zza = zzafmVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzafmVar.zzb() + (zza * 1000);
        zzan zzanVar = this.zzb;
        zzanVar.zza = zzb;
        zzanVar.zzb = -1L;
        if (zzb()) {
            this.zzb.zzc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.zza > 0 && !this.zzc;
    }
}
