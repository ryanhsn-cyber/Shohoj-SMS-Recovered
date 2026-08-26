package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjv;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzki extends zzkr {
    private final zzjv zza;
    private final zzxv zzb;
    private final zzxv zzc;

    @Nullable
    private final Integer zzd;

    public final zzjv zzb() {
        return this.zza;
    }

    public static zzki zza(zzjv zzjvVar, zzxv zzxvVar, @Nullable Integer num) throws GeneralSecurityException {
        zzxv zzb;
        EllipticCurve curve;
        zzjv.zzf zzf = zzjvVar.zzf();
        if (!zzf.equals(zzjv.zzf.zzc) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzf) + " variant.");
        }
        if (zzf.equals(zzjv.zzf.zzc) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzjv.zzd zze = zzjvVar.zze();
        int zza = zzxvVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        if (zze == zzjv.zzd.zza) {
            if (zza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zze == zzjv.zzd.zzb) {
            if (zza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zze == zzjv.zzd.zzc) {
            if (zza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else if (zze == zzjv.zzd.zzd) {
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            throw new GeneralSecurityException("Unable to validate public key length for " + String.valueOf(zze));
        }
        if (zze == zzjv.zzd.zza || zze == zzjv.zzd.zzb || zze == zzjv.zzd.zzc) {
            if (zze == zzjv.zzd.zza) {
                curve = zzmf.zza.getCurve();
            } else if (zze == zzjv.zzd.zzb) {
                curve = zzmf.zzb.getCurve();
            } else if (zze == zzjv.zzd.zzc) {
                curve = zzmf.zzc.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zze));
            }
            zzmf.zza(zzwr.zza(curve, zzwt.UNCOMPRESSED, zzxvVar.zzb()), curve);
        }
        zzjv.zzf zzf2 = zzjvVar.zzf();
        if (zzf2 == zzjv.zzf.zzc) {
            zzb = zznt.zza;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + String.valueOf(zzf2));
            }
            if (zzf2 == zzjv.zzf.zzb) {
                zzb = zznt.zza(num.intValue());
            } else if (zzf2 == zzjv.zzf.zza) {
                zzb = zznt.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown HpkeParameters.Variant: " + String.valueOf(zzf2));
            }
        }
        return new zzki(zzjvVar, zzxvVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkr
    public final zzxv zzc() {
        return this.zzc;
    }

    public final zzxv zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zzd;
    }

    private zzki(zzjv zzjvVar, zzxv zzxvVar, zzxv zzxvVar2, @Nullable Integer num) {
        this.zza = zzjvVar;
        this.zzb = zzxvVar;
        this.zzc = zzxvVar2;
        this.zzd = num;
    }
}
