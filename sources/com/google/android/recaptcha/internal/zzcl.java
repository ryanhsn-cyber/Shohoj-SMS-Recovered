package com.google.android.recaptcha.internal;

import java.util.HashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzcl {
    private final zzaa zza;
    private final zzck zzb = new zzck();
    private final HashMap zzc = new HashMap();
    private final zzcd zzd;
    private final zzag zze;

    public zzcl(zzcd zzcdVar, zzag zzagVar, zzaa zzaaVar) {
        this.zzd = zzcdVar;
        this.zze = zzagVar;
        this.zza = zzaaVar;
        this.zzb.zze(173, this.zzc);
    }

    public final zzaa zza() {
        return this.zza;
    }

    public final zzck zzb() {
        return this.zzb;
    }

    public final void zzc() {
        this.zzb.zzd();
        this.zzb.zze(173, this.zzc);
    }

    public final zzag zzd() {
        return this.zze;
    }

    public final zzcd zze() {
        return this.zzd;
    }

    public final void zzf(int i, Object obj) {
        this.zzc.put(Integer.valueOf(i - 2), obj);
    }
}
