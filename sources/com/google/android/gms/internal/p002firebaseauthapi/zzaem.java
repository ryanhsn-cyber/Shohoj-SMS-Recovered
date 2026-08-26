package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzaem implements zzacu<zzaem> {
    private static final String zza = zzaem.class.getSimpleName();
    private String zzb;
    private boolean zzc;
    private String zzd;
    private boolean zze;
    private zzagr zzf = zzagr.zza();
    private List<String> zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaem zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", null);
            this.zzc = jSONObject.optBoolean("registered", false);
            this.zzd = jSONObject.optString("providerId", null);
            this.zze = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.zzf = zzagr.zza();
            } else {
                this.zzf = new zzagr(1, zzahe.zza(jSONObject.optJSONArray("allProviders")));
            }
            this.zzg = zzahe.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzg;
    }
}
