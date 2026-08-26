package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzpf extends zzit implements zzkf {
    private static final zzpf zzb;
    private zzjb zzd = zzx();

    static {
        zzpf zzpfVar = new zzpf();
        zzb = zzpfVar;
        zzit.zzD(zzpf.class, zzpfVar);
    }

    private zzpf() {
    }

    public static zzpf zzg(byte[] bArr) throws zzje {
        return (zzpf) zzit.zzu(zzb, bArr);
    }

    public final List zzi() {
        return this.zzd;
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
                return zzA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzpr.class});
            case 3:
                return new zzpf();
            case 4:
                return new zzpe(zzorVar);
            case 5:
                return zzb;
        }
    }
}
