package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzafe {
    private List<zzaff> zza;

    public final List<zzaff> zza() {
        return this.zza;
    }

    public zzafe() {
        this.zza = new ArrayList();
    }

    public zzafe(List<zzaff> list) {
        this.zza = Collections.unmodifiableList(list);
    }
}
