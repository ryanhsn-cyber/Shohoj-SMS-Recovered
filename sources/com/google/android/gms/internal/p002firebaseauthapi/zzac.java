package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzac {
    private final zzj zza;
    private final boolean zzb;
    private final zzai zzc;
    private final int zzd;

    public static zzac zza(char c) {
        zzl zzlVar = new zzl(c);
        zzz.zza(zzlVar);
        return new zzac(new zzab(zzlVar));
    }

    public static zzac zza(String str) {
        zzs zza = zzy.zza(str);
        if (!(!zza.zza("").zzc())) {
            throw new IllegalArgumentException(zzah.zza("The pattern may not match the empty string: %s", zza));
        }
        return new zzac(new zzad(zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzz.zza(charSequence);
        Iterator<String> zza = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private zzac(zzai zzaiVar) {
        this(zzaiVar, false, zzn.zza, Integer.MAX_VALUE);
    }

    private zzac(zzai zzaiVar, boolean z, zzj zzjVar, int i) {
        this.zzc = zzaiVar;
        this.zzb = false;
        this.zza = zzjVar;
        this.zzd = Integer.MAX_VALUE;
    }
}
