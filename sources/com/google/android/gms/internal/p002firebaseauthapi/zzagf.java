package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzagf implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzj;
    private boolean zzh = true;
    private zzagr zzg = new zzagr();
    private zzagr zzi = new zzagr();

    public final zzagf zza(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzi.zzb().add(str);
        return this;
    }

    public final zzagf zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final zzagf zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final zzagf zzd(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzagf zze(String str) {
        this.zze = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzagf zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzagf zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzagf zzh(String str) {
        this.zzj = str;
        return this;
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

    public final String zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        char c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> zzb = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < zzb.size(); i++) {
                jSONArray.put(zzb.get(i));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> zzb2 = this.zzg.zzb();
        int size = zzb2.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < zzb2.size(); i2++) {
            String str = zzb2.get(i2);
            int i3 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c = 1;
                        break;
                    }
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    i3 = 1;
                    break;
                case 1:
                    break;
                case 2:
                    i3 = 5;
                    break;
                case 3:
                    i3 = 4;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            iArr[i2] = i3;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i4 = 0; i4 < size; i4++) {
                jSONArray2.put(iArr[i4]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        if (this.zza != null) {
            jSONObject.put("idToken", this.zza);
        }
        if (this.zzc != null) {
            jSONObject.put("email", this.zzc);
        }
        if (this.zzd != null) {
            jSONObject.put("password", this.zzd);
        }
        if (this.zzb != null) {
            jSONObject.put("displayName", this.zzb);
        }
        if (this.zzf != null) {
            jSONObject.put("photoUrl", this.zzf);
        }
        if (this.zze != null) {
            jSONObject.put("oobCode", this.zze);
        }
        if (this.zzj != null) {
            jSONObject.put("tenantId", this.zzj);
        }
        return jSONObject.toString();
    }

    public final boolean zzi(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzg.zzb().contains(str);
    }
}
