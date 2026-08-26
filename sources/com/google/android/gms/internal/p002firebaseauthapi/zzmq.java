package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzox;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public abstract class zzmq<SerializationT extends zzox> {
    private final zzxv zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzox> zzmq<SerializationT> zza(zzms<SerializationT> zzmsVar, zzxv zzxvVar, Class<SerializationT> cls) {
        return new zzmp(zzxvVar, cls, zzmsVar);
    }

    public abstract zzbu zza(SerializationT serializationt, @Nullable zzcn zzcnVar) throws GeneralSecurityException;

    public final zzxv zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzmq(zzxv zzxvVar, Class<SerializationT> cls) {
        this.zza = zzxvVar;
        this.zzb = cls;
    }
}
