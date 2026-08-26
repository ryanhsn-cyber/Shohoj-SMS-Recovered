package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzwr {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzmf.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger zza = zzmf.zza(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(zza);
        if (zza.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod2 = mod.mod(zza);
        if (mod2.equals(BigInteger.ZERO)) {
            bigInteger3 = BigInteger.ZERO;
        } else {
            if (zza.testBit(0) && zza.testBit(1)) {
                bigInteger2 = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
            } else if (zza.testBit(0) && !zza.testBit(1)) {
                BigInteger bigInteger4 = BigInteger.ONE;
                BigInteger shiftRight = zza.subtract(BigInteger.ONE).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(zza);
                    if (mod3.equals(BigInteger.ZERO)) {
                        bigInteger3 = bigInteger4;
                        break;
                    }
                    BigInteger modPow = mod3.modPow(shiftRight, zza);
                    if (!modPow.add(BigInteger.ONE).equals(zza)) {
                        if (!modPow.equals(BigInteger.ONE)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigInteger4 = bigInteger4.add(BigInteger.ONE);
                        i++;
                        if (i == 128 && !zza.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    } else {
                        BigInteger shiftRight2 = zza.add(BigInteger.ONE).shiftRight(1);
                        BigInteger bigInteger5 = BigInteger.ONE;
                        BigInteger bigInteger6 = bigInteger4;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger6.multiply(bigInteger5);
                            bigInteger6 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(zza).multiply(mod3)).mod(zza);
                            bigInteger5 = multiply.add(multiply).mod(zza);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod4 = bigInteger6.multiply(bigInteger4).add(bigInteger5.multiply(mod3)).mod(zza);
                                bigInteger5 = bigInteger4.multiply(bigInteger5).add(bigInteger6).mod(zza);
                                bigInteger6 = mod4;
                            }
                        }
                        bigInteger2 = bigInteger6;
                    }
                }
            } else {
                bigInteger2 = null;
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zza).compareTo(mod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger3 = bigInteger2;
        }
        if (z != bigInteger3.testBit(0)) {
            return zza.subtract(bigInteger3).mod(zza);
        }
        return bigInteger3;
    }

    public static KeyPair zza(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator zza = zzwv.zzd.zza("EC");
        zza.initialize(eCParameterSpec);
        return zza.generateKeyPair();
    }

    public static ECPrivateKey zza(zzwq zzwqVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) zzwv.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzmd.zza(bArr), zza(zzwqVar)));
    }

    public static ECPublicKey zza(zzwq zzwqVar, zzwt zzwtVar, byte[] bArr) throws GeneralSecurityException {
        return zza(zza(zzwqVar), zzwtVar, bArr);
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzwt zzwtVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) zzwv.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzwtVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzwq zzwqVar) throws NoSuchAlgorithmException {
        switch (zzwqVar) {
            case NIST_P256:
                return zzmf.zza;
            case NIST_P384:
                return zzmf.zzb;
            case NIST_P521:
                return zzmf.zzc;
            default:
                throw new NoSuchAlgorithmException("curve not implemented:" + String.valueOf(zzwqVar));
        }
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzwt zzwtVar, byte[] bArr) throws GeneralSecurityException {
        int zza = zza(ellipticCurve);
        boolean z = false;
        switch (zzwtVar) {
            case UNCOMPRESSED:
                if (bArr.length != (zza * 2) + 1) {
                    throw new GeneralSecurityException("invalid point size");
                }
                if (bArr[0] != 4) {
                    throw new GeneralSecurityException("invalid point format");
                }
                int i = zza + 1;
                ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
                zzmf.zza(eCPoint, ellipticCurve);
                return eCPoint;
            case COMPRESSED:
                BigInteger zza2 = zzmf.zza(ellipticCurve);
                if (bArr.length != zza + 1) {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
                if (bArr[0] != 2) {
                    if (bArr[0] == 3) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(zza2) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                return new ECPoint(bigInteger, zza(bigInteger, z, ellipticCurve));
            case DO_NOT_USE_CRUNCHY_UNCOMPRESSED:
                if (bArr.length != zza * 2) {
                    throw new GeneralSecurityException("invalid point size");
                }
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, zza)), new BigInteger(1, Arrays.copyOfRange(bArr, zza, bArr.length)));
                zzmf.zza(eCPoint2, ellipticCurve);
                return eCPoint2;
            default:
                throw new GeneralSecurityException("invalid format:" + String.valueOf(zzwtVar));
        }
    }

    public static void zza(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        zzmf.zza(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    private static void zzb(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (!zzmf.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        return zza(eCPrivateKey, eCPublicKey.getW());
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        zzmf.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = zzwv.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement zza = zzwv.zzc.zza("ECDH");
        zza.init(eCPrivateKey);
        try {
            zza.doPhase(generatePublic, true);
            byte[] generateSecret = zza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(zzmf.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            zza(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
