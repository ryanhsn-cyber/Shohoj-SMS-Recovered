package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzafz implements zzacu<zzafz> {
    private static final String zza = zzafz.class.getSimpleName();
    private String zzb;
    private String zzc;
    private String zzd;
    private zzafq zze;

    public final zzafq zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafz zza(String str) throws zzaah {
        String str2;
        char c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("email"));
            this.zzc = Strings.emptyToNull(jSONObject.optString("newEmail"));
            String str3 = null;
            switch (jSONObject.optInt("reqType")) {
                case 1:
                    str2 = "PASSWORD_RESET";
                    break;
                case 2:
                case 3:
                default:
                    str2 = null;
                    break;
                case 4:
                    str2 = "VERIFY_EMAIL";
                    break;
                case 5:
                    str2 = "RECOVER_EMAIL";
                    break;
                case 6:
                    str2 = "EMAIL_SIGNIN";
                    break;
                case 7:
                    str2 = "VERIFY_AND_CHANGE_EMAIL";
                    break;
                case 8:
                    str2 = "REVERT_SECOND_FACTOR_ADDITION";
                    break;
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(this.zzd)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        str3 = optString;
                        break;
                }
                this.zzd = str3;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzafq.zza(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzb != null;
    }

    public final boolean zzf() {
        return this.zze != null;
    }

    public final boolean zzg() {
        return this.zzc != null;
    }

    public final boolean zzh() {
        return this.zzd != null;
    }
}
