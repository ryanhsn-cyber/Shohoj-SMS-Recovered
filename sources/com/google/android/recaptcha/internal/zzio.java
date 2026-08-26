package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public class zzio extends zzin implements zzkf {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzio(zzip zzipVar) {
        super(zzipVar);
    }

    @Override // com.google.android.recaptcha.internal.zzin, com.google.android.recaptcha.internal.zzkd
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzip zzk() {
        if (!((zzip) this.zza).zzG()) {
            return (zzip) this.zza;
        }
        ((zzip) this.zza).zzb.zzg();
        return (zzip) super.zzk();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzin
    public final void zzn() {
        super.zzn();
        if (((zzip) this.zza).zzb != zzij.zzd()) {
            zzip zzipVar = (zzip) this.zza;
            zzipVar.zzb = zzipVar.zzb.clone();
        }
    }
}
