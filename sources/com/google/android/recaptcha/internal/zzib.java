package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzib extends zzit implements zzkf {
    private static final zzib zzb;
    private long zzd;
    private int zze;

    static {
        zzib zzibVar = new zzib();
        zzb = zzibVar;
        zzit.zzD(zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static zzia zzi() {
        return (zzia) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return new zzkp(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
            case 3:
                return new zzib();
            case 4:
                return new zzia(null);
            case 5:
                return zzb;
        }
    }
}
