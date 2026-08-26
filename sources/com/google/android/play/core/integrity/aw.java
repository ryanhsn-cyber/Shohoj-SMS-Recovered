package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
abstract class aw extends com.google.android.play.integrity.internal.r {
    final /* synthetic */ ax f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = axVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void a(Exception exc) {
        if (!(exc instanceof com.google.android.play.integrity.internal.ad)) {
            super.a(exc);
        } else if (ax.g(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
