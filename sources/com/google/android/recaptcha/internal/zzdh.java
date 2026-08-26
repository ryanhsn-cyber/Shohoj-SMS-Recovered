package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzdh implements zzdd {
    public static final zzdh zza = new zzdh();

    private zzdh() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length == 2) {
            Class<?> zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 == null) {
                throw new zzae(4, 5, null);
            }
            Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
            Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
            if (true != (zza3 instanceof String)) {
                zza3 = null;
            }
            String str = (String) zza3;
            if (str != null) {
                try {
                    zzcjVar.zzc().zzf(i, cls.getField(zzcjVar.zzh().zza(str)));
                    return;
                } catch (Exception e) {
                    throw new zzae(6, 10, e);
                }
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
