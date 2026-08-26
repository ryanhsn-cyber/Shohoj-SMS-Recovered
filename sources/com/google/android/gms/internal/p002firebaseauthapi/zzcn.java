package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzcn {
    private static final zzcn zza = new zzcn();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcn zza() {
        return zza;
    }

    public static zzcn zza(@Nullable zzcn zzcnVar) throws GeneralSecurityException {
        if (zzcnVar == null) {
            throw new GeneralSecurityException("SecretKeyAccess is required");
        }
        return zzcnVar;
    }

    private zzcn() {
    }
}
