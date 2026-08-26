package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzek extends zzcw {
    private final int zza;
    private final zzb zzb;

    public final int zzb() {
        return this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzek.class, Integer.valueOf(this.zza), this.zzb);
    }

    public static zza zzc() {
        return new zza();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zzb(String str) {
            this.zzd = str;
        }
    }

    public final zzb zzd() {
        return this.zzb;
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza {

        @Nullable
        private Integer zza;
        private zzb zzb;

        public final zza zza(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        public final zzek zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            return new zzek(this.zza.intValue(), this.zzb);
        }

        private zza() {
            this.zza = null;
            this.zzb = zzb.zzc;
        }
    }

    private zzek(int i, zzb zzbVar) {
        this.zza = i;
        this.zzb = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzek)) {
            return false;
        }
        zzek zzekVar = (zzek) obj;
        return zzekVar.zza == this.zza && zzekVar.zzb == this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzb != zzb.zzc;
    }
}
