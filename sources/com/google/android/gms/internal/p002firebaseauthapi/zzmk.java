package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzmk<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmk<E, O> zza(E e, O o) {
        this.zza.put(e, o);
        this.zzb.put(o, e);
        return this;
    }

    public final zzmh<E, O> zza() {
        return new zzmh<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }

    private zzmk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
