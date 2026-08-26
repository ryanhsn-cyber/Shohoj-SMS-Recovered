package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzxs implements zzbh {
    private final zzhs zza;
    private final byte[] zzb;

    public static zzbh zza(zzfx zzfxVar) throws GeneralSecurityException {
        return new zzxs(zzfxVar.zzd().zza(zzbr.zza()), zzfxVar.zzc().zzb());
    }

    private zzxs(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzhs(bArr);
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
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] zza = zzow.zza(24);
        allocate.put(zza);
        this.zza.zza(allocate, zza, bArr, bArr2);
        byte[] array = allocate.array();
        if (this.zzb.length == 0) {
            return array;
        }
        return zzwh.zza(this.zzb, array);
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.zza.zza(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
