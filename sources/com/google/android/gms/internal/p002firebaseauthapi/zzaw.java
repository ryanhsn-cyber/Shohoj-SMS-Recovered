package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzaw {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.zza) + "=" + String.valueOf(this.zzb) + " and " + String.valueOf(this.zza) + "=" + String.valueOf(this.zzc));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }
}
