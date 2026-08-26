package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetCustomCredentialOption.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/credentials/GetCustomCredentialOption;", "Landroidx/credentials/CredentialOption;", "type", "", "requestData", "Landroid/os/Bundle;", "candidateQueryData", "isSystemProviderRequired", "", "isAutoSelectAllowed", "allowedProviders", "", "Landroid/content/ComponentName;", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class GetCustomCredentialOption extends CredentialOption {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String type, Bundle requestData, Bundle candidateQueryData, boolean z) {
        this(type, requestData, candidateQueryData, z, false, null, 48, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String type, Bundle requestData, Bundle candidateQueryData, boolean z, boolean z2) {
        this(type, requestData, candidateQueryData, z, z2, null, 32, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GetCustomCredentialOption(java.lang.String r8, android.os.Bundle r9, android.os.Bundle r10, boolean r11, boolean r12, java.util.Set r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 16
            if (r15 == 0) goto L7
            r12 = 0
            r5 = r12
            goto L8
        L7:
            r5 = r12
        L8:
            r12 = r14 & 32
            if (r12 == 0) goto L12
            java.util.Set r13 = kotlin.collections.SetsKt.emptySet()
            r6 = r13
            goto L13
        L12:
            r6 = r13
        L13:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.GetCustomCredentialOption.<init>(java.lang.String, android.os.Bundle, android.os.Bundle, boolean, boolean, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String type, Bundle requestData, Bundle candidateQueryData, boolean isSystemProviderRequired, boolean isAutoSelectAllowed, Set<ComponentName> allowedProviders) {
        super(type, requestData, candidateQueryData, isSystemProviderRequired, isAutoSelectAllowed, allowedProviders);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        if (!(type.length() > 0)) {
            throw new IllegalArgumentException("type should not be empty".toString());
        }
    }
}
