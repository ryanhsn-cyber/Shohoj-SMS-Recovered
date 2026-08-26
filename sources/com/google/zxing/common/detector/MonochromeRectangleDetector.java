package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

@Deprecated
/* loaded from: classes12.dex */
public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    public MonochromeRectangleDetector(BitMatrix image) {
        this.image = image;
    }

    public ResultPoint[] detect() throws NotFoundException {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int halfHeight = height / 2;
        int halfWidth = width / 2;
        int deltaY = Math.max(1, height / 256);
        int deltaX = Math.max(1, width / 256);
        ResultPoint pointA = findCornerFromCenter(halfWidth, 0, 0, width, halfHeight, -deltaY, 0, height, halfWidth / 2);
        int top = ((int) pointA.getY()) - 1;
        ResultPoint pointB = findCornerFromCenter(halfWidth, -deltaX, 0, width, halfHeight, 0, top, height, halfHeight / 2);
        int left = ((int) pointB.getX()) - 1;
        ResultPoint pointC = findCornerFromCenter(halfWidth, deltaX, left, width, halfHeight, 0, top, height, halfHeight / 2);
        int right = ((int) pointC.getX()) + 1;
        ResultPoint pointD = findCornerFromCenter(halfWidth, 0, left, right, halfHeight, deltaY, top, height, halfWidth / 2);
        int bottom = ((int) pointD.getY()) + 1;
        ResultPoint pointA2 = findCornerFromCenter(halfWidth, 0, left, right, halfHeight, -deltaY, top, bottom, halfWidth / 4);
        return new ResultPoint[]{pointA2, pointB, pointC, pointD};
    }

    private ResultPoint findCornerFromCenter(int centerX, int deltaX, int left, int right, int centerY, int deltaY, int top, int bottom, int maxWhiteRun) throws NotFoundException {
        int[] range;
        int[] lastRange = null;
        int y = centerY;
        int x = centerX;
        while (y < bottom && y >= top && x < right && x >= left) {
            if (deltaX == 0) {
                range = blackWhiteRange(y, maxWhiteRun, left, right, true);
            } else {
                range = blackWhiteRange(x, maxWhiteRun, top, bottom, false);
            }
            if (range == null) {
                if (lastRange == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (deltaX == 0) {
                    int lastY = y - deltaY;
                    if (lastRange[0] < centerX) {
                        if (lastRange[1] > centerX) {
                            return new ResultPoint(lastRange[deltaY > 0 ? (char) 0 : (char) 1], lastY);
                        }
                        return new ResultPoint(lastRange[0], lastY);
                    }
                    return new ResultPoint(lastRange[1], lastY);
                }
                int lastY2 = x - deltaX;
                if (lastRange[0] < centerY) {
                    if (lastRange[1] > centerY) {
                        return new ResultPoint(lastY2, lastRange[deltaX < 0 ? (char) 0 : (char) 1]);
                    }
                    return new ResultPoint(lastY2, lastRange[0]);
                }
                return new ResultPoint(lastY2, lastRange[1]);
            }
            lastRange = range;
            y += deltaY;
            x += deltaX;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0069 A[EDGE_INSN: B:66:0x0069->B:46:0x0069 BREAK  A[LOOP:3: B:38:0x0055->B:60:0x0055], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0031 A[EDGE_INSN: B:81:0x0031->B:21:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:75:0x001c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int[] blackWhiteRange(int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r7 = this;
            int r0 = r10 + r11
            r1 = 2
            int r0 = r0 / r1
            r2 = r0
        L5:
            if (r2 < r10) goto L3b
            com.google.zxing.common.BitMatrix r3 = r7.image
            if (r12 == 0) goto L12
            boolean r3 = r3.get(r2, r8)
            if (r3 == 0) goto L1b
            goto L18
        L12:
            boolean r3 = r3.get(r8, r2)
            if (r3 == 0) goto L1b
        L18:
            int r2 = r2 + (-1)
            goto L5
        L1b:
            r3 = r2
        L1c:
            int r2 = r2 + (-1)
            if (r2 < r10) goto L31
            com.google.zxing.common.BitMatrix r4 = r7.image
            if (r12 == 0) goto L2b
            boolean r4 = r4.get(r2, r8)
            if (r4 == 0) goto L1c
            goto L31
        L2b:
            boolean r4 = r4.get(r8, r2)
            if (r4 == 0) goto L1c
        L31:
            int r4 = r3 - r2
            if (r2 < r10) goto L39
            if (r4 <= r9) goto L38
            goto L39
        L38:
            goto L5
        L39:
            r2 = r3
        L3b:
            r3 = 1
            int r2 = r2 + r3
            r4 = r0
        L3e:
            if (r4 >= r11) goto L73
            com.google.zxing.common.BitMatrix r5 = r7.image
            if (r12 == 0) goto L4b
            boolean r5 = r5.get(r4, r8)
            if (r5 == 0) goto L54
            goto L51
        L4b:
            boolean r5 = r5.get(r8, r4)
            if (r5 == 0) goto L54
        L51:
            int r4 = r4 + 1
            goto L3e
        L54:
            r5 = r4
        L55:
            int r4 = r4 + r3
            if (r4 >= r11) goto L69
            com.google.zxing.common.BitMatrix r6 = r7.image
            if (r12 == 0) goto L63
            boolean r6 = r6.get(r4, r8)
            if (r6 == 0) goto L55
            goto L69
        L63:
            boolean r6 = r6.get(r8, r4)
            if (r6 == 0) goto L55
        L69:
            int r6 = r4 - r5
            if (r4 >= r11) goto L71
            if (r6 <= r9) goto L70
            goto L71
        L70:
            goto L3e
        L71:
            r4 = r5
        L73:
            int r4 = r4 + (-1)
            if (r4 <= r2) goto L7f
            int[] r1 = new int[r1]
            r5 = 0
            r1[r5] = r2
            r1[r3] = r4
            goto L80
        L7f:
            r1 = 0
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.detector.MonochromeRectangleDetector.blackWhiteRange(int, int, int, int, boolean):int[]");
    }
}
