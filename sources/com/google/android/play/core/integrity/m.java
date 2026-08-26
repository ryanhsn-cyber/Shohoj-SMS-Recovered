package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class m implements t {
    private Context a;

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m(l lVar) {
    }

    public final m a(Context context) {
        if (context == null) {
            throw null;
        }
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.t
    public final o b() {
        com.google.android.play.integrity.internal.ak.a(this.a, Context.class);
        return new o(this.a, null);
    }
}
