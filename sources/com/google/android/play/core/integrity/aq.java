package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class aq extends com.google.android.play.integrity.internal.r {
    final /* synthetic */ Context a;
    final /* synthetic */ ax b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ax axVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.b = axVar;
        this.a = context;
    }

    @Override // com.google.android.play.integrity.internal.r
    protected final void b() {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.b.d;
        taskCompletionSource.trySetResult(Boolean.valueOf(com.google.android.play.integrity.internal.ag.a(this.a)));
    }
}
