package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zzf;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzagu implements zzacu<zzagu> {
    private static final String zza = zzagu.class.getSimpleName();
    private boolean zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private boolean zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private List<zzafq> zzt;
    private String zzu;

    public final long zza() {
        return this.zzf;
    }

    public final zzf zzb() {
        if (!TextUtils.isEmpty(this.zzn) || !TextUtils.isEmpty(this.zzo)) {
            return zzf.zza(this.zzk, this.zzo, this.zzn, this.zzr, this.zzp);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagu zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            this.zzc = jSONObject.optBoolean("needEmail", false);
            this.zzd = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zze = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            this.zzg = Strings.emptyToNull(jSONObject.optString("localId", null));
            this.zzh = Strings.emptyToNull(jSONObject.optString("email", null));
            this.zzi = Strings.emptyToNull(jSONObject.optString("displayName", null));
            this.zzj = Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.zzk = Strings.emptyToNull(jSONObject.optString("providerId", null));
            this.zzl = Strings.emptyToNull(jSONObject.optString("rawUserInfo", null));
            this.zzm = jSONObject.optBoolean("isNewUser", false);
            this.zzn = jSONObject.optString("oauthAccessToken", null);
            this.zzo = jSONObject.optString("oauthIdToken", null);
            this.zzq = Strings.emptyToNull(jSONObject.optString("errorMessage", null));
            this.zzr = Strings.emptyToNull(jSONObject.optString("pendingToken", null));
            this.zzs = Strings.emptyToNull(jSONObject.optString("tenantId", null));
            this.zzt = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzu = Strings.emptyToNull(jSONObject.optString("mfaPendingCredential", null));
            this.zzp = Strings.emptyToNull(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zzu;
    }

    public final String zzg() {
        return this.zzk;
    }

    public final String zzh() {
        return this.zzl;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzs;
    }

    public final List<zzafq> zzk() {
        return this.zzt;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzu);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzq);
    }
}
