package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class o {
    private final o a = this;
    private final com.google.android.play.integrity.internal.al b;
    private final com.google.android.play.integrity.internal.al c;
    private final com.google.android.play.integrity.internal.al d;
    private final com.google.android.play.integrity.internal.al e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(Context context, n nVar) {
        z zVar;
        this.b = com.google.android.play.integrity.internal.aj.b(context);
        zVar = y.a;
        this.c = com.google.android.play.integrity.internal.ah.b(zVar);
        this.d = com.google.android.play.integrity.internal.ah.b(new af(this.b, this.c));
        this.e = com.google.android.play.integrity.internal.ah.b(new x(this.d));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
