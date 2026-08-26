package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public abstract class zzaho implements Serializable, Iterable<Byte> {
    public static final zzaho zza = new zzaib(zzajh.zzb);
    private static final zzahv zzb = new zzaia();
    private static final Comparator<zzaho> zzc = new zzahq();
    private int zzd = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract zzaho zza(int i, int i2);

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzahp zzahpVar) throws IOException;

    protected abstract void zza(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzb();

    protected abstract int zzb(int i, int i2, int i3);

    public abstract zzaic zzc();

    public abstract boolean zze();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            }
            if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            }
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
        return i4;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int zzb2 = zzb();
            i = zzb(zzb2, 0, zzb2);
            if (i == 0) {
                i = 1;
            }
            this.zzd = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzahx zzc(int i) {
        return new zzahx(i);
    }

    public static zzaho zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaho zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzaib(zzb.zza(bArr, i, i2));
    }

    public static zzaho zza(String str) {
        return new zzaib(str.getBytes(zzajh.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaho zzb(byte[] bArr) {
        return new zzaib(bArr);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzaly.zza(this);
        } else {
            str = zzaly.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }

    public final String zzd() {
        return zzb() == 0 ? "" : zza(zzajh.zza);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzahr(this);
    }

    public final byte[] zzf() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzajh.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }
}
