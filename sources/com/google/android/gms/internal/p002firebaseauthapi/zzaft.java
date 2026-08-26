package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzaft extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaft> CREATOR = new zzafs();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public static zzaq<zzaft> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaq.zza(new ArrayList());
        }
        zzap zzg = zzaq.zzg();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzg.zza(new zzaft(jSONObject.getString("credentialId"), jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    public static final zzaft zza(JSONObject jSONObject) throws JSONException {
        return new zzaft(jSONObject.getString("credentialId"), jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME), jSONObject.getString("displayName"));
    }

    public static final JSONObject zza(zzaft zzaftVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzaftVar.zza);
        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, zzaftVar.zzb);
        jSONObject.put("displayName", zzaftVar.zzc);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaft(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
