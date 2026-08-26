package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzalf implements zzakn {
    private final zzakp zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final zzakp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final zzala zzb() {
        if ((this.zzd & 1) != 0) {
            return zzala.PROTO2;
        }
        if ((this.zzd & 4) == 4) {
            return zzala.EDITIONS;
        }
        return zzala.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalf(zzakp zzakpVar, String str, Object[] objArr) {
        this.zza = zzakpVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.zzd = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
