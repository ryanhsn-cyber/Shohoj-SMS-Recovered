package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzeo implements zzen {
    private final Context zzb;
    private final Map zzc = MapsKt.mapOf(TuplesKt.to(2, "activity"), TuplesKt.to(3, "phone"), TuplesKt.to(4, "input_method"), TuplesKt.to(5, "audio"));

    public zzeo(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzae(4, 5, null);
        }
        Object obj2 = this.zzc.get(Integer.valueOf(num.intValue()));
        if (obj2 == null) {
            throw new zzae(4, 4, null);
        }
        return this.zzb.getSystemService((String) obj2);
    }
}
