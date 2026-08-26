package com.google.firebase.auth.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public interface zzbp {
    Task<RecaptchaTasksClient> zza(Application application, String str);
}
