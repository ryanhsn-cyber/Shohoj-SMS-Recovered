package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zznl {
    private static final zznl zza = new zznl();
    private static final zzno zzb = new zzno();
    private final AtomicReference<zzrp> zzc = new AtomicReference<>();

    public static zznl zza() {
        return zza;
    }

    public final zzrp zzb() {
        zzrp zzrpVar = this.zzc.get();
        if (zzrpVar == null) {
            return zzb;
        }
        return zzrpVar;
    }
}
