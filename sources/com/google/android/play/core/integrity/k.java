package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
final class k extends StandardIntegrityManager.StandardIntegrityTokenRequest {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k(String str, j jVar) {
        this.a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.a;
        return str == null ? standardIntegrityTokenRequest.a() == null : str.equals(standardIntegrityTokenRequest.a());
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.a + "}";
    }
}
