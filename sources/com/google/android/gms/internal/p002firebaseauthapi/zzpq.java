package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzpq extends zzql {
    private final int zza;
    private final int zzb;
    private final zzb zzc;

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    private final int zzf() {
        if (this.zzc == zzb.zzd) {
            return this.zzb;
        }
        if (this.zzc == zzb.zza) {
            return this.zzb + 5;
        }
        if (this.zzc == zzb.zzb) {
            return this.zzb + 5;
        }
        if (this.zzc == zzb.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        public final String toString() {
            return this.zze;
        }

        private zzb(String str) {
            this.zze = str;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza {

        @Nullable
        private Integer zza;

        @Nullable
        private Integer zzb;
        private zzb zzc;

        public final zza zza(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zza zzb(int i) throws GeneralSecurityException {
            if (i < 10 || 16 < i) {
                throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
            }
            this.zzb = Integer.valueOf(i);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zzpq zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("variant not set");
            }
            return new zzpq(this.zza.intValue(), this.zzb.intValue(), this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zzb.zzd;
        }
    }

    public final int hashCode() {
        return Objects.hash(zzpq.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public static zza zzd() {
        return new zza();
    }

    public final zzb zze() {
        return this.zzc;
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    private zzpq(int i, int i2, zzb zzbVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpq)) {
            return false;
        }
        zzpq zzpqVar = (zzpq) obj;
        return zzpqVar.zza == this.zza && zzpqVar.zzf() == zzf() && zzpqVar.zzc == this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzc != zzb.zzd;
    }
}
