package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzoo<P> {
    private final Map<zzxv, List<zzop<P>>> zza;
    private final List<zzop<P>> zzb;
    private final zzop<P> zzc;
    private final Class<P> zzd;
    private final zzrk zze;

    public static <P> zzon<P> zza(Class<P> cls) {
        return new zzon<>(cls);
    }

    @Nullable
    public final zzop<P> zza() {
        return this.zzc;
    }

    public final zzrk zzb() {
        return this.zze;
    }

    public final Class<P> zzc() {
        return this.zzd;
    }

    public final Collection<List<zzop<P>>> zzd() {
        return this.zza.values();
    }

    public final List<zzop<P>> zza(byte[] bArr) {
        List<zzop<P>> list = this.zza.get(zzxv.zza(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final List<zzop<P>> zze() {
        return zza(zzbo.zza);
    }

    private zzoo(Map<zzxv, List<zzop<P>>> map, List<zzop<P>> list, zzop<P> zzopVar, zzrk zzrkVar, Class<P> cls) {
        this.zza = map;
        this.zzb = list;
        this.zzc = zzopVar;
        this.zzd = cls;
        this.zze = zzrkVar;
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
