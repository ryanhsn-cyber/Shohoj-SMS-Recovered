package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes11.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();
    private final Algorithm zza;

    /* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
    /* loaded from: classes11.dex */
    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int algId) {
            super("Algorithm with COSE value " + algId + " not supported");
        }
    }

    COSEAlgorithmIdentifier(Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier fromCoseValue(int value) throws UnsupportedAlgorithmIdentifierException {
        RSAAlgorithm rSAAlgorithm;
        if (value == RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] values = RSAAlgorithm.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    RSAAlgorithm rSAAlgorithm2 = values[i];
                    if (rSAAlgorithm2.getAlgoValue() == value) {
                        rSAAlgorithm = rSAAlgorithm2;
                        break;
                    }
                    i++;
                } else {
                    for (RSAAlgorithm rSAAlgorithm3 : EC2Algorithm.values()) {
                        if (rSAAlgorithm3.getAlgoValue() == value) {
                            rSAAlgorithm = rSAAlgorithm3;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(value);
                }
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
