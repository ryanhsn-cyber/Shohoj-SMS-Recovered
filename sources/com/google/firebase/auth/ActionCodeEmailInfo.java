package com.google.firebase.auth;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public abstract class ActionCodeEmailInfo extends ActionCodeInfo {
    @Override // com.google.firebase.auth.ActionCodeInfo
    public String getEmail() {
        return super.getEmail();
    }

    public abstract String getPreviousEmail();
}
