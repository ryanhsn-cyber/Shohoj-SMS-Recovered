package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzahq implements Comparator<zzaho> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzaho zzahoVar, zzaho zzahoVar2) {
        zzaho zzahoVar3 = zzahoVar;
        zzaho zzahoVar4 = zzahoVar2;
        zzahu zzahuVar = (zzahu) zzahoVar3.iterator();
        zzahu zzahuVar2 = (zzahu) zzahoVar4.iterator();
        while (zzahuVar.hasNext() && zzahuVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzaho.zza(zzahuVar.zza())).compareTo(Integer.valueOf(zzaho.zza(zzahuVar2.zza())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzahoVar3.zzb()).compareTo(Integer.valueOf(zzahoVar4.zzb()));
    }
}
