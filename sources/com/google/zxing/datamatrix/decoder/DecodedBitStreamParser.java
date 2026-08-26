package com.google.zxing.datamatrix.decoder;

import com.google.common.base.Ascii;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.ECIStringBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;
import kotlin.text.Typography;

/* loaded from: classes12.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] C40_SHIFT2_SET_CHARS = {'!', Typography.quote, '#', Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', Typography.less, '=', Typography.greater, '?', '@', '[', '\\', ']', '^', '_'};
    private static final char[] TEXT_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] TEXT_SHIFT2_SET_CHARS = C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', Ascii.MAX};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        ECI_ENCODE
    }

    private DecodedBitStreamParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.common.DecoderResult decode(byte[] r15) throws com.google.zxing.FormatException {
        /*
            com.google.zxing.common.BitSource r0 = new com.google.zxing.common.BitSource
            r0.<init>(r15)
            com.google.zxing.common.ECIStringBuilder r1 = new com.google.zxing.common.ECIStringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.<init>(r5)
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r5 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r8 = 0
        L28:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r9 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
            if (r5 != r9) goto L31
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r5 = decodeAsciiSegment(r0, r1, r2, r7)
            goto L5c
        L31:
            int[] r9 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode
            int r10 = r5.ordinal()
            r9 = r9[r10]
            switch(r9) {
                case 1: goto L56;
                case 2: goto L52;
                case 3: goto L4e;
                case 4: goto L4a;
                case 5: goto L46;
                case 6: goto L41;
                default: goto L3c;
            }
        L3c:
            com.google.zxing.FormatException r4 = com.google.zxing.FormatException.getFormatInstance()
            throw r4
        L41:
            decodeECISegment(r0, r1)
            r8 = 1
            goto L5a
        L46:
            decodeBase256Segment(r0, r1, r3)
            goto L5a
        L4a:
            decodeEdifactSegment(r0, r1)
            goto L5a
        L4e:
            decodeAnsiX12Segment(r0, r1)
            goto L5a
        L52:
            decodeTextSegment(r0, r1, r7)
            goto L5a
        L56:
            decodeC40Segment(r0, r1, r7)
        L5a:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r5 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
        L5c:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r9 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.PAD_ENCODE
            if (r5 == r9) goto L66
            int r9 = r0.available()
            if (r9 > 0) goto L28
        L66:
            int r9 = r2.length()
            if (r9 <= 0) goto L6f
            r1.appendCharacters(r2)
        L6f:
            r9 = 5
            r10 = 4
            if (r8 == 0) goto L9b
            boolean r4 = r7.contains(r4)
            if (r4 != 0) goto L99
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto L84
            goto L99
        L84:
            boolean r4 = r7.contains(r6)
            if (r4 != 0) goto L97
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto L95
            goto L97
        L95:
            r4 = 4
            goto Lc2
        L97:
            r4 = 6
            goto Lc2
        L99:
            r4 = 5
            goto Lc2
        L9b:
            boolean r4 = r7.contains(r4)
            if (r4 != 0) goto Lc1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto Lac
            goto Lc1
        Lac:
            boolean r4 = r7.contains(r6)
            if (r4 != 0) goto Lbf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto Lbd
            goto Lbf
        Lbd:
            r4 = 1
            goto Lc2
        Lbf:
            r4 = 3
            goto Lc2
        Lc1:
            r4 = 2
        Lc2:
            com.google.zxing.common.DecoderResult r6 = new com.google.zxing.common.DecoderResult
            java.lang.String r11 = r1.toString()
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto Ld1
            r9 = 0
            r12 = r9
            goto Ld2
        Ld1:
            r12 = r3
        Ld2:
            r13 = 0
            r9 = r6
            r10 = r15
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.decode(byte[]):com.google.zxing.common.DecoderResult");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0037. Please report as an issue. */
    private static Mode decodeAsciiSegment(BitSource bits, ECIStringBuilder result, StringBuilder resultTrailer, Set<Integer> fnc1positions) throws FormatException {
        boolean upperShift = false;
        do {
            int oneByte = bits.readBits(8);
            if (oneByte == 0) {
                throw FormatException.getFormatInstance();
            }
            if (oneByte <= 128) {
                if (upperShift) {
                    oneByte += 128;
                }
                result.append((char) (oneByte - 1));
                return Mode.ASCII_ENCODE;
            }
            if (oneByte == 129) {
                return Mode.PAD_ENCODE;
            }
            if (oneByte <= 229) {
                int value = oneByte - 130;
                if (value < 10) {
                    result.append('0');
                }
                result.append(value);
            } else {
                switch (oneByte) {
                    case 230:
                        return Mode.C40_ENCODE;
                    case 231:
                        return Mode.BASE256_ENCODE;
                    case 232:
                        fnc1positions.add(Integer.valueOf(result.length()));
                        result.append((char) 29);
                        break;
                    case 233:
                    case 234:
                        break;
                    case 235:
                        upperShift = true;
                        break;
                    case 236:
                        result.append("[)>\u001e05\u001d");
                        resultTrailer.insert(0, "\u001e\u0004");
                        break;
                    case 237:
                        result.append("[)>\u001e06\u001d");
                        resultTrailer.insert(0, "\u001e\u0004");
                        break;
                    case 238:
                        return Mode.ANSIX12_ENCODE;
                    case 239:
                        return Mode.TEXT_ENCODE;
                    case 240:
                        return Mode.EDIFACT_ENCODE;
                    case 241:
                        return Mode.ECI_ENCODE;
                    default:
                        if (oneByte != 254 || bits.available() != 0) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                }
            }
        } while (bits.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    private static void decodeC40Segment(BitSource bits, ECIStringBuilder result, Set<Integer> fnc1positions) throws FormatException {
        int firstByte;
        boolean upperShift = false;
        int[] cValues = new int[3];
        int shift = 0;
        while (bits.available() != 8 && (firstByte = bits.readBits(8)) != 254) {
            parseTwoBytes(firstByte, bits.readBits(8), cValues);
            for (int i = 0; i < 3; i++) {
                int cValue = cValues[i];
                switch (shift) {
                    case 0:
                        if (cValue < 3) {
                            shift = cValue + 1;
                            break;
                        } else if (cValue < C40_BASIC_SET_CHARS.length) {
                            char c40char = C40_BASIC_SET_CHARS[cValue];
                            if (upperShift) {
                                result.append((char) (c40char + 128));
                                upperShift = false;
                                break;
                            } else {
                                result.append(c40char);
                                break;
                            }
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    case 1:
                        if (upperShift) {
                            result.append((char) (cValue + 128));
                            upperShift = false;
                        } else {
                            result.append((char) cValue);
                        }
                        shift = 0;
                        break;
                    case 2:
                        if (cValue < C40_SHIFT2_SET_CHARS.length) {
                            char c40char2 = C40_SHIFT2_SET_CHARS[cValue];
                            if (upperShift) {
                                result.append((char) (c40char2 + 128));
                                upperShift = false;
                            } else {
                                result.append(c40char2);
                            }
                        } else {
                            switch (cValue) {
                                case 27:
                                    fnc1positions.add(Integer.valueOf(result.length()));
                                    result.append((char) 29);
                                    break;
                                case 30:
                                    upperShift = true;
                                    break;
                                default:
                                    throw FormatException.getFormatInstance();
                            }
                        }
                        shift = 0;
                        break;
                    case 3:
                        if (upperShift) {
                            result.append((char) (cValue + 224));
                            upperShift = false;
                        } else {
                            result.append((char) (cValue + 96));
                        }
                        shift = 0;
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
            if (bits.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeTextSegment(BitSource bits, ECIStringBuilder result, Set<Integer> fnc1positions) throws FormatException {
        int firstByte;
        boolean upperShift = false;
        int[] cValues = new int[3];
        int shift = 0;
        while (bits.available() != 8 && (firstByte = bits.readBits(8)) != 254) {
            parseTwoBytes(firstByte, bits.readBits(8), cValues);
            for (int i = 0; i < 3; i++) {
                int cValue = cValues[i];
                switch (shift) {
                    case 0:
                        if (cValue < 3) {
                            shift = cValue + 1;
                            break;
                        } else if (cValue < TEXT_BASIC_SET_CHARS.length) {
                            char textChar = TEXT_BASIC_SET_CHARS[cValue];
                            if (upperShift) {
                                result.append((char) (textChar + 128));
                                upperShift = false;
                                break;
                            } else {
                                result.append(textChar);
                                break;
                            }
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    case 1:
                        if (upperShift) {
                            result.append((char) (cValue + 128));
                            upperShift = false;
                        } else {
                            result.append((char) cValue);
                        }
                        shift = 0;
                        break;
                    case 2:
                        if (cValue < TEXT_SHIFT2_SET_CHARS.length) {
                            char textChar2 = TEXT_SHIFT2_SET_CHARS[cValue];
                            if (upperShift) {
                                result.append((char) (textChar2 + 128));
                                upperShift = false;
                            } else {
                                result.append(textChar2);
                            }
                        } else {
                            switch (cValue) {
                                case 27:
                                    fnc1positions.add(Integer.valueOf(result.length()));
                                    result.append((char) 29);
                                    break;
                                case 30:
                                    upperShift = true;
                                    break;
                                default:
                                    throw FormatException.getFormatInstance();
                            }
                        }
                        shift = 0;
                        break;
                    case 3:
                        if (cValue < TEXT_SHIFT3_SET_CHARS.length) {
                            char textChar3 = TEXT_SHIFT3_SET_CHARS[cValue];
                            if (upperShift) {
                                result.append((char) (textChar3 + 128));
                                upperShift = false;
                            } else {
                                result.append(textChar3);
                            }
                            shift = 0;
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
            if (bits.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeAnsiX12Segment(BitSource bits, ECIStringBuilder result) throws FormatException {
        int firstByte;
        int[] cValues = new int[3];
        while (bits.available() != 8 && (firstByte = bits.readBits(8)) != 254) {
            parseTwoBytes(firstByte, bits.readBits(8), cValues);
            for (int i = 0; i < 3; i++) {
                int cValue = cValues[i];
                switch (cValue) {
                    case 0:
                        result.append('\r');
                        break;
                    case 1:
                        result.append('*');
                        break;
                    case 2:
                        result.append(Typography.greater);
                        break;
                    case 3:
                        result.append(' ');
                        break;
                    default:
                        if (cValue < 14) {
                            result.append((char) (cValue + 44));
                            break;
                        } else if (cValue < 40) {
                            result.append((char) (cValue + 51));
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                }
            }
            if (bits.available() <= 0) {
                return;
            }
        }
    }

    private static void parseTwoBytes(int firstByte, int secondByte, int[] result) {
        int fullBitValue = ((firstByte << 8) + secondByte) - 1;
        int temp = fullBitValue / 1600;
        result[0] = temp;
        int fullBitValue2 = fullBitValue - (temp * 1600);
        int temp2 = fullBitValue2 / 40;
        result[1] = temp2;
        result[2] = fullBitValue2 - (temp2 * 40);
    }

    private static void decodeEdifactSegment(BitSource bits, ECIStringBuilder result) {
        while (bits.available() > 16) {
            for (int i = 0; i < 4; i++) {
                int edifactValue = bits.readBits(6);
                if (edifactValue == 31) {
                    int bitsLeft = 8 - bits.getBitOffset();
                    if (bitsLeft != 8) {
                        bits.readBits(bitsLeft);
                        return;
                    }
                    return;
                }
                if ((edifactValue & 32) == 0) {
                    edifactValue |= 64;
                }
                result.append((char) edifactValue);
            }
            int i2 = bits.available();
            if (i2 <= 0) {
                return;
            }
        }
    }

    private static void decodeBase256Segment(BitSource bits, ECIStringBuilder result, Collection<byte[]> byteSegments) throws FormatException {
        int count;
        int codewordPosition = bits.getByteOffset() + 1;
        int codewordPosition2 = codewordPosition + 1;
        int d1 = unrandomize255State(bits.readBits(8), codewordPosition);
        if (d1 == 0) {
            count = bits.available() / 8;
        } else if (d1 >= 250) {
            count = unrandomize255State(bits.readBits(8), codewordPosition2) + ((d1 - 249) * 250);
            codewordPosition2++;
        } else {
            count = d1;
        }
        if (count < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bytes = new byte[count];
        int i = 0;
        while (i < count) {
            if (bits.available() < 8) {
                throw FormatException.getFormatInstance();
            }
            bytes[i] = (byte) unrandomize255State(bits.readBits(8), codewordPosition2);
            i++;
            codewordPosition2++;
        }
        byteSegments.add(bytes);
        result.append(new String(bytes, StandardCharsets.ISO_8859_1));
    }

    private static void decodeECISegment(BitSource bits, ECIStringBuilder result) throws FormatException {
        if (bits.available() < 8) {
            throw FormatException.getFormatInstance();
        }
        int c1 = bits.readBits(8);
        if (c1 <= 127) {
            result.appendECI(c1 - 1);
        }
    }

    private static int unrandomize255State(int randomizedBase256Codeword, int base256CodewordPosition) {
        int pseudoRandomNumber = ((base256CodewordPosition * 149) % 255) + 1;
        int tempVariable = randomizedBase256Codeword - pseudoRandomNumber;
        return tempVariable >= 0 ? tempVariable : tempVariable + 256;
    }
}
