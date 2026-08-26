package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes11.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zza = new Object();

    @Nullable
    private static volatile zzda zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(new Object() { // from class: com.google.android.gms.internal.auth.zzcu
    }, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z, zzdb zzdbVar) {
        if (zzczVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            synchronized (zza) {
                if (zze == null) {
                    synchronized (zza) {
                        zzda zzdaVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzdaVar == null || zzdaVar.zza() != context) {
                            zzcg.zzd();
                            zzdd.zzc();
                            zzco.zze();
                            zze = new zzcd(context, zzdn.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                @Override // com.google.android.gms.internal.auth.zzdj
                                public final Object zza() {
                                    Context context2 = context;
                                    int i = zzdc.zzd;
                                    return zzcp.zza(context2);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract Object zza(Object obj);

    public final Object zzb() {
        zzcl zza2;
        String str;
        Object zzb;
        if (!this.zzm && this.zzc == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i = zzi.get();
        if (this.zzk < i) {
            synchronized (this) {
                if (this.zzk < i) {
                    zzda zzdaVar = zze;
                    if (zzdaVar == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    zzcz zzczVar = this.zzb;
                    boolean z = zzczVar.zzf;
                    if (zzczVar.zzb == null) {
                        Context zza3 = zzdaVar.zza();
                        String str2 = this.zzb.zza;
                        zza2 = zzdd.zza(zza3, null, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdc.zzd();
                            }
                        });
                    } else if (zzcq.zza(zzdaVar.zza(), this.zzb.zzb)) {
                        boolean z2 = this.zzb.zzh;
                        zza2 = zzcg.zza(zzdaVar.zza().getContentResolver(), this.zzb.zzb, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdc.zzd();
                            }
                        });
                    } else {
                        zza2 = null;
                    }
                    Object zza4 = (zza2 == null || (zzb = zza2.zzb(zzc())) == null) ? null : zza(zzb);
                    if (zza4 == null) {
                        zzcz zzczVar2 = this.zzb;
                        if (zzczVar2.zze) {
                            zza4 = null;
                        } else {
                            zzdg zzdgVar = zzczVar2.zzi;
                            zzco zza5 = zzco.zza(zzdaVar.zza());
                            zzcz zzczVar3 = this.zzb;
                            if (zzczVar3.zze) {
                                str = null;
                            } else {
                                String str3 = zzczVar3.zzc;
                                str = this.zzc;
                            }
                            String zzb2 = zza5.zzb(str);
                            zza4 = zzb2 != null ? zza(zzb2) : null;
                        }
                        if (zza4 == null) {
                            zza4 = this.zzj;
                        }
                    }
                    zzdh zzdhVar = (zzdh) zzdaVar.zzb().zza();
                    if (zzdhVar.zzb()) {
                        zzci zzciVar = (zzci) zzdhVar.zza();
                        zzcz zzczVar4 = this.zzb;
                        Uri uri = zzczVar4.zzb;
                        String str4 = zzczVar4.zza;
                        String zza6 = zzciVar.zza(uri, null, zzczVar4.zzd, this.zzc);
                        zza4 = zza6 == null ? this.zzj : zza(zza6);
                    }
                    this.zzl = zza4;
                    this.zzk = i;
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zzb.zzd;
        return this.zzc;
    }
}
