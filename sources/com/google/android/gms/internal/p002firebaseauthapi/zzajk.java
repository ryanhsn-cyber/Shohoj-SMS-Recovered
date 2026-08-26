package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public class zzajk extends IOException {
    private zzakp zza;
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajn zza() {
        return new zzajn("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zzb() {
        return new zzajk("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zzc() {
        return new zzajk("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zzd() {
        return new zzajk("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zze() {
        return new zzajk("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zzf() {
        return new zzajk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zzg() {
        return new zzajk("Failed to parse the message.");
    }

    public final zzajk zza(zzakp zzakpVar) {
        this.zza = zzakpVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zzh() {
        return new zzajk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajk zzi() {
        return new zzajk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public zzajk(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public zzajk(String str) {
        super(str);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj() {
        this.zzb = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk() {
        return this.zzb;
    }
}
