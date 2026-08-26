package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzv {
    public static final zzv zza = new zzv();
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    private zzv() {
    }

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzu();
        }
        zzu zzuVar = (zzu) obj;
        zzuVar.zzg(zzuVar.zzb() + 1);
        zzuVar.zzf(zzuVar.zzd() + j);
        zzuVar.zze(Math.max(j, zzuVar.zzc()));
        zzb.put(valueOf, zzuVar);
    }
}
