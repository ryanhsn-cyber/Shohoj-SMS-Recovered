package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes11.dex */
final class zzdg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzcz zzczVar) {
        StringBuilder sb = new StringBuilder(zzczVar.zzd());
        for (int i = 0; i < zzczVar.zzd(); i++) {
            byte zza = zzczVar.zza(i);
            switch (zza) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case 34:
                    sb.append("\\\"");
                    break;
                case 39:
                    sb.append("\\'");
                    break;
                case 92:
                    sb.append("\\\\");
                    break;
                default:
                    if (zza < 32 || zza > 126) {
                        sb.append('\\');
                        sb.append((char) (((zza >>> 6) & 3) + 48));
                        sb.append((char) (((zza >>> 3) & 7) + 48));
                        sb.append((char) ((zza & 7) + 48));
                        break;
                    } else {
                        sb.append((char) zza);
                        break;
                    }
                    break;
            }
        }
        return sb.toString();
    }
}
