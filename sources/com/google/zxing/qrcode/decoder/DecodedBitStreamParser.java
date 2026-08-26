package com.google.zxing.qrcode.decoder;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.StringUtils;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes12.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    private DecodedBitStreamParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0040. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124 A[LOOP:0: B:2:0x001e->B:17:0x0124, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.common.DecoderResult decode(byte[] r18, com.google.zxing.qrcode.decoder.Version r19, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r20, java.util.Map<com.google.zxing.DecodeHintType, ?> r21) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.DecodedBitStreamParser.decode(byte[], com.google.zxing.qrcode.decoder.Version, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):com.google.zxing.common.DecoderResult");
    }

    private static void decodeHanziSegment(BitSource bits, StringBuilder result, int count) throws FormatException {
        int i;
        if (StringUtils.GB2312_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (count * 13 > bits.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] buffer = new byte[count * 2];
        int offset = 0;
        while (count > 0) {
            int twoBytes = bits.readBits(13);
            int assembledTwoBytes = ((twoBytes / 96) << 8) | (twoBytes % 96);
            if (assembledTwoBytes < 2560) {
                i = 41377;
            } else {
                i = 42657;
            }
            int assembledTwoBytes2 = assembledTwoBytes + i;
            buffer[offset] = (byte) ((assembledTwoBytes2 >> 8) & 255);
            buffer[offset + 1] = (byte) (assembledTwoBytes2 & 255);
            offset += 2;
            count--;
        }
        result.append(new String(buffer, StringUtils.GB2312_CHARSET));
    }

    private static void decodeKanjiSegment(BitSource bits, StringBuilder result, int count) throws FormatException {
        int i;
        if (StringUtils.SHIFT_JIS_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (count * 13 > bits.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] buffer = new byte[count * 2];
        int offset = 0;
        while (count > 0) {
            int twoBytes = bits.readBits(13);
            int assembledTwoBytes = ((twoBytes / 192) << 8) | (twoBytes % 192);
            if (assembledTwoBytes < 7936) {
                i = 33088;
            } else {
                i = 49472;
            }
            int assembledTwoBytes2 = assembledTwoBytes + i;
            buffer[offset] = (byte) (assembledTwoBytes2 >> 8);
            buffer[offset + 1] = (byte) assembledTwoBytes2;
            offset += 2;
            count--;
        }
        result.append(new String(buffer, StringUtils.SHIFT_JIS_CHARSET));
    }

    private static void decodeByteSegment(BitSource bits, StringBuilder result, int count, CharacterSetECI currentCharacterSetECI, Collection<byte[]> byteSegments, Map<DecodeHintType, ?> hints) throws FormatException {
        Charset encoding;
        if (count * 8 > bits.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] readBytes = new byte[count];
        for (int i = 0; i < count; i++) {
            readBytes[i] = (byte) bits.readBits(8);
        }
        if (currentCharacterSetECI == null) {
            encoding = StringUtils.guessCharset(readBytes, hints);
        } else {
            encoding = currentCharacterSetECI.getCharset();
        }
        result.append(new String(readBytes, encoding));
        byteSegments.add(readBytes);
    }

    private static char toAlphaNumericChar(int value) throws FormatException {
        if (value >= ALPHANUMERIC_CHARS.length) {
            throw FormatException.getFormatInstance();
        }
        return ALPHANUMERIC_CHARS[value];
    }

    private static void decodeAlphanumericSegment(BitSource bits, StringBuilder result, int count, boolean fc1InEffect) throws FormatException {
        int start = result.length();
        while (count > 1) {
            if (bits.available() < 11) {
                throw FormatException.getFormatInstance();
            }
            int nextTwoCharsBits = bits.readBits(11);
            result.append(toAlphaNumericChar(nextTwoCharsBits / 45));
            result.append(toAlphaNumericChar(nextTwoCharsBits % 45));
            count -= 2;
        }
        if (count == 1) {
            if (bits.available() < 6) {
                throw FormatException.getFormatInstance();
            }
            result.append(toAlphaNumericChar(bits.readBits(6)));
        }
        if (fc1InEffect) {
            for (int i = start; i < result.length(); i++) {
                if (result.charAt(i) == '%') {
                    if (i < result.length() - 1 && result.charAt(i + 1) == '%') {
                        result.deleteCharAt(i + 1);
                    } else {
                        result.setCharAt(i, (char) 29);
                    }
                }
            }
        }
    }

    private static void decodeNumericSegment(BitSource bits, StringBuilder result, int count) throws FormatException {
        while (count >= 3) {
            if (bits.available() < 10) {
                throw FormatException.getFormatInstance();
            }
            int threeDigitsBits = bits.readBits(10);
            if (threeDigitsBits >= 1000) {
                throw FormatException.getFormatInstance();
            }
            result.append(toAlphaNumericChar(threeDigitsBits / 100));
            result.append(toAlphaNumericChar((threeDigitsBits / 10) % 10));
            result.append(toAlphaNumericChar(threeDigitsBits % 10));
            count -= 3;
        }
        if (count == 2) {
            if (bits.available() < 7) {
                throw FormatException.getFormatInstance();
            }
            int twoDigitsBits = bits.readBits(7);
            if (twoDigitsBits >= 100) {
                throw FormatException.getFormatInstance();
            }
            result.append(toAlphaNumericChar(twoDigitsBits / 10));
            result.append(toAlphaNumericChar(twoDigitsBits % 10));
            return;
        }
        if (count == 1) {
            if (bits.available() < 4) {
                throw FormatException.getFormatInstance();
            }
            int digitBits = bits.readBits(4);
            if (digitBits >= 10) {
                throw FormatException.getFormatInstance();
            }
            result.append(toAlphaNumericChar(digitBits));
        }
    }

    private static int parseECIValue(BitSource bits) throws FormatException {
        int firstByte = bits.readBits(8);
        if ((firstByte & 128) == 0) {
            return firstByte & 127;
        }
        if ((firstByte & 192) == 128) {
            int secondByte = bits.readBits(8);
            return ((firstByte & 63) << 8) | secondByte;
        }
        if ((firstByte & 224) == 192) {
            int secondThirdBytes = bits.readBits(16);
            return ((firstByte & 31) << 16) | secondThirdBytes;
        }
        throw FormatException.getFormatInstance();
    }
}
