package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqf;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzpw extends zzqi {
    private final zzqf zza;
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
        private zzqf zza;

        @Nullable
        private zzxw zzb;

        @Nullable
        private Integer zzc;

        public final zza zza(@Nullable Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzxw zzxwVar) {
            this.zzb = zzxwVar;
            return this;
        }

        public final zza zza(zzqf zzqfVar) {
            this.zza = zzqfVar;
            return this;
        }

        public final zzpw zza() throws GeneralSecurityException {
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
            if (this.zza.zzf() == zzqf.zzc.zzd) {
                zza = zznt.zza;
            } else if (this.zza.zzf() == zzqf.zzc.zzc || this.zza.zzf() == zzqf.zzc.zzb) {
                zza = zznt.zza(this.zzc.intValue());
            } else if (this.zza.zzf() == zzqf.zzc.zza) {
                zza = zznt.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + String.valueOf(this.zza.zzf()));
            }
            return new zzpw(this.zza, this.zzb, zza, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
    }

    public final zzqf zzc() {
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

    private zzpw(zzqf zzqfVar, zzxw zzxwVar, zzxv zzxvVar, @Nullable Integer num) {
        this.zza = zzqfVar;
        this.zzb = zzxwVar;
        this.zzc = zzxvVar;
        this.zzd = num;
    }
}
