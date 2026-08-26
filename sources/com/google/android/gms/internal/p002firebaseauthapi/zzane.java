package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import javax.annotation.Nullable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzane {
    private static final zzamd zza = (zzamd) ((zzaje) zzamd.zzc().zza(-62135596800L).zza(0).zzf());
    private static final zzamd zzb = (zzamd) ((zzaje) zzamd.zzc().zza(253402300799L).zza(999999999).zzf());
    private static final zzamd zzc = (zzamd) ((zzaje) zzamd.zzc().zza(0L).zza(0).zzf());
    private static final ThreadLocal<SimpleDateFormat> zzd = new zzang();

    @Nullable
    private static final Method zze = zzc("now");

    @Nullable
    private static final Method zzf = zzc("getEpochSecond");

    @Nullable
    private static final Method zzg = zzc("getNano");

    private static long zzb(String str) throws ParseException {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            throw new ParseException("Invalid offset value: " + str, 0);
        }
        try {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        } catch (NumberFormatException e) {
            ParseException parseException = new ParseException("Invalid offset value: " + str, 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static long zza(zzamd zzamdVar) {
        return zzb(zzamdVar).zzb();
    }

    private static zzamd zzb(zzamd zzamdVar) {
        long zzb2 = zzamdVar.zzb();
        int zza2 = zzamdVar.zza();
        boolean z = false;
        if (zza(zzb2) && zza2 >= 0 && zza2 < 1000000000) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzb2), Integer.valueOf(zza2)));
        }
        return zzamdVar;
    }

    public static zzamd zza(String str) throws ParseException {
        String str2;
        int i;
        int indexOf = str.indexOf(84);
        if (indexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
        int indexOf2 = str.indexOf(90, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(43, indexOf);
        }
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(45, indexOf);
        }
        if (indexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String substring = str.substring(0, indexOf2);
        int indexOf3 = substring.indexOf(46);
        if (indexOf3 == -1) {
            str2 = "";
        } else {
            String substring2 = substring.substring(0, indexOf3);
            str2 = substring.substring(indexOf3 + 1);
            substring = substring2;
        }
        long time = zzd.get().parse(substring).getTime() / 1000;
        if (str2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < 9; i2++) {
                i *= 10;
                if (i2 < str2.length()) {
                    if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    i += str2.charAt(i2) - '0';
                }
            }
        }
        if (str.charAt(indexOf2) == 'Z') {
            if (str.length() != indexOf2 + 1) {
                throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(indexOf2) + "\"", 0);
            }
        } else {
            long zzb2 = zzb(str.substring(indexOf2 + 1));
            if (str.charAt(indexOf2) == '+') {
                time -= zzb2;
            } else {
                time += zzb2;
            }
        }
        try {
            if (!zza(time)) {
                throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(time)));
            }
            if (i <= -1000000000 || i >= 1000000000) {
                time = zzbf.zza(time, i / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                i %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            }
            if (i < 0) {
                i += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                time = zzbf.zzb(time, 1L);
            }
            return zzb((zzamd) ((zzaje) zzamd.zzc().zza(time).zza(i).zzf()));
        } catch (IllegalArgumentException e) {
            ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    @Nullable
    private static Method zzc(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    private static boolean zza(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
