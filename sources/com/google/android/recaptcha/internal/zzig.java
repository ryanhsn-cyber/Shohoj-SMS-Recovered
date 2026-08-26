package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
final class zzig extends zzif {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final int zza(Map.Entry entry) {
        return ((zziq) entry.getKey()).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final zzij zzb(Object obj) {
        return ((zzip) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final zzij zzc(Object obj) {
        return ((zzip) obj).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final Object zzd(zzie zzieVar, zzke zzkeVar, int i) {
        return zzieVar.zza(zzkeVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final Object zze(Object obj, zzkq zzkqVar, Object obj2, zzie zzieVar, zzij zzijVar, Object obj3, zzll zzllVar) throws IOException {
        zzir zzirVar = (zzir) obj2;
        zzmb zzmbVar = zzirVar.zzb.zzb;
        Object obj4 = null;
        if (zzmbVar == zzmb.ENUM) {
            zzkqVar.zzg();
            throw null;
        }
        switch (zzmbVar) {
            case DOUBLE:
                obj4 = Double.valueOf(zzkqVar.zza());
                break;
            case FLOAT:
                obj4 = Float.valueOf(zzkqVar.zzb());
                break;
            case INT64:
                obj4 = Long.valueOf(zzkqVar.zzl());
                break;
            case UINT64:
                obj4 = Long.valueOf(zzkqVar.zzo());
                break;
            case INT32:
                obj4 = Integer.valueOf(zzkqVar.zzg());
                break;
            case FIXED64:
                obj4 = Long.valueOf(zzkqVar.zzk());
                break;
            case FIXED32:
                obj4 = Integer.valueOf(zzkqVar.zzf());
                break;
            case BOOL:
                obj4 = Boolean.valueOf(zzkqVar.zzN());
                break;
            case STRING:
                obj4 = zzkqVar.zzr();
                break;
            case GROUP:
                Object zze = zzijVar.zze(zzirVar.zzb);
                if (!(zze instanceof zzit)) {
                    throw null;
                }
                zzkr zzb = zzkn.zza().zzb(zze.getClass());
                if (!((zzit) zze).zzG()) {
                    Object zze2 = zzb.zze();
                    zzb.zzg(zze2, zze);
                    zzijVar.zzi(zzirVar.zzb, zze2);
                    zze = zze2;
                }
                zzkqVar.zzt(zze, zzb, zzieVar);
                return obj3;
            case MESSAGE:
                Object zze3 = zzijVar.zze(zzirVar.zzb);
                if (!(zze3 instanceof zzit)) {
                    throw null;
                }
                zzkr zzb2 = zzkn.zza().zzb(zze3.getClass());
                if (!((zzit) zze3).zzG()) {
                    Object zze4 = zzb2.zze();
                    zzb2.zzg(zze4, zze3);
                    zzijVar.zzi(zzirVar.zzb, zze4);
                    zze3 = zze4;
                }
                zzkqVar.zzu(zze3, zzb2, zzieVar);
                return obj3;
            case BYTES:
                obj4 = zzkqVar.zzp();
                break;
            case UINT32:
                obj4 = Integer.valueOf(zzkqVar.zzj());
                break;
            case ENUM:
                throw new IllegalStateException("Shouldn't reach here.");
            case SFIXED32:
                obj4 = Integer.valueOf(zzkqVar.zzh());
                break;
            case SFIXED64:
                obj4 = Long.valueOf(zzkqVar.zzm());
                break;
            case SINT32:
                obj4 = Integer.valueOf(zzkqVar.zzi());
                break;
            case SINT64:
                obj4 = Long.valueOf(zzkqVar.zzn());
                break;
        }
        switch (zzirVar.zzb.zzb.ordinal()) {
            case 9:
            case 10:
                Object zze5 = zzijVar.zze(zzirVar.zzb);
                if (zze5 != null) {
                    byte[] bArr = zzjc.zzd;
                    obj4 = ((zzke) zze5).zzX().zzc((zzke) obj4).zzk();
                    break;
                }
                break;
        }
        zzijVar.zzi(zzirVar.zzb, obj4);
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzf(Object obj) {
        ((zzip) obj).zzb.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzg(zzkq zzkqVar, Object obj, zzie zzieVar, zzij zzijVar) throws IOException {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzh(zzgw zzgwVar, Object obj, zzie zzieVar, zzij zzijVar) throws IOException {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzi(zzmd zzmdVar, Map.Entry entry) throws IOException {
        zziq zziqVar = (zziq) entry.getKey();
        zzmb zzmbVar = zzmb.DOUBLE;
        switch (zziqVar.zzb) {
            case DOUBLE:
                zzmdVar.zzf(zziqVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case FLOAT:
                zzmdVar.zzo(zziqVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case INT64:
                zzmdVar.zzt(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case UINT64:
                zzmdVar.zzK(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case INT32:
                zzmdVar.zzr(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case FIXED64:
                zzmdVar.zzm(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case FIXED32:
                zzmdVar.zzk(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case BOOL:
                zzmdVar.zzb(zziqVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case STRING:
                zzmdVar.zzG(zziqVar.zza, (String) entry.getValue());
                return;
            case GROUP:
                zzmdVar.zzq(zziqVar.zza, entry.getValue(), zzkn.zza().zzb(entry.getValue().getClass()));
                return;
            case MESSAGE:
                zzmdVar.zzv(zziqVar.zza, entry.getValue(), zzkn.zza().zzb(entry.getValue().getClass()));
                return;
            case BYTES:
                zzmdVar.zzd(zziqVar.zza, (zzgw) entry.getValue());
                return;
            case UINT32:
                zzmdVar.zzI(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case ENUM:
                zzmdVar.zzr(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED32:
                zzmdVar.zzx(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case SFIXED64:
                zzmdVar.zzz(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case SINT32:
                zzmdVar.zzB(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case SINT64:
                zzmdVar.zzD(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzif
    public final boolean zzj(zzke zzkeVar) {
        return zzkeVar instanceof zzip;
    }
}
