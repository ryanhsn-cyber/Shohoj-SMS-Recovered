package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zznt {
    public static final zzxv zza = zzxv.zza(new byte[0]);

    public static final zzxv zza(int i) {
        return zzxv.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzxv zzb(int i) {
        return zzxv.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
