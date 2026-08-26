package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzly implements zzlk {
    private final zzxv zza;
    private final zzxv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzly zza(byte[] bArr) throws GeneralSecurityException {
        return new zzly(bArr, zzxt.zza(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final zzxv zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final zzxv zzb() {
        return this.zzb;
    }

    private zzly(byte[] bArr, byte[] bArr2) {
        this.zza = zzxv.zza(bArr);
        this.zzb = zzxv.zza(bArr2);
    }
}
