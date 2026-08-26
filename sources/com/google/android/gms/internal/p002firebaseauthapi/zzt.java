package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Matcher;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzt extends zzp {
    private final Matcher zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final int zzb() {
        return this.zza.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(Matcher matcher) {
        this.zza = (Matcher) zzz.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final boolean zza(int i) {
        return this.zza.find(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final boolean zzc() {
        return this.zza.matches();
    }
}
