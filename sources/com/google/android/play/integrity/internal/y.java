package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class y extends r {
    final /* synthetic */ IBinder a;
    final /* synthetic */ ab b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(ab abVar, IBinder iBinder) {
        this.b = abVar;
        this.a = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b() {
        x xVar;
        List list;
        List list2;
        ac acVar = this.b.a;
        xVar = acVar.j;
        acVar.o = (IInterface) xVar.a(this.a);
        ac.r(this.b.a);
        this.b.a.h = false;
        list = this.b.a.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.b.a.e;
        list2.clear();
    }
}
