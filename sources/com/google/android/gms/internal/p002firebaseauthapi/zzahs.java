package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzahs extends zzaib {
    private final int zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    public final byte zza(int i) {
        int zzb = zzb();
        if (((zzb - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + zzb);
        }
        return this.zzb[this.zzc + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    public final int zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahs(byte[] bArr, int i, int i2) {
        super(bArr);
        zza(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    protected final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, zzg(), bArr, 0, i3);
    }
}
