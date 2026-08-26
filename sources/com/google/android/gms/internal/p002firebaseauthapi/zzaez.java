package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzaez implements zzaes {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    public static zzaez zza(String str, String str2, String str3, String str4) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str4);
        return new zzaez(TotpMultiFactorGenerator.FACTOR_ID, str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (this.zzc != null) {
            jSONObject2.put("verificationCode", this.zzc);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zzb);
        if (this.zzd != null) {
            jSONObject.put("tenantId", this.zzd);
        }
        if (this.zze != null) {
            jSONObject.put("mfaEnrollmentId", this.zze);
        }
        return jSONObject.toString();
    }

    private zzaez(String str, String str2, String str3, String str4, String str5) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
    }
}
