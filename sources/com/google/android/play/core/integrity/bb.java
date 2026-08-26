package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class bb extends StandardIntegrityManager.StandardIntegrityToken {
    private final String a;
    private final u b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bb(String str, com.google.android.play.integrity.internal.q qVar, PendingIntent pendingIntent) {
        this.a = str;
        this.b = new u(qVar, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.a;
    }
}
