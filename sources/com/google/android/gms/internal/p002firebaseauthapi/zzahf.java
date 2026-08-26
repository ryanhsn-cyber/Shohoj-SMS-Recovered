package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzahf;
import com.google.android.gms.internal.p002firebaseauthapi.zzahh;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public abstract class zzahf<MessageType extends zzahf<MessageType, BuilderType>, BuilderType extends zzahh<MessageType, BuilderType>> implements zzakp {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzi() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zza(zzalh zzalhVar) {
        int zzi = zzi();
        if (zzi == -1) {
            int zza = zzalhVar.zza(this);
            zzb(zza);
            return zza;
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakp
    public final zzaho zzj() {
        try {
            zzahx zzc = zzaho.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzb(int i) {
        throw new UnsupportedOperationException();
    }

    public final void zza(OutputStream outputStream) throws IOException {
        zzaim zza = zzaim.zza(outputStream, zzaim.zzf(zzl()));
        zza(zza);
        zza.zzc();
    }

    public final byte[] a_() {
        try {
            byte[] bArr = new byte[zzl()];
            zzaim zzb = zzaim.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
