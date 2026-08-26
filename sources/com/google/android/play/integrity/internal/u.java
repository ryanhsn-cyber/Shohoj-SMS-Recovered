package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class u extends r {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ r b;
    final /* synthetic */ ac c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ac acVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, r rVar) {
        super(taskCompletionSource);
        this.c = acVar;
        this.a = taskCompletionSource2;
        this.b = rVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        q qVar;
        obj = this.c.g;
        synchronized (obj) {
            ac.o(this.c, this.a);
            atomicInteger = this.c.m;
            if (atomicInteger.getAndIncrement() > 0) {
                qVar = this.c.c;
                qVar.c("Already connected to the service.", new Object[0]);
            }
            ac.q(this.c, this.b);
        }
    }
}
