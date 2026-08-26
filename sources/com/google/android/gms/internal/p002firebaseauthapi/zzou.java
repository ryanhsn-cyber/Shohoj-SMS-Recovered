package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzou implements zzox {
    private final String zza;
    private final zzxv zzb;
    private final zzaho zzc;
    private final zzuw.zzb zzd;
    private final zzvs zze;

    @Nullable
    private final Integer zzf;

    public static zzou zza(String str, zzaho zzahoVar, zzuw.zzb zzbVar, zzvs zzvsVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzvsVar == zzvs.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzou(str, zzph.zza(str), zzahoVar, zzbVar, zzvsVar, num);
    }

    public final zzuw.zzb zza() {
        return this.zzd;
    }

    public final zzvs zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzox
    public final zzxv zzb() {
        return this.zzb;
    }

    public final zzaho zzd() {
        return this.zzc;
    }

    @Nullable
    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    private zzou(String str, zzxv zzxvVar, zzaho zzahoVar, zzuw.zzb zzbVar, zzvs zzvsVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzxvVar;
        this.zzc = zzahoVar;
        this.zzd = zzbVar;
        this.zze = zzvsVar;
        this.zzf = num;
    }
}
