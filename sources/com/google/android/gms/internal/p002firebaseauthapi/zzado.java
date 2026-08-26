package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzado {
    private final String zza;
    private final String zzb;

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public zzado(Context context) {
        this(context, context.getPackageName());
    }

    private zzado(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.zza = Preconditions.checkNotEmpty(str);
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, this.zza);
            if (packageCertificateHashBytes == null) {
                Log.e("FBA-PackageInfo", "single cert required: " + str);
                this.zzb = null;
            } else {
                this.zzb = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
