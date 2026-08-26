package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzagh implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.zza != null) {
            jSONObject.put("email", this.zza);
        }
        if (this.zzb != null) {
            jSONObject.put("password", this.zzb);
        }
        if (this.zzd != null) {
            jSONObject.put("tenantId", this.zzd);
        }
        if (this.zze != null) {
            zzahe.zza(jSONObject, "captchaResponse", this.zze);
        } else {
            zzahe.zza(jSONObject);
        }
        if (this.zzf != null) {
            jSONObject.put("idToken", this.zzf);
        }
        return jSONObject.toString();
    }

    public zzagh(String str) {
        this.zzd = str;
    }

    public zzagh(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = null;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }
}
