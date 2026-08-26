package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class v {
    private static o a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized o a(Context context) {
        o oVar;
        synchronized (v.class) {
            if (a == null) {
                m mVar = new m(null);
                mVar.a(com.google.android.play.integrity.internal.ae.a(context));
                a = mVar.b();
            }
            oVar = a;
        }
        return oVar;
    }
}
