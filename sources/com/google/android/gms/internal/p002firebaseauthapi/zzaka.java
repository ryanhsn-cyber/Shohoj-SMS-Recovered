package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaka extends zzahi<Long> implements zzajl<Long>, zzalb, RandomAccess {
    private static final zzaka zza = new zzaka(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + zzajh.zza(this.zzb[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final long zzb(int i) {
        zzd(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final /* synthetic */ zzajl<Long> zza(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzaka(Arrays.copyOf(this.zzb, i), this.zzc, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        zzd(i);
        long j = this.zzb[i];
        if (i < this.zzc - 1) {
            System.arraycopy(this.zzb, i + 1, this.zzb, i, (this.zzc - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzd(i);
        long j = this.zzb[i];
        this.zzb[i] = longValue;
        return Long.valueOf(j);
    }

    private final String zzc(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    zzaka() {
        this(new long[10], 0, true);
    }

    private zzaka(long[] jArr, int i, boolean z) {
        super(z);
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i, this.zzb, i + 1, this.zzc - i);
        } else {
            long[] jArr = new long[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, jArr, 0, i);
            System.arraycopy(this.zzb, i, jArr, i + 1, this.zzc - i);
            this.zzb = jArr;
        }
        this.zzb[i] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final void zza(long j) {
        zza();
        if (this.zzc == this.zzb.length) {
            long[] jArr = new long[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, jArr, 0, this.zzc);
            this.zzb = jArr;
        }
        long[] jArr2 = this.zzb;
        int i = this.zzc;
        this.zzc = i + 1;
        jArr2[i] = j;
    }

    private final void zzd(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzb, i2, this.zzb, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zzajh.zza(collection);
        if (!(collection instanceof zzaka)) {
            return super.addAll(collection);
        }
        zzaka zzakaVar = (zzaka) collection;
        if (zzakaVar.zzc == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.zzc < zzakaVar.zzc) {
            throw new OutOfMemoryError();
        }
        int i = this.zzc + zzakaVar.zzc;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i);
        }
        System.arraycopy(zzakaVar.zzb, 0, this.zzb, this.zzc, zzakaVar.zzc);
        this.zzc = i;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaka)) {
            return super.equals(obj);
        }
        zzaka zzakaVar = (zzaka) obj;
        if (this.zzc != zzakaVar.zzc) {
            return false;
        }
        long[] jArr = zzakaVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }
}
