package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzmc implements zzcd {
    private static final Object zza = new Object();
    private static final String zzb = zzmc.class.getSimpleName();
    private final String zzc;

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza {
        private String zza = null;

        public zza() {
            zzmc.zza();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final zzbh zza(String str) throws GeneralSecurityException {
        zzma zzmaVar;
        try {
            synchronized (zza) {
                zzmaVar = new zzma(zzxq.zza("android-keystore://", str));
                byte[] zza2 = zzow.zza(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(zza2, zzmaVar.zza(zzmaVar.zzb(zza2, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return zzmaVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    private static KeyStore zzb() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public zzmc() throws GeneralSecurityException {
        this(new zza());
    }

    private zzmc(zza zzaVar) {
        this.zzc = null;
    }

    static /* synthetic */ boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(String str) throws GeneralSecurityException {
        new zzmc();
        synchronized (zza) {
            if (zzd(str)) {
                return false;
            }
            String zza2 = zzxq.zza("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return true;
        }
    }

    private static boolean zzd(String str) throws GeneralSecurityException {
        boolean containsAlias;
        String zza2 = zzxq.zza("android-keystore://", str);
        try {
            synchronized (zza) {
                containsAlias = zzb().containsAlias(zza2);
            }
            return containsAlias;
        } catch (NullPointerException e) {
            Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                Thread.sleep((int) (Math.random() * 40.0d));
            } catch (InterruptedException e2) {
            }
            synchronized (zza) {
                return zzb().containsAlias(zza2);
            }
        }
    }
}
