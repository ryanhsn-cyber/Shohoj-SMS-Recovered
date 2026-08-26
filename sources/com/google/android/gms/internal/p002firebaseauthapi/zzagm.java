package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzagm extends zzagi {
    private static final String zza = zzagm.class.getSimpleName();
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi, com.google.android.gms.internal.p002firebaseauthapi.zzacu
    public final /* synthetic */ zzagi zza(String str) throws zzaah {
        return (zzagm) zza(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) throws zzaah {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzah.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi
    public final String zza() {
        return this.zzb;
    }
}
