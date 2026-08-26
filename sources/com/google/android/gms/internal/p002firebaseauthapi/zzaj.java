package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + String.valueOf(obj2));
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + String.valueOf(obj) + "=null");
        }
    }
}
