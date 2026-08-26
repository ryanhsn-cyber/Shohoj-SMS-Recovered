package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [KeyT, SerializationT] */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzmt<KeyT, SerializationT> extends zzmu<KeyT, SerializationT> {
    private final /* synthetic */ zzmw zza;

    /* JADX WARN: Incorrect return type in method signature: (TKeyT;Lcom/google/android/gms/internal/firebase-auth-api/zzcn;)TSerializationT; */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
    public final zzox zza(zzbu zzbuVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        return this.zza.zza(zzbuVar, zzcnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmt(Class cls, Class cls2, zzmw zzmwVar) {
        super(cls, cls2);
        this.zza = zzmwVar;
    }
}
