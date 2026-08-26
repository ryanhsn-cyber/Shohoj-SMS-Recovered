package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzagd implements zzacr {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final boolean zzh;
    private zzaeh zzi;

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zza);
        if (this.zze != null) {
            jSONObject.put("tenantId", this.zze);
        }
        if (this.zzf != null) {
            jSONObject.put("recaptchaToken", this.zzf);
        }
        if (this.zzi != null) {
            jSONObject.put("autoRetrievalInfo", this.zzi.zza());
        }
        if (this.zzg != null) {
            jSONObject.put("playIntegrityToken", this.zzg);
        }
        return jSONObject.toString();
    }

    public zzagd(String str, long j, boolean z, String str2, String str3, String str4, String str5, boolean z2) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = j;
        this.zzc = z;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = z2;
    }

    public final void zza(zzaeh zzaehVar) {
        this.zzi = zzaehVar;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzh;
    }
}
