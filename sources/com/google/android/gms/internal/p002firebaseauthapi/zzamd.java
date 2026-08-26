package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzamd extends zzaje<zzamd, zza> implements zzakr {
    private static final zzamd zzc;
    private static volatile zzaky<zzamd> zzd;
    private long zze;
    private int zzf;

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza extends zzaje.zza<zzamd, zza> implements zzakr {
        public final zza zza(int i) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamd) this.zza).zza(i);
            return this;
        }

        public final zza zza(long j) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamd) this.zza).zza(j);
            return this;
        }

        private zza() {
            super(zzamd.zzc);
        }

        /* synthetic */ zza(zzamc zzamcVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i, Object obj, Object obj2) {
        zzamc zzamcVar = null;
        switch (zzamc.zza[i - 1]) {
            case 1:
                return new zzamd();
            case 2:
                return new zza(zzamcVar);
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzamd> zzakyVar = zzd;
                if (zzakyVar == null) {
                    synchronized (zzamd.class) {
                        zzakyVar = zzd;
                        if (zzakyVar == null) {
                            zzakyVar = new zzaje.zzc<>(zzc);
                            zzd = zzakyVar;
                        }
                    }
                }
                return zzakyVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzamd zzamdVar = new zzamd();
        zzc = zzamdVar;
        zzaje.zza((Class<zzamd>) zzamd.class, zzamdVar);
    }

    private zzamd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i) {
        this.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j) {
        this.zze = j;
    }
}
