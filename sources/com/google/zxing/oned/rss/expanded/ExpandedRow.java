package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
final class ExpandedRow {
    private final List<ExpandedPair> pairs;
    private final int rowNumber;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExpandedRow(List<ExpandedPair> pairs, int rowNumber) {
        this.pairs = new ArrayList(pairs);
        this.rowNumber = rowNumber;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ExpandedPair> getPairs() {
        return this.pairs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getRowNumber() {
        return this.rowNumber;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEquivalent(List<ExpandedPair> otherPairs) {
        return this.pairs.equals(otherPairs);
    }

    public String toString() {
        return "{ " + this.pairs + " }";
    }

    public boolean equals(Object o) {
        if (!(o instanceof ExpandedRow)) {
            return false;
        }
        ExpandedRow that = (ExpandedRow) o;
        return this.pairs.equals(that.pairs);
    }

    public int hashCode() {
        return this.pairs.hashCode();
    }
}
