package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzajx extends zzaju {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzamm.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    private static <L> List<L> zza(Object obj, long j, int i) {
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzajv) {
                arrayList = new zzajs(i);
            } else if ((zzc instanceof zzalb) && (zzc instanceof zzajl)) {
                arrayList = ((zzajl) zzc).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzamm.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzamm.zza(obj, j, arrayList2);
            return arrayList2;
        }
        if (zzc instanceof zzamh) {
            zzajs zzajsVar = new zzajs(zzc.size() + i);
            zzajsVar.addAll((zzamh) zzc);
            zzamm.zza(obj, j, zzajsVar);
            return zzajsVar;
        }
        if ((zzc instanceof zzalb) && (zzc instanceof zzajl)) {
            zzajl zzajlVar = (zzajl) zzc;
            if (!zzajlVar.zzc()) {
                zzajl zza2 = zzajlVar.zza(zzc.size() + i);
                zzamm.zza(obj, j, zza2);
                return zza2;
            }
            return zzc;
        }
        return zzc;
    }

    private zzajx() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzamm.zze(obj, j);
        if (list instanceof zzajv) {
            unmodifiableList = ((zzajv) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzalb) && (list instanceof zzajl)) {
                zzajl zzajlVar = (zzajl) list;
                if (zzajlVar.zzc()) {
                    zzajlVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzamm.zza(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzamm.zza(obj, j, zzc);
    }
}
