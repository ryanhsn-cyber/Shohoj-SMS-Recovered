package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzads {
    private static final Map<String, zzadu> zza = new ArrayMap();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzacz zzaczVar) {
        zza(str, zzaczVar);
        return new zzadv(onVerificationStateChangedCallbacks, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacz zzaczVar) {
        zza.put(str, new zzadu(zzaczVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        if (zza.containsKey(str)) {
            zzadu zzaduVar = zza.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzaduVar.zzb < 120000) {
                if (zzaduVar.zza != null) {
                    zzaduVar.zza.zza(onVerificationStateChangedCallbacks, activity, executor, str);
                    return true;
                }
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
