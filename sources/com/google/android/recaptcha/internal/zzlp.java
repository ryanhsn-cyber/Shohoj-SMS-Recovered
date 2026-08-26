package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzlp implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzlq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlp(zzlq zzlqVar) {
        zzjm zzjmVar;
        this.zzb = zzlqVar;
        zzjmVar = this.zzb.zza;
        this.zza = zzjmVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
