package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.compose.material3.MenuKt;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzan {
    private static Logger zzc = new Logger("TokenRefresher", "FirebaseAuth:");
    volatile long zza;
    volatile long zzb;
    private final FirebaseApp zzd;
    private long zze;
    private HandlerThread zzf;
    private Handler zzg;
    private Runnable zzh;

    public zzan(FirebaseApp firebaseApp) {
        zzc.v("Initializing TokenRefresher", new Object[0]);
        this.zzd = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.zzf = new HandlerThread("TokenRefresher", 10);
        this.zzf.start();
        this.zzg = new com.google.android.gms.internal.p002firebaseauthapi.zzg(this.zzf.getLooper());
        this.zzh = new zzaq(this, this.zzd.getName());
        this.zze = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    public final void zzb() {
        this.zzg.removeCallbacks(this.zzh);
    }

    public final void zzc() {
        zzc.v("Scheduling refresh for " + (this.zza - this.zze), new Object[0]);
        zzb();
        this.zzb = Math.max((this.zza - DefaultClock.getInstance().currentTimeMillis()) - this.zze, 0L) / 1000;
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd() {
        long j;
        switch ((int) this.zzb) {
            case 30:
            case 60:
            case MenuKt.InTransitionDuration /* 120 */:
            case 240:
            case 480:
                j = 2 * this.zzb;
                break;
            case 960:
                j = 960;
                break;
            default:
                j = 30;
                break;
        }
        this.zzb = j;
        this.zza = DefaultClock.getInstance().currentTimeMillis() + (this.zzb * 1000);
        zzc.v("Scheduling refresh for " + this.zza, new Object[0]);
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }
}
