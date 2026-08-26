package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzafm extends AbstractSafeParcelable implements zzacu<zzafm> {
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;
    private static final String zza = zzafm.class.getSimpleName();
    public static final Parcelable.Creator<zzafm> CREATOR = new zzafp();

    public final long zza() {
        if (this.zzd == null) {
            return 0L;
        }
        return this.zzd.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public static zzafm zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzafm zzafmVar = new zzafm();
            zzafmVar.zzb = jSONObject.optString("refresh_token", null);
            zzafmVar.zzc = jSONObject.optString("access_token", null);
            zzafmVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzafmVar.zze = jSONObject.optString("token_type", null);
            zzafmVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzafmVar;
        } catch (JSONException e) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzxy(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzafm zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("refresh_token"));
            this.zzc = Strings.emptyToNull(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = Strings.emptyToNull(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahe.zza(e, zza, str);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzxy(e);
        }
    }

    public zzafm() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public zzafm(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafm(String str, String str2, Long l, String str3, Long l2) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l;
        this.zze = str3;
        this.zzf = l2;
    }

    public final void zzc(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLongObject(parcel, 4, Long.valueOf(zza()), false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeLongObject(parcel, 6, Long.valueOf(this.zzf.longValue()), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zzg() {
        return DefaultClock.getInstance().currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }
}
