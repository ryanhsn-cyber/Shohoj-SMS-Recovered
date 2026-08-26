package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class bd {
    private final ax a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bd(ax axVar) {
        this.a = axVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task a(long j, long j2, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.a.c(standardIntegrityTokenRequest.a(), j, j2);
    }
}
