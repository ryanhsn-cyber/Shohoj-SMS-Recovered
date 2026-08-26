package com.google.firebase.auth.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
final class zzbs implements zzbp {
    @Override // com.google.firebase.auth.internal.zzbp
    public final Task<RecaptchaTasksClient> zza(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}
