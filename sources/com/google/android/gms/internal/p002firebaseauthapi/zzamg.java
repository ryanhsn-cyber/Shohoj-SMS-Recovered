package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
abstract class zzamg<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(T t);

    abstract B zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zza(T t, T t2);

    abstract void zza(B b, int i, int i2);

    abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzaho zzahoVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzanc zzancVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzale zzaleVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(T t, zzanc zzancVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzd(Object obj);

    abstract T zze(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzale zzaleVar) throws IOException {
        int zzd = zzaleVar.zzd();
        int i = zzd >>> 3;
        switch (zzd & 7) {
            case 0:
                zzb(b, i, zzaleVar.zzl());
                return true;
            case 1:
                zza((zzamg<T, B>) b, i, zzaleVar.zzk());
                return true;
            case 2:
                zza((zzamg<T, B>) b, i, zzaleVar.zzp());
                return true;
            case 3:
                B zza = zza();
                int i2 = (i << 3) | 4;
                while (zzaleVar.zzc() != Integer.MAX_VALUE && zza((zzamg<T, B>) zza, zzaleVar)) {
                }
                if (i2 != zzaleVar.zzd()) {
                    throw zzajk.zzb();
                }
                zza((zzamg<T, B>) b, i, (int) zze(zza));
                return true;
            case 4:
                return false;
            case 5:
                zza((zzamg<T, B>) b, i, zzaleVar.zzf());
                return true;
            default:
                throw zzajk.zza();
        }
    }
}
