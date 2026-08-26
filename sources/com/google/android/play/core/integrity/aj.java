package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class aj {
    private static s a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized s a(Context context) {
        s sVar;
        synchronized (aj.class) {
            if (a == null) {
                q qVar = new q(null);
                qVar.a(com.google.android.play.integrity.internal.ae.a(context));
                a = qVar.b();
            }
            sVar = a;
        }
        return sVar;
    }
}
