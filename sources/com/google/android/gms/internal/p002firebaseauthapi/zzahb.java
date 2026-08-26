package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzahb implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    public static zzahb zza(String str, String str2, boolean z) {
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzb = Preconditions.checkNotEmpty(str);
        zzahbVar.zzc = Preconditions.checkNotEmpty(str2);
        zzahbVar.zzf = z;
        return zzahbVar;
    }

    public static zzahb zzb(String str, String str2, boolean z) {
        zzahb zzahbVar = new zzahb();
        zzahbVar.zza = Preconditions.checkNotEmpty(str);
        zzahbVar.zzd = Preconditions.checkNotEmpty(str2);
        zzahbVar.zzf = z;
        return zzahbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        if (this.zze != null) {
            jSONObject.put("idToken", this.zze);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    private zzahb() {
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
