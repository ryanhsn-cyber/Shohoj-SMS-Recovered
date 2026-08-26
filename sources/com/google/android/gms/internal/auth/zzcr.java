package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes11.dex */
public final class zzcr {
    private static final ArrayMap zza = new ArrayMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzcr.class) {
            uri = (Uri) zza.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                zza.put("com.google.android.gms.auth_account", uri);
            }
        }
        return uri;
    }
}
