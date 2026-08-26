package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class ac {
    private static final Map a = new HashMap();
    private final Context b;
    private final q c;
    private final String d;
    private boolean h;
    private final Intent i;
    private final x j;
    private ServiceConnection n;
    private IInterface o;
    private final List e = new ArrayList();
    private final Set f = new HashSet();
    private final Object g = new Object();
    private final IBinder.DeathRecipient l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.t
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ac.k(ac.this);
        }
    };
    private final AtomicInteger m = new AtomicInteger(0);
    private final WeakReference k = new WeakReference(null);

    public ac(Context context, q qVar, String str, Intent intent, x xVar, w wVar) {
        this.b = context;
        this.c = qVar;
        this.d = str;
        this.i = intent;
        this.j = xVar;
    }

    public static /* synthetic */ void k(ac acVar) {
        acVar.c.c("reportBinderDeath", new Object[0]);
        w wVar = (w) acVar.k.get();
        if (wVar == null) {
            acVar.c.c("%s : Binder has died.", acVar.d);
            Iterator it = acVar.e.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a(acVar.w());
            }
            acVar.e.clear();
        } else {
            acVar.c.c("calling onBinderDied", new Object[0]);
            wVar.a();
        }
        synchronized (acVar.g) {
            acVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(ac acVar, final TaskCompletionSource taskCompletionSource) {
        acVar.f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.s
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ac.this.u(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void r(ac acVar) {
        acVar.c.c("linkToDeath", new Object[0]);
        try {
            acVar.o.asBinder().linkToDeath(acVar.l, 0);
        } catch (RemoteException e) {
            acVar.c.b(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(ac acVar) {
        acVar.c.c("unlinkToDeath", new Object[0]);
        acVar.o.asBinder().unlinkToDeath(acVar.l, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.d).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f.clear();
    }

    public final Handler c() {
        Handler handler;
        synchronized (a) {
            if (!a.containsKey(this.d)) {
                HandlerThread handlerThread = new HandlerThread(this.d, 10);
                handlerThread.start();
                a.put(this.d, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) a.get(this.d);
        }
        return handler;
    }

    public final IInterface e() {
        return this.o;
    }

    public final void t(r rVar, TaskCompletionSource taskCompletionSource) {
        c().post(new u(this, rVar.c(), taskCompletionSource, rVar));
    }

    public final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
        c().post(new v(this));
    }

    public static /* bridge */ /* synthetic */ void q(ac acVar, r rVar) {
        if (acVar.o != null || acVar.h) {
            if (acVar.h) {
                acVar.c.c("Waiting to bind to the service.", new Object[0]);
                acVar.e.add(rVar);
                return;
            } else {
                rVar.run();
                return;
            }
        }
        acVar.c.c("Initiate binding to the service.", new Object[0]);
        acVar.e.add(rVar);
        acVar.n = new ab(acVar, null);
        acVar.h = true;
        if (acVar.b.bindService(acVar.i, acVar.n, 1)) {
            return;
        }
        acVar.c.c("Failed to bind to the service.", new Object[0]);
        acVar.h = false;
        Iterator it = acVar.e.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(new ad());
        }
        acVar.e.clear();
    }
}
