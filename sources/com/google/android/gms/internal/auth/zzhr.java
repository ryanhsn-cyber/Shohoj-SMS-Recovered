package com.google.android.gms.internal.auth;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes11.dex */
public final class zzhr extends zzeu implements zzfx {
    private static final zzhr zzb;
    private zzey zzd = zzeu.zzc();

    static {
        zzhr zzhrVar = new zzhr();
        zzb = zzhrVar;
        zzeu.zzg(zzhr.class, zzhrVar);
    }

    private zzhr() {
    }

    public static zzhr zzk(byte[] bArr) throws zzfa {
        return (zzhr) zzeu.zzb(zzb, bArr);
    }

    public final List zzl() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.auth.zzeu
    public final Object zzi(int i, Object obj, Object obj2) {
        zzhp zzhpVar = null;
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return zzf(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
            case 3:
                return new zzhr();
            case 4:
                return new zzhq(zzhpVar);
            case 5:
                return zzb;
        }
    }
}
