package com.google.firebase.firestore.model.mutation;

/* loaded from: classes12.dex */
final class AutoValue_Overlay extends Overlay {
    private final int largestBatchId;
    private final Mutation mutation;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Overlay(int largestBatchId, Mutation mutation) {
        this.largestBatchId = largestBatchId;
        if (mutation == null) {
            throw new NullPointerException("Null mutation");
        }
        this.mutation = mutation;
    }

    @Override // com.google.firebase.firestore.model.mutation.Overlay
    public int getLargestBatchId() {
        return this.largestBatchId;
    }

    @Override // com.google.firebase.firestore.model.mutation.Overlay
    public Mutation getMutation() {
        return this.mutation;
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.largestBatchId + ", mutation=" + this.mutation + "}";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Overlay)) {
            return false;
        }
        Overlay that = (Overlay) o;
        return this.largestBatchId == that.getLargestBatchId() && this.mutation.equals(that.getMutation());
    }

    public int hashCode() {
        int h$ = 1 * 1000003;
        return ((h$ ^ this.largestBatchId) * 1000003) ^ this.mutation.hashCode();
    }
}
