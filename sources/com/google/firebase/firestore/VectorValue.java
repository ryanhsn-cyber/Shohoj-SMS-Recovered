package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class VectorValue {
    private final double[] values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VectorValue(double[] values) {
        this.values = values == null ? new double[0] : (double[]) values.clone();
    }

    public double[] toArray() {
        return (double[]) this.values.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Double> toList() {
        ArrayList<Double> result = new ArrayList<>(this.values.length);
        for (int i = 0; i < this.values.length; i++) {
            result.add(i, Double.valueOf(this.values[i]));
        }
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VectorValue otherArray = (VectorValue) obj;
        return Arrays.equals(this.values, otherArray.values);
    }

    public int hashCode() {
        return Arrays.hashCode(this.values);
    }
}
