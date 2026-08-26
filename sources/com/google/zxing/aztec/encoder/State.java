package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int binaryShiftCost;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int mode, int binaryBytes, int bitCount) {
        this.token = token;
        this.mode = mode;
        this.binaryShiftByteCount = binaryBytes;
        this.bitCount = bitCount;
        this.binaryShiftCost = calculateBinaryShiftCost(binaryBytes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMode() {
        return this.mode;
    }

    Token getToken() {
        return this.token;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBitCount() {
        return this.bitCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State appendFLGn(int eci) {
        Token token;
        State result = shiftAndAppend(4, 0);
        Token token2 = result.token;
        int bitsAdded = 3;
        if (eci < 0) {
            token = token2.add(0, 3);
        } else {
            if (eci > 999999) {
                throw new IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] eciDigits = Integer.toString(eci).getBytes(StandardCharsets.ISO_8859_1);
            Token token3 = token2.add(eciDigits.length, 3);
            for (byte eciDigit : eciDigits) {
                token3 = token3.add((eciDigit - 48) + 2, 4);
            }
            bitsAdded = 3 + (eciDigits.length * 4);
            token = token3;
        }
        return new State(token, this.mode, 0, this.bitCount + bitsAdded);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State latchAndAppend(int mode, int value) {
        int bitCount = this.bitCount;
        Token token = this.token;
        if (mode != this.mode) {
            int latch = HighLevelEncoder.LATCH_TABLE[this.mode][mode];
            token = token.add(65535 & latch, latch >> 16);
            bitCount += latch >> 16;
        }
        int latchModeBitCount = mode == 2 ? 4 : 5;
        return new State(token.add(value, latchModeBitCount), mode, 0, bitCount + latchModeBitCount);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State shiftAndAppend(int mode, int value) {
        Token token = this.token;
        int thisModeBitCount = this.mode == 2 ? 4 : 5;
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[this.mode][mode], thisModeBitCount).add(value, 5), this.mode, 0, this.bitCount + thisModeBitCount + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State addBinaryShiftChar(int index) {
        Token token = this.token;
        int mode = this.mode;
        int bitCount = this.bitCount;
        if (this.mode == 4 || this.mode == 2) {
            int latch = HighLevelEncoder.LATCH_TABLE[mode][0];
            token = token.add(65535 & latch, latch >> 16);
            bitCount += latch >> 16;
            mode = 0;
        }
        int deltaBitCount = (this.binaryShiftByteCount == 0 || this.binaryShiftByteCount == 31) ? 18 : this.binaryShiftByteCount == 62 ? 9 : 8;
        State result = new State(token, mode, this.binaryShiftByteCount + 1, bitCount + deltaBitCount);
        if (result.binaryShiftByteCount == 2078) {
            return result.endBinaryShift(index + 1);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State endBinaryShift(int index) {
        if (this.binaryShiftByteCount == 0) {
            return this;
        }
        Token token = this.token;
        return new State(token.addBinaryShift(index - this.binaryShiftByteCount, this.binaryShiftByteCount), this.mode, 0, this.bitCount);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isBetterThanOrEqualTo(State other) {
        int newModeBitCount = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][other.mode] >> 16);
        if (this.binaryShiftByteCount < other.binaryShiftByteCount) {
            newModeBitCount += other.binaryShiftCost - this.binaryShiftCost;
        } else if (this.binaryShiftByteCount > other.binaryShiftByteCount && other.binaryShiftByteCount > 0) {
            newModeBitCount += 10;
        }
        return newModeBitCount <= other.bitCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitArray toBitArray(byte[] text) {
        List<Token> symbols = new ArrayList<>();
        for (Token token = endBinaryShift(text.length).token; token != null; token = token.getPrevious()) {
            symbols.add(token);
        }
        BitArray bitArray = new BitArray();
        for (int i = symbols.size() - 1; i >= 0; i--) {
            symbols.get(i).appendTo(bitArray, text);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }

    private static int calculateBinaryShiftCost(int binaryShiftByteCount) {
        if (binaryShiftByteCount > 62) {
            return 21;
        }
        if (binaryShiftByteCount > 31) {
            return 20;
        }
        if (binaryShiftByteCount > 0) {
            return 10;
        }
        return 0;
    }
}
