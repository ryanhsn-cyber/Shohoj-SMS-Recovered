package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzpv implements zzch<zzps, zzps> {
    private static final zzpv zza = new zzpv();

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final Class<zzps> zza() {
        return zzps.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final Class<zzps> zzb() {
        return zzps.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final /* synthetic */ zzps zza(zzoo<zzps> zzooVar) throws GeneralSecurityException {
        if (zzooVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (zzooVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<zzop<zzps>>> it = zzooVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator<zzop<zzps>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().zzd();
            }
        }
        return new zzpu(zzooVar);
    }

    private zzpv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc() throws GeneralSecurityException {
        zznp.zza().zza(zza);
    }
}
