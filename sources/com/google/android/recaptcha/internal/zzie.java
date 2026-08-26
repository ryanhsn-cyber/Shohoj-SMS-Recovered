package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzie {
    public static final /* synthetic */ int zzb = 0;
    private final Map zzd;
    private static volatile boolean zzc = false;
    static final zzie zza = new zzie(true);

    zzie() {
        this.zzd = new HashMap();
    }

    public final zzir zza(zzke zzkeVar, int i) {
        return (zzir) this.zzd.get(new zzid(zzkeVar, i));
    }

    zzie(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
