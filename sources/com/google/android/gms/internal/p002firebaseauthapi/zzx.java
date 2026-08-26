package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzx implements zzv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzv
    public final zzs zza(String str) {
        return new zzu(Pattern.compile(str));
    }

    private zzx() {
    }
}
