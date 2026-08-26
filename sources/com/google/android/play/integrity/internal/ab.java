package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class ab implements ServiceConnection {
    final /* synthetic */ ac a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ab(ac acVar, aa aaVar) {
        this.a = acVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ac.f(this.a).c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        ac acVar = this.a;
        acVar.c().post(new y(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ac.f(this.a).c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        ac acVar = this.a;
        acVar.c().post(new z(this));
    }
}
