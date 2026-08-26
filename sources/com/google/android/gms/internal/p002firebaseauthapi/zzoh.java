package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzoh {
    private final Map<zzoj, zzoe<?, ?>> zza;
    private final Map<Class<?>, zzch<?, ?>> zzb;

    public final <KeyT extends zzbu, PrimitiveT> zzoh zza(zzoe<KeyT, PrimitiveT> zzoeVar) throws GeneralSecurityException {
        if (zzoeVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzoj zzojVar = new zzoj(zzoeVar.zza(), zzoeVar.zzb());
        if (this.zza.containsKey(zzojVar)) {
            zzoe<?, ?> zzoeVar2 = this.zza.get(zzojVar);
            if (!zzoeVar2.equals(zzoeVar) || !zzoeVar.equals(zzoeVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(zzojVar));
            }
        } else {
            this.zza.put(zzojVar, zzoeVar);
        }
        return this;
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzoh zza(zzch<InputPrimitiveT, WrapperPrimitiveT> zzchVar) throws GeneralSecurityException {
        if (zzchVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class<WrapperPrimitiveT> zzb = zzchVar.zzb();
        if (this.zzb.containsKey(zzb)) {
            zzch<?, ?> zzchVar2 = this.zzb.get(zzb);
            if (!zzchVar2.equals(zzchVar) || !zzchVar.equals(zzchVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(zzb));
            }
        } else {
            this.zzb.put(zzb, zzchVar);
        }
        return this;
    }

    public final zzoi zza() {
        return new zzoi(this);
    }

    private zzoh() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzoh(zzoi zzoiVar) {
        this.zza = new HashMap(zzoi.zzb(zzoiVar));
        this.zzb = new HashMap(zzoi.zzc(zzoiVar));
    }
}
