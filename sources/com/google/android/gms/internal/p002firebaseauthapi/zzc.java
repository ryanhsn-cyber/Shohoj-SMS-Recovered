package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzc extends ContextCompat {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        if (zza.zza()) {
            if (zza.zza()) {
                i = 2;
            } else {
                i = 0;
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, i);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
