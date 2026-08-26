package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public abstract class zzav<E> extends zzal<E> implements Set<E> {

    @CheckForNull
    private transient zzaq<E> zza;

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbe.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public zzaq<E> zzc() {
        zzaq<E> zzaqVar = this.zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq<E> zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    zzaq<E> zzg() {
        return zzaq.zza(toArray());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        return zzbe.zza(this, obj);
    }
}
