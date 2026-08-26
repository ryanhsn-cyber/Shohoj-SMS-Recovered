package com.google.android.recaptcha.internal;

import androidx.core.view.PointerIconCompat;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public final class zzx {
    public static final zzw zza = new zzw(null);
    public static final zzx zzb = new zzx(9999);
    public static final zzx zzc = new zzx(1000);
    public static final zzx zzd = new zzx(1001);
    public static final zzx zze = new zzx(1002);
    public static final zzx zzf = new zzx(PointerIconCompat.TYPE_HELP);
    public static final zzx zzg = new zzx(PointerIconCompat.TYPE_WAIT);
    public static final zzx zzh = new zzx(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
    public static final zzx zzi = new zzx(PointerIconCompat.TYPE_CELL);
    public static final zzx zzj = new zzx(PointerIconCompat.TYPE_CROSSHAIR);
    public static final zzx zzk = new zzx(PointerIconCompat.TYPE_TEXT);
    public static final zzx zzl = new zzx(PointerIconCompat.TYPE_VERTICAL_TEXT);
    public static final zzx zzm = new zzx(PointerIconCompat.TYPE_ALIAS);
    private final int zzn;

    private zzx(int i) {
        this.zzn = i;
    }

    public final int zza() {
        return this.zzn;
    }
}
