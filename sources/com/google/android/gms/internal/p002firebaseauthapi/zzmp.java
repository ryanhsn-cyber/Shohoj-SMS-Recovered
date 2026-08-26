package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [SerializationT] */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzmp<SerializationT> extends zzmq<SerializationT> {
    private final /* synthetic */ zzms zza;

    /* JADX WARN: Incorrect types in method signature: (TSerializationT;Lcom/google/android/gms/internal/firebase-auth-api/zzcn;)Lcom/google/android/gms/internal/firebase-auth-api/zzbu; */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmq
    public final zzbu zza(zzox zzoxVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        return this.zza.zza(zzoxVar, zzcnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmp(zzxv zzxvVar, Class cls, zzms zzmsVar) {
        super(zzxvVar, cls);
        this.zza = zzmsVar;
    }
}
