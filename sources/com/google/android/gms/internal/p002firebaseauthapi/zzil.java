package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzis;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzil extends zziw {
    private final zzis zza;
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
        private zzis zza;

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

        public final zza zza(zzis zzisVar) {
            this.zza = zzisVar;
            return this;
        }

        public final zzil zza() throws GeneralSecurityException {
            zzxv zzb;
            if (this.zza == null || this.zzb == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            }
            if (this.zza.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzd() == zzis.zzb.zzc) {
                zzb = zznt.zza;
            } else if (this.zza.zzd() == zzis.zzb.zzb) {
                zzb = zznt.zza(this.zzc.intValue());
            } else if (this.zza.zzd() == zzis.zzb.zza) {
                zzb = zznt.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: " + String.valueOf(this.zza.zzd()));
            }
            return new zzil(this.zza, this.zzb, zzb, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
    }

    public final zzis zzc() {
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

    private zzil(zzis zzisVar, zzxw zzxwVar, zzxv zzxvVar, @Nullable Integer num) {
        this.zza = zzisVar;
        this.zzb = zzxwVar;
        this.zzc = zzxvVar;
        this.zzd = num;
    }
}
