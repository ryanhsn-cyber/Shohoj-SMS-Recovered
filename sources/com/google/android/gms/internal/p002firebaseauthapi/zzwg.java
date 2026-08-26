package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzwg implements zzbh {
    private final zzho zza;
    private final byte[] zzb;

    public static zzbh zza(zzem zzemVar) throws GeneralSecurityException {
        return new zzwg(zzemVar.zzd().zza(zzbr.zza()), zzemVar.zzc().zzb());
    }

    private zzwg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzho(bArr);
        this.zzb = bArr2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (!zzph.zza(this.zzb, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return zzc(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] zza = zzow.zza(12);
        allocate.put(zza);
        this.zza.zza(allocate, zza, bArr, bArr2);
        byte[] array = allocate.array();
        if (this.zzb.length == 0) {
            return array;
        }
        return zzwh.zza(this.zzb, array);
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.zza.zza(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }
}
