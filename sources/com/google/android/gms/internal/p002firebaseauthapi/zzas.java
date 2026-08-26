package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzas<E> extends zzak<E> {
    private final zzaq<E> zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    protected final E zza(int i) {
        return this.zza.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzaq<E> zzaqVar, int i) {
        super(zzaqVar.size(), i);
        this.zza = zzaqVar;
    }
}
