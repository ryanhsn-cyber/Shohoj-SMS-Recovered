package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public class zzjk {
    private static final zzie zzb = zzie.zza;
    protected volatile zzke zza;
    private volatile zzgw zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        zzke zzkeVar = this.zza;
        zzke zzkeVar2 = zzjkVar.zza;
        if (zzkeVar != null || zzkeVar2 != null) {
            if (zzkeVar == null || zzkeVar2 == null) {
                if (zzkeVar != null) {
                    zzjkVar.zzd(zzkeVar.zzY());
                    return zzkeVar.equals(zzjkVar.zza);
                }
                zzd(zzkeVar2.zzY());
                return this.zza.equals(zzkeVar2);
            }
            return zzkeVar.equals(zzkeVar2);
        }
        return zzb().equals(zzjkVar.zzb());
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgt) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zzgw zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgw.zzb;
            } else {
                this.zzc = this.zza.zzb();
            }
            return this.zzc;
        }
    }

    public final zzke zzc(zzke zzkeVar) {
        zzke zzkeVar2 = this.zza;
        this.zzc = null;
        this.zza = zzkeVar;
        return zzkeVar2;
    }

    protected final void zzd(zzke zzkeVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzkeVar;
                this.zzc = zzgw.zzb;
            } catch (zzje e) {
                this.zza = zzkeVar;
                this.zzc = zzgw.zzb;
            }
        }
    }
}
