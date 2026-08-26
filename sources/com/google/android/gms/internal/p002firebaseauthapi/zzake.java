package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzake implements zzakm {
    private zzakm[] zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final zzakn zza(Class<?> cls) {
        for (zzakm zzakmVar : this.zza) {
            if (zzakmVar.zzb(cls)) {
                return zzakmVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzake(zzakm... zzakmVarArr) {
        this.zza = zzakmVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final boolean zzb(Class<?> cls) {
        for (zzakm zzakmVar : this.zza) {
            if (zzakmVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
