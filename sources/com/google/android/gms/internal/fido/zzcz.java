package com.google.android.gms.internal.fido;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes11.dex */
public abstract class zzcz implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzcz zzb = new zzcw(zzde.zzd);
    private static final zzcy zzd;
    private int zzc = 0;

    static {
        int i = zzcp.zza;
        zzd = new zzcy(null);
        zza = new zzcr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static zzcz zzl(byte[] bArr, int i, int i2) {
        zzj(0, i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return new zzcw(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzcq(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzdg.zza(this) : zzdg.zza(zzg(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf(int i, int i2, int i3);

    public abstract zzcz zzg(int i, int i2);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzde.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
