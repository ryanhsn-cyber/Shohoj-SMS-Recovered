package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzbf {
    private static final Logger zza = new Logger("GetTokenResultFactory", new String[0]);

    public static GetTokenResult zza(String str) {
        Map hashMap;
        try {
            hashMap = zzbe.zza(str);
        } catch (zzxy e) {
            zza.e("Error parsing token claims", e, new Object[0]);
            hashMap = new HashMap();
        }
        return new GetTokenResult(str, hashMap);
    }
}
