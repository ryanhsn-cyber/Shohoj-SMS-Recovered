package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzbk implements zzcb {
    private final InputStream zza;

    public static zzcb zza(byte[] bArr) {
        return new zzbk(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zztx zza() throws IOException {
        try {
            return zztx.zza(this.zza, zzaiq.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zzvg zzb() throws IOException {
        try {
            return zzvg.zza(this.zza, zzaiq.zza());
        } finally {
            this.zza.close();
        }
    }

    private zzbk(InputStream inputStream) {
        this.zza = inputStream;
    }
}
