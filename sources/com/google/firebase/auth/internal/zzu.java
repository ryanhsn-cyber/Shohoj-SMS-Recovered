package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzu implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzu> CREATOR = new zzt();
    private final String zza;
    private final String zzb;
    private Map<String, Object> zzc;
    private boolean zzd;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getProviderId() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getUsername() {
        if ("github.com".equals(this.zza)) {
            return (String) this.zzc.get("login");
        }
        if ("twitter.com".equals(this.zza)) {
            return (String) this.zzc.get("screen_name");
        }
        return null;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final Map<String, Object> getProfile() {
        return this.zzc;
    }

    public zzu(boolean z) {
        this.zzd = z;
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public zzu(String str, String str2, boolean z) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbe.zzb(str2);
        this.zzd = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getProviderId(), false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, isNewUser());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean isNewUser() {
        return this.zzd;
    }
}
