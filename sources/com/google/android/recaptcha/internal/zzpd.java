package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzpd extends zzit implements zzkf {
    private static final zzpd zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzpd zzpdVar = new zzpd();
        zzb = zzpdVar;
        zzit.zzD(zzpd.class, zzpdVar);
    }

    private zzpd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzH(zzpd zzpdVar, zznf zznfVar) {
        zznfVar.getClass();
        zzpdVar.zze = zznfVar;
        zzpdVar.zzd = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzI(zzpd zzpdVar, zznu zznuVar) {
        zznuVar.getClass();
        zzpdVar.zze = zznuVar;
        zzpdVar.zzd = 2;
    }

    public static zzpc zzi() {
        return (zzpc) zzb.zzp();
    }

    public static zzpd zzk(byte[] bArr) throws zzje {
        return (zzpd) zzit.zzu(zzb, bArr);
    }

    public final int zzJ() {
        switch (this.zzd) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 0;
        }
    }

    public final zznf zzf() {
        return this.zzd == 1 ? (zznf) this.zze : zznf.zzH();
    }

    public final zznu zzg() {
        return this.zzd == 2 ? (zznu) this.zze : zznu.zzg();
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
                return zzA(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zznf.class, zznu.class});
            case 3:
                return new zzpd();
            case 4:
                return new zzpc(zzorVar);
            case 5:
                return zzb;
        }
    }
}
