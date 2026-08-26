package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzadx {
    private static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaea> zzd = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzacf zza(zzacf zzacfVar, String str) {
        return new zzady(this, zzacfVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        Signature[] apkContentsSigners;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                apkContentsSigners = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 64).signatures;
            } else {
                apkContentsSigners = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String zza2 = zza(packageName, apkContentsSigners[0].toCharsString());
            if (zza2 == null) {
                zza.e("Hash generation failed.", new Object[0]);
                return null;
            }
            return zza2;
        } catch (PackageManager.NameNotFoundException e) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(zzq.zza));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.d("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            zza.e("NoSuchAlgorithm: " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzadx zzadxVar, String str) {
        zzaea zzaeaVar = zzadxVar.zzd.get(str);
        if (zzaeaVar == null || zzah.zzc(zzaeaVar.zzd) || zzah.zzc(zzaeaVar.zze) || zzaeaVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(PhoneAuthCredential.zza(zzaeaVar.zzd, zzaeaVar.zze));
        }
        zzaeaVar.zzh = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadx(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar != null && !zzaeaVar.zzh && !zzah.zzc(zzaeaVar.zzd)) {
            zza.w("Timed out waiting for SMS.", new Object[0]);
            Iterator<zzacf> it = zzaeaVar.zzb.iterator();
            while (it.hasNext()) {
                it.next().zza(zzaeaVar.zzd);
            }
            zzaeaVar.zzi = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        if (!zzaeaVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzacf zzacfVar, String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        zzaeaVar.zzb.add(zzacfVar);
        if (zzaeaVar.zzg) {
            zzacfVar.zzb(zzaeaVar.zzd);
        }
        if (zzaeaVar.zzh) {
            zzacfVar.zza(PhoneAuthCredential.zza(zzaeaVar.zzd, zzaeaVar.zze));
        }
        if (zzaeaVar.zzi) {
            zzacfVar.zza(zzaeaVar.zzd);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        if (zzaeaVar.zzf != null && !zzaeaVar.zzf.isDone()) {
            zzaeaVar.zzf.cancel(false);
        }
        zzaeaVar.zzb.clear();
        this.zzd.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(final String str, zzacf zzacfVar, long j, boolean z) {
        this.zzd.put(str, new zzaea(j, z));
        zzb(zzacfVar, str);
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar.zza <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaeaVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzadw
            @Override // java.lang.Runnable
            public final void run() {
                zzadx.this.zzb(str);
            }
        }, zzaeaVar.zza, TimeUnit.SECONDS);
        if (!zzaeaVar.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaeb zzaebVar = new zzaeb(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        zzc.zza(this.zzb.getApplicationContext(), zzaebVar, intentFilter);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzadz(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }
}
