package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzbb extends zzaq<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzz.zza(i, this.zzc);
        return Objects.requireNonNull(this.zza[(i * 2) + this.zzb]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbb(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
