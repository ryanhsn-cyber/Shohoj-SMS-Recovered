package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzaek implements zzacu<zzaek> {
    private static final String zza = zzaek.class.getName();
    private String zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaek zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            this.zzc = jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e.getMessage());
            throw new zzaah("Failed to parse error for string [" + str + "]", e);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
