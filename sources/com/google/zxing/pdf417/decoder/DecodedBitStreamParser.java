package com.google.zxing.pdf417.decoder;

import com.google.api.Service;
import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.ECIStringBuilder;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes12.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final BigInteger[] EXP900 = new BigInteger[16];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        EXP900[0] = BigInteger.ONE;
        BigInteger nineHundred = BigInteger.valueOf(900L);
        EXP900[1] = nineHundred;
        for (int i = 2; i < EXP900.length; i++) {
            EXP900[i] = EXP900[i - 1].multiply(nineHundred);
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DecoderResult decode(int[] codewords, String ecLevel) throws FormatException {
        ECIStringBuilder result = new ECIStringBuilder(codewords.length * 2);
        int code = textCompaction(codewords, 1, result);
        PDF417ResultMetadata resultMetadata = new PDF417ResultMetadata();
        while (code < codewords[0]) {
            int codeIndex = code + 1;
            int code2 = codewords[code];
            switch (code2) {
                case 900:
                    code = textCompaction(codewords, codeIndex, result);
                    break;
                case BYTE_COMPACTION_MODE_LATCH /* 901 */:
                case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                    code = byteCompaction(code2, codewords, codeIndex, result);
                    break;
                case NUMERIC_COMPACTION_MODE_LATCH /* 902 */:
                    code = numericCompaction(codewords, codeIndex, result);
                    break;
                case MODE_SHIFT_TO_BYTE_COMPACTION_MODE /* 913 */:
                    result.append((char) codewords[codeIndex]);
                    code = codeIndex + 1;
                    break;
                case MACRO_PDF417_TERMINATOR /* 922 */:
                case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                    throw FormatException.getFormatInstance();
                case ECI_USER_DEFINED /* 925 */:
                    code = codeIndex + 1;
                    break;
                case ECI_GENERAL_PURPOSE /* 926 */:
                    code = codeIndex + 2;
                    break;
                case ECI_CHARSET /* 927 */:
                    result.appendECI(codewords[codeIndex]);
                    code = codeIndex + 1;
                    break;
                case 928:
                    code = decodeMacroBlock(codewords, codeIndex, resultMetadata);
                    break;
                default:
                    code = textCompaction(codewords, codeIndex - 1, result);
                    break;
            }
        }
        if (result.isEmpty() && resultMetadata.getFileId() == null) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, result.toString(), null, ecLevel);
        decoderResult.setOther(resultMetadata);
        return decoderResult;
    }

    static int decodeMacroBlock(int[] codewords, int codeIndex, PDF417ResultMetadata resultMetadata) throws FormatException {
        if (codeIndex + 2 > codewords[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] segmentIndexArray = new int[2];
        int i = 0;
        while (i < 2) {
            segmentIndexArray[i] = codewords[codeIndex];
            i++;
            codeIndex++;
        }
        String segmentIndexString = decodeBase900toBase10(segmentIndexArray, 2);
        if (segmentIndexString.isEmpty()) {
            resultMetadata.setSegmentIndex(0);
        } else {
            try {
                resultMetadata.setSegmentIndex(Integer.parseInt(segmentIndexString));
            } catch (NumberFormatException e) {
                throw FormatException.getFormatInstance();
            }
        }
        StringBuilder fileId = new StringBuilder();
        while (codeIndex < codewords[0] && codeIndex < codewords.length && codewords[codeIndex] != MACRO_PDF417_TERMINATOR && codewords[codeIndex] != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
            fileId.append(String.format("%03d", Integer.valueOf(codewords[codeIndex])));
            codeIndex++;
        }
        if (fileId.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        resultMetadata.setFileId(fileId.toString());
        int optionalFieldsStart = -1;
        if (codewords[codeIndex] == BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
            optionalFieldsStart = codeIndex + 1;
        }
        while (codeIndex < codewords[0]) {
            switch (codewords[codeIndex]) {
                case MACRO_PDF417_TERMINATOR /* 922 */:
                    codeIndex++;
                    resultMetadata.setLastSegment(true);
                    break;
                case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                    int codeIndex2 = codeIndex + 1;
                    switch (codewords[codeIndex2]) {
                        case 0:
                            ECIStringBuilder fileName = new ECIStringBuilder();
                            codeIndex = textCompaction(codewords, codeIndex2 + 1, fileName);
                            resultMetadata.setFileName(fileName.toString());
                            break;
                        case 1:
                            ECIStringBuilder segmentCount = new ECIStringBuilder();
                            codeIndex = numericCompaction(codewords, codeIndex2 + 1, segmentCount);
                            try {
                                resultMetadata.setSegmentCount(Integer.parseInt(segmentCount.toString()));
                                break;
                            } catch (NumberFormatException e2) {
                                throw FormatException.getFormatInstance();
                            }
                        case 2:
                            ECIStringBuilder timestamp = new ECIStringBuilder();
                            codeIndex = numericCompaction(codewords, codeIndex2 + 1, timestamp);
                            try {
                                resultMetadata.setTimestamp(Long.parseLong(timestamp.toString()));
                                break;
                            } catch (NumberFormatException e3) {
                                throw FormatException.getFormatInstance();
                            }
                        case 3:
                            ECIStringBuilder sender = new ECIStringBuilder();
                            codeIndex = textCompaction(codewords, codeIndex2 + 1, sender);
                            resultMetadata.setSender(sender.toString());
                            break;
                        case 4:
                            ECIStringBuilder addressee = new ECIStringBuilder();
                            codeIndex = textCompaction(codewords, codeIndex2 + 1, addressee);
                            resultMetadata.setAddressee(addressee.toString());
                            break;
                        case 5:
                            ECIStringBuilder fileSize = new ECIStringBuilder();
                            codeIndex = numericCompaction(codewords, codeIndex2 + 1, fileSize);
                            try {
                                resultMetadata.setFileSize(Long.parseLong(fileSize.toString()));
                                break;
                            } catch (NumberFormatException e4) {
                                throw FormatException.getFormatInstance();
                            }
                        case 6:
                            ECIStringBuilder checksum = new ECIStringBuilder();
                            codeIndex = numericCompaction(codewords, codeIndex2 + 1, checksum);
                            try {
                                resultMetadata.setChecksum(Integer.parseInt(checksum.toString()));
                                break;
                            } catch (NumberFormatException e5) {
                                throw FormatException.getFormatInstance();
                            }
                        default:
                            throw FormatException.getFormatInstance();
                    }
                default:
                    throw FormatException.getFormatInstance();
            }
        }
        if (optionalFieldsStart != -1) {
            int optionalFieldsLength = codeIndex - optionalFieldsStart;
            if (resultMetadata.isLastSegment()) {
                optionalFieldsLength--;
            }
            if (optionalFieldsLength > 0) {
                resultMetadata.setOptionalData(Arrays.copyOfRange(codewords, optionalFieldsStart, optionalFieldsStart + optionalFieldsLength));
            }
        }
        return codeIndex;
    }

    private static int textCompaction(int[] codewords, int code, ECIStringBuilder result) throws FormatException {
        int[] textCompactionData = new int[(codewords[0] - code) * 2];
        int[] byteCompactionData = new int[(codewords[0] - code) * 2];
        int index = 0;
        boolean end = false;
        Mode subMode = Mode.ALPHA;
        while (code < codewords[0] && !end) {
            int codeIndex = code + 1;
            int code2 = codewords[code];
            if (code2 >= 900) {
                switch (code2) {
                    case 900:
                        textCompactionData[index] = 900;
                        code = codeIndex;
                        index++;
                        break;
                    case BYTE_COMPACTION_MODE_LATCH /* 901 */:
                    case NUMERIC_COMPACTION_MODE_LATCH /* 902 */:
                    case MACRO_PDF417_TERMINATOR /* 922 */:
                    case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                    case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                    case 928:
                        end = true;
                        code = codeIndex - 1;
                        break;
                    case MODE_SHIFT_TO_BYTE_COMPACTION_MODE /* 913 */:
                        textCompactionData[index] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                        byteCompactionData[index] = codewords[codeIndex];
                        index++;
                        code = codeIndex + 1;
                        break;
                    case ECI_CHARSET /* 927 */:
                        subMode = decodeTextCompaction(textCompactionData, byteCompactionData, index, result, subMode);
                        int codeIndex2 = codeIndex + 1;
                        result.appendECI(codewords[codeIndex]);
                        if (codeIndex2 > codewords[0]) {
                            throw FormatException.getFormatInstance();
                        }
                        textCompactionData = new int[(codewords[0] - codeIndex2) * 2];
                        byteCompactionData = new int[(codewords[0] - codeIndex2) * 2];
                        index = 0;
                        code = codeIndex2;
                        break;
                    default:
                        code = codeIndex;
                        break;
                }
            } else {
                textCompactionData[index] = code2 / 30;
                textCompactionData[index + 1] = code2 % 30;
                index += 2;
                code = codeIndex;
            }
        }
        decodeTextCompaction(textCompactionData, byteCompactionData, index, result, subMode);
        return code;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x006b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0090. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00b5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0023. Please report as an issue. */
    private static Mode decodeTextCompaction(int[] textCompactionData, int[] byteCompactionData, int length, ECIStringBuilder result, Mode startMode) {
        Mode subMode = startMode;
        Mode priorToShiftMode = startMode;
        Mode latchedMode = startMode;
        for (int i = 0; i < length; i++) {
            int subModeCh = textCompactionData[i];
            char ch = 0;
            switch (subMode) {
                case ALPHA:
                    if (subModeCh < 26) {
                        ch = (char) (subModeCh + 65);
                        break;
                    } else {
                        switch (subModeCh) {
                            case 26:
                                ch = ' ';
                                break;
                            case 27:
                                subMode = Mode.LOWER;
                                latchedMode = subMode;
                                break;
                            case 28:
                                subMode = Mode.MIXED;
                                latchedMode = subMode;
                                break;
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                priorToShiftMode = subMode;
                                subMode = Mode.PUNCT_SHIFT;
                                break;
                            case 900:
                                subMode = Mode.ALPHA;
                                latchedMode = subMode;
                                break;
                            case MODE_SHIFT_TO_BYTE_COMPACTION_MODE /* 913 */:
                                result.append((char) byteCompactionData[i]);
                                break;
                        }
                    }
                case LOWER:
                    if (subModeCh < 26) {
                        ch = (char) (subModeCh + 97);
                        break;
                    } else {
                        switch (subModeCh) {
                            case 26:
                                ch = ' ';
                                break;
                            case 27:
                                priorToShiftMode = subMode;
                                subMode = Mode.ALPHA_SHIFT;
                                break;
                            case 28:
                                subMode = Mode.MIXED;
                                latchedMode = subMode;
                                break;
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                priorToShiftMode = subMode;
                                subMode = Mode.PUNCT_SHIFT;
                                break;
                            case 900:
                                subMode = Mode.ALPHA;
                                latchedMode = subMode;
                                break;
                            case MODE_SHIFT_TO_BYTE_COMPACTION_MODE /* 913 */:
                                result.append((char) byteCompactionData[i]);
                                break;
                        }
                    }
                case MIXED:
                    if (subModeCh < 25) {
                        ch = MIXED_CHARS[subModeCh];
                        break;
                    } else {
                        switch (subModeCh) {
                            case 25:
                                subMode = Mode.PUNCT;
                                latchedMode = subMode;
                                break;
                            case 26:
                                ch = ' ';
                                break;
                            case 27:
                                subMode = Mode.LOWER;
                                latchedMode = subMode;
                                break;
                            case 28:
                            case 900:
                                subMode = Mode.ALPHA;
                                latchedMode = subMode;
                                break;
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                priorToShiftMode = subMode;
                                subMode = Mode.PUNCT_SHIFT;
                                break;
                            case MODE_SHIFT_TO_BYTE_COMPACTION_MODE /* 913 */:
                                result.append((char) byteCompactionData[i]);
                                break;
                        }
                    }
                case PUNCT:
                    if (subModeCh < 29) {
                        ch = PUNCT_CHARS[subModeCh];
                        break;
                    } else {
                        switch (subModeCh) {
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                            case 900:
                                subMode = Mode.ALPHA;
                                latchedMode = subMode;
                                break;
                            case MODE_SHIFT_TO_BYTE_COMPACTION_MODE /* 913 */:
                                result.append((char) byteCompactionData[i]);
                                break;
                        }
                    }
                    break;
                case ALPHA_SHIFT:
                    subMode = priorToShiftMode;
                    if (subModeCh < 26) {
                        ch = (char) (subModeCh + 65);
                        break;
                    } else {
                        switch (subModeCh) {
                            case 26:
                                ch = ' ';
                                break;
                            case 900:
                                subMode = Mode.ALPHA;
                                break;
                        }
                    }
                case PUNCT_SHIFT:
                    subMode = priorToShiftMode;
                    if (subModeCh < 29) {
                        ch = PUNCT_CHARS[subModeCh];
                        break;
                    } else {
                        switch (subModeCh) {
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                            case 900:
                                subMode = Mode.ALPHA;
                                break;
                            case MODE_SHIFT_TO_BYTE_COMPACTION_MODE /* 913 */:
                                result.append((char) byteCompactionData[i]);
                                break;
                        }
                    }
                    break;
            }
            if (ch != 0) {
                result.append(ch);
            }
        }
        return latchedMode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r12 == com.google.zxing.pdf417.decoder.DecodedBitStreamParser.BYTE_COMPACTION_MODE_LATCH_6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r9 >= r13[0]) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r13[r9] >= 900) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0053, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0055, code lost:
    
        if (r14 >= 6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0057, code lost:
    
        r15.append((byte) (r5 >> ((5 - r14) * 8)));
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0065, code lost:
    
        r14 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int byteCompaction(int r12, int[] r13, int r14, com.google.zxing.common.ECIStringBuilder r15) throws com.google.zxing.FormatException {
        /*
            r0 = 0
        L1:
            r1 = 0
            r2 = r13[r1]
            if (r14 >= r2) goto L90
            if (r0 != 0) goto L90
        L8:
            r2 = r13[r1]
            r3 = 927(0x39f, float:1.299E-42)
            if (r14 >= r2) goto L1c
            r2 = r13[r14]
            if (r2 != r3) goto L1c
            int r14 = r14 + 1
            r2 = r13[r14]
            r15.appendECI(r2)
            int r14 = r14 + 1
            goto L8
        L1c:
            r2 = r13[r1]
            if (r14 >= r2) goto L8d
            r2 = r13[r14]
            r4 = 900(0x384, float:1.261E-42)
            if (r2 < r4) goto L28
            goto L8d
        L28:
            r5 = 0
            r2 = 0
        L2b:
            r7 = 900(0x384, double:4.447E-321)
            long r7 = r7 * r5
            int r9 = r14 + 1
            r14 = r13[r14]
            long r10 = (long) r14
            long r5 = r7 + r10
            int r2 = r2 + 1
            r14 = 5
            if (r2 >= r14) goto L45
            r7 = r13[r1]
            if (r9 >= r7) goto L45
            r7 = r13[r9]
            if (r7 < r4) goto L43
            goto L45
        L43:
            r14 = r9
            goto L2b
        L45:
            if (r2 != r14) goto L67
            r14 = 924(0x39c, float:1.295E-42)
            if (r12 == r14) goto L53
            r14 = r13[r1]
            if (r9 >= r14) goto L67
            r14 = r13[r9]
            if (r14 >= r4) goto L67
        L53:
            r14 = 0
        L54:
            r1 = 6
            if (r14 >= r1) goto L65
            int r1 = 5 - r14
            int r1 = r1 * 8
            long r3 = r5 >> r1
            int r1 = (int) r3
            byte r1 = (byte) r1
            r15.append(r1)
            int r14 = r14 + 1
            goto L54
        L65:
            r14 = r9
            goto L8b
        L67:
            int r9 = r9 - r2
        L68:
            r14 = r13[r1]
            if (r9 >= r14) goto L8a
            if (r0 != 0) goto L8a
            int r14 = r9 + 1
            r7 = r13[r9]
            if (r7 >= r4) goto L7a
            byte r8 = (byte) r7
            r15.append(r8)
            r9 = r14
            goto L89
        L7a:
            if (r7 != r3) goto L85
            int r8 = r14 + 1
            r14 = r13[r14]
            r15.appendECI(r14)
            r9 = r8
            goto L89
        L85:
            int r14 = r14 + (-1)
            r0 = 1
            r9 = r14
        L89:
            goto L68
        L8a:
            r14 = r9
        L8b:
            goto L1
        L8d:
            r0 = 1
            goto L1
        L90:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.byteCompaction(int, int[], int, com.google.zxing.common.ECIStringBuilder):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x001f. Please report as an issue. */
    private static int numericCompaction(int[] codewords, int code, ECIStringBuilder result) throws FormatException {
        int count = 0;
        boolean end = false;
        int[] numericCodewords = new int[15];
        while (code < codewords[0] && !end) {
            int codeIndex = code + 1;
            int code2 = codewords[code];
            if (codeIndex == codewords[0]) {
                end = true;
            }
            if (code2 < 900) {
                numericCodewords[count] = code2;
                count++;
            } else {
                switch (code2) {
                    case 900:
                    case BYTE_COMPACTION_MODE_LATCH /* 901 */:
                    case MACRO_PDF417_TERMINATOR /* 922 */:
                    case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                    case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                    case ECI_CHARSET /* 927 */:
                    case 928:
                        codeIndex--;
                        end = true;
                        break;
                }
            }
            if ((count % 15 == 0 || code2 == NUMERIC_COMPACTION_MODE_LATCH || end) && count > 0) {
                result.append(decodeBase900toBase10(numericCodewords, count));
                count = 0;
            }
            code = codeIndex;
        }
        return code;
    }

    private static String decodeBase900toBase10(int[] codewords, int count) throws FormatException {
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < count; i++) {
            result = result.add(EXP900[(count - i) - 1].multiply(BigInteger.valueOf(codewords[i])));
        }
        String resultString = result.toString();
        if (resultString.charAt(0) != '1') {
            throw FormatException.getFormatInstance();
        }
        return resultString.substring(1);
    }
}
