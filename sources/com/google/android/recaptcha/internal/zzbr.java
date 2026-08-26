package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzbr {
    public static final zzbr zza = new zzbr();

    private zzbr() {
    }

    public static final zzp zza(int i) {
        switch (i) {
            case 403:
                return new zzp(zzn.zzl, zzl.zzV, null);
            case 404:
                return new zzp(zzn.zze, zzl.zzs, null);
            case 503:
                return new zzp(zzn.zzl, zzl.zzV, null);
            default:
                return new zzp(zzn.zzc, zzl.zzW, null);
        }
    }
}
