package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
@Deprecated
/* loaded from: classes11.dex */
public final class zzamh extends AbstractList<String> implements zzajv, RandomAccess {
    private final zzajv zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final zzajv zzd() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzamj(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final List<?> zze() {
        return this.zza.zze();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzamk(this, i);
    }

    public zzamh(zzajv zzajvVar) {
        this.zza = zzajvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final void zza(zzaho zzahoVar) {
        throw new UnsupportedOperationException();
    }
}
