package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzge;
import com.google.android.recaptcha.internal.zzgf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public abstract class zzgf<MessageType extends zzgf<MessageType, BuilderType>, BuilderType extends zzge<MessageType, BuilderType>> implements zzke {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzjc.zzd;
        if (iterable == 0) {
            throw null;
        }
        if (iterable instanceof zzjm) {
            List zzh = ((zzjm) iterable).zzh();
            zzjm zzjmVar = (zzjm) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (zzjmVar.size() - size) + " is null.";
                    for (int size2 = zzjmVar.size() - 1; size2 >= size; size2--) {
                        zzjmVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof zzgw) {
                    zzjmVar.zzi((zzgw) obj);
                } else {
                    zzjmVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof zzkm)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
            }
            return;
        }
        list.addAll(iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zza(zzkr zzkrVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final zzgw zzb() {
        try {
            int zzn = zzn();
            zzgw zzgwVar = zzgw.zzb;
            byte[] bArr = new byte[zzn];
            zzhh zzA = zzhh.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return new zzgt(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzd() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzhh zzA = zzhh.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
