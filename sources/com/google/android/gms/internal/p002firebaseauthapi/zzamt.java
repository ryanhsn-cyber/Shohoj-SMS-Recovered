package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzamt {
    public static final zzamt zza = new zzamt("DOUBLE", 0, zzand.DOUBLE, 1);
    public static final zzamt zzb = new zzamt("FLOAT", 1, zzand.FLOAT, 5);
    public static final zzamt zzc = new zzamt("INT64", 2, zzand.LONG, 0);
    public static final zzamt zzd = new zzamt("UINT64", 3, zzand.LONG, 0);
    public static final zzamt zze = new zzamt("INT32", 4, zzand.INT, 0);
    public static final zzamt zzf = new zzamt("FIXED64", 5, zzand.LONG, 1);
    public static final zzamt zzg = new zzamt("FIXED32", 6, zzand.INT, 5);
    public static final zzamt zzh = new zzamt("BOOL", 7, zzand.BOOLEAN, 0);
    public static final zzamt zzi = new zzams("STRING", zzand.STRING);
    public static final zzamt zzj = new zzamu("GROUP", zzand.MESSAGE);
    public static final zzamt zzk = new zzamw("MESSAGE", zzand.MESSAGE);
    public static final zzamt zzl = new zzamy("BYTES", zzand.BYTE_STRING);
    public static final zzamt zzm = new zzamt("UINT32", 12, zzand.INT, 0);
    public static final zzamt zzn = new zzamt("ENUM", 13, zzand.ENUM, 0);
    public static final zzamt zzo = new zzamt("SFIXED32", 14, zzand.INT, 5);
    public static final zzamt zzp = new zzamt("SFIXED64", 15, zzand.LONG, 1);
    public static final zzamt zzq = new zzamt("SINT32", 16, zzand.INT, 0);
    public static final zzamt zzr = new zzamt("SINT64", 17, zzand.LONG, 0);
    private static final /* synthetic */ zzamt[] zzs = {zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzr};
    private final zzand zzt;
    private final int zzu;

    public final int zza() {
        return this.zzu;
    }

    public final zzand zzb() {
        return this.zzt;
    }

    private zzamt(String str, int i, zzand zzandVar, int i2) {
        this.zzt = zzandVar;
        this.zzu = i2;
    }

    public static zzamt[] values() {
        return (zzamt[]) zzs.clone();
    }
}
