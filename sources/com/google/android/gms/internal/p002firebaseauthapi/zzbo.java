package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvg;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzbo {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzvg.zza zzaVar) throws GeneralSecurityException {
        switch (zzbn.zza[zzaVar.zzf().ordinal()]) {
            case 1:
            case 2:
                return zznt.zza(zzaVar.zza()).zzb();
            case 3:
                return zznt.zzb(zzaVar.zza()).zzb();
            case 4:
                return zza;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
    }
}
