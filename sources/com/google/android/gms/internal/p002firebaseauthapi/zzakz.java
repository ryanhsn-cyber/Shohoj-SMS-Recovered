package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzakz {
    private static final zzakx zza = zzc();
    private static final zzakx zzb = new zzakw();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzakx zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzakx zzb() {
        return zzb;
    }

    private static zzakx zzc() {
        try {
            return (zzakx) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
