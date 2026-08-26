package com.google.firebase.auth;

import android.net.Uri;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public interface UserInfo {
    String getDisplayName();

    String getEmail();

    String getPhoneNumber();

    Uri getPhotoUrl();

    String getProviderId();

    String getUid();

    boolean isEmailVerified();
}
