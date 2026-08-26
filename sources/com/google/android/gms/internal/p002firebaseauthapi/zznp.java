package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zznp {
    private static zznp zza = new zznp();
    private final AtomicReference<zzoi> zzb = new AtomicReference<>(new zzoh().zza());

    public static zznp zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbu, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.zzb.get().zza((zzoi) keyt, (Class) cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoo<InputPrimitiveT> zzooVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.zzb.get().zza(zzooVar, cls);
    }

    zznp() {
    }

    public final synchronized <KeyT extends zzbu, PrimitiveT> void zza(zzoe<KeyT, PrimitiveT> zzoeVar) throws GeneralSecurityException {
        this.zzb.set(zzoi.zza(this.zzb.get()).zza(zzoeVar).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzch<InputPrimitiveT, WrapperPrimitiveT> zzchVar) throws GeneralSecurityException {
        this.zzb.set(zzoi.zza(this.zzb.get()).zza(zzchVar).zza());
    }
}
