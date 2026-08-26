package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzfi extends zzcw {
    private final zzc zza;
    private final String zzb;
    private final zzb zzc;
    private final zzcw zzd;

    public final int hashCode() {
        return Objects.hash(zzfi.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static class zza {

        @Nullable
        private zzc zza;

        @Nullable
        private String zzb;

        @Nullable
        private zzb zzc;

        @Nullable
        private zzcw zzd;

        public final zza zza(zzcw zzcwVar) {
            this.zzd = zzcwVar;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zza zza(String str) {
            this.zzb = str;
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zza = zzcVar;
            return this;
        }

        public final zzfi zza() throws GeneralSecurityException {
            if (this.zza == null) {
                this.zza = zzc.zzb;
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (this.zzd.zza()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            zzb zzbVar = this.zzc;
            zzcw zzcwVar = this.zzd;
            boolean z = true;
            if ((!zzbVar.equals(zzb.zza) || !(zzcwVar instanceof zzdz)) && ((!zzbVar.equals(zzb.zzc) || !(zzcwVar instanceof zzeq)) && ((!zzbVar.equals(zzb.zzb) || !(zzcwVar instanceof zzgd)) && ((!zzbVar.equals(zzb.zzd) || !(zzcwVar instanceof zzdg)) && ((!zzbVar.equals(zzb.zze) || !(zzcwVar instanceof zzdq)) && (!zzbVar.equals(zzb.zzf) || !(zzcwVar instanceof zzek))))))) {
                z = false;
            }
            if (!z) {
                throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzc.toString() + " when new keys are picked according to " + String.valueOf(this.zzd) + ".");
            }
            return new zzfi(this.zza, this.zzb, this.zzc, this.zzd);
        }

        private zza() {
        }
    }

    public final zzcw zzb() {
        return this.zzd;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("NO_PREFIX");
        private final String zzc;

        public final String toString() {
            return this.zzc;
        }

        private zzc(String str) {
            this.zzc = str;
        }
    }

    public final zzc zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + String.valueOf(this.zzd) + ", variant: " + String.valueOf(this.zza) + ")";
    }

    private zzfi(zzc zzcVar, String str, zzb zzbVar, zzcw zzcwVar) {
        this.zza = zzcVar;
        this.zzb = str;
        this.zzc = zzbVar;
        this.zzd = zzcwVar;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("ASSUME_AES_GCM");
        public static final zzb zzb = new zzb("ASSUME_XCHACHA20POLY1305");
        public static final zzb zzc = new zzb("ASSUME_CHACHA20POLY1305");
        public static final zzb zzd = new zzb("ASSUME_AES_CTR_HMAC");
        public static final zzb zze = new zzb("ASSUME_AES_EAX");
        public static final zzb zzf = new zzb("ASSUME_AES_GCM_SIV");
        private final String zzg;

        public final String toString() {
            return this.zzg;
        }

        private zzb(String str) {
            this.zzg = str;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfi)) {
            return false;
        }
        zzfi zzfiVar = (zzfi) obj;
        return zzfiVar.zzc.equals(this.zzc) && zzfiVar.zzd.equals(this.zzd) && zzfiVar.zzb.equals(this.zzb) && zzfiVar.zza.equals(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zza != zzc.zzb;
    }
}
