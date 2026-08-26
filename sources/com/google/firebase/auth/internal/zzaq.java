package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzaq implements Runnable {
    final /* synthetic */ zzan zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzan zzanVar, String str) {
        this.zza = zzanVar;
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzb));
        if (firebaseAuth.getCurrentUser() != null) {
            Task<GetTokenResult> accessToken = firebaseAuth.getAccessToken(true);
            logger = zzan.zzc;
            logger.v("Token refreshing started", new Object[0]);
            accessToken.addOnFailureListener(new zzap(this));
        }
    }
}
