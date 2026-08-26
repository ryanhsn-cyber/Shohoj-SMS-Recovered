package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes11.dex */
final class zzbp extends zzbr implements Serializable {
    static final zzbp zza = new zzbp();

    private zzbp() {
    }

    @Override // com.google.android.gms.internal.fido.zzbr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (comparable == null) {
            throw null;
        }
        if (comparable2 != null) {
            return comparable.compareTo(comparable2);
        }
        throw null;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.fido.zzbr
    public final zzbr zza() {
        return zzbv.zza;
    }
}
