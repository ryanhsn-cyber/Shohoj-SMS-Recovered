package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzaiq {
    private final Map<zzait, zzaje.zzd<?, ?>> zzd;
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    static final zzaiq zza = new zzaiq(true);

    public static zzaiq zza() {
        return zza;
    }

    public final <ContainingType extends zzakp> zzaje.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzaje.zzd) this.zzd.get(new zzait(containingtype, i));
    }

    zzaiq() {
        this.zzd = new HashMap();
    }

    private zzaiq(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
