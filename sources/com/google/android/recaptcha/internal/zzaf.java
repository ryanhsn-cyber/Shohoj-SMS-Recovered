package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzaf {
    public static final zzaf zza = new zzaf();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final GoogleApiAvailabilityLight zzc = GoogleApiAvailabilityLight.getInstance();

    private zzaf() {
    }

    public static final String zza(Context context) {
        switch (zzc.isGooglePlayServicesAvailable(context)) {
            case 1:
            case 3:
            case 9:
                return "ANDROID_OFFPLAY";
            default:
                return "ANDROID_ONPLAY";
        }
    }
}
