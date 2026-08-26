package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzajs extends zzahi<String> implements zzajv, RandomAccess {
    private static final zzajs zza;

    @Deprecated
    private static final zzajv zzb;
    private final List<Object> zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final /* synthetic */ zzajl zza(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzajs((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final zzajv zzd() {
        if (zzc()) {
            return new zzamh(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaho) {
            zzaho zzahoVar = (zzaho) obj;
            String zzd = zzahoVar.zzd();
            if (zzahoVar.zze()) {
                this.zzc.set(i, zzd);
            }
            return zzd;
        }
        byte[] bArr = (byte[]) obj;
        String zzb2 = zzajh.zzb(bArr);
        if (zzajh.zzc(bArr)) {
            this.zzc.set(i, zzb2);
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final Object zzb(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zza(remove);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zza(this.zzc.set(i, (String) obj));
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaho) {
            return ((zzaho) obj).zzd();
        }
        return zzajh.zzb((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final List<?> zze() {
        return Collections.unmodifiableList(this.zzc);
    }

    static {
        zzajs zzajsVar = new zzajs(false);
        zza = zzajsVar;
        zzb = zzajsVar;
    }

    public zzajs() {
        this(10);
    }

    public zzajs(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzajs(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private zzajs(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final void zza(zzaho zzahoVar) {
        zza();
        this.zzc.add(zzahoVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzajv) {
            collection = ((zzajv) collection).zze();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }
}
