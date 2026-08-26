package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class s {
    private final s a = this;
    private final com.google.android.play.integrity.internal.al b;
    private final com.google.android.play.integrity.internal.al c;
    private final com.google.android.play.integrity.internal.al d;
    private final com.google.android.play.integrity.internal.al e;
    private final com.google.android.play.integrity.internal.al f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s(Context context, r rVar) {
        ao aoVar;
        this.b = com.google.android.play.integrity.internal.aj.b(context);
        aoVar = an.a;
        this.c = com.google.android.play.integrity.internal.ah.b(aoVar);
        this.d = com.google.android.play.integrity.internal.ah.b(new az(this.b, this.c));
        com.google.android.play.integrity.internal.al alVar = this.d;
        this.e = com.google.android.play.integrity.internal.ah.b(new be(alVar));
        this.f = com.google.android.play.integrity.internal.ah.b(new am(alVar, this.e));
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
