package com.google.android.play.core.integrity.model;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:integrity@@1.2.0 */
/* loaded from: classes11.dex */
public final class b {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    static {
        a.put(-1, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n");
        a.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        a.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        a.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        a.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        a.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        a.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        a.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        a.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        a.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        a.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        a.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        a.put(-17, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.");
        a.put(-100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        b.put(-1, "API_NOT_AVAILABLE");
        b.put(-3, "NETWORK_ERROR");
        b.put(-2, "PLAY_STORE_NOT_FOUND");
        b.put(-14, "PLAY_STORE_VERSION_OUTDATED");
        b.put(-5, "APP_NOT_INSTALLED");
        b.put(-6, "PLAY_SERVICES_NOT_FOUND");
        b.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        b.put(-7, "APP_UID_MISMATCH");
        b.put(-8, "TOO_MANY_REQUESTS");
        b.put(-9, "CANNOT_BIND_TO_SERVICE");
        b.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        b.put(-17, "REQUEST_HASH_TOO_LONG");
        b.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        b.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i) {
        Map map = a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !b.containsKey(valueOf)) {
            return "";
        }
        return ((String) a.get(valueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#" + ((String) b.get(valueOf)) + ")";
    }
}
