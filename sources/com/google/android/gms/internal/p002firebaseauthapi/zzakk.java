package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzakk {
    private static final zzaki zza = zzc();
    private static final zzaki zzb = new zzakl();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaki zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaki zzb() {
        return zzb;
    }

    private static zzaki zzc() {
        try {
            return (zzaki) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
