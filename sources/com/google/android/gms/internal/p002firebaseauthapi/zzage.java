package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzage implements zzacu<zzage> {
    private static final String zza = zzage.class.getSimpleName();
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzafu zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    public final long zza() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzage zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("email", null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("passwordHash", null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = Strings.emptyToNull(jSONObject.optString("displayName", null));
            this.zzf = Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.zzg = zzafu.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zzi = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzj = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List<zzafv> zze() {
        if (this.zzg != null) {
            return this.zzg.zza();
        }
        return null;
    }
}
