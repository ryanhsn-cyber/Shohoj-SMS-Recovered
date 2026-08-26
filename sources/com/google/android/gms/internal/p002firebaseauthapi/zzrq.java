package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzrq {

    @Nullable
    private ArrayList<zzrt> zza = new ArrayList<>();
    private zzrk zzb = zzrk.zza;

    @Nullable
    private Integer zzc = null;

    public final zzrq zza(zzbw zzbwVar, int i, String str, String str2) {
        if (this.zza == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        this.zza.add(new zzrt(zzbwVar, i, str, str2));
        return this;
    }

    public final zzrq zza(zzrk zzrkVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzrkVar;
        return this;
    }

    public final zzrq zza(int i) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzrr zza() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        if (this.zzc != null) {
            int intValue = this.zzc.intValue();
            ArrayList<zzrt> arrayList = this.zza;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                zzrt zzrtVar = arrayList.get(i);
                i++;
                if (zzrtVar.zza() == intValue) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
        }
        zzrr zzrrVar = new zzrr(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
        this.zza = null;
        return zzrrVar;
    }
}
