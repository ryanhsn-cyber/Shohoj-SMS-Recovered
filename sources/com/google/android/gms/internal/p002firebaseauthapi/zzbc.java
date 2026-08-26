package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzbc<K> extends zzav<K> {
    private final transient zzau<K, ?> zza;
    private final transient zzaq<K> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzav, com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    /* renamed from: zzd */
    public final zzbd<K> iterator() {
        return (zzbd) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzav, com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(zzau<K, ?> zzauVar, zzaq<K> zzaqVar) {
        this.zza = zzauVar;
        this.zzb = zzaqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
