package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzka {
    private static final zzjz zza;
    private static final zzjz zzb;

    static {
        zzjz zzjzVar;
        try {
            zzjzVar = (zzjz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            zzjzVar = null;
        }
        zza = zzjzVar;
        zzb = new zzjz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjz zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjz zzb() {
        return zzb;
    }
}
