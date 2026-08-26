package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzadz implements OnFailureListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadz(zzadx zzadxVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        logger = zzadx.zza;
        logger.e("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
