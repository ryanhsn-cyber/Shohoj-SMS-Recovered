package com.google.firebase.auth;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public class PlayGamesAuthProvider {
    public static final String PLAY_GAMES_SIGN_IN_METHOD = "playgames.google.com";
    public static final String PROVIDER_ID = "playgames.google.com";

    public static AuthCredential getCredential(String str) {
        return new PlayGamesAuthCredential(str);
    }

    private PlayGamesAuthProvider() {
    }
}
