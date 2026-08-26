package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public final class UPCEANExtension5Support {
    private static final int[] CHECK_DIGIT_ENCODINGS = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] decodeMiddleCounters = new int[4];
    private final StringBuilder decodeRowStringBuffer = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Result decodeRow(int rowNumber, BitArray row, int[] extensionStartRange) throws NotFoundException {
        StringBuilder result = this.decodeRowStringBuffer;
        result.setLength(0);
        int end = decodeMiddle(row, extensionStartRange, result);
        String resultString = result.toString();
        Map<ResultMetadataType, Object> extensionData = parseExtensionString(resultString);
        Result extensionResult = new Result(resultString, null, new ResultPoint[]{new ResultPoint((extensionStartRange[0] + extensionStartRange[1]) / 2.0f, rowNumber), new ResultPoint(end, rowNumber)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (extensionData != null) {
            extensionResult.putAllMetadata(extensionData);
        }
        return extensionResult;
    }

    private int decodeMiddle(BitArray row, int[] startRange, StringBuilder resultString) throws NotFoundException {
        int[] counters = this.decodeMiddleCounters;
        counters[0] = 0;
        counters[1] = 0;
        counters[2] = 0;
        counters[3] = 0;
        int end = row.getSize();
        int rowOffset = startRange[1];
        int lgPatternFound = 0;
        for (int x = 0; x < 5 && rowOffset < end; x++) {
            int bestMatch = UPCEANReader.decodeDigit(row, counters, rowOffset, UPCEANReader.L_AND_G_PATTERNS);
            resultString.append((char) ((bestMatch % 10) + 48));
            for (int counter : counters) {
                rowOffset += counter;
            }
            if (bestMatch >= 10) {
                lgPatternFound |= 1 << (4 - x);
            }
            if (x != 4) {
                rowOffset = row.getNextUnset(row.getNextSet(rowOffset));
            }
        }
        if (resultString.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        int checkDigit = determineCheckDigit(lgPatternFound);
        if (extensionChecksum(resultString.toString()) != checkDigit) {
            throw NotFoundException.getNotFoundInstance();
        }
        return rowOffset;
    }

    private static int extensionChecksum(CharSequence s) {
        int length = s.length();
        int sum = 0;
        for (int i = length - 2; i >= 0; i -= 2) {
            sum += s.charAt(i) - '0';
        }
        int sum2 = sum * 3;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            sum2 += s.charAt(i2) - '0';
        }
        return (sum2 * 3) % 10;
    }

    private static int determineCheckDigit(int lgPatternFound) throws NotFoundException {
        for (int d = 0; d < 10; d++) {
            if (lgPatternFound == CHECK_DIGIT_ENCODINGS[d]) {
                return d;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static Map<ResultMetadataType, Object> parseExtensionString(String raw) {
        Object parseExtension5String;
        if (raw.length() != 5 || (parseExtension5String = parseExtension5String(raw)) == null) {
            return null;
        }
        Map<ResultMetadataType, Object> result = new EnumMap<>(ResultMetadataType.class);
        result.put(ResultMetadataType.SUGGESTED_PRICE, parseExtension5String);
        return result;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r7.equals("90000") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String parseExtension5String(java.lang.String r7) {
        /*
            r0 = 0
            char r1 = r7.charAt(r0)
            r2 = 1
            switch(r1) {
                case 48: goto L43;
                case 53: goto L40;
                case 57: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = ""
            goto L46
        Lc:
            int r1 = r7.hashCode()
            switch(r1) {
                case 54118329: goto L28;
                case 54395376: goto L1e;
                case 54395377: goto L14;
                default: goto L13;
            }
        L13:
            goto L31
        L14:
            java.lang.String r0 = "99991"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L13
            r0 = r2
            goto L32
        L1e:
            java.lang.String r0 = "99990"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2
            goto L32
        L28:
            java.lang.String r1 = "90000"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L13
            goto L32
        L31:
            r0 = -1
        L32:
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                default: goto L35;
            }
        L35:
            java.lang.String r0 = ""
            goto L46
        L38:
            java.lang.String r0 = "Used"
            return r0
        L3b:
            java.lang.String r0 = "0.00"
            return r0
        L3e:
            r0 = 0
            return r0
        L40:
            java.lang.String r0 = "$"
            goto L46
        L43:
            java.lang.String r0 = "£"
        L46:
            java.lang.String r1 = r7.substring(r2)
            int r1 = java.lang.Integer.parseInt(r1)
            int r2 = r1 / 100
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r1 % 100
            r4 = 10
            if (r3 >= r4) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "0"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            goto L72
        L6e:
            java.lang.String r4 = java.lang.String.valueOf(r3)
        L72:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r2)
            r6 = 46
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.UPCEANExtension5Support.parseExtension5String(java.lang.String):java.lang.String");
    }
}
