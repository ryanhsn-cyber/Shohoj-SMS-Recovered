package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzali<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzalt> zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzalu zze;
    private Map<K, V> zzf;
    private volatile zzalm zzg;

    private final int zza(K k) {
        int size = this.zzb.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzb.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzb.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public final int zza() {
        return this.zzb.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zza = zza();
        int i = 0;
        for (int i2 = 0; i2 < zza; i2++) {
            i += this.zzb.get(i2).hashCode();
        }
        if (this.zzc.size() > 0) {
            return i + this.zzc.hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzaiz<FieldDescriptorType>> zzali<FieldDescriptorType, Object> zza(int i) {
        return new zzall(i);
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        if (this.zzc.isEmpty()) {
            return zzalo.zza();
        }
        return this.zzc.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzali<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzb.get(zza).getValue();
        }
        return this.zzc.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v) {
        zzg();
        int zza = zza((zzali<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzb.get(zza).setValue(v);
        }
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i = -(zza + 1);
        if (i >= this.zza) {
            return zzf().put(k, v);
        }
        if (this.zzb.size() == this.zza) {
            zzalt remove = this.zzb.remove(this.zza - 1);
            zzf().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzb.add(i, new zzalt(this, k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzali<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzali<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzc(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzc(int i) {
        zzg();
        V v = (V) this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zzb.add(new zzalt(this, it.next()));
            it.remove();
        }
        return v;
    }

    public final Map.Entry<K, V> zzb(int i) {
        return this.zzb.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzc() {
        if (this.zzg == null) {
            this.zzg = new zzalm(this);
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzalu(this);
        }
        return this.zze;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            this.zzc = new TreeMap();
            this.zzf = ((TreeMap) this.zzc).descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    private zzali(int i) {
        this.zza = i;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public void zzd() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = unmodifiableMap;
            if (this.zzf.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = unmodifiableMap2;
            this.zzd = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzali<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzali)) {
            return super.equals(obj);
        }
        zzali zzaliVar = (zzali) obj;
        int size = size();
        if (size != zzaliVar.size()) {
            return false;
        }
        int zza = zza();
        if (zza != zzaliVar.zza()) {
            return entrySet().equals(zzaliVar.entrySet());
        }
        for (int i = 0; i < zza; i++) {
            if (!zzb(i).equals(zzaliVar.zzb(i))) {
                return false;
            }
        }
        if (zza == size) {
            return true;
        }
        return this.zzc.equals(zzaliVar.zzc);
    }

    public final boolean zze() {
        return this.zzd;
    }
}
