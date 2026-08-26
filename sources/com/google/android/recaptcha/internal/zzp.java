package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzp extends Exception {
    public static final zzo zza = new zzo(null);
    private static final Map zzb = MapsKt.mapOf(TuplesKt.to(zzpb.JS_NETWORK_ERROR, new zzp(zzn.zze, zzl.zzm, null)), TuplesKt.to(zzpb.JS_INTERNAL_ERROR, new zzp(zzn.zzc, zzl.zzk, null)), TuplesKt.to(zzpb.JS_INVALID_SITE_KEY, new zzp(zzn.zzf, zzl.zzn, null)), TuplesKt.to(zzpb.JS_INVALID_SITE_KEY_TYPE, new zzp(zzn.zzg, zzl.zzo, null)), TuplesKt.to(zzpb.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzp(zzn.zzh, zzl.zzp, null)), TuplesKt.to(zzpb.JS_INVALID_ACTION, new zzp(zzn.zzi, zzl.zzq, null)), TuplesKt.to(zzpb.JS_PROGRAM_ERROR, new zzp(zzn.zzc, zzl.zzu, null)));
    private final zzn zzc;
    private final zzl zzd;
    private final String zze;
    private final Map zzf = MapsKt.mapOf(TuplesKt.to(zzn.zze, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), TuplesKt.to(zzn.zzk, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), TuplesKt.to(zzn.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), TuplesKt.to(zzn.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), TuplesKt.to(zzn.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), TuplesKt.to(zzn.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), TuplesKt.to(zzn.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)));

    public zzp(zzn zznVar, zzl zzlVar, String str) {
        this.zzc = zznVar;
        this.zzd = zzlVar;
        this.zze = str;
    }

    public final zzl zza() {
        return this.zzd;
    }

    public final zzn zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        if (Intrinsics.areEqual(this.zzd, zzl.zzT)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        if (recaptchaException != null) {
            return recaptchaException;
        }
        return new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
    }

    public final String zzd() {
        return this.zze;
    }
}
