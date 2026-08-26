package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzaeo implements zzacr {
    private static final String zza = zzaeo.class.getSimpleName();
    private static final Logger zzb = new Logger(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(this.zzd);
        String code = parseLink != null ? parseLink.getCode() : null;
        String zza2 = parseLink != null ? parseLink.zza() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (code != null) {
            jSONObject.put("oobCode", code);
        }
        if (zza2 != null) {
            jSONObject.put("tenantId", zza2);
        }
        if (this.zze != null) {
            jSONObject.put("idToken", this.zze);
        }
        if (this.zzf != null) {
            zzahe.zza(jSONObject, "captchaResp", this.zzf);
        } else {
            zzahe.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public zzaeo(EmailAuthCredential emailAuthCredential, String str, String str2) {
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.zzc());
        this.zzd = Preconditions.checkNotEmpty(emailAuthCredential.zze());
        this.zze = str;
        this.zzf = str2;
    }
}
