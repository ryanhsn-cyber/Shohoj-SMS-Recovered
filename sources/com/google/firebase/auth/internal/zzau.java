package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzau {
    private static zzau zza;
    private boolean zzb = false;
    private BroadcastReceiver zzc;

    private static AuthCredential zza(Intent intent) {
        Preconditions.checkNotNull(intent);
        return com.google.firebase.auth.zzf.zza(((zzags) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzags.CREATOR)).zzc(true));
    }

    public static zzau zza() {
        if (zza == null) {
            zza = new zzau();
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzau zzauVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        zza(context);
    }

    private zzau() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Context context) {
        zza.zzb = false;
        if (zza.zzc != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(zza.zzc);
        }
        zza.zzc = null;
    }

    private final void zza(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.zzc = broadcastReceiver;
        LocalBroadcastManager.getInstance(activity).registerReceiver(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return zza(activity, taskCompletionSource, firebaseAuth, (FirebaseUser) null);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (!this.zzb) {
            zza(activity, new zzaz(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
            this.zzb = true;
            return true;
        }
        return false;
    }

    public final boolean zza(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (!this.zzb) {
            zza(activity, new zzbb(this, activity, taskCompletionSource));
            this.zzb = true;
            return true;
        }
        return false;
    }
}
