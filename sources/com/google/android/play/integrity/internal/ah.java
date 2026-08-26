package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class ah implements al {
    private static final Object a = new Object();
    private volatile al b;
    private volatile Object c = a;

    private ah(al alVar) {
        this.b = alVar;
    }

    public static al b(al alVar) {
        return alVar instanceof ah ? alVar : new ah(alVar);
    }

    @Override // com.google.android.play.integrity.internal.al
    public final Object a() {
        Object obj = this.c;
        if (obj == a) {
            synchronized (this) {
                obj = this.c;
                if (obj == a) {
                    obj = this.b.a();
                    Object obj2 = this.c;
                    if (obj2 != a && obj2 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}
