package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzoi {
    private final Map<zzoj, zzoe<?, ?>> zza;
    private final Map<Class<?>, zzch<?, ?>> zzb;

    public /* synthetic */ zzoi(zzoh zzohVar, zzol zzolVar) {
        this(zzohVar);
    }

    public static zzoh zza(zzoi zzoiVar) {
        return new zzoh(zzoiVar);
    }

    public final Class<?> zza(Class<?> cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No input primitive class for " + String.valueOf(cls) + " available");
        }
        return this.zzb.get(cls).zza();
    }

    public final <KeyT extends zzbu, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        zzoj zzojVar = new zzoj(keyt.getClass(), cls);
        if (!this.zza.containsKey(zzojVar)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzojVar) + " available");
        }
        return (PrimitiveT) this.zza.get(zzojVar).zza(keyt);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoo<InputPrimitiveT> zzooVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + String.valueOf(cls));
        }
        zzch<?, ?> zzchVar = this.zzb.get(cls);
        if (!zzooVar.zzc().equals(zzchVar.zza()) || !zzchVar.zza().equals(zzooVar.zzc())) {
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        return (WrapperPrimitiveT) zzchVar.zza(zzooVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzoi(zzoh zzohVar) {
        Map map;
        Map map2;
        map = zzohVar.zza;
        this.zza = new HashMap(map);
        map2 = zzohVar.zzb;
        this.zzb = new HashMap(map2);
    }
}
