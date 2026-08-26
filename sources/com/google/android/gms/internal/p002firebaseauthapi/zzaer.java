package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzaer implements zzacu<zzaer> {
    private static final String zza = zzaer.class.getSimpleName();
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;
    private long zzg;
    private List<zzafq> zzh;
    private String zzi;

    public final long zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaer zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("localId", null);
            this.zzc = jSONObject.optString("email", null);
            this.zzd = jSONObject.optString("idToken", null);
            this.zze = jSONObject.optString("refreshToken", null);
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = jSONObject.optLong("expiresIn", 0L);
            this.zzh = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzi = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzi;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzafq> zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzi);
    }

    public final boolean zzg() {
        return this.zzf;
    }
}
