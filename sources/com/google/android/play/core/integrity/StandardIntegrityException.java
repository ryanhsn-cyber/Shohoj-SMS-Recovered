package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public class StandardIntegrityException extends ApiException {
    private final Throwable a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StandardIntegrityException(int i, Throwable th) {
        super(new Status(i, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i), com.google.android.play.core.integrity.model.b.a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
