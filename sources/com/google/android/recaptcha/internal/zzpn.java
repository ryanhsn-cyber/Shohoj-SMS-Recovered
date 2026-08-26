package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzpn extends zzit implements zzkf {
    private static final zzpn zzb;
    private String zzd = "";
    private zziy zze = zzv();
    private zzja zzf = zzw();

    static {
        zzpn zzpnVar = new zzpn();
        zzb = zzpnVar;
        zzit.zzD(zzpn.class, zzpnVar);
    }

    private zzpn() {
    }

    public static zzpn zzg(byte[] bArr) throws zzje {
        return (zzpn) zzit.zzu(zzb, bArr);
    }

    public final String zzi() {
        return this.zzd;
    }

    public final List zzj() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i, Object obj, Object obj2) {
        zzor zzorVar = null;
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return zzA(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%", new Object[]{"zzd", "zze", "zzf"});
            case 3:
                return new zzpn();
            case 4:
                return new zzpm(zzorVar);
            case 5:
                return zzb;
        }
    }
}
