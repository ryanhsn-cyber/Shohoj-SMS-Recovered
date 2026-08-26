package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgd;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzfx extends zzcu {
    private final zzgd zza;
    private final zzxw zzb;
    private final zzxv zzc;

    @Nullable
    private final Integer zzd;

    public static zzfx zza(zzgd.zza zzaVar, zzxw zzxwVar, @Nullable Integer num) throws GeneralSecurityException {
        zzxv zzb;
        if (zzaVar != zzgd.zza.zzc && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzgd.zza.zzc && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzxwVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzxwVar.zza());
        }
        zzgd zza = zzgd.zza(zzaVar);
        if (zza.zzb() == zzgd.zza.zzc) {
            zzb = zznt.zza;
        } else if (zza.zzb() == zzgd.zza.zzb) {
            zzb = zznt.zza(num.intValue());
        } else if (zza.zzb() == zzgd.zza.zza) {
            zzb = zznt.zzb(num.intValue());
        } else {
            throw new IllegalStateException("Unknown Variant: " + String.valueOf(zza.zzb()));
        }
        return new zzfx(zza, zzxwVar, zzb, num);
    }

    public final zzgd zzb() {
        return this.zza;
    }

    public final zzxv zzc() {
        return this.zzc;
    }

    public final zzxw zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zzd;
    }

    private zzfx(zzgd zzgdVar, zzxw zzxwVar, zzxv zzxvVar, @Nullable Integer num) {
        this.zza = zzgdVar;
        this.zzb = zzxwVar;
        this.zzc = zzxvVar;
        this.zzd = num;
    }
}
