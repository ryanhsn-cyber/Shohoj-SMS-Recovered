package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzow {
    private static final ThreadLocal<SecureRandom> zza = new zzov();

    private static Provider zzb() throws GeneralSecurityException {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    private static SecureRandom zzc() {
        try {
            return SecureRandom.getInstance("SHA1PRNG", ProviderInstaller.PROVIDER_NAME);
        } catch (GeneralSecurityException e) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            } catch (GeneralSecurityException e2) {
                try {
                    return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                } catch (GeneralSecurityException e3) {
                    try {
                        return SecureRandom.getInstance("SHA1PRNG", zzb());
                    } catch (GeneralSecurityException e4) {
                        return new SecureRandom();
                    }
                }
            }
        }
    }

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        zza.get().nextBytes(bArr);
        return bArr;
    }
}
