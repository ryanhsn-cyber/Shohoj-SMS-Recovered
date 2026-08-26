package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzcz extends zzcu {
    private final zzdg zza;
    private final zzxw zzb;
    private final zzxw zzc;
    private final zzxv zzd;

    @Nullable
    private final Integer zze;

    public static zza zzb() {
        return new zza();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static class zza {

        @Nullable
        private zzdg zza;

        @Nullable
        private zzxw zzb;

        @Nullable
        private zzxw zzc;

        @Nullable
        private Integer zzd;

        public final zza zza(zzxw zzxwVar) {
            this.zzb = zzxwVar;
            return this;
        }

        public final zza zzb(zzxw zzxwVar) {
            this.zzc = zzxwVar;
            return this;
        }

        public final zza zza(@Nullable Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdg zzdgVar) {
            this.zza = zzdgVar;
            return this;
        }

        public final zzcz zza() throws GeneralSecurityException {
            zzxv zzb;
            if (this.zza == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.zzb == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (this.zza.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.zza.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzd != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzh() == zzdg.zzb.zzc) {
                zzb = zznt.zza;
            } else if (this.zza.zzh() == zzdg.zzb.zzb) {
                zzb = zznt.zza(this.zzd.intValue());
            } else if (this.zza.zzh() == zzdg.zzb.zza) {
                zzb = zznt.zzb(this.zzd.intValue());
            } else {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + String.valueOf(this.zza.zzh()));
            }
            return new zzcz(this.zza, this.zzb, this.zzc, zzb, this.zzd);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final zzdg zzc() {
        return this.zza;
    }

    public final zzxv zzd() {
        return this.zzd;
    }

    public final zzxw zze() {
        return this.zzb;
    }

    public final zzxw zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    @Nullable
    public final Integer zza() {
        return this.zze;
    }

    private zzcz(zzdg zzdgVar, zzxw zzxwVar, zzxw zzxwVar2, zzxv zzxvVar, @Nullable Integer num) {
        this.zza = zzdgVar;
        this.zzb = zzxwVar;
        this.zzc = zzxwVar2;
        this.zzd = zzxvVar;
        this.zze = num;
    }
}
