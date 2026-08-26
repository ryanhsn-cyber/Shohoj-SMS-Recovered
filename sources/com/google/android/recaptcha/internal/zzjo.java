package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzjo extends zzjs {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzjo() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjo(zzjn zzjnVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List arrayList;
        List list = (List) zzlv.zzf(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzjm) {
                arrayList = new zzjl(i);
            } else if (!(list instanceof zzkm) || !(list instanceof zzjb)) {
                arrayList = new ArrayList(i);
            } else {
                arrayList = ((zzjb) list).zzd(i);
            }
            zzlv.zzs(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzlv.zzs(obj, j, arrayList2);
            return arrayList2;
        }
        if (list instanceof zzlq) {
            zzjl zzjlVar = new zzjl(list.size() + i);
            zzjlVar.addAll(zzjlVar.size(), (zzlq) list);
            zzlv.zzs(obj, j, zzjlVar);
            return zzjlVar;
        }
        if (!(list instanceof zzkm) || !(list instanceof zzjb)) {
            return list;
        }
        zzjb zzjbVar = (zzjb) list;
        if (zzjbVar.zzc()) {
            return list;
        }
        zzjb zzd = zzjbVar.zzd(list.size() + i);
        zzlv.zzs(obj, j, zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjs
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzlv.zzf(obj, j);
        if (list instanceof zzjm) {
            unmodifiableList = ((zzjm) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if (!(list instanceof zzkm) || !(list instanceof zzjb)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzjb zzjbVar = (zzjb) list;
                if (!zzjbVar.zzc()) {
                    return;
                }
                zzjbVar.zzb();
                return;
            }
        }
        zzlv.zzs(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzlv.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzlv.zzs(obj, j, list);
    }
}
