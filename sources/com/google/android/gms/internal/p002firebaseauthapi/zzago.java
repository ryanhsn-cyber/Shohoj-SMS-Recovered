package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzago extends zzagi {
    private static final String zza = zzago.class.getSimpleName();
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    public final int zzb() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi, com.google.android.gms.internal.p002firebaseauthapi.zzacu
    public final /* synthetic */ zzagi zza(String str) throws zzaah {
        return (zzago) zza(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzago zza(String str) throws zzaah {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (optJSONObject != null) {
                this.zzc = zzah.zza(optJSONObject.optString("sharedSecretKey"));
                this.zzd = optJSONObject.optInt("verificationCodeLength");
                this.zze = zzah.zza(optJSONObject.optString("hashingAlgorithm"));
                this.zzf = optJSONObject.optInt("periodSec");
                this.zzb = zzah.zza(optJSONObject.optString("sessionInfo"));
                String optString = optJSONObject.optString("finalizeEnrollmentTime");
                try {
                    this.zzg = zzane.zza(zzane.zza(optString));
                } catch (ParseException e) {
                    Log.e(zza, "Failed to parse timestamp: " + optString);
                }
            }
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzahe.zza(e2, zza, str);
        }
    }

    public final String zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi
    public final String zza() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzc;
    }
}
