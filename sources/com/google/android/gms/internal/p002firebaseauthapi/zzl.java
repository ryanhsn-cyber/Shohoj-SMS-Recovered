package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
final class zzl extends zzm {
    private final char zza;

    public final String toString() {
        char c = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(char c) {
        this.zza = c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzj
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
