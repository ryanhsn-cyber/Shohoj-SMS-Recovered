package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class g extends a implements i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void c(Bundle bundle, k kVar) throws RemoteException {
        Parcel a = a();
        c.c(a, bundle);
        a.writeStrongBinder(kVar);
        b(3, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void d(Bundle bundle, k kVar) throws RemoteException {
        Parcel a = a();
        c.c(a, bundle);
        a.writeStrongBinder(kVar);
        b(2, a);
    }
}
