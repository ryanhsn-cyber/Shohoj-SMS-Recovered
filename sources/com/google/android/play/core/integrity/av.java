package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class av extends at {
    private final com.google.android.play.integrity.internal.q c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public av(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.c = new com.google.android.play.integrity.internal.q("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        int i = bundle.getInt("error");
        if (i != 0) {
            this.a.trySetException(new StandardIntegrityException(i, null));
        } else {
            this.a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
