package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzcn implements zzdd {
    public static final zzcn zza = new zzcn();

    private zzcn() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        Object obj;
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, null);
        }
        Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzae(4, 5, null);
        }
        Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num != null) {
            int intValue = num.intValue();
            try {
                if (zza2 instanceof String) {
                    obj = String.valueOf(((String) zza2).charAt(intValue));
                } else {
                    obj = zza2 instanceof List ? ((List) zza2).get(intValue) : Array.get(zza2, intValue);
                }
                zzcjVar.zzc().zzf(i, obj);
                return;
            } catch (Exception e) {
                if (!(e instanceof ArrayIndexOutOfBoundsException)) {
                    throw new zzae(4, 23, e);
                }
                throw new zzae(4, 22, e);
            }
        }
        throw new zzae(4, 5, null);
    }
}
