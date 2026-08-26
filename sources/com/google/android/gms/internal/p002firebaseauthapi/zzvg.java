package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzvg extends zzaje<zzvg, zzb> implements zzakr {
    private static final zzvg zzc;
    private static volatile zzaky<zzvg> zzd;
    private int zze;
    private zzajl<zza> zzf = zzp();

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza extends zzaje<zza, C0050zza> implements zzakr {
        private static final zza zzc;
        private static volatile zzaky<zza> zzd;
        private int zze;
        private zzuw zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        public final int zza() {
            return this.zzh;
        }

        public final zzuw zzb() {
            return this.zzf == null ? zzuw.zzd() : this.zzf;
        }

        /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvg$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes11.dex */
        public static final class C0050zza extends zzaje.zza<zza, C0050zza> implements zzakr {
            public final C0050zza zza(zzuw.zza zzaVar) {
                zzi();
                ((zza) this.zza).zza((zzuw) ((zzaje) zzaVar.zzf()));
                return this;
            }

            public final C0050zza zza(zzuw zzuwVar) {
                zzi();
                ((zza) this.zza).zza(zzuwVar);
                return this;
            }

            public final C0050zza zza(int i) {
                zzi();
                ((zza) this.zza).zza(i);
                return this;
            }

            public final C0050zza zza(zzvs zzvsVar) {
                zzi();
                ((zza) this.zza).zza(zzvsVar);
                return this;
            }

            public final C0050zza zza(zzva zzvaVar) {
                zzi();
                ((zza) this.zza).zza(zzvaVar);
                return this;
            }

            private C0050zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0050zza(zzvf zzvfVar) {
                this();
            }
        }

        public final zzva zzc() {
            zzva zza = zzva.zza(this.zzg);
            return zza == null ? zzva.UNRECOGNIZED : zza;
        }

        public static C0050zza zzd() {
            return zzc.zzm();
        }

        public final zzvs zzf() {
            zzvs zza = zzvs.zza(this.zzi);
            return zza == null ? zzvs.UNRECOGNIZED : zza;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
        public final Object zza(int i, Object obj, Object obj2) {
            zzvf zzvfVar = null;
            switch (zzvf.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0050zza(zzvfVar);
                case 3:
                    return zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzaky<zza> zzakyVar = zzd;
                    if (zzakyVar == null) {
                        synchronized (zza.class) {
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
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzaje.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzuw zzuwVar) {
            zzuwVar.getClass();
            this.zzf = zzuwVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i) {
            this.zzh = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvs zzvsVar) {
            this.zzi = zzvsVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzva zzvaVar) {
            this.zzg = zzvaVar.zza();
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zzb extends zzaje.zza<zzvg, zzb> implements zzakr {
        public final int zza() {
            return ((zzvg) this.zza).zza();
        }

        public final zzb zza(zza zzaVar) {
            zzi();
            ((zzvg) this.zza).zza(zzaVar);
            return this;
        }

        public final zzb zza(int i) {
            zzi();
            ((zzvg) this.zza).zzc(i);
            return this;
        }

        public final zza zzb(int i) {
            return ((zzvg) this.zza).zza(i);
        }

        public final List<zza> zzb() {
            return Collections.unmodifiableList(((zzvg) this.zza).zze());
        }

        private zzb() {
            super(zzvg.zzc);
        }

        /* synthetic */ zzb(zzvf zzvfVar) {
            this();
        }
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public static zzb zzc() {
        return zzc.zzm();
    }

    public final zza zza(int i) {
        return this.zzf.get(i);
    }

    public static zzvg zza(InputStream inputStream, zzaiq zzaiqVar) throws IOException {
        return (zzvg) zzaje.zza(zzc, inputStream, zzaiqVar);
    }

    public static zzvg zza(byte[] bArr, zzaiq zzaiqVar) throws zzajk {
        return (zzvg) zzaje.zza(zzc, bArr, zzaiqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i, Object obj, Object obj2) {
        zzvf zzvfVar = null;
        switch (zzvf.zza[i - 1]) {
            case 1:
                return new zzvg();
            case 2:
                return new zzb(zzvfVar);
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzaky<zzvg> zzakyVar = zzd;
                if (zzakyVar == null) {
                    synchronized (zzvg.class) {
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

    public final List<zza> zze() {
        return this.zzf;
    }

    static {
        zzvg zzvgVar = new zzvg();
        zzc = zzvgVar;
        zzaje.zza((Class<zzvg>) zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzajl<zza> zzajlVar = this.zzf;
        if (!zzajlVar.zzc()) {
            this.zzf = zzaje.zza(zzajlVar);
        }
        this.zzf.add(zzaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i) {
        this.zze = i;
    }
}
