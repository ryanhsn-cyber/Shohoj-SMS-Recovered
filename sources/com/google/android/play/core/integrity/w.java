package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class w implements IntegrityManager {
    private final ad a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(ad adVar) {
        this.a = adVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.a.b(integrityTokenRequest);
    }
}
