package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzjv implements zzkc {
    private final zzkc[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjv(zzkc... zzkcVarArr) {
        this.zza = zzkcVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzkc
    public final zzkb zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzkc zzkcVar = this.zza[i];
            if (zzkcVar.zzc(cls)) {
                return zzkcVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.recaptcha.internal.zzkc
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
