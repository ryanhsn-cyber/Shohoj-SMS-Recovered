package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzfv extends zzfx {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzfv(java.lang.String r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzft r0 = new com.google.android.recaptcha.internal.zzft
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.recaptcha.internal.zzft.zze(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.recaptcha.internal.zzff.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfv.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    final int zza(byte[] bArr, CharSequence charSequence) throws zzfw {
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zze.length()) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                int zzb = (this.zzb.zzb(zze.charAt(i)) << 18) | (this.zzb.zzb(zze.charAt(i3)) << 12);
                bArr[i2] = (byte) (zzb >>> 16);
                int i5 = i3 + 1;
                if (i5 < zze.length()) {
                    int i6 = i5 + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zze.charAt(i5)) << 6);
                    i2 = i4 + 1;
                    bArr[i4] = (byte) ((zzb2 >>> 8) & 255);
                    if (i6 < zze.length()) {
                        bArr[i2] = (byte) ((zzb2 | this.zzb.zzb(zze.charAt(i6))) & 255);
                        i2++;
                        i = i6 + 1;
                    } else {
                        i = i6;
                    }
                } else {
                    i = i5;
                    i2 = i4;
                }
            }
            return i2;
        }
        throw new zzfw("Invalid input length " + zze.length());
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzff.zzd(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = bArr[i3] & 255;
            int i7 = bArr[i5] & 255;
            int i8 = i5 + 1;
            int i9 = (i6 << 16) | (i7 << 8) | (bArr[i8] & 255);
            appendable.append(this.zzb.zza(i9 >>> 18));
            appendable.append(this.zzb.zza((i9 >>> 12) & 63));
            appendable.append(this.zzb.zza((i9 >>> 6) & 63));
            appendable.append(this.zzb.zza(i9 & 63));
            i3 = i8 + 1;
        }
        if (i3 < i2) {
            zzf(appendable, bArr, i3, i2 - i3);
        }
    }
}
