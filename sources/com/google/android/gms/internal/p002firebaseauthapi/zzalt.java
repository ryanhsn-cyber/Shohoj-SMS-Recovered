package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzalt<K, V> implements Comparable<zzalt>, Map.Entry<K, V> {
    private final Comparable zza;
    private V zzb;
    private final /* synthetic */ zzali zzc;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzalt zzaltVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzaltVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (this.zza == null ? 0 : this.zza.hashCode()) ^ (this.zzb != null ? this.zzb.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzc.zzg();
        V v2 = this.zzb;
        this.zzb = v;
        return v2;
    }

    public final String toString() {
        return String.valueOf(this.zza) + "=" + String.valueOf(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalt(zzali zzaliVar, Map.Entry<K, V> entry) {
        this(zzaliVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzalt(zzali zzaliVar, K k, V v) {
        this.zzc = zzaliVar;
        this.zza = k;
        this.zzb = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
