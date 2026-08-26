package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzjw implements zzks {
    private static final zzkc zza = new zzju();
    private final zzkc zzb;

    public zzjw() {
        zzkc zzkcVar;
        zzkc[] zzkcVarArr = new zzkc[2];
        zzkcVarArr[0] = zzim.zza();
        try {
            zzkcVar = (zzkc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            zzkcVar = zza;
        }
        zzkcVarArr[1] = zzkcVar;
        zzjv zzjvVar = new zzjv(zzkcVarArr);
        byte[] bArr = zzjc.zzd;
        this.zzb = zzjvVar;
    }

    private static boolean zzb(zzkb zzkbVar) {
        switch (zzkbVar.zzc() - 1) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final zzkr zza(Class cls) {
        zzkt.zzs(cls);
        zzkb zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            if (zzit.class.isAssignableFrom(cls)) {
                if (zzb(zzb)) {
                    return zzkh.zzm(cls, zzb, zzkl.zzb(), zzjs.zze(), zzkt.zzn(), zzih.zzb(), zzka.zzb());
                }
                return zzkh.zzm(cls, zzb, zzkl.zzb(), zzjs.zze(), zzkt.zzn(), null, zzka.zzb());
            }
            if (zzb(zzb)) {
                return zzkh.zzm(cls, zzb, zzkl.zza(), zzjs.zzd(), zzkt.zzm(), zzih.zza(), zzka.zza());
            }
            return zzkh.zzm(cls, zzb, zzkl.zza(), zzjs.zzd(), zzkt.zzm(), null, zzka.zza());
        }
        if (zzit.class.isAssignableFrom(cls)) {
            return zzki.zzc(zzkt.zzn(), zzih.zzb(), zzb.zza());
        }
        return zzki.zzc(zzkt.zzm(), zzih.zza(), zzb.zza());
    }
}
