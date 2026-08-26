package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpq;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzpj extends zzqi {
    private final zzpq zza;
    private final zzxw zzb;
    private final zzxv zzc;

    @Nullable
    private final Integer zzd;

    public static zza zzb() {
        return new zza();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static class zza {

        @Nullable
        private zzpq zza;

        @Nullable
        private zzxw zzb;

        @Nullable
        private Integer zzc;

        public final zza zza(zzxw zzxwVar) throws GeneralSecurityException {
            this.zzb = zzxwVar;
            return this;
        }

        public final zza zza(@Nullable Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzpq zzpqVar) {
            this.zza = zzpqVar;
            return this;
        }

        public final zzpj zza() throws GeneralSecurityException {
            zzxv zza;
            if (this.zza == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (this.zza.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zze() == zzpq.zzb.zzd) {
                zza = zznt.zza;
            } else if (this.zza.zze() == zzpq.zzb.zzc || this.zza.zze() == zzpq.zzb.zzb) {
                zza = zznt.zza(this.zzc.intValue());
            } else if (this.zza.zze() == zzpq.zzb.zza) {
                zza = zznt.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + String.valueOf(this.zza.zze()));
            }
            return new zzpj(this.zza, this.zzb, zza, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
    }

    public final zzpq zzc() {
        return this.zza;
    }

    public final zzxv zzd() {
        return this.zzc;
    }

    public final zzxw zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zzd;
    }

    private zzpj(zzpq zzpqVar, zzxw zzxwVar, zzxv zzxvVar, @Nullable Integer num) {
        this.zza = zzpqVar;
        this.zzb = zzxwVar;
        this.zzc = zzxvVar;
        this.zzd = num;
    }
}
