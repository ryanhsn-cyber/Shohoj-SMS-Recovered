package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzafh implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;
    private String zzg;

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public static zzafh zza(ActionCodeSettings actionCodeSettings, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(actionCodeSettings);
        return new zzafh(7, actionCodeSettings, null, str2, str, null, null);
    }

    public final zzafh zza(ActionCodeSettings actionCodeSettings) {
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    public final zzafh zza(String str) {
        this.zzg = str;
        return this;
    }

    public final zzafh zzb(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzafh zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzafh zzd(String str) {
        this.zzd = Preconditions.checkNotEmpty(str);
        return this;
    }

    private static String zza(int i) {
        switch (i) {
            case 1:
                return "PASSWORD_RESET";
            case 2:
            case 3:
            case 5:
            default:
                return "REQUEST_TYPE_UNSET_ENUM_VALUE";
            case 4:
                return "VERIFY_EMAIL";
            case 6:
                return "EMAIL_SIGNIN";
            case 7:
                return "VERIFY_AND_CHANGE_EMAIL";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        char c;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        int i = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c = 2;
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
                i = 1;
                break;
            case 1:
                i = 4;
                break;
            case 2:
                i = 6;
                break;
            case 3:
                i = 7;
                break;
        }
        jSONObject.put("requestType", i);
        if (this.zzb != null) {
            jSONObject.put("email", this.zzb);
        }
        if (this.zzc != null) {
            jSONObject.put("newEmail", this.zzc);
        }
        if (this.zzd != null) {
            jSONObject.put("idToken", this.zzd);
        }
        if (this.zze != null) {
            jSONObject.put("androidInstallApp", this.zze.getAndroidInstallApp());
            jSONObject.put("canHandleCodeInApp", this.zze.canHandleCodeInApp());
            if (this.zze.getUrl() != null) {
                jSONObject.put("continueUrl", this.zze.getUrl());
            }
            if (this.zze.getIOSBundle() != null) {
                jSONObject.put("iosBundleId", this.zze.getIOSBundle());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.getAndroidPackageName() != null) {
                jSONObject.put("androidPackageName", this.zze.getAndroidPackageName());
            }
            if (this.zze.getAndroidMinimumVersion() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.getAndroidMinimumVersion());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        if (this.zzf != null) {
            jSONObject.put("tenantId", this.zzf);
        }
        if (this.zzg != null) {
            zzahe.zza(jSONObject, "captchaResp", this.zzg);
        } else {
            zzahe.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public zzafh(int i) {
        this.zza = zza(i);
    }

    private zzafh(int i, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }
}
