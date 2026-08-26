package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaz<K, V> extends zzaq<Map.Entry<K, V>> {
    private final /* synthetic */ zzba zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzd;
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzd;
        zzz.zza(i, i2);
        objArr = this.zza.zzb;
        int i3 = i * 2;
        Object requireNonNull = Objects.requireNonNull(objArr[i3]);
        objArr2 = this.zza.zzb;
        return new AbstractMap.SimpleImmutableEntry(requireNonNull, Objects.requireNonNull(objArr2[i3 + 1]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(zzba zzbaVar) {
        this.zza = zzbaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
