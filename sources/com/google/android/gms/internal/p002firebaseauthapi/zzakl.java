package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzakl implements zzaki {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final int zza(int i, Object obj, Object obj2) {
        zzakj zzakjVar = (zzakj) obj;
        if (zzakjVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzakjVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final zzakg<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final Object zza(Object obj, Object obj2) {
        zzakj zzakjVar = (zzakj) obj;
        zzakj zzakjVar2 = (zzakj) obj2;
        if (!zzakjVar2.isEmpty()) {
            if (!zzakjVar.zzd()) {
                zzakjVar = zzakjVar.zzb();
            }
            zzakjVar.zza(zzakjVar2);
        }
        return zzakjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final Object zzb(Object obj) {
        return zzakj.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final Object zzc(Object obj) {
        ((zzakj) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final Map<?, ?> zzd(Object obj) {
        return (zzakj) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final Map<?, ?> zze(Object obj) {
        return (zzakj) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final boolean zzf(Object obj) {
        return !((zzakj) obj).zzd();
    }
}
