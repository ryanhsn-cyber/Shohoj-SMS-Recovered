package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzay<E> extends zzaq<E> {
    static final zzaq<Object> zza = new zzay(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzal
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final int zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zzb() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzz.zza(i, this.zzc);
        return (E) Objects.requireNonNull(this.zzb[i]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final Object[] zzf() {
        return this.zzb;
    }
}
