package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzku extends zzle {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzku(int i) {
        super(i, null);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                ((zzii) zzg(i).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzii) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
