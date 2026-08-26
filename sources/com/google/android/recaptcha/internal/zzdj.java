package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzdj implements zzdd {
    public static final zzdj zza = new zzdj();

    private zzdj() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length == 2) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field == null) {
                throw new zzae(4, 5, null);
            }
            try {
                zzcjVar.zzc().zzf(i, field.get(zzcjVar.zzc().zza(zzpqVarArr[1])));
                return;
            } catch (Exception e) {
                throw new zzae(6, 16, e);
            }
        }
        throw new zzae(4, 3, null);
    }
}
