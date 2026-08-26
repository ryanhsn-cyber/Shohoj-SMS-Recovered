package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaiu {
    private static final zzais<?> zza = new zzaiv();
    private static final zzais<?> zzb = zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzais<?> zza() {
        if (zzb == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzais<?> zzb() {
        return zza;
    }

    private static zzais<?> zzc() {
        try {
            return (zzais) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
