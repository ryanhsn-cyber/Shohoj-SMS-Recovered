package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "()V", "getClient", "Lkotlin/Result;", "Lcom/google/android/recaptcha/RecaptchaClient;", "application", "Landroid/app/Application;", "siteKey", "", "timeout", "", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasksClient", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m5217getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m5218getClientBWLJW6A(application, str, j, continuation);
    }

    @JvmStatic
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
        zzam zzamVar = zzam.zza;
        return zzam.zzd(application, siteKey, 10000L);
    }

    @JvmStatic
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey, long timeout) {
        zzam zzamVar = zzam.zza;
        return zzam.zzd(application, siteKey, timeout);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0048, B:17:0x0036), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5218getClientBWLJW6A(android.app.Application r8, java.lang.String r9, long r10, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.google.android.recaptcha.RecaptchaClient>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L14
            r0 = r12
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.zzc = r1
            r6 = r0
            goto L1a
        L14:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r7, r12)
            r6 = r0
        L1a:
            java.lang.Object r12 = r6.zza
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.zzc
            switch(r1) {
                case 0: goto L33;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L31
            goto L48
        L31:
            r8 = move-exception
            goto L4f
        L33:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Result$Companion r12 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L31
            com.google.android.recaptcha.internal.zzam r12 = com.google.android.recaptcha.internal.zzam.zza     // Catch: java.lang.Throwable -> L31
            r12 = 1
            r6.zzc = r12     // Catch: java.lang.Throwable -> L31
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r12 = com.google.android.recaptcha.internal.zzam.zzc(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L31
            if (r12 != r0) goto L48
            return r0
        L48:
            com.google.android.recaptcha.internal.zzaw r12 = (com.google.android.recaptcha.internal.zzaw) r12     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = kotlin.Result.m5491constructorimpl(r12)     // Catch: java.lang.Throwable -> L31
            goto L59
        L4f:
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m5491constructorimpl(r8)
        L59:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m5218getClientBWLJW6A(android.app.Application, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
