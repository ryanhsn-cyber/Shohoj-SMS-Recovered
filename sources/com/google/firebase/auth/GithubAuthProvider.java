package com.google.firebase.auth;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public class GithubAuthProvider {
    public static final String GITHUB_SIGN_IN_METHOD = "github.com";
    public static final String PROVIDER_ID = "github.com";

    public static AuthCredential getCredential(String str) {
        return new GithubAuthCredential(str);
    }

    private GithubAuthProvider() {
    }
}
