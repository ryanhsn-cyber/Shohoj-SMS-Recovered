package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import com.google.android.gms.internal.p002firebaseauthapi.zzis;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzjo extends zzkp {
    private static final Set<zzci> zza = (Set) zzpf.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
        public final Object zza() {
            return zzjo.zzj();
        }
    });
    private final zzb zzb;
    private final zzd zzc;

    @Nullable
    private final zzc zzd;
    private final zze zze;
    private final zzci zzf;

    @Nullable
    private final zzxv zzg;

    public final int hashCode() {
        return Objects.hash(zzjo.class, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza {
        private zzb zza;
        private zzd zzb;
        private zzc zzc;
        private zzci zzd;
        private zze zze;

        @Nullable
        private zzxv zzf;

        public final zza zza(zzb zzbVar) {
            this.zza = zzbVar;
            return this;
        }

        public final zza zza(zzci zzciVar) throws GeneralSecurityException {
            if (!zzjo.zza.contains(zzciVar)) {
                throw new GeneralSecurityException("Invalid DEM parameters " + String.valueOf(zzciVar) + "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
            }
            this.zzd = zzciVar;
            return this;
        }

        public final zza zza(zzd zzdVar) {
            this.zzb = zzdVar;
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zzc = zzcVar;
            return this;
        }

        public final zza zza(zzxv zzxvVar) {
            if (zzxvVar.zza() == 0) {
                this.zzf = null;
                return this;
            }
            this.zzf = zzxvVar;
            return this;
        }

        public final zza zza(zze zzeVar) {
            this.zze = zzeVar;
            return this;
        }

        public final zzjo zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("Elliptic curve type is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("Hash type is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("DEM parameters are not set");
            }
            if (this.zze == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.zza != zzb.zzd && this.zzc == null) {
                throw new GeneralSecurityException("Point format is not set");
            }
            if (this.zza == zzb.zzd && this.zzc != null) {
                throw new GeneralSecurityException("For Curve25519 point format must not be set");
            }
            return new zzjo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = zze.zzc;
            this.zzf = null;
        }
    }

    public final zzci zzb() {
        return this.zzf;
    }

    public static zza zzc() {
        return new zza();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzc {
        public static final zzc zza = new zzc("COMPRESSED");
        public static final zzc zzb = new zzc("UNCOMPRESSED");
        public static final zzc zzc = new zzc("LEGACY_UNCOMPRESSED");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zzc(String str) {
            this.zzd = str;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zze {
        public static final zze zza = new zze("TINK");
        public static final zze zzb = new zze("CRUNCHY");
        public static final zze zzc = new zze("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zze(String str) {
            this.zzd = str;
        }
    }

    public final zzb zzd() {
        return this.zzb;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("NIST_P256");
        public static final zzb zzb = new zzb("NIST_P384");
        public static final zzb zzc = new zzb("NIST_P521");
        public static final zzb zzd = new zzb("X25519");
        private final String zze;

        public final String toString() {
            return this.zze;
        }

        private zzb(String str) {
            this.zze = str;
        }
    }

    public final zzd zze() {
        return this.zzc;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzd {
        public static final zzd zza = new zzd("SHA1");
        public static final zzd zzb = new zzd("SHA224");
        public static final zzd zzc = new zzd("SHA256");
        public static final zzd zzd = new zzd("SHA384");
        public static final zzd zze = new zzd("SHA512");
        private final String zzf;

        public final String toString() {
            return this.zzf;
        }

        private zzd(String str) {
            this.zzf = str;
        }
    }

    @Nullable
    public final zzc zzf() {
        return this.zzd;
    }

    public final zze zzg() {
        return this.zze;
    }

    @Nullable
    public final zzxv zzh() {
        return this.zzg;
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Set zzj() throws Exception {
        HashSet hashSet = new HashSet();
        hashSet.add(zzdz.zze().zza(12).zzb(16).zzc(16).zza(zzdz.zzb.zzc).zza());
        hashSet.add(zzdz.zze().zza(12).zzb(32).zzc(16).zza(zzdz.zzb.zzc).zza());
        hashSet.add(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza());
        hashSet.add(zzdg.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza());
        hashSet.add(zzgd.zzc());
        hashSet.add(zzis.zzc().zza(64).zza(zzis.zzb.zzc).zza());
        return Collections.unmodifiableSet(hashSet);
    }

    private zzjo(zzb zzbVar, zzd zzdVar, @Nullable zzc zzcVar, zzci zzciVar, zze zzeVar, zzxv zzxvVar) {
        this.zzb = zzbVar;
        this.zzc = zzdVar;
        this.zzd = zzcVar;
        this.zzf = zzciVar;
        this.zze = zzeVar;
        this.zzg = zzxvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjo)) {
            return false;
        }
        zzjo zzjoVar = (zzjo) obj;
        return Objects.equals(zzjoVar.zzb, this.zzb) && Objects.equals(zzjoVar.zzc, this.zzc) && Objects.equals(zzjoVar.zzd, this.zzd) && Objects.equals(zzjoVar.zzf, this.zzf) && Objects.equals(zzjoVar.zze, this.zze) && Objects.equals(zzjoVar.zzg, this.zzg);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zze != zze.zzc;
    }
}
