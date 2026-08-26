package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeEmailInfo;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzq extends ActionCodeEmailInfo {
    private final String zza;

    @Override // com.google.firebase.auth.ActionCodeEmailInfo
    public final String getPreviousEmail() {
        return this.zza;
    }

    public zzq(String str, String str2) {
        this.email = Preconditions.checkNotEmpty(str);
        this.zza = Preconditions.checkNotEmpty(str2);
    }
}
