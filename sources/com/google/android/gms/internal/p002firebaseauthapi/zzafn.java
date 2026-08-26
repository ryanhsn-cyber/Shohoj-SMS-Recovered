package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzafn implements zzacu<zzafn> {
    private static final String zza = zzafn.class.getSimpleName();
    private String zzb;
    private zzaq<zzafx> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzafn zza(String str) throws zzaah {
        zzaq<zzafx> zza2;
        zzafx zza3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzap zzg = zzaq.zzg();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 == null) {
                            zza3 = zzafx.zza(null, null);
                        } else {
                            zza3 = zzafx.zza(Strings.emptyToNull(jSONObject2.optString("provider")), Strings.emptyToNull(jSONObject2.optString("enforcementState")));
                        }
                        zzg.zza(zza3);
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaq.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb(String str) {
        Preconditions.checkNotEmpty(str);
        String str2 = null;
        if (this.zzc != null && !this.zzc.isEmpty()) {
            zzaq<zzafx> zzaqVar = this.zzc;
            int size = zzaqVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                zzafx zzafxVar = zzaqVar.get(i);
                i++;
                zzafx zzafxVar2 = zzafxVar;
                String zza2 = zzafxVar2.zza();
                String zzb = zzafxVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    str2 = zzafxVar2.zza();
                    break;
                }
            }
        }
        if (str2 == null) {
            return false;
        }
        return str2.equals("ENFORCE") || str2.equals("AUDIT");
    }
}
