package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzafu {
    private List<zzafv> zza;

    public static zzafu zza(JSONArray jSONArray) throws JSONException {
        zzafv zzafvVar;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                zzafvVar = new zzafv();
            } else {
                zzafvVar = new zzafv(Strings.emptyToNull(jSONObject.optString("federatedId", null)), Strings.emptyToNull(jSONObject.optString("displayName", null)), Strings.emptyToNull(jSONObject.optString("photoUrl", null)), Strings.emptyToNull(jSONObject.optString("providerId", null)), null, Strings.emptyToNull(jSONObject.optString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, null)), Strings.emptyToNull(jSONObject.optString("email", null)));
            }
            arrayList.add(zzafvVar);
        }
        return new zzafu(arrayList);
    }

    public final List<zzafv> zza() {
        return this.zza;
    }

    public zzafu() {
        this.zza = new ArrayList();
    }

    private zzafu(List<zzafv> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }
}
