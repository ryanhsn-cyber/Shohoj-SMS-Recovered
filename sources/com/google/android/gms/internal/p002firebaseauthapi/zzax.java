package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.UShort;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzax<K, V> extends zzau<K, V> {
    private static final zzau<Object, Object> zza = new zzax(null, new Object[0], 0);

    @CheckForNull
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    final zzal<V> zza() {
        return new zzbb(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    final zzav<Map.Entry<K, V>> zzb() {
        return new zzba(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    final zzav<K> zzc() {
        return new zzbc(this, new zzbb(this.zzc, 0, this.zzd));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> zzax<K, V> zza(int i, Object[] objArr, zzat<K, V> zzatVar) {
        int i2;
        char c;
        int i3 = i;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (zzax) zza;
        }
        Object[] objArr3 = null;
        int i4 = 1;
        if (i3 == 1) {
            zzaj.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzax<>(null, objArr2, 1);
        }
        zzz.zzb(i3, objArr2.length >> 1);
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1) << 1;
            while (i2 * 0.7d < max) {
                i2 <<= 1;
            }
        } else {
            i2 = Ints.MAX_POWER_OF_TWO;
            if (!(max < 1073741824)) {
                throw new IllegalArgumentException(String.valueOf("collection too large"));
            }
        }
        if (i3 == 1) {
            zzaj.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            c = 2;
        } else {
            int i5 = i2 - 1;
            int i6 = -1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i3) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i9]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i9 ^ i4]);
                    zzaj.zza(requireNonNull, requireNonNull2);
                    int zza2 = zzam.zza(requireNonNull.hashCode());
                    while (true) {
                        int i11 = zza2 & i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArr2[i10] = requireNonNull;
                                objArr2[i10 ^ 1] = requireNonNull2;
                            }
                            i8++;
                        } else {
                            if (requireNonNull.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                objArr3 = new zzaw(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i13]));
                                objArr2[i13] = requireNonNull2;
                                break;
                            }
                            zza2 = i11 + 1;
                        }
                    }
                    i7++;
                    i4 = 1;
                }
                if (i8 == i3) {
                    objArr3 = bArr;
                    c = 2;
                } else {
                    objArr3 = new Object[]{bArr, Integer.valueOf(i8), objArr3};
                    c = 2;
                }
            } else if (i2 <= 32768) {
                short[] sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i14 = 0;
                for (int i15 = 0; i15 < i3; i15++) {
                    int i16 = i15 * 2;
                    int i17 = i14 * 2;
                    Object requireNonNull3 = Objects.requireNonNull(objArr2[i16]);
                    Object requireNonNull4 = Objects.requireNonNull(objArr2[i16 ^ 1]);
                    zzaj.zza(requireNonNull3, requireNonNull4);
                    int zza3 = zzam.zza(requireNonNull3.hashCode());
                    while (true) {
                        int i18 = zza3 & i5;
                        int i19 = sArr[i18] & UShort.MAX_VALUE;
                        if (i19 == 65535) {
                            sArr[i18] = (short) i17;
                            if (i14 < i15) {
                                objArr2[i17] = requireNonNull3;
                                objArr2[i17 ^ 1] = requireNonNull4;
                            }
                            i14++;
                        } else {
                            if (requireNonNull3.equals(objArr2[i19])) {
                                int i20 = i19 ^ 1;
                                objArr3 = new zzaw(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i20]));
                                objArr2[i20] = requireNonNull4;
                                break;
                            }
                            zza3 = i18 + 1;
                        }
                    }
                }
                if (i14 == i3) {
                    objArr3 = sArr;
                    c = 2;
                } else {
                    c = 2;
                    objArr3 = new Object[]{sArr, Integer.valueOf(i14), objArr3};
                }
            } else {
                int[] iArr = new int[i2];
                Arrays.fill(iArr, -1);
                int i21 = 0;
                int i22 = 0;
                while (i21 < i3) {
                    int i23 = i21 * 2;
                    int i24 = i22 * 2;
                    Object requireNonNull5 = Objects.requireNonNull(objArr2[i23]);
                    Object requireNonNull6 = Objects.requireNonNull(objArr2[i23 ^ 1]);
                    zzaj.zza(requireNonNull5, requireNonNull6);
                    int zza4 = zzam.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i25 = zza4 & i5;
                        int i26 = iArr[i25];
                        if (i26 == i6) {
                            iArr[i25] = i24;
                            if (i22 < i21) {
                                objArr2[i24] = requireNonNull5;
                                objArr2[i24 ^ 1] = requireNonNull6;
                            }
                            i22++;
                        } else {
                            if (requireNonNull5.equals(objArr2[i26])) {
                                int i27 = i26 ^ 1;
                                objArr3 = new zzaw(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i27]));
                                objArr2[i27] = requireNonNull6;
                                break;
                            }
                            zza4 = i25 + 1;
                            i6 = -1;
                        }
                    }
                    i21++;
                    i6 = -1;
                }
                if (i22 == i3) {
                    objArr3 = iArr;
                    c = 2;
                } else {
                    c = 2;
                    objArr3 = new Object[]{iArr, Integer.valueOf(i22), objArr3};
                }
            }
        }
        if (objArr3 instanceof Object[]) {
            Object[] objArr4 = objArr3;
            zzaw zzawVar = (zzaw) objArr4[c];
            if (zzatVar == null) {
                throw zzawVar.zza();
            }
            zzatVar.zza = zzawVar;
            Object obj = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue << 1);
            objArr3 = obj;
            i3 = intValue;
        }
        return new zzax<>(objArr3, objArr2, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i = this.zzd;
        if (obj == null) {
            v = null;
        } else if (i == 1) {
            if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                v = (V) Objects.requireNonNull(objArr[1]);
            } else {
                v = null;
            }
        } else if (obj2 == null) {
            v = null;
        } else if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int zza2 = zzam.zza(obj.hashCode());
            while (true) {
                int i2 = zza2 & length;
                int i3 = bArr[i2] & 255;
                if (i3 == 255) {
                    v = null;
                    break;
                }
                if (obj.equals(objArr[i3])) {
                    v = (V) objArr[i3 ^ 1];
                    break;
                }
                zza2 = i2 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int zza3 = zzam.zza(obj.hashCode());
            while (true) {
                int i4 = zza3 & length2;
                int i5 = sArr[i4] & UShort.MAX_VALUE;
                if (i5 == 65535) {
                    v = null;
                    break;
                }
                if (obj.equals(objArr[i5])) {
                    v = (V) objArr[i5 ^ 1];
                    break;
                }
                zza3 = i4 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int zza4 = zzam.zza(obj.hashCode());
            while (true) {
                int i6 = zza4 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    v = null;
                    break;
                }
                if (obj.equals(objArr[i7])) {
                    v = (V) objArr[i7 ^ 1];
                    break;
                }
                zza4 = i6 + 1;
            }
        }
        if (v == null) {
            return null;
        }
        return v;
    }

    private zzax(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    final boolean zzd() {
        return false;
    }
}
