package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzfs {
    public static boolean zza(Collection collection, Iterator it) {
        if (it != null) {
            boolean z = false;
            while (it.hasNext()) {
                z |= collection.add(it.next());
            }
            return z;
        }
        throw null;
    }
}
