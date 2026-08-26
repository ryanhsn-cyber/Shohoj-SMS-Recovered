package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzvc extends zzaje<zzvc, zza> implements zzakr {
    private static final zzvc zzc;
    private static volatile zzaky<zzvc> zzd;
    private String zze = "";
    private zzaho zzf = zzaho.zza;
    private int zzg;

    public static zza zza() {
        return zzc.zzm();
    }

    public static zza zza(zzvc zzvcVar) {
        return zzc.zzm().zza((zza) zzvcVar);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza extends zzaje.zza<zzvc, zza> implements zzakr {
        public final zza zza(zzvs zzvsVar) {
            zzi();
            ((zzvc) this.zza).zza(zzvsVar);
            return this;
        }

        public final zza zza(String str) {
            zzi();
            ((zzvc) this.zza).zza(str);
            return this;
        }

        public final zza zza(zzaho zzahoVar) {
            zzi();
            ((zzvc) this.zza).zza(zzahoVar);
            return this;
        }

        private zza() {
            super(zzvc.zzc);
        }

        /* synthetic */ zza(zzvb zzvbVar) {
            this();
        }
    }

    public static zzvc zzc() {
        return zzc;
    }

    public static zzvc zza(byte[] bArr, zzaiq zzaiqVar) throws zzajk {
        return (zzvc) zzaje.zza(zzc, bArr, zzaiqVar);
    }

    public final zzvs zzd() {
        zzvs zza2 = zzvs.zza(this.zzg);
        return zza2 == null ? zzvs.UNRECOGNIZED : zza2;
    }

    public final zzaho zze() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i, Object obj, Object obj2) {
        zzvb zzvbVar = null;
        switch (zzvb.zza[i - 1]) {
            case 1:
                return new zzvc();
            case 2:
                return new zza(zzvbVar);
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzvc> zzakyVar = zzd;
                if (zzakyVar == null) {
                    synchronized (zzvc.class) {
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

    public final String zzf() {
        return this.zze;
    }

    static {
        zzvc zzvcVar = new zzvc();
        zzc = zzvcVar;
        zzaje.zza((Class<zzvc>) zzvc.class, zzvcVar);
    }

    private zzvc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvs zzvsVar) {
        this.zzg = zzvsVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaho zzahoVar) {
        zzahoVar.getClass();
        this.zzf = zzahoVar;
    }
}
