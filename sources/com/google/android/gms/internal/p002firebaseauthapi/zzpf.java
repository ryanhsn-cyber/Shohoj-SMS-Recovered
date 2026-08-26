package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzpf extends RuntimeException {
    public static <T> T zza(zzpi<T> zzpiVar) {
        try {
            return zzpiVar.zza();
        } catch (Exception e) {
            throw new zzpf(e);
        }
    }

    public zzpf(String str) {
        super(str);
    }

    private zzpf(Throwable th) {
        super(th);
    }
}
