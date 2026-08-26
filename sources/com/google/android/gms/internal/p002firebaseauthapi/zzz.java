package com.google.android.gms.internal.p002firebaseauthapi;

import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzz {
    public static int zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzah.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                zza = zzah.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i;
    }

    public static int zzb(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, "index"));
        }
        return i;
    }

    public static int zza(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, str));
        }
        return i;
    }

    public static <T> T zza(@CheckForNull T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    private static String zzb(int i, int i2, String str) {
        if (i < 0) {
            return zzah.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        }
        return zzah.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void zza(int i, int i2, int i3) {
        String zzb;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zzb = zzb(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                zzb = zzb(i2, i3, "end index");
            } else {
                zzb = zzah.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
    }
}
