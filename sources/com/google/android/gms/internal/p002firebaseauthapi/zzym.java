package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzbh;
import com.google.firebase.auth.zzf;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzym {
    private String zza;
    private List<zzafq> zzb;
    private zzf zzc;

    public final zzf zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return zzbh.zza(this.zzb);
    }

    public zzym(String str, List<zzafq> list, zzf zzfVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzfVar;
    }
}
