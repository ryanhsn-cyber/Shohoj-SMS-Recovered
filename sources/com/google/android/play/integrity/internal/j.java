package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public abstract class j extends b implements k {
    public j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                e(bundle);
                return true;
            case 3:
                Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                c(bundle2);
                return true;
            case 4:
                Bundle bundle3 = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                d(bundle3);
                return true;
            case 5:
                Bundle bundle4 = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                b(bundle4);
                return true;
            default:
                return false;
        }
    }
}
