package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzas implements Parcelable.Creator<PlayGamesAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlayGamesAuthCredential createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PlayGamesAuthCredential(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlayGamesAuthCredential[] newArray(int i) {
        return new PlayGamesAuthCredential[i];
    }
}
