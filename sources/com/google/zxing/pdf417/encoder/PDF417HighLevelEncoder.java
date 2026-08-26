package com.google.zxing.pdf417.encoder;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.ECIInput;
import com.google.zxing.common.MinimalECIInput;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: classes12.dex */
final class PDF417HighLevelEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BYTE_COMPACTION = 1;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final int NUMERIC_COMPACTION = 2;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, Ascii.CR, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, Base64.padSymbol, 94, 0, 32, 0, 0, 0};
    private static final byte[] TEXT_PUNCTUATION_RAW = {59, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 91, 92, 93, 95, 96, 126, 33, Ascii.CR, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, Utf8.REPLACEMENT_BYTE, 123, 125, 39, 0};
    private static final byte[] MIXED = new byte[128];
    private static final byte[] PUNCTUATION = new byte[128];
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;

    static {
        Arrays.fill(MIXED, (byte) -1);
        for (int i = 0; i < TEXT_MIXED_RAW.length; i++) {
            byte b = TEXT_MIXED_RAW[i];
            if (b > 0) {
                MIXED[b] = (byte) i;
            }
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        for (int i2 = 0; i2 < TEXT_PUNCTUATION_RAW.length; i2++) {
            byte b2 = TEXT_PUNCTUATION_RAW[i2];
            if (b2 > 0) {
                PUNCTUATION[b2] = (byte) i2;
            }
        }
    }

    private PDF417HighLevelEncoder() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static String encodeHighLevel(String str, Compaction compaction, Charset charset, boolean z) throws WriterException {
        ECIInput noECIInput;
        CharacterSetECI characterSetECI;
        Charset charset2 = charset;
        if (str.isEmpty()) {
            throw new WriterException("Empty message not allowed");
        }
        if (charset2 == null && !z) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 255) {
                    throw new WriterException("Non-encodable character detected: " + str.charAt(i) + " (Unicode: " + ((int) str.charAt(i)) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                }
            }
        }
        StringBuilder sb = new StringBuilder(str.length());
        Charset charset3 = null;
        boolean z2 = false;
        if (z) {
            noECIInput = new MinimalECIInput(str, charset2, -1);
        } else {
            noECIInput = new NoECIInput(str);
            if (charset2 == null) {
                charset2 = DEFAULT_ENCODING;
            } else if (!DEFAULT_ENCODING.equals(charset2) && (characterSetECI = CharacterSetECI.getCharacterSetECI(charset)) != null) {
                encodingECI(characterSetECI.getValue(), sb);
            }
        }
        int length = noECIInput.length();
        int i2 = 0;
        int i3 = 0;
        switch (compaction) {
            case TEXT:
                encodeText(noECIInput, 0, length, sb, 0);
                break;
            case BYTE:
                if (z) {
                    encodeMultiECIBinary(noECIInput, 0, noECIInput.length(), 0, sb);
                    break;
                } else {
                    byte[] bytes = noECIInput.toString().getBytes(charset2);
                    encodeBinary(bytes, 0, bytes.length, 1, sb);
                    break;
                }
            case NUMERIC:
                sb.append((char) 902);
                encodeNumeric(noECIInput, 0, length, sb);
                break;
            default:
                int i4 = 0;
                while (i2 < length) {
                    while (i2 < length && noECIInput.isECI(i2)) {
                        encodingECI(noECIInput.getECIValue(i2), sb);
                        i2++;
                    }
                    if (i2 >= length) {
                        break;
                    } else {
                        int determineConsecutiveDigitCount = determineConsecutiveDigitCount(noECIInput, i2);
                        if (determineConsecutiveDigitCount >= 13) {
                            sb.append((char) 902);
                            i4 = 2;
                            i3 = 0;
                            encodeNumeric(noECIInput, i2, determineConsecutiveDigitCount, sb);
                            i2 += determineConsecutiveDigitCount;
                        } else {
                            int determineConsecutiveTextCount = determineConsecutiveTextCount(noECIInput, i2);
                            if (determineConsecutiveTextCount >= 5 || determineConsecutiveDigitCount == length) {
                                if (i4 != 0) {
                                    sb.append((char) 900);
                                    i4 = 0;
                                    i3 = 0;
                                }
                                int encodeText = encodeText(noECIInput, i2, determineConsecutiveTextCount, sb, i3);
                                i2 += determineConsecutiveTextCount;
                                i3 = encodeText;
                            } else {
                                int determineConsecutiveBinaryCount = determineConsecutiveBinaryCount(noECIInput, i2, z ? charset3 : charset2);
                                if (determineConsecutiveBinaryCount == 0) {
                                    determineConsecutiveBinaryCount = 1;
                                }
                                byte[] bytes2 = z ? charset3 : noECIInput.subSequence(i2, i2 + determineConsecutiveBinaryCount).toString().getBytes(charset2);
                                if (((bytes2 == null && determineConsecutiveBinaryCount == 1) || (bytes2 != null && bytes2.length == 1)) && i4 == 0) {
                                    if (z) {
                                        encodeMultiECIBinary(noECIInput, i2, 1, 0, sb);
                                    } else {
                                        encodeBinary(bytes2, 0, 1, 0, sb);
                                    }
                                } else {
                                    if (z) {
                                        encodeMultiECIBinary(noECIInput, i2, i2 + determineConsecutiveBinaryCount, i4, sb);
                                    } else {
                                        encodeBinary(bytes2, 0, bytes2.length, i4, sb);
                                    }
                                    i4 = 1;
                                    i3 = 0;
                                }
                                i2 += determineConsecutiveBinaryCount;
                            }
                        }
                        charset3 = null;
                    }
                }
                break;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        if (r2 < r13) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010b, code lost:
    
        r3 = 0;
        r4 = r0.length();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        if (r5 >= r4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0115, code lost:
    
        if ((r5 % 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
    
        r3 = (char) ((r3 * 30) + r0.charAt(r5));
        r14.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        r3 = r0.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        r5 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        if (r5 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0133, code lost:
    
        r14.append((char) ((r3 * 30) + 29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int encodeText(com.google.zxing.common.ECIInput r11, int r12, int r13, java.lang.StringBuilder r14, int r15) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.encodeText(com.google.zxing.common.ECIInput, int, int, java.lang.StringBuilder, int):int");
    }

    private static void encodeMultiECIBinary(ECIInput input, int startpos, int count, int startmode, StringBuilder sb) throws WriterException {
        int end = Math.min(startpos + count, input.length());
        int localStart = startpos;
        while (true) {
            if (localStart < end && input.isECI(localStart)) {
                encodingECI(input.getECIValue(localStart), sb);
                localStart++;
            } else {
                int localEnd = localStart;
                while (localEnd < end && !input.isECI(localEnd)) {
                    localEnd++;
                }
                int localCount = localEnd - localStart;
                if (localCount > 0) {
                    encodeBinary(subBytes(input, localStart, localEnd), 0, localCount, localStart == startpos ? startmode : 1, sb);
                    localStart = localEnd;
                } else {
                    return;
                }
            }
        }
    }

    static byte[] subBytes(ECIInput input, int start, int end) {
        int count = end - start;
        byte[] result = new byte[count];
        for (int i = start; i < end; i++) {
            result[i - start] = (byte) (input.charAt(i) & 255);
        }
        return result;
    }

    private static void encodeBinary(byte[] bytes, int startpos, int count, int startmode, StringBuilder sb) {
        if (count == 1 && startmode == 0) {
            sb.append((char) 913);
        } else if (count % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        int idx = startpos;
        if (count >= 6) {
            char[] chars = new char[5];
            while ((startpos + count) - idx >= 6) {
                long t = 0;
                for (int i = 0; i < 6; i++) {
                    t = (t << 8) + (bytes[idx + i] & 255);
                }
                for (int i2 = 0; i2 < 5; i2++) {
                    chars[i2] = (char) (t % 900);
                    t /= 900;
                }
                int i3 = chars.length;
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    sb.append(chars[i4]);
                }
                idx += 6;
            }
        }
        for (int i5 = idx; i5 < startpos + count; i5++) {
            int ch = bytes[i5] & 255;
            sb.append((char) ch);
        }
    }

    private static void encodeNumeric(ECIInput input, int startpos, int count, StringBuilder sb) {
        int idx = 0;
        StringBuilder tmp = new StringBuilder((count / 3) + 1);
        BigInteger num900 = BigInteger.valueOf(900L);
        BigInteger num0 = BigInteger.valueOf(0L);
        while (idx < count) {
            tmp.setLength(0);
            int len = Math.min(44, count - idx);
            String part = "1" + ((Object) input.subSequence(startpos + idx, startpos + idx + len));
            BigInteger bigint = new BigInteger(part);
            do {
                tmp.append((char) bigint.mod(num900).intValue());
                bigint = bigint.divide(num900);
            } while (!bigint.equals(num0));
            for (int i = tmp.length() - 1; i >= 0; i--) {
                sb.append(tmp.charAt(i));
            }
            idx += len;
        }
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static boolean isAlphaUpper(char ch) {
        return ch == ' ' || (ch >= 'A' && ch <= 'Z');
    }

    private static boolean isAlphaLower(char ch) {
        return ch == ' ' || (ch >= 'a' && ch <= 'z');
    }

    private static boolean isMixed(char ch) {
        return MIXED[ch] != -1;
    }

    private static boolean isPunctuation(char ch) {
        return PUNCTUATION[ch] != -1;
    }

    private static boolean isText(char ch) {
        return ch == '\t' || ch == '\n' || ch == '\r' || (ch >= ' ' && ch <= '~');
    }

    private static int determineConsecutiveDigitCount(ECIInput input, int startpos) {
        int count = 0;
        int len = input.length();
        int idx = startpos;
        if (idx < len) {
            while (idx < len && !input.isECI(idx) && isDigit(input.charAt(idx))) {
                count++;
                idx++;
            }
        }
        return count;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0028, code lost:
    
        return (r1 - r6) - r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int determineConsecutiveTextCount(com.google.zxing.common.ECIInput r5, int r6) {
        /*
            int r0 = r5.length()
            r1 = r6
        L5:
            if (r1 >= r0) goto L41
            r2 = 0
        L8:
            r3 = 13
            if (r2 >= r3) goto L23
            if (r1 >= r0) goto L23
            boolean r4 = r5.isECI(r1)
            if (r4 != 0) goto L23
            char r4 = r5.charAt(r1)
            boolean r4 = isDigit(r4)
            if (r4 == 0) goto L23
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L8
        L23:
            if (r2 < r3) goto L29
            int r3 = r1 - r6
            int r3 = r3 - r2
            return r3
        L29:
            if (r2 <= 0) goto L2c
            goto L5
        L2c:
            boolean r3 = r5.isECI(r1)
            if (r3 != 0) goto L41
            char r3 = r5.charAt(r1)
            boolean r3 = isText(r3)
            if (r3 != 0) goto L3d
            goto L41
        L3d:
            int r1 = r1 + 1
            goto L5
        L41:
            int r2 = r1 - r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.determineConsecutiveTextCount(com.google.zxing.common.ECIInput, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        return r2 - r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int determineConsecutiveBinaryCount(com.google.zxing.common.ECIInput r9, int r10, java.nio.charset.Charset r11) throws com.google.zxing.WriterException {
        /*
            if (r11 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.nio.charset.CharsetEncoder r0 = r11.newEncoder()
        L8:
            int r1 = r9.length()
            r2 = r10
        Ld:
            if (r2 >= r1) goto L78
            r3 = 0
            r4 = r2
        L11:
            r5 = 13
            if (r3 >= r5) goto L2c
            boolean r6 = r9.isECI(r4)
            if (r6 != 0) goto L2c
            char r6 = r9.charAt(r4)
            boolean r6 = isDigit(r6)
            if (r6 == 0) goto L2c
            int r3 = r3 + 1
            int r4 = r2 + r3
            if (r4 < r1) goto L11
        L2c:
            if (r3 < r5) goto L31
            int r5 = r2 - r10
            return r5
        L31:
            if (r0 == 0) goto L74
            char r5 = r9.charAt(r2)
            boolean r5 = r0.canEncode(r5)
            if (r5 != 0) goto L74
            boolean r5 = r9 instanceof com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.NoECIInput
            if (r5 != 0) goto L47
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L47:
            char r5 = r9.charAt(r2)
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Non-encodable character detected: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r8 = " (Unicode: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            r8 = 41
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L74:
            int r2 = r2 + 1
            goto Ld
        L78:
            int r3 = r2 - r10
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.determineConsecutiveBinaryCount(com.google.zxing.common.ECIInput, int, java.nio.charset.Charset):int");
    }

    private static void encodingECI(int eci, StringBuilder sb) throws WriterException {
        if (eci >= 0 && eci < 900) {
            sb.append((char) 927);
            sb.append((char) eci);
        } else if (eci < 810900) {
            sb.append((char) 926);
            sb.append((char) ((eci / 900) - 1));
            sb.append((char) (eci % 900));
        } else {
            if (eci < 811800) {
                sb.append((char) 925);
                sb.append((char) (810900 - eci));
                return;
            }
            throw new WriterException("ECI number not in valid range from 0..811799, but was " + eci);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public static final class NoECIInput implements ECIInput {
        String input;

        private NoECIInput(String input) {
            this.input = input;
        }

        @Override // com.google.zxing.common.ECIInput
        public int length() {
            return this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public char charAt(int index) {
            return this.input.charAt(index);
        }

        @Override // com.google.zxing.common.ECIInput
        public boolean isECI(int index) {
            return false;
        }

        @Override // com.google.zxing.common.ECIInput
        public int getECIValue(int index) {
            return -1;
        }

        @Override // com.google.zxing.common.ECIInput
        public boolean haveNCharacters(int index, int n) {
            return index + n <= this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public CharSequence subSequence(int start, int end) {
            return this.input.subSequence(start, end);
        }

        public String toString() {
            return this.input;
        }
    }
}
