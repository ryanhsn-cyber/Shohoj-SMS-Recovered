package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzba<K, V> extends zzav<Map.Entry<K, V>> {
    private final transient zzau<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc = 0;
    private final transient int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzav
    final zzaq<Map.Entry<K, V>> zzg() {
        return new zzaz(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    /* renamed from: zzd */
    public final zzbd<Map.Entry<K, V>> iterator() {
        return (zzbd) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzav, com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(zzau<K, V> zzauVar, Object[] objArr, int i, int i2) {
        this.zza = zzauVar;
        this.zzb = objArr;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.zza.get(key));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
