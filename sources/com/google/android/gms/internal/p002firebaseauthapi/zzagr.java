package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzagr {
    private final int zza;
    private List<String> zzb;

    public static zzagr zza() {
        return new zzagr(null);
    }

    public final List<String> zzb() {
        return this.zzb;
    }

    public zzagr() {
        this(null);
    }

    private zzagr(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
    }

    public zzagr(int i, List<String> list) {
        this.zza = 1;
        if (list == null || list.isEmpty()) {
            this.zzb = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, Strings.emptyToNull(list.get(i2)));
        }
        this.zzb = Collections.unmodifiableList(list);
    }
}
