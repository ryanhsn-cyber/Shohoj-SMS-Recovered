package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzcm implements zzdd {
    public static final zzcm zza = new zzcm();

    private zzcm() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        Object obj;
        if (zzpqVarArr.length == 2) {
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
                if (zza2 instanceof Integer) {
                    obj = Integer.valueOf(((Number) zza2).intValue() + intValue);
                } else if (zza2 instanceof int[]) {
                    int[] iArr = (int[]) zza2;
                    ArrayList arrayList = new ArrayList(iArr.length);
                    for (int i2 : iArr) {
                        arrayList.add(Integer.valueOf(i2 + intValue));
                    }
                    obj = (Serializable) arrayList.toArray(new Integer[0]);
                } else {
                    throw new zzae(4, 5, null);
                }
                zzcjVar.zzc().zzf(i, obj);
                return;
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
