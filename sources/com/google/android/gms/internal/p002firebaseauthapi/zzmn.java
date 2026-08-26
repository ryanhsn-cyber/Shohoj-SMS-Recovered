package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzmn {
    private static final Logger zza = Logger.getLogger(zzmn.class.getName());
    private static final zzmn zzb = new zzmn();
    private ConcurrentMap<String, zzbt<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    public final <P> zzbt<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzbt<P> zzbtVar = (zzbt<P>) zzc(str);
        if (zzbtVar.zza().equals(cls)) {
            return zzbtVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzbtVar.getClass()) + ", which only supports: " + String.valueOf(zzbtVar.zza()));
    }

    private final synchronized zzbt<?> zzc(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final zzbt<?> zza(String str) throws GeneralSecurityException {
        return zzc(str);
    }

    public static zzmn zza() {
        return zzb;
    }

    private final synchronized void zza(zzbt<?> zzbtVar, boolean z, boolean z2) throws GeneralSecurityException {
        String zzb2 = zzbtVar.zzb();
        if (z2 && this.zzd.containsKey(zzb2) && !this.zzd.get(zzb2).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
        }
        zzbt<?> zzbtVar2 = this.zzc.get(zzb2);
        if (zzbtVar2 != null && !zzbtVar2.getClass().equals(zzbtVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzb2, zzbtVar2.getClass().getName(), zzbtVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(zzb2, zzbtVar);
        this.zzd.put(zzb2, Boolean.valueOf(z2));
    }

    public final synchronized <P> void zza(zzbt<P> zzbtVar, boolean z) throws GeneralSecurityException {
        zza(zzbtVar, zzig.zza.zza, z);
    }

    public final synchronized <P> void zza(zzbt<P> zzbtVar, zzig.zza zzaVar, boolean z) throws GeneralSecurityException {
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zza((zzbt<?>) zzbtVar, false, z);
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }
}
