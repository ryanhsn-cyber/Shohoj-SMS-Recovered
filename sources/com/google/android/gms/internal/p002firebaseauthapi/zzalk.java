package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzalk<K, V> implements Iterator<Map.Entry<K, V>> {
    private int zza;
    private Iterator<Map.Entry<K, V>> zzb;
    private final /* synthetic */ zzali zzc;

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (zza().hasNext()) {
            return zza().next();
        }
        list = this.zzc.zzb;
        int i = this.zza - 1;
        this.zza = i;
        return (Map.Entry) list.get(i);
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    private zzalk(zzali zzaliVar) {
        List list;
        this.zzc = zzaliVar;
        list = this.zzc.zzb;
        this.zza = list.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        if (this.zza > 0) {
            int i = this.zza;
            list = this.zzc.zzb;
            if (i <= list.size()) {
                return true;
            }
        }
        return zza().hasNext();
    }
}
