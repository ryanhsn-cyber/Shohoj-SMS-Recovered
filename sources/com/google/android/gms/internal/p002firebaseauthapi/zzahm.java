package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzahm extends zzahi<Boolean> implements zzajl<Boolean>, zzalb, RandomAccess {
    private static final zzahm zza = new zzahm(new boolean[0], 0, false);
    private boolean[] zzb;
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
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final /* synthetic */ zzajl<Boolean> zza(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzahm(Arrays.copyOf(this.zzb, i), this.zzc, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Boolean.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        zzd(i);
        boolean z = this.zzb[i];
        if (i < this.zzc - 1) {
            System.arraycopy(this.zzb, i + 1, this.zzb, i, (this.zzc - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzd(i);
        boolean z = this.zzb[i];
        this.zzb[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    private final String zzc(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    zzahm() {
        this(new boolean[10], 0, true);
    }

    private zzahm(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzb = zArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i < 0 || i > this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i, this.zzb, i + 1, this.zzc - i);
        } else {
            boolean[] zArr = new boolean[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, zArr, 0, i);
            System.arraycopy(this.zzb, i, zArr, i + 1, this.zzc - i);
            this.zzb = zArr;
        }
        this.zzb[i] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    public final void zza(boolean z) {
        zza();
        if (this.zzc == this.zzb.length) {
            boolean[] zArr = new boolean[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i = this.zzc;
        this.zzc = i + 1;
        zArr2[i] = z;
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
        zza(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzajh.zza(collection);
        if (!(collection instanceof zzahm)) {
            return super.addAll(collection);
        }
        zzahm zzahmVar = (zzahm) collection;
        if (zzahmVar.zzc == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.zzc < zzahmVar.zzc) {
            throw new OutOfMemoryError();
        }
        int i = this.zzc + zzahmVar.zzc;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i);
        }
        System.arraycopy(zzahmVar.zzb, 0, this.zzb, this.zzc, zzahmVar.zzc);
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
        if (!(obj instanceof zzahm)) {
            return super.equals(obj);
        }
        zzahm zzahmVar = (zzahm) obj;
        if (this.zzc != zzahmVar.zzc) {
            return false;
        }
        boolean[] zArr = zzahmVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzb(int i) {
        zzd(i);
        return this.zzb[i];
    }
}
