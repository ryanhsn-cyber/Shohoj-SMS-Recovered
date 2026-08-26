package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class b extends ba {
    private String a;
    private com.google.android.play.integrity.internal.q b;
    private PendingIntent c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final ba a(PendingIntent pendingIntent) {
        this.c = pendingIntent;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final ba b(com.google.android.play.integrity.internal.q qVar) {
        if (qVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.b = qVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final ba c(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final bb d() {
        com.google.android.play.integrity.internal.q qVar;
        String str = this.a;
        if (str == null || (qVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" token");
            }
            if (this.b == null) {
                sb.append(" logger");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new bb(str, qVar, this.c);
    }
}
