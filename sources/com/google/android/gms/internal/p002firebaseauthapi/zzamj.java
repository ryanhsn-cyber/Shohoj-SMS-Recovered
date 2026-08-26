package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzamj implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzamh zzb;

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamj(zzamh zzamhVar) {
        zzajv zzajvVar;
        this.zzb = zzamhVar;
        zzajvVar = this.zzb.zza;
        this.zza = zzajvVar.iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }
}
