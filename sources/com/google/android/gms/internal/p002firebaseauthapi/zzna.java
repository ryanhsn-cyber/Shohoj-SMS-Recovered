package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzna extends zzbu {
    private final zzou zza;

    public final zzou zza(@Nullable zzcn zzcnVar) throws GeneralSecurityException {
        zza(this.zza, zzcnVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zza.zze();
    }

    public zzna(zzou zzouVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        zza(zzouVar, zzcnVar);
        this.zza = zzouVar;
    }

    private static void zza(zzou zzouVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        switch (zzouVar.zza()) {
            case SYMMETRIC:
            case ASYMMETRIC_PRIVATE:
                zzcn.zza(zzcnVar);
                return;
            default:
                return;
        }
    }
}
