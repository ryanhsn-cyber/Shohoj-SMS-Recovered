package com.google.android.gms.internal.p002firebaseauthapi;

import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
abstract class zzaf extends zzi<String> {
    final CharSequence zza;
    private final zzj zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    abstract int zza(int i);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzi
    @CheckForNull
    protected final /* synthetic */ String zza() {
        int i = this.zzd;
        while (this.zzd != -1) {
            int zzb = zzb(this.zzd);
            if (zzb == -1) {
                zzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(zzb);
            }
            if (this.zzd == i) {
                this.zzd++;
                if (this.zzd > this.zza.length()) {
                    this.zzd = -1;
                }
            } else {
                while (i < zzb && this.zzb.zza(this.zza.charAt(i))) {
                    i++;
                }
                while (zzb > i && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                    zzb--;
                }
                if (this.zze == 1) {
                    zzb = this.zza.length();
                    this.zzd = -1;
                    while (zzb > i && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                        zzb--;
                    }
                } else {
                    this.zze--;
                }
                return this.zza.subSequence(i, zzb).toString();
            }
        }
        zzb();
        return null;
    }

    abstract int zzb(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaf(zzac zzacVar, CharSequence charSequence) {
        zzj zzjVar;
        int i;
        zzjVar = zzacVar.zza;
        this.zzb = zzjVar;
        this.zzc = false;
        i = zzacVar.zzd;
        this.zze = i;
        this.zza = charSequence;
    }
}
