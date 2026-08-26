package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzamm {
    static final boolean zza;
    private static final Unsafe zzb = zzb();
    private static final Class<?> zzc = zzahl.zza();
    private static final boolean zzd = zzd(Long.TYPE);
    private static final boolean zze = zzd(Integer.TYPE);
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    private static final class zza extends zzc {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, boolean z) {
            if (zzamm.zza) {
                zzamm.zza(obj, j, z);
            } else {
                zzamm.zzb(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, byte b) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j, b);
            } else {
                zzamm.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final boolean zzc(Object obj, long j) {
            if (zzamm.zza) {
                return zzamm.zzf(obj, j);
            }
            return zzamm.zzg(obj, j);
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    private static final class zzb extends zzc {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, boolean z) {
            if (zzamm.zza) {
                zzamm.zza(obj, j, z);
            } else {
                zzamm.zzb(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, byte b) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j, b);
            } else {
                zzamm.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final boolean zzc(Object obj, long j) {
            if (zzamm.zza) {
                return zzamm.zzf(obj, j);
            }
            return zzamm.zzg(obj, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    /* loaded from: classes11.dex */
    public static abstract class zzc {
        Unsafe zza;

        public abstract double zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract float zzb(Object obj, long j);

        public abstract boolean zzc(Object obj, long j);

        public final int zzd(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final long zze(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public final void zza(Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }

        public final boolean zza() {
            if (this.zza == null) {
                return false;
            }
            try {
                Class<?> cls = this.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                cls.getMethod("getInt", Object.class, Long.TYPE);
                cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls.getMethod("getObject", Object.class, Long.TYPE);
                cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                return true;
            } catch (Throwable th) {
                zzamm.zza(th);
                return false;
            }
        }

        public final boolean zzb() {
            if (this.zza == null) {
                return false;
            }
            try {
                Class<?> cls = this.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamm.zza() != null;
            } catch (Throwable th) {
                zzamm.zza(th);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static /* synthetic */ Field zza() {
        return zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(Object obj, long j) {
        return zzf.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zze(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    private static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzaml());
        } catch (Throwable th) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzamm.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static /* synthetic */ void zza(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void zzb(Object obj, long j, boolean z) {
        zzd(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    static {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamm.<clinit>():void");
    }

    private zzamm() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(Object obj, long j, boolean z) {
        zzf.zza(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, byte b) {
        zzf.zza((Object) bArr, zzi + j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzc2 = zzc(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzc2 & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzc(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, double d) {
        zzf.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, float f) {
        zzf.zza(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, int i) {
        zzf.zza(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, long j2) {
        zzf.zza(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static /* synthetic */ boolean zzf(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzh(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd() {
        return zzg;
    }
}
