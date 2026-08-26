package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public abstract class zzau<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];

    @CheckForNull
    private transient zzav<Map.Entry<K, V>> zzb;

    @CheckForNull
    private transient zzav<K> zzc;

    @CheckForNull
    private transient zzal<V> zzd;

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    public int hashCode() {
        return zzbe.zza((zzav) entrySet());
    }

    abstract zzal<V> zza();

    abstract zzav<Map.Entry<K, V>> zzb();

    abstract zzav<K> zzc();

    abstract boolean zzd();

    public static <K, V> zzau<K, V> zza(Map<? extends K, ? extends V> map) {
        int i;
        if ((map instanceof zzau) && !(map instanceof SortedMap)) {
            zzau<K, V> zzauVar = (zzau) map;
            zzauVar.zzd();
            return zzauVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        zzat zzatVar = new zzat(i);
        zzatVar.zza(entrySet);
        return zzatVar.zza();
    }

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzaj.zza(size, "size");
        StringBuilder append = new StringBuilder((int) Math.min(size << 3, 1073741824L)).append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            append.append(entry.getKey()).append('=').append(entry.getValue());
            z = false;
        }
        return append.append('}').toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzal<V> zzalVar = this.zzd;
        if (zzalVar != null) {
            return zzalVar;
        }
        zzal<V> zza2 = zza();
        this.zzd = zza2;
        return zza2;
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzav<Map.Entry<K, V>> zzavVar = this.zzb;
        if (zzavVar != null) {
            return zzavVar;
        }
        zzav<Map.Entry<K, V>> zzb = zzb();
        this.zzb = zzb;
        return zzb;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzav<K> zzavVar = this.zzc;
        if (zzavVar != null) {
            return zzavVar;
        }
        zzav<K> zzc = zzc();
        this.zzc = zzc;
        return zzc;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return ((zzal) values()).contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }
}
