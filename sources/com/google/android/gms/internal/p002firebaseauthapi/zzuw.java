package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzuw extends zzaje<zzuw, zza> implements zzakr {
    private static final zzuw zzc;
    private static volatile zzaky<zzuw> zzd;
    private String zze = "";
    private zzaho zzf = zzaho.zza;
    private int zzg;

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzb zzb() {
        zzb zza2 = zzb.zza(this.zzg);
        return zza2 == null ? zzb.UNRECOGNIZED : zza2;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static final class zza extends zzaje.zza<zzuw, zza> implements zzakr {
        public final zza zza(zzb zzbVar) {
            zzi();
            ((zzuw) this.zza).zza(zzbVar);
            return this;
        }

        public final zza zza(String str) {
            zzi();
            ((zzuw) this.zza).zza(str);
            return this;
        }

        public final zza zza(zzaho zzahoVar) {
            zzi();
            ((zzuw) this.zza).zza(zzahoVar);
            return this;
        }

        private zza() {
            super(zzuw.zzc);
        }

        /* synthetic */ zza(zzux zzuxVar) {
            this();
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public enum zzb implements zzajg {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private static final zzajj<zzb> zzg = new zzuy();
        private final int zzi;

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final int zza() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.zzi;
        }

        public static zzb zza(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=").append(zza());
            }
            return sb.append(" name=").append(name()).append(Typography.greater).toString();
        }

        zzb(int i) {
            this.zzi = i;
        }
    }

    public static zzuw zzd() {
        return zzc;
    }

    public final zzaho zze() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i, Object obj, Object obj2) {
        zzux zzuxVar = null;
        switch (zzux.zza[i - 1]) {
            case 1:
                return new zzuw();
            case 2:
                return new zza(zzuxVar);
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzuw> zzakyVar = zzd;
                if (zzakyVar == null) {
                    synchronized (zzuw.class) {
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
        zzuw zzuwVar = new zzuw();
        zzc = zzuwVar;
        zzaje.zza((Class<zzuw>) zzuw.class, zzuwVar);
    }

    private zzuw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        this.zzg = zzbVar.zza();
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
