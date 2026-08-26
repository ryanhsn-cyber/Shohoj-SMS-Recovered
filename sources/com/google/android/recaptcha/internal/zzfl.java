package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzfl extends zzfp implements Serializable {
    final int zza;
    private final Queue zzb;

    public static zzfl zza(int i) {
        return new zzfl(i);
    }

    @Override // com.google.android.recaptcha.internal.zzfn, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw null;
        }
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzfn, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.zza) {
            return zzfs.zza(this, collection.iterator());
        }
        clear();
        int i = this.zza;
        if (collection != null) {
            int i2 = size - i;
            zzff.zzb(i2 >= 0, "number to skip cannot be negative");
            return zzfs.zza(this, new zzfr(collection, i2).iterator());
        }
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzfp, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzfn, com.google.android.recaptcha.internal.zzfo
    protected final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzfp, com.google.android.recaptcha.internal.zzfn
    protected final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzfp
    protected final Queue zzd() {
        return this.zzb;
    }

    private zzfl(int i) {
        if (i >= 0) {
            this.zzb = new ArrayDeque(i);
            this.zza = i;
            return;
        }
        throw new IllegalArgumentException(zzfi.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
    }
}
