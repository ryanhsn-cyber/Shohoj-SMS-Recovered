package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzalm extends zzalu {
    private final /* synthetic */ zzali zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzalk(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzalm(zzali zzaliVar) {
        super(zzaliVar);
        this.zza = zzaliVar;
    }
}
