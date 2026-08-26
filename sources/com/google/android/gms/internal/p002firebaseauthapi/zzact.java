package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.List;
import kotlin.time.DurationKt;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzact {
    private final int zza;

    private static int zza(String str) {
        try {
            List<String> zza = zzac.zza("[.-]").zza((CharSequence) str);
            if (zza.size() != 1) {
                if (zza.size() >= 3) {
                    return (Integer.parseInt(zza.get(0)) * DurationKt.NANOS_IN_MILLIS) + (Integer.parseInt(zza.get(1)) * 1000) + Integer.parseInt(zza.get(2));
                }
                return -1;
            }
            return Integer.parseInt(str);
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e));
                return -1;
            }
            return -1;
        }
    }

    public static zzact zza() {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        if (TextUtils.isEmpty(version) || version.equals("UNKNOWN")) {
            version = "-1";
        }
        return new zzact(version);
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }

    private zzact(String str) {
        this.zza = zza(str);
    }
}
