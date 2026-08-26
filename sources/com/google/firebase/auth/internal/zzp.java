package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeInfo;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzp extends ActionCodeInfo {
    public zzp(String str) {
        this.email = Preconditions.checkNotEmpty(str);
    }
}
