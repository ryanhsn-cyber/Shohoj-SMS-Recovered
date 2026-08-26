package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzir extends zzic {
    final zzke zza;
    final zziq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzke zzkeVar, Object obj, zzke zzkeVar2, zziq zziqVar, Class cls) {
        if (zzkeVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (zziqVar.zzb == zzmb.MESSAGE) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.zza = zzkeVar;
        this.zzb = zziqVar;
    }
}
