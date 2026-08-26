package com.google.android.recaptcha.internal;

import android.content.Context;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzek implements zzen {
    private final Context zzb;

    public zzek(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(Object... objArr) {
        return this.zzb.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
