package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzajz extends zzaju {
    private static <E> zzajl<E> zzc(Object obj, long j) {
        return (zzajl) zzamm.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <L> List<L> zza(Object obj, long j) {
        zzajl zzc = zzc(obj, j);
        if (!zzc.zzc()) {
            int size = zzc.size();
            zzajl zza = zzc.zza(size == 0 ? 10 : size << 1);
            zzamm.zza(obj, j, zza);
            return zza;
        }
        return zzc;
    }

    private zzajz() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzajl zzc = zzc(obj, j);
        zzajl zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzamm.zza(obj, j, zzc2);
    }
}
