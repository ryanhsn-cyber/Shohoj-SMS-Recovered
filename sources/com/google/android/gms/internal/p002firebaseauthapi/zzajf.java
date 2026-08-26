package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzajf extends zzahi<Integer> implements zzajl<Integer>, zzalb, RandomAccess {
    private static final zzajf zza = new zzajf(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public final int zzb(int i) {
        zze(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == intValue) {
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
    public final /* synthetic */ zzajl<Integer> zza(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzajf(Arrays.copyOf(this.zzb, i), this.zzc, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        zze(i);
        int i2 = this.zzb[i];
        if (i < this.zzc - 1) {
            System.arraycopy(this.zzb, i + 1, this.zzb, i, (this.zzc - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zze(i);
        int i2 = this.zzb[i];
        this.zzb[i] = intValue;
        return Integer.valueOf(i2);
    }

    private final String zzd(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    zzajf() {
        this(new int[10], 0, true);
    }

    private zzajf(int[] iArr, int i, boolean z) {
        super(z);
        this.zzb = iArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i, this.zzb, i + 1, this.zzc - i);
        } else {
            int[] iArr = new int[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, iArr, 0, i);
            System.arraycopy(this.zzb, i, iArr, i + 1, this.zzc - i);
            this.zzb = iArr;
        }
        this.zzb[i] = intValue;
        this.zzc++;
        this.modCount++;
    }

    public final void zzc(int i) {
        zza();
        if (this.zzc == this.zzb.length) {
            int[] iArr = new int[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, iArr, 0, this.zzc);
            this.zzb = iArr;
        }
        int[] iArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        iArr2[i2] = i;
    }

    private final void zze(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i));
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
        zzc(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        zzajh.zza(collection);
        if (!(collection instanceof zzajf)) {
            return super.addAll(collection);
        }
        zzajf zzajfVar = (zzajf) collection;
        if (zzajfVar.zzc == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.zzc < zzajfVar.zzc) {
            throw new OutOfMemoryError();
        }
        int i = this.zzc + zzajfVar.zzc;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i);
        }
        System.arraycopy(zzajfVar.zzb, 0, this.zzb, this.zzc, zzajfVar.zzc);
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
        if (!(obj instanceof zzajf)) {
            return super.equals(obj);
        }
        zzajf zzajfVar = (zzajf) obj;
        if (this.zzc != zzajfVar.zzc) {
            return false;
        }
        int[] iArr = zzajfVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }
}
