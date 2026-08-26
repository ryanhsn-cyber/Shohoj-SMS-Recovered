package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zztx extends zzaje<zztx, zza> implements zzakr {
    private static final zztx zzc;
    private static volatile zzaky<zztx> zzd;
    private int zze;
    private zzaho zzf = zzaho.zza;
    private zzvh zzg;

    public static zza zza() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza extends zzaje.zza<zztx, zza> implements zzakr {
        public final zza zza() {
            zzi();
            ((zztx) this.zza).zzd();
            return this;
        }

        public final zza zza(zzaho zzahoVar) {
            zzi();
            ((zztx) this.zza).zza(zzahoVar);
            return this;
        }

        public final zza zza(zzvh zzvhVar) {
            zzi();
            ((zztx) this.zza).zza(zzvhVar);
            return this;
        }

        private zza() {
            super(zztx.zzc);
        }

        /* synthetic */ zza(zztz zztzVar) {
            this();
        }
    }

    public static zztx zza(InputStream inputStream, zzaiq zzaiqVar) throws IOException {
        return (zztx) zzaje.zza(zzc, inputStream, zzaiqVar);
    }

    public final zzaho zzc() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i, Object obj, Object obj2) {
        zztz zztzVar = null;
        switch (zztz.zza[i - 1]) {
            case 1:
                return new zztx();
            case 2:
                return new zza(zztzVar);
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaky<zztx> zzakyVar = zzd;
                if (zzakyVar == null) {
                    synchronized (zztx.class) {
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
        zztx zztxVar = new zztx();
        zzc = zztxVar;
        zzaje.zza((Class<zztx>) zztx.class, zztxVar);
    }

    private zztx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        this.zzg = null;
        this.zze &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaho zzahoVar) {
        zzahoVar.getClass();
        this.zzf = zzahoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvh zzvhVar) {
        zzvhVar.getClass();
        this.zzg = zzvhVar;
        this.zze |= 1;
    }
}
