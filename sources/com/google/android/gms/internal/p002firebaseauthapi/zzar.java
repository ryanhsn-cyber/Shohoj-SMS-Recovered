package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzar<E> extends zzaq<E> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzaq zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq
    /* renamed from: zza */
    public final zzaq<E> subList(int i, int i2) {
        zzz.zza(i, i2, this.zzb);
        return (zzaq) this.zzc.subList(i + this.zza, i2 + this.zza);
    }

    @Override // java.util.List
    public final E get(int i) {
        zzz.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(zzaq zzaqVar, int i, int i2) {
        this.zzc = zzaqVar;
        this.zza = i;
        this.zzb = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    @CheckForNull
    public final Object[] zzf() {
        return this.zzc.zzf();
    }
}
