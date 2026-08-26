package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzwu<JcePrimitiveT> implements zzxa<JcePrimitiveT> {
    private final zzxd<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxa
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Iterator<Provider> it = zzwv.zza(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzwu(zzxd<JcePrimitiveT> zzxdVar) {
        this.zza = zzxdVar;
    }
}
