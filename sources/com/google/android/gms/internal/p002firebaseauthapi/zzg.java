package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzg extends Handler {
    private static zzf zza = null;
    private final Looper zzb;

    public zzg() {
        this.zzb = Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        this.zzb = Looper.getMainLooper();
    }
}
