package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public abstract class zzaim extends zzahp {
    private static final Logger zza = Logger.getLogger(zzaim.class.getName());
    private static final boolean zzb = zzamm.zzc();
    zzaip zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static abstract class zza extends zzaim {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        zza(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            this.zza = new byte[Math.max(i, 20)];
            this.zzb = this.zza.length;
        }

        final void zza(byte b) {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b;
            this.zzd++;
        }

        final void zza(int i) {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr[i2] = (byte) i;
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr2[i3] = (byte) (i >> 8);
            byte[] bArr3 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr3[i4] = (byte) (i >> 16);
            byte[] bArr4 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            bArr4[i5] = (byte) (i >>> 24);
            this.zzd += 4;
        }

        final void zza(long j) {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = (byte) (j & 255);
            byte[] bArr2 = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr2[i2] = (byte) ((j >> 8) & 255);
            byte[] bArr3 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr3[i3] = (byte) ((j >> 16) & 255);
            byte[] bArr4 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr4[i4] = (byte) (255 & (j >> 24));
            byte[] bArr5 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            bArr5[i5] = (byte) (j >> 32);
            byte[] bArr6 = this.zza;
            int i6 = this.zzc;
            this.zzc = i6 + 1;
            bArr6[i6] = (byte) (j >> 40);
            byte[] bArr7 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            bArr7[i7] = (byte) (j >> 48);
            byte[] bArr8 = this.zza;
            int i8 = this.zzc;
            this.zzc = i8 + 1;
            bArr8[i8] = (byte) (j >> 56);
            this.zzd += 8;
        }

        final void zza(int i, int i2) {
            zzb((i << 3) | i2);
        }

        final void zzb(int i) {
            if (zzaim.zzb) {
                long j = this.zzc;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    zzamm.zza(bArr, i2, (byte) (i | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zzamm.zza(bArr2, i3, (byte) i);
                this.zzd += (int) (this.zzc - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                bArr3[i4] = (byte) (i | 128);
                this.zzd++;
                i >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            bArr4[i5] = (byte) i;
            this.zzd++;
        }

        final void zzb(long j) {
            if (zzaim.zzb) {
                long j2 = this.zzc;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i = this.zzc;
                    this.zzc = i + 1;
                    zzamm.zza(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzamm.zza(bArr2, i2, (byte) j);
                this.zzd += (int) (this.zzc - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr3[i3] = (byte) (((int) j) | 128);
                this.zzd++;
                j >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr4[i4] = (byte) j;
            this.zzd++;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    private static class zzc extends zzaim {
        private final byte[] zza;
        private final int zzb;
        private final int zzc;
        private int zzd;

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final int zza() {
            return this.zzc - this.zzd;
        }

        zzc(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i2 | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.zza = bArr;
            this.zzb = 0;
            this.zzd = 0;
            this.zzc = i2;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(byte b) throws IOException {
            try {
                byte[] bArr = this.zza;
                int i = this.zzd;
                this.zzd = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zza, this.zzd, i2);
                this.zzd += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(int i, boolean z) throws IOException {
            zzk(i, 0);
            zzb(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzn(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzc(int i, zzaho zzahoVar) throws IOException {
            zzk(i, 2);
            zzb(zzahoVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(zzaho zzahoVar) throws IOException {
            zzn(zzahoVar.zzb());
            zzahoVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzh(int i, int i2) throws IOException {
            zzk(i, 5);
            zzk(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzk(int i) throws IOException {
            try {
                byte[] bArr = this.zza;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.zza;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.zza;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.zza;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzf(int i, long j) throws IOException {
            zzk(i, 1);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzh(long j) throws IOException {
            try {
                byte[] bArr = this.zza;
                int i = this.zzd;
                this.zzd = i + 1;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.zza;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.zza;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.zza;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.zza;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.zza;
                int i6 = this.zzd;
                this.zzd = i6 + 1;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.zza;
                int i7 = this.zzd;
                this.zzd = i7 + 1;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.zza;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzi(int i, int i2) throws IOException {
            zzk(i, 0);
            zzl(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzl(int i) throws IOException {
            if (i >= 0) {
                zzn(i);
            } else {
                zzj(i);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahp
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        final void zzc(int i, zzakp zzakpVar, zzalh zzalhVar) throws IOException {
            zzk(i, 2);
            zzn(((zzahf) zzakpVar).zza(zzalhVar));
            zzalhVar.zza((zzalh) zzakpVar, (zzanc) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzc(zzakp zzakpVar) throws IOException {
            zzn(zzakpVar.zzl());
            zzakpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        final void zzb(zzakp zzakpVar, zzalh zzalhVar) throws IOException {
            zzn(((zzahf) zzakpVar).zza(zzalhVar));
            zzalhVar.zza((zzalh) zzakpVar, (zzanc) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(int i, zzakp zzakpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzk(3, 2);
            zzc(zzakpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzd(int i, zzaho zzahoVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzc(3, zzahoVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(int i, String str) throws IOException {
            zzk(i, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(String str) throws IOException {
            int i = this.zzd;
            try {
                int zzj = zzj(str.length() * 3);
                int zzj2 = zzj(str.length());
                if (zzj2 == zzj) {
                    this.zzd = i + zzj2;
                    int zza = zzamn.zza(str, this.zza, this.zzd, zza());
                    this.zzd = i;
                    zzn((zza - i) - zzj2);
                    this.zzd = zza;
                    return;
                }
                zzn(zzamn.zza(str));
                this.zzd = zzamn.zza(str, this.zza, this.zzd, zza());
            } catch (zzamq e) {
                this.zzd = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzk(int i, int i2) throws IOException {
            zzn((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzl(int i, int i2) throws IOException {
            zzk(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzn(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzh(int i, long j) throws IOException {
            zzk(i, 0);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzj(long j) throws IOException {
            if (zzaim.zzb && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i = this.zzd;
                    this.zzd = i + 1;
                    zzamm.zza(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                zzamm.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zza;
                    int i3 = this.zzd;
                    this.zzd = i3 + 1;
                    bArr3[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr4 = this.zza;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr4[i4] = (byte) j;
        }
    }

    public static int zza(int i, boolean z) {
        return zzj(i << 3) + 1;
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzb(int i, zzakp zzakpVar) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzaho zzahoVar) throws IOException;

    abstract void zzb(zzakp zzakpVar, zzalh zzalhVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i, zzaho zzahoVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(int i, zzakp zzakpVar, zzalh zzalhVar) throws IOException;

    public abstract void zzc(zzakp zzakpVar) throws IOException;

    public abstract void zzd(int i, zzaho zzahoVar) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzh(long j) throws IOException;

    public abstract void zzi(int i, int i2) throws IOException;

    public abstract void zzj(long j) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzk(int i, int i2) throws IOException;

    public abstract void zzl(int i) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzn(int i) throws IOException;

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    private static final class zzd extends zza {
        private final OutputStream zzf;

        zzd(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzc() throws IOException {
            if (this.zzc > 0) {
                zze();
            }
        }

        private final void zzo(int i) throws IOException {
            if (this.zzb - this.zzc < i) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(byte b) throws IOException {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b);
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            if (this.zzb - this.zzc >= i2) {
                System.arraycopy(bArr, i, this.zza, this.zzc, i2);
                this.zzc += i2;
            } else {
                int i3 = this.zzb - this.zzc;
                System.arraycopy(bArr, i, this.zza, this.zzc, i3);
                int i4 = i + i3;
                i2 -= i3;
                this.zzc = this.zzb;
                this.zzd += i3;
                zze();
                if (i2 <= this.zzb) {
                    System.arraycopy(bArr, i4, this.zza, 0, i2);
                    this.zzc = i2;
                } else {
                    this.zzf.write(bArr, i4, i2);
                }
            }
            this.zzd += i2;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(int i, boolean z) throws IOException {
            zzo(11);
            zza(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzn(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzc(int i, zzaho zzahoVar) throws IOException {
            zzk(i, 2);
            zzb(zzahoVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(zzaho zzahoVar) throws IOException {
            zzn(zzahoVar.zzb());
            zzahoVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzh(int i, int i2) throws IOException {
            zzo(14);
            zza(i, 5);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzk(int i) throws IOException {
            zzo(4);
            zza(i);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzf(int i, long j) throws IOException {
            zzo(18);
            zza(i, 1);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzh(long j) throws IOException {
            zzo(8);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzi(int i, int i2) throws IOException {
            zzo(20);
            zza(i, 0);
            if (i2 >= 0) {
                zzb(i2);
            } else {
                zzb(i2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzl(int i) throws IOException {
            if (i >= 0) {
                zzn(i);
            } else {
                zzj(i);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahp
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        final void zzc(int i, zzakp zzakpVar, zzalh zzalhVar) throws IOException {
            zzk(i, 2);
            zzb(zzakpVar, zzalhVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzc(zzakp zzakpVar) throws IOException {
            zzn(zzakpVar.zzl());
            zzakpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        final void zzb(zzakp zzakpVar, zzalh zzalhVar) throws IOException {
            zzn(((zzahf) zzakpVar).zza(zzalhVar));
            zzalhVar.zza((zzalh) zzakpVar, (zzanc) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(int i, zzakp zzakpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzk(3, 2);
            zzc(zzakpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzd(int i, zzaho zzahoVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzc(3, zzahoVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(int i, String str) throws IOException {
            zzk(i, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzb(String str) throws IOException {
            int zza;
            try {
                int length = str.length() * 3;
                int zzj = zzj(length);
                int i = zzj + length;
                if (i > this.zzb) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzamn.zza(str, bArr, 0, length);
                    zzn(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i > this.zzb - this.zzc) {
                    zze();
                }
                int zzj2 = zzj(str.length());
                int i2 = this.zzc;
                try {
                    if (zzj2 == zzj) {
                        this.zzc = i2 + zzj2;
                        int zza3 = zzamn.zza(str, this.zza, this.zzc, this.zzb - this.zzc);
                        this.zzc = i2;
                        zza = (zza3 - i2) - zzj2;
                        zzb(zza);
                        this.zzc = zza3;
                    } else {
                        zza = zzamn.zza(str);
                        zzb(zza);
                        this.zzc = zzamn.zza(str, this.zza, this.zzc, zza);
                    }
                    this.zzd += zza;
                } catch (zzamq e) {
                    this.zzd -= this.zzc - i2;
                    this.zzc = i2;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new zzb(e2);
                }
            } catch (zzamq e3) {
                zza(str, e3);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzk(int i, int i2) throws IOException {
            zzn((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzl(int i, int i2) throws IOException {
            zzo(20);
            zza(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzn(int i) throws IOException {
            zzo(5);
            zzb(i);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzh(int i, long j) throws IOException {
            zzo(20);
            zza(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zzj(long j) throws IOException {
            zzo(10);
            zzb(j);
        }
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zza(int i, zzaho zzahoVar) {
        int zzj = zzj(i << 3);
        int zzb2 = zzahoVar.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zza(zzaho zzahoVar) {
        int zzb2 = zzahoVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zza(int i, double d) {
        return zzj(i << 3) + 8;
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i, int i2) {
        return zzj(i << 3) + zzg(i2);
    }

    public static int zzc(int i) {
        return zzg(i);
    }

    public static int zzc(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    public static int zzd(int i) {
        return 4;
    }

    public static int zza(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zza(int i, float f) {
        return zzj(i << 3) + 4;
    }

    public static int zza(float f) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zza(int i, zzakp zzakpVar, zzalh zzalhVar) {
        return (zzj(i << 3) << 1) + ((zzahf) zzakpVar).zza(zzalhVar);
    }

    @Deprecated
    public static int zza(zzakp zzakpVar) {
        return zzakpVar.zzl();
    }

    public static int zzd(int i, int i2) {
        return zzj(i << 3) + zzg(i2);
    }

    public static int zze(int i) {
        return zzg(i);
    }

    public static int zzb(int i, long j) {
        return zzj(i << 3) + zzg(j);
    }

    public static int zzd(long j) {
        return zzg(j);
    }

    public static int zza(int i, zzajt zzajtVar) {
        return (zzj(8) << 1) + zzg(2, i) + zzb(3, zzajtVar);
    }

    public static int zzb(int i, zzajt zzajtVar) {
        int zzj = zzj(i << 3);
        int zzb2 = zzajtVar.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zza(zzajt zzajtVar) {
        int zzb2 = zzajtVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zza(int i, zzakp zzakpVar) {
        return (zzj(8) << 1) + zzg(2, i) + zzj(24) + zzb(zzakpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzakp zzakpVar, zzalh zzalhVar) {
        return zzj(i << 3) + zza(zzakpVar, zzalhVar);
    }

    public static int zzb(zzakp zzakpVar) {
        int zzl = zzakpVar.zzl();
        return zzj(zzl) + zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzakp zzakpVar, zzalh zzalhVar) {
        int zza2 = ((zzahf) zzakpVar).zza(zzalhVar);
        return zzj(zza2) + zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzb(int i, zzaho zzahoVar) {
        return (zzj(8) << 1) + zzg(2, i) + zza(3, zzahoVar);
    }

    public static int zze(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    public static int zzg(int i) {
        return 4;
    }

    public static int zzc(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zze(long j) {
        return 8;
    }

    public static int zzf(int i, int i2) {
        return zzj(i << 3) + zzj(zza(i2));
    }

    public static int zzh(int i) {
        return zzj(zza(i));
    }

    public static int zzd(int i, long j) {
        return zzj(i << 3) + zzg(zza(j));
    }

    public static int zzf(long j) {
        return zzg(zza(j));
    }

    public static int zza(int i, String str) {
        return zzj(i << 3) + zza(str);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzamn.zza(str);
        } catch (zzamq e) {
            length = str.getBytes(zzajh.zza).length;
        }
        return zzj(length) + length;
    }

    public static int zzi(int i) {
        return zzj(i << 3);
    }

    public static int zzg(int i, int i2) {
        return zzj(i << 3) + zzj(i2);
    }

    public static int zzj(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zze(int i, long j) {
        return zzj(i << 3) + zzg(j);
    }

    public static int zzg(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    private static int zza(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private static long zza(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static zzaim zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static zzaim zza(OutputStream outputStream, int i) {
        return new zzd(outputStream, i);
    }

    private zzaim() {
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(String str, zzamq zzamqVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzamqVar);
        byte[] bytes = str.getBytes(zzajh.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    public final void zzb(boolean z) throws IOException {
        zzb(z ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i, double d) throws IOException {
        zzf(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) throws IOException {
        zzh(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i, float f) throws IOException {
        zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) throws IOException {
        zzk(Float.floatToRawIntBits(f));
    }

    public final void zzj(int i, int i2) throws IOException {
        zzl(i, zza(i2));
    }

    public final void zzm(int i) throws IOException {
        zzn(zza(i));
    }

    public final void zzg(int i, long j) throws IOException {
        zzh(i, zza(j));
    }

    public final void zzi(long j) throws IOException {
        zzj(zza(j));
    }
}
