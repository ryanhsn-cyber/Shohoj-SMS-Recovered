package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public class PhoneMultiFactorGenerator {
    public static final String FACTOR_ID = "phone";

    public static PhoneMultiFactorAssertion getAssertion(PhoneAuthCredential phoneAuthCredential) {
        Preconditions.checkNotNull(phoneAuthCredential);
        return new PhoneMultiFactorAssertion(phoneAuthCredential);
    }
}
