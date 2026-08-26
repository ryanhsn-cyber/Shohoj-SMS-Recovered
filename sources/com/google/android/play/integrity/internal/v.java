package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class v extends r {
    final /* synthetic */ ac a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(ac acVar) {
        this.a = acVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        q qVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        q qVar2;
        obj = this.a.g;
        synchronized (obj) {
            atomicInteger = this.a.m;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.a.m;
                if (atomicInteger2.decrementAndGet() > 0) {
                    qVar2 = this.a.c;
                    qVar2.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            ac acVar = this.a;
            iInterface = acVar.o;
            if (iInterface != null) {
                qVar = acVar.c;
                qVar.c("Unbind from service.", new Object[0]);
                ac acVar2 = this.a;
                context = acVar2.b;
                serviceConnection = acVar2.n;
                context.unbindService(serviceConnection);
                this.a.h = false;
                this.a.o = null;
                this.a.n = null;
            }
            this.a.x();
        }
    }
}
