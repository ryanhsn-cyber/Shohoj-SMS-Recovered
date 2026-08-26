package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzadr {
    public static zzahb zza(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.zzd())) {
            return zzahb.zzb(phoneAuthCredential.zzb(), phoneAuthCredential.zzd(), phoneAuthCredential.zze());
        }
        return zzahb.zza(phoneAuthCredential.zzc(), phoneAuthCredential.getSmsCode(), phoneAuthCredential.zze());
    }
}
