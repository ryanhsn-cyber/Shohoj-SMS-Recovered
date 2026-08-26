package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzaff {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzafu zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private zzf zzl;
    private List<zzafq> zzm;
    private zzaq<zzaft> zzn;

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final zzaq<zzaft> zzd() {
        return this.zzn;
    }

    public final zzf zze() {
        return this.zzl;
    }

    public final zzaff zza(zzf zzfVar) {
        this.zzl = zzfVar;
        return this;
    }

    public final zzaff zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzaff zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzaff zza(boolean z) {
        this.zzk = z;
        return this;
    }

    public final zzaff zza(zzaq<zzaft> zzaqVar) {
        Preconditions.checkNotNull(zzaqVar);
        this.zzn = zzaqVar;
        return this;
    }

    public final zzaff zzc(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzg = str;
        return this;
    }

    public final zzaff zzd(String str) {
        this.zze = str;
        return this;
    }

    public final zzaff zza(List<zzafv> list) {
        Preconditions.checkNotNull(list);
        this.zzf = new zzafu();
        this.zzf.zza().addAll(list);
        return this;
    }

    public final zzafu zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final List<zzafq> zzk() {
        return this.zzm;
    }

    public final List<zzafv> zzl() {
        return this.zzf.zza();
    }

    public zzaff() {
        this.zzf = new zzafu();
        this.zzn = zzaq.zzh();
    }

    public zzaff(String str, String str2, boolean z, String str3, String str4, zzafu zzafuVar, String str5, String str6, long j, long j2, boolean z2, zzf zzfVar, List<zzafq> list, zzaq<zzaft> zzaqVar) {
        zzafu zzafuVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = str4;
        if (zzafuVar == null) {
            zzafuVar2 = new zzafu();
        } else {
            List<zzafv> zza = zzafuVar.zza();
            zzafu zzafuVar3 = new zzafu();
            if (zza != null) {
                zzafuVar3.zza().addAll(zza);
            }
            zzafuVar2 = zzafuVar3;
        }
        this.zzf = zzafuVar2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j;
        this.zzj = j2;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list == null ? new ArrayList<>() : list;
        this.zzn = zzaqVar;
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzk;
    }
}
