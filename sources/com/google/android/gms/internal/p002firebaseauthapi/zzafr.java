package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzafr {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;
    private boolean zzf;

    public static zzafr zza(String str) throws UnsupportedEncodingException {
        try {
            zzafr zzafrVar = new zzafr();
            JSONObject jSONObject = new JSONObject(str);
            zzafrVar.zza = jSONObject.optString("iss");
            zzafrVar.zzb = jSONObject.optString("aud");
            zzafrVar.zzc = jSONObject.optString("sub");
            zzafrVar.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzafrVar.zze = Long.valueOf(jSONObject.optLong("exp"));
            zzafrVar.zzf = jSONObject.optBoolean("is_anonymous");
            return zzafrVar;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e));
        }
    }

    public final Long zza() {
        return this.zze;
    }

    public final Long zzb() {
        return this.zzd;
    }
}
