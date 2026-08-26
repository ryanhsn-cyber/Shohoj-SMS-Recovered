package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzqf extends zzql {
    private final int zza;
    private final int zzb;
    private final zzc zzc;
    private final zzb zzd;

    public final int zzb() {
        return this.zzb;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza {

        @Nullable
        private Integer zza;

        @Nullable
        private Integer zzb;
        private zzb zzc;
        private zzc zzd;

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zza zza(int i) throws GeneralSecurityException {
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zza zzb(int i) throws GeneralSecurityException {
            this.zzb = Integer.valueOf(i);
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zzd = zzcVar;
            return this;
        }

        public final zzqf zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (this.zza.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
            }
            int intValue = this.zzb.intValue();
            zzb zzbVar = this.zzc;
            if (intValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
            }
            if (zzbVar == zzb.zza) {
                if (intValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                }
            } else if (zzbVar == zzb.zzb) {
                if (intValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                }
            } else if (zzbVar == zzb.zzc) {
                if (intValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                }
            } else if (zzbVar == zzb.zzd) {
                if (intValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                }
            } else if (zzbVar == zzb.zze) {
                if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                }
            } else {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            return new zzqf(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzc.zzd;
        }
    }

    public final int zzc() {
        return this.zza;
    }

    private final int zzg() {
        if (this.zzc == zzc.zzd) {
            return this.zzb;
        }
        if (this.zzc == zzc.zza) {
            return this.zzb + 5;
        }
        if (this.zzc == zzc.zzb) {
            return this.zzb + 5;
        }
        if (this.zzc == zzc.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("CRUNCHY");
        public static final zzc zzc = new zzc("LEGACY");
        public static final zzc zzd = new zzc("NO_PREFIX");
        private final String zze;

        public final String toString() {
            return this.zze;
        }

        private zzc(String str) {
            this.zze = str;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("SHA1");
        public static final zzb zzb = new zzb("SHA224");
        public static final zzb zzc = new zzb("SHA256");
        public static final zzb zzd = new zzb("SHA384");
        public static final zzb zze = new zzb("SHA512");
        private final String zzf;

        public final String toString() {
            return this.zzf;
        }

        private zzb(String str) {
            this.zzf = str;
        }
    }

    public final int hashCode() {
        return Objects.hash(zzqf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public static zza zzd() {
        return new zza();
    }

    public final zzb zze() {
        return this.zzd;
    }

    public final zzc zzf() {
        return this.zzc;
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    private zzqf(int i, int i2, zzc zzcVar, zzb zzbVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcVar;
        this.zzd = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqf)) {
            return false;
        }
        zzqf zzqfVar = (zzqf) obj;
        return zzqfVar.zza == this.zza && zzqfVar.zzg() == zzg() && zzqfVar.zzc == this.zzc && zzqfVar.zzd == this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzc != zzc.zzd;
    }
}
