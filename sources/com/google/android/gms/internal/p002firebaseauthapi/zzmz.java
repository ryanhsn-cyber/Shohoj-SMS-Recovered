package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzuw;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final /* synthetic */ class zzmz {
    static final /* synthetic */ int[] zza = new int[zzuw.zzb.values().length];
    private static final /* synthetic */ int[] zzb;

    static {
        try {
            zza[zzuw.zzb.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            zza[zzuw.zzb.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        zzb = new int[zzvs.values().length];
        try {
            zzb[zzvs.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            zzb[zzvs.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            zzb[zzvs.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        try {
            zzb[zzvs.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
        }
    }
}
