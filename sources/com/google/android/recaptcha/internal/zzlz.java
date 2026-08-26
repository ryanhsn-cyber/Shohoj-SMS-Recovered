package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzlz extends IllegalArgumentException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlz(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
