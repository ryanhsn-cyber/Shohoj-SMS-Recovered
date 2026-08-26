package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzft {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzft(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2c
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.recaptcha.internal.zzff.zzc(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L20
            goto L21
        L20:
            r6 = r3
        L21:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.recaptcha.internal.zzff.zzc(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2c:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzft.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            boolean z = zzftVar.zzi;
            if (Arrays.equals(this.zzf, zzftVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char zza(int i) {
        return this.zzf[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb(char c) throws zzfw {
        if (c > 127) {
            throw new zzfw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.zzg[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzfw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zzfw("Unrecognized character: " + c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zzd(char c) {
        return this.zzg[61] != -1;
    }

    private zzft(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        if (cArr != null) {
            this.zzf = cArr;
            try {
                int length = cArr.length;
                int zzb = zzga.zzb(length, RoundingMode.UNNECESSARY);
                this.zzb = zzb;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
                int i = 1 << (3 - numberOfTrailingZeros);
                this.zzc = i;
                this.zzd = this.zzb >> numberOfTrailingZeros;
                this.zza = length - 1;
                this.zzg = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.zzd; i2++) {
                    zArr[zzga.zza(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
                }
                this.zzh = zArr;
                this.zzi = false;
                return;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
            }
        }
        throw null;
    }
}
