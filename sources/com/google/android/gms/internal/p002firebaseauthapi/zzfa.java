package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzez;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzfa extends zzcu {
    private final zzez zza;
    private final zzxv zzb;

    @Nullable
    private final Integer zzc;

    public static zzfa zza(zzez zzezVar, @Nullable Integer num) throws GeneralSecurityException {
        zzxv zza;
        if (zzezVar.zzb() == zzez.zza.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = zzxv.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else if (zzezVar.zzb() == zzez.zza.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = zzxv.zza(new byte[0]);
        } else {
            throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzezVar.zzb()));
        }
        return new zzfa(zzezVar, zza, num);
    }

    public final zzez zzb() {
        return this.zza;
    }

    public final zzxv zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zzc;
    }

    private zzfa(zzez zzezVar, zzxv zzxvVar, @Nullable Integer num) {
        this.zza = zzezVar;
        this.zzb = zzxvVar;
        this.zzc = num;
    }
}
