package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
abstract class zzll {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(Object obj, int i, zzgw zzgwVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzp(Object obj, zzmd zzmdVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzq(Object obj, zzmd zzmdVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzs(zzkq zzkqVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzr(Object obj, zzkq zzkqVar) throws IOException {
        int zzd = zzkqVar.zzd();
        int i = zzd >>> 3;
        switch (zzd & 7) {
            case 0:
                zzl(obj, i, zzkqVar.zzl());
                return true;
            case 1:
                zzi(obj, i, zzkqVar.zzk());
                return true;
            case 2:
                zzk(obj, i, zzkqVar.zzp());
                return true;
            case 3:
                Object zzf = zzf();
                int i2 = i << 3;
                while (zzkqVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzkqVar)) {
                }
                if ((i2 | 4) != zzkqVar.zzd()) {
                    throw zzje.zzb();
                }
                zzg(zzf);
                zzj(obj, i, zzf);
                return true;
            case 4:
                return false;
            case 5:
                zzh(obj, i, zzkqVar.zzf());
                return true;
            default:
                throw zzje.zza();
        }
    }
}
