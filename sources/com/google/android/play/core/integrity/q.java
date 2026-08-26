package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class q implements ai {
    private Context a;

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        if (context == null) {
            throw null;
        }
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ai
    public final s b() {
        com.google.android.play.integrity.internal.ak.a(this.a, Context.class);
        return new s(this.a, null);
    }
}
