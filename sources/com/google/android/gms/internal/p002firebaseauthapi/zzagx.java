package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzagx implements zzacr {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.zza);
        jSONObject.put("returnSecureToken", true);
        if (this.zzb != null) {
            jSONObject.put("tenantId", this.zzb);
        }
        return jSONObject.toString();
    }

    public zzagx(String str, String str2) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = str2;
    }
}
