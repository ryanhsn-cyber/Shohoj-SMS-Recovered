package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
final class zzap implements OnFailureListener {
    private final /* synthetic */ zzaq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        if (exc instanceof FirebaseNetworkException) {
            logger = zzan.zzc;
            logger.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.zza.zza.zzd();
        }
    }
}
