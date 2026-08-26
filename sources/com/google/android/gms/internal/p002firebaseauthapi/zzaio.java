package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaio extends zzahi<Double> implements zzajl<Double>, zzalb, RandomAccess {
    private static final zzaio zza = new zzaio(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    public final double zzb(int i) {
        zzd(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + zzajh.zza(Double.doubleToLongBits(this.zzb[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == doubleValue) {
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
    public final /* synthetic */ zzajl<Double> zza(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzaio(Arrays.copyOf(this.zzb, i), this.zzc, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Double.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        zzd(i);
        double d = this.zzb[i];
        if (i < this.zzc - 1) {
            System.arraycopy(this.zzb, i + 1, this.zzb, i, (this.zzc - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzd(i);
        double d = this.zzb[i];
        this.zzb[i] = doubleValue;
        return Double.valueOf(d);
    }

    private final String zzc(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    zzaio() {
        this(new double[10], 0, true);
    }

    private zzaio(double[] dArr, int i, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i < 0 || i > this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        if (this.zzc < this.zzb.length) {
            System.arraycopy(this.zzb, i, this.zzb, i + 1, this.zzc - i);
        } else {
            double[] dArr = new double[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, dArr, 0, i);
            System.arraycopy(this.zzb, i, dArr, i + 1, this.zzc - i);
            this.zzb = dArr;
        }
        this.zzb[i] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final void zza(double d) {
        zza();
        if (this.zzc == this.zzb.length) {
            double[] dArr = new double[((this.zzc * 3) / 2) + 1];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i = this.zzc;
        this.zzc = i + 1;
        dArr2[i] = d;
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
        zza(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzajh.zza(collection);
        if (!(collection instanceof zzaio)) {
            return super.addAll(collection);
        }
        zzaio zzaioVar = (zzaio) collection;
        if (zzaioVar.zzc == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.zzc < zzaioVar.zzc) {
            throw new OutOfMemoryError();
        }
        int i = this.zzc + zzaioVar.zzc;
        if (i > this.zzb.length) {
            this.zzb = Arrays.copyOf(this.zzb, i);
        }
        System.arraycopy(zzaioVar.zzb, 0, this.zzb, this.zzc, zzaioVar.zzc);
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
        if (!(obj instanceof zzaio)) {
            return super.equals(obj);
        }
        zzaio zzaioVar = (zzaio) obj;
        if (this.zzc != zzaioVar.zzc) {
            return false;
        }
        double[] dArr = zzaioVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }
}
