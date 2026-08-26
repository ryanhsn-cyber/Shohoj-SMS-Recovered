package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class MultiFinderPatternFinder extends FinderPatternFinder {
    private static final float DIFF_MODSIZE_CUTOFF = 0.5f;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05f;
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180.0f;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9.0f;
    private static final FinderPatternInfo[] EMPTY_RESULT_ARRAY = new FinderPatternInfo[0];
    private static final FinderPattern[] EMPTY_FP_ARRAY = new FinderPattern[0];
    private static final FinderPattern[][] EMPTY_FP_2D_ARRAY = new FinderPattern[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public static final class ModuleSizeComparator implements Comparator<FinderPattern>, Serializable {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern center1, FinderPattern center2) {
            float value = center2.getEstimatedModuleSize() - center1.getEstimatedModuleSize();
            if (value < 0.0d) {
                return -1;
            }
            return ((double) value) > 0.0d ? 1 : 0;
        }
    }

    public MultiFinderPatternFinder(BitMatrix image, ResultPointCallback resultPointCallback) {
        super(image, resultPointCallback);
    }

    private FinderPattern[][] selectMultipleBestPatterns() throws NotFoundException {
        char c;
        List<FinderPattern> possibleCenters;
        int size;
        char c2;
        boolean z;
        boolean z2;
        char c3;
        List<FinderPattern> possibleCenters2;
        int size2;
        FinderPattern p2;
        float vModSize12;
        List<FinderPattern> possibleCenters3 = new ArrayList<>();
        Iterator<FinderPattern> it = getPossibleCenters().iterator();
        while (true) {
            c = 2;
            if (!it.hasNext()) {
                break;
            }
            FinderPattern fp = it.next();
            if (fp.getCount() >= 2) {
                possibleCenters3.add(fp);
            }
        }
        int size3 = possibleCenters3.size();
        int i = 3;
        if (size3 < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        char c4 = 0;
        boolean z3 = true;
        if (size3 == 3) {
            return new FinderPattern[][]{(FinderPattern[]) possibleCenters3.toArray(EMPTY_FP_ARRAY)};
        }
        Collections.sort(possibleCenters3, new ModuleSizeComparator());
        List<FinderPattern[]> results = new ArrayList<>();
        int i1 = 0;
        while (i1 < size3 - 2) {
            FinderPattern p1 = possibleCenters3.get(i1);
            if (p1 != null) {
                int i2 = i1 + 1;
                while (i2 < size3 - 1) {
                    FinderPattern p22 = possibleCenters3.get(i2);
                    if (p22 == null) {
                        possibleCenters = possibleCenters3;
                        size = size3;
                        c2 = c;
                        z = z3;
                    } else {
                        float vModSize122 = (p1.getEstimatedModuleSize() - p22.getEstimatedModuleSize()) / Math.min(p1.getEstimatedModuleSize(), p22.getEstimatedModuleSize());
                        float vModSize12A = Math.abs(p1.getEstimatedModuleSize() - p22.getEstimatedModuleSize());
                        float f = 0.5f;
                        float f2 = DIFF_MODSIZE_CUTOFF_PERCENT;
                        if (vModSize12A <= 0.5f || vModSize122 < DIFF_MODSIZE_CUTOFF_PERCENT) {
                            int i3 = i2 + 1;
                            while (true) {
                                if (i3 >= size3) {
                                    possibleCenters = possibleCenters3;
                                    size = size3;
                                    c2 = c;
                                    z = z3;
                                    break;
                                }
                                FinderPattern p3 = possibleCenters3.get(i3);
                                if (p3 == null) {
                                    possibleCenters2 = possibleCenters3;
                                    size2 = size3;
                                    c3 = c;
                                    z2 = z3;
                                    p2 = p22;
                                    vModSize12 = vModSize122;
                                } else {
                                    float vModSize23 = (p22.getEstimatedModuleSize() - p3.getEstimatedModuleSize()) / Math.min(p22.getEstimatedModuleSize(), p3.getEstimatedModuleSize());
                                    float vModSize23A = Math.abs(p22.getEstimatedModuleSize() - p3.getEstimatedModuleSize());
                                    if (vModSize23A > f && vModSize23 >= f2) {
                                        possibleCenters = possibleCenters3;
                                        size = size3;
                                        c2 = 2;
                                        z = true;
                                        break;
                                    }
                                    FinderPattern[] test = new FinderPattern[i];
                                    test[c4] = p1;
                                    z2 = true;
                                    test[1] = p22;
                                    c3 = 2;
                                    test[2] = p3;
                                    ResultPoint.orderBestPatterns(test);
                                    FinderPatternInfo info = new FinderPatternInfo(test);
                                    float dA = ResultPoint.distance(info.getTopLeft(), info.getBottomLeft());
                                    float dC = ResultPoint.distance(info.getTopRight(), info.getBottomLeft());
                                    possibleCenters2 = possibleCenters3;
                                    float dB = ResultPoint.distance(info.getTopLeft(), info.getTopRight());
                                    float estimatedModuleCount = (dA + dB) / (p1.getEstimatedModuleSize() * 2.0f);
                                    if (estimatedModuleCount > MAX_MODULE_COUNT_PER_EDGE) {
                                        size2 = size3;
                                        p2 = p22;
                                        vModSize12 = vModSize122;
                                    } else if (estimatedModuleCount < MIN_MODULE_COUNT_PER_EDGE) {
                                        size2 = size3;
                                        p2 = p22;
                                        vModSize12 = vModSize122;
                                    } else {
                                        float vABBC = Math.abs((dA - dB) / Math.min(dA, dB));
                                        if (vABBC >= 0.1f) {
                                            size2 = size3;
                                            p2 = p22;
                                            vModSize12 = vModSize122;
                                        } else {
                                            size2 = size3;
                                            p2 = p22;
                                            vModSize12 = vModSize122;
                                            float dCpy = (float) Math.sqrt((dA * dA) + (dB * dB));
                                            float vPyC = Math.abs((dC - dCpy) / Math.min(dC, dCpy));
                                            if (vPyC < 0.1f) {
                                                results.add(test);
                                            }
                                        }
                                    }
                                }
                                i3++;
                                c = c3;
                                z3 = z2;
                                possibleCenters3 = possibleCenters2;
                                size3 = size2;
                                p22 = p2;
                                vModSize122 = vModSize12;
                                i = 3;
                                c4 = 0;
                                f = 0.5f;
                                f2 = DIFF_MODSIZE_CUTOFF_PERCENT;
                            }
                        }
                    }
                    i2++;
                    c = c2;
                    z3 = z;
                    possibleCenters3 = possibleCenters;
                    size3 = size;
                    i = 3;
                    c4 = 0;
                }
            }
            i1++;
            c = c;
            z3 = z3;
            possibleCenters3 = possibleCenters3;
            size3 = size3;
            i = 3;
            c4 = 0;
        }
        if (!results.isEmpty()) {
            return (FinderPattern[][]) results.toArray(EMPTY_FP_2D_ARRAY);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public FinderPatternInfo[] findMulti(Map<DecodeHintType, ?> hints) throws NotFoundException {
        boolean tryHarder = hints != null && hints.containsKey(DecodeHintType.TRY_HARDER);
        BitMatrix image = getImage();
        int maxI = image.getHeight();
        int maxJ = image.getWidth();
        int iSkip = (maxI * 3) / 388;
        if (iSkip < 3 || tryHarder) {
            iSkip = 3;
        }
        int[] stateCount = new int[5];
        for (int i = iSkip - 1; i < maxI; i += iSkip) {
            doClearCounts(stateCount);
            int currentState = 0;
            for (int j = 0; j < maxJ; j++) {
                if (image.get(j, i)) {
                    if ((currentState & 1) == 1) {
                        currentState++;
                    }
                    stateCount[currentState] = stateCount[currentState] + 1;
                } else if ((currentState & 1) == 0) {
                    if (currentState == 4) {
                        if (foundPatternCross(stateCount) && handlePossibleCenter(stateCount, i, j)) {
                            currentState = 0;
                            doClearCounts(stateCount);
                        } else {
                            doShiftCounts2(stateCount);
                            currentState = 3;
                        }
                    } else {
                        currentState++;
                        stateCount[currentState] = stateCount[currentState] + 1;
                    }
                } else {
                    stateCount[currentState] = stateCount[currentState] + 1;
                }
            }
            if (foundPatternCross(stateCount)) {
                handlePossibleCenter(stateCount, i, maxJ);
            }
        }
        FinderPattern[][] patternInfo = selectMultipleBestPatterns();
        List<FinderPatternInfo> result = new ArrayList<>();
        for (FinderPattern[] pattern : patternInfo) {
            ResultPoint.orderBestPatterns(pattern);
            result.add(new FinderPatternInfo(pattern));
        }
        if (result.isEmpty()) {
            return EMPTY_RESULT_ARRAY;
        }
        return (FinderPatternInfo[]) result.toArray(EMPTY_RESULT_ARRAY);
    }
}
