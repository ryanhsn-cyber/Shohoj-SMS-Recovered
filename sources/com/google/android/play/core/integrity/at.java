package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
class at extends com.google.android.play.integrity.internal.j {
    final TaskCompletionSource a;
    final /* synthetic */ ax b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public at(ax axVar, TaskCompletionSource taskCompletionSource) {
        this.b = axVar;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) throws RemoteException {
        this.b.a.v(this.a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) throws RemoteException {
        this.b.a.v(this.a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) throws RemoteException {
        this.b.a.v(this.a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) throws RemoteException {
        this.b.a.v(this.a);
    }
}
