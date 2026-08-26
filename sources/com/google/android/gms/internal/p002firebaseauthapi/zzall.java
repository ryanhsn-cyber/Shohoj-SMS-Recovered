package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzall<FieldDescriptorType> extends zzali<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzall(int i) {
        super(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzali
    public final void zzd() {
        if (!zze()) {
            for (int i = 0; i < zza(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzb = zzb(i);
                if (((zzaiz) zzb.getKey()).zze()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzb()) {
                if (((zzaiz) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
