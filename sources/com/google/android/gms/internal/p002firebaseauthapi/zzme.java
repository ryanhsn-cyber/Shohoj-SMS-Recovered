package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzme implements zzce {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zzme(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.zzb = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zztx zztxVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzxl.zza(zztxVar.a_())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzvg zzvgVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzxl.zza(zzvgVar.a_())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
