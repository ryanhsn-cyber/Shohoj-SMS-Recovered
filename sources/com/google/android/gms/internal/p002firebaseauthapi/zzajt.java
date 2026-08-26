package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzajt {
    private static final zzaiq zza = zzaiq.zza;
    private zzaho zzb;
    private volatile zzakp zzc;
    private volatile zzaho zzd;

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zzb();
        }
        if (this.zzc != null) {
            return this.zzc.zzl();
        }
        return 0;
    }

    public int hashCode() {
        return 1;
    }

    public final zzaho zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzaho.zza;
            } else {
                this.zzd = this.zzc.zzj();
            }
            return this.zzd;
        }
    }

    private final zzakp zzb(zzakp zzakpVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzakpVar;
                        this.zzd = zzaho.zza;
                    } catch (zzajk e) {
                        this.zzc = zzakpVar;
                        this.zzd = zzaho.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final zzakp zza(zzakp zzakpVar) {
        zzakp zzakpVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzakpVar;
        return zzakpVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajt)) {
            return false;
        }
        zzajt zzajtVar = (zzajt) obj;
        zzakp zzakpVar = this.zzc;
        zzakp zzakpVar2 = zzajtVar.zzc;
        if (zzakpVar == null && zzakpVar2 == null) {
            return zzc().equals(zzajtVar.zzc());
        }
        if (zzakpVar != null && zzakpVar2 != null) {
            return zzakpVar.equals(zzakpVar2);
        }
        if (zzakpVar != null) {
            return zzakpVar.equals(zzajtVar.zzb(zzakpVar.zzh()));
        }
        return zzb(zzakpVar2.zzh()).equals(zzakpVar2);
    }
}
