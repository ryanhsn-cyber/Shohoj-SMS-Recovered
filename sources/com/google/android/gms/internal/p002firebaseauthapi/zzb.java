package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public abstract class zzb {
    private static zzb zza = new zze();

    public static synchronized zzb zza() {
        zzb zzbVar;
        synchronized (zzb.class) {
            zzbVar = zza;
        }
        return zzbVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
