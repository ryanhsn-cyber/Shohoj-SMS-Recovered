package com.google.firebase.firestore.core;

import android.util.Pair;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes12.dex */
public final class Target {
    public static final long NO_LIMIT = -1;
    private final String collectionGroup;
    private final Bound endAt;
    private final List<Filter> filters;
    private final long limit;
    private String memoizedCanonicalId;
    private final List<OrderBy> orderBys;
    private final ResourcePath path;
    private final Bound startAt;

    public Target(ResourcePath path, String collectionGroup, List<Filter> filters, List<OrderBy> orderBys, long limit, Bound startAt, Bound endAt) {
        this.path = path;
        this.collectionGroup = collectionGroup;
        this.orderBys = orderBys;
        this.filters = filters;
        this.limit = limit;
        this.startAt = startAt;
        this.endAt = endAt;
    }

    public ResourcePath getPath() {
        return this.path;
    }

    public String getCollectionGroup() {
        return this.collectionGroup;
    }

    public boolean isDocumentQuery() {
        return DocumentKey.isDocumentKey(this.path) && this.collectionGroup == null && this.filters.isEmpty();
    }

    public List<Filter> getFilters() {
        return this.filters;
    }

    public long getLimit() {
        return this.limit;
    }

    public boolean hasLimit() {
        return this.limit != -1;
    }

    public Bound getStartAt() {
        return this.startAt;
    }

    public Bound getEndAt() {
        return this.endAt;
    }

    private List<FieldFilter> getFieldFiltersForPath(FieldPath path) {
        List<FieldFilter> result = new ArrayList<>();
        for (Filter filter : this.filters) {
            if ((filter instanceof FieldFilter) && ((FieldFilter) filter).getField().equals(path)) {
                result.add((FieldFilter) filter);
            }
        }
        return result;
    }

    public List<Value> getArrayValues(FieldIndex fieldIndex) {
        FieldIndex.Segment segment = fieldIndex.getArraySegment();
        if (segment == null) {
            return null;
        }
        for (FieldFilter fieldFilter : getFieldFiltersForPath(segment.getFieldPath())) {
            switch (fieldFilter.getOperator()) {
                case ARRAY_CONTAINS_ANY:
                    return fieldFilter.getValue().getArrayValue().getValuesList();
                case ARRAY_CONTAINS:
                    return Collections.singletonList(fieldFilter.getValue());
            }
        }
        return null;
    }

    public Collection<Value> getNotInValues(FieldIndex fieldIndex) {
        LinkedHashMap<FieldPath, Value> values = new LinkedHashMap<>();
        for (FieldIndex.Segment segment : fieldIndex.getDirectionalSegments()) {
            for (FieldFilter fieldFilter : getFieldFiltersForPath(segment.getFieldPath())) {
                switch (fieldFilter.getOperator()) {
                    case EQUAL:
                    case IN:
                        values.put(segment.getFieldPath(), fieldFilter.getValue());
                        break;
                    case NOT_IN:
                    case NOT_EQUAL:
                        values.put(segment.getFieldPath(), fieldFilter.getValue());
                        return values.values();
                }
            }
        }
        return null;
    }

    public Bound getLowerBound(FieldIndex fieldIndex) {
        Pair<Value, Boolean> segmentBound;
        List<Value> values = new ArrayList<>();
        boolean inclusive = true;
        for (FieldIndex.Segment segment : fieldIndex.getDirectionalSegments()) {
            if (segment.getKind().equals(FieldIndex.Segment.Kind.ASCENDING)) {
                segmentBound = getAscendingBound(segment, this.startAt);
            } else {
                segmentBound = getDescendingBound(segment, this.startAt);
            }
            values.add((Value) segmentBound.first);
            inclusive &= ((Boolean) segmentBound.second).booleanValue();
        }
        return new Bound(values, inclusive);
    }

    public Bound getUpperBound(FieldIndex fieldIndex) {
        Pair<Value, Boolean> segmentBound;
        List<Value> values = new ArrayList<>();
        boolean inclusive = true;
        for (FieldIndex.Segment segment : fieldIndex.getDirectionalSegments()) {
            if (segment.getKind().equals(FieldIndex.Segment.Kind.ASCENDING)) {
                segmentBound = getDescendingBound(segment, this.endAt);
            } else {
                segmentBound = getAscendingBound(segment, this.endAt);
            }
            values.add((Value) segmentBound.first);
            inclusive &= ((Boolean) segmentBound.second).booleanValue();
        }
        return new Bound(values, inclusive);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<com.google.firestore.v1.Value, java.lang.Boolean> getAscendingBound(com.google.firebase.firestore.model.FieldIndex.Segment r9, com.google.firebase.firestore.core.Bound r10) {
        /*
            r8 = this;
            com.google.firestore.v1.Value r0 = com.google.firebase.firestore.model.Values.MIN_VALUE
            r1 = 1
            com.google.firebase.firestore.model.FieldPath r2 = r9.getFieldPath()
            java.util.List r2 = r8.getFieldFiltersForPath(r2)
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()
            com.google.firebase.firestore.core.FieldFilter r3 = (com.google.firebase.firestore.core.FieldFilter) r3
            com.google.firestore.v1.Value r4 = com.google.firebase.firestore.model.Values.MIN_VALUE
            r5 = 1
            int[] r6 = com.google.firebase.firestore.core.Target.AnonymousClass1.$SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator
            com.google.firebase.firestore.core.FieldFilter$Operator r7 = r3.getOperator()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            switch(r6) {
                case 3: goto L40;
                case 4: goto L40;
                case 5: goto L3d;
                case 6: goto L3d;
                case 7: goto L34;
                case 8: goto L34;
                case 9: goto L40;
                case 10: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L45
        L2e:
            com.google.firestore.v1.Value r4 = r3.getValue()
            r5 = 0
            goto L45
        L34:
            com.google.firestore.v1.Value r6 = r3.getValue()
            com.google.firestore.v1.Value r4 = com.google.firebase.firestore.model.Values.getLowerBound(r6)
            goto L45
        L3d:
            com.google.firestore.v1.Value r4 = com.google.firebase.firestore.model.Values.MIN_VALUE
            goto L45
        L40:
            com.google.firestore.v1.Value r4 = r3.getValue()
        L45:
            int r6 = com.google.firebase.firestore.model.Values.lowerBoundCompare(r0, r1, r4, r5)
            if (r6 >= 0) goto L4d
            r0 = r4
            r1 = r5
        L4d:
            goto Lf
        L4e:
            if (r10 == 0) goto L8c
            r2 = 0
        L51:
            java.util.List<com.google.firebase.firestore.core.OrderBy> r3 = r8.orderBys
            int r3 = r3.size()
            if (r2 >= r3) goto L8c
            java.util.List<com.google.firebase.firestore.core.OrderBy> r3 = r8.orderBys
            java.lang.Object r3 = r3.get(r2)
            com.google.firebase.firestore.core.OrderBy r3 = (com.google.firebase.firestore.core.OrderBy) r3
            com.google.firebase.firestore.model.FieldPath r4 = r3.getField()
            com.google.firebase.firestore.model.FieldPath r5 = r9.getFieldPath()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            java.util.List r4 = r10.getPosition()
            java.lang.Object r4 = r4.get(r2)
            com.google.firestore.v1.Value r4 = (com.google.firestore.v1.Value) r4
            boolean r5 = r10.isInclusive()
            int r5 = com.google.firebase.firestore.model.Values.lowerBoundCompare(r0, r1, r4, r5)
            if (r5 >= 0) goto L8c
            r0 = r4
            boolean r1 = r10.isInclusive()
            goto L8c
        L89:
            int r2 = r2 + 1
            goto L51
        L8c:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2.<init>(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.Target.getAscendingBound(com.google.firebase.firestore.model.FieldIndex$Segment, com.google.firebase.firestore.core.Bound):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<com.google.firestore.v1.Value, java.lang.Boolean> getDescendingBound(com.google.firebase.firestore.model.FieldIndex.Segment r9, com.google.firebase.firestore.core.Bound r10) {
        /*
            r8 = this;
            com.google.firestore.v1.Value r0 = com.google.firebase.firestore.model.Values.MAX_VALUE
            r1 = 1
            com.google.firebase.firestore.model.FieldPath r2 = r9.getFieldPath()
            java.util.List r2 = r8.getFieldFiltersForPath(r2)
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            com.google.firebase.firestore.core.FieldFilter r3 = (com.google.firebase.firestore.core.FieldFilter) r3
            com.google.firestore.v1.Value r4 = com.google.firebase.firestore.model.Values.MAX_VALUE
            r5 = 1
            int[] r6 = com.google.firebase.firestore.core.Target.AnonymousClass1.$SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator
            com.google.firebase.firestore.core.FieldFilter$Operator r7 = r3.getOperator()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            switch(r6) {
                case 3: goto L41;
                case 4: goto L41;
                case 5: goto L3e;
                case 6: goto L3e;
                case 7: goto L38;
                case 8: goto L41;
                case 9: goto L2e;
                case 10: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L46
        L2e:
            com.google.firestore.v1.Value r6 = r3.getValue()
            com.google.firestore.v1.Value r4 = com.google.firebase.firestore.model.Values.getUpperBound(r6)
            r5 = 0
            goto L46
        L38:
            com.google.firestore.v1.Value r4 = r3.getValue()
            r5 = 0
            goto L46
        L3e:
            com.google.firestore.v1.Value r4 = com.google.firebase.firestore.model.Values.MAX_VALUE
            goto L46
        L41:
            com.google.firestore.v1.Value r4 = r3.getValue()
        L46:
            int r6 = com.google.firebase.firestore.model.Values.upperBoundCompare(r0, r1, r4, r5)
            if (r6 <= 0) goto L4e
            r0 = r4
            r1 = r5
        L4e:
            goto Lf
        L4f:
            if (r10 == 0) goto L8d
            r2 = 0
        L52:
            java.util.List<com.google.firebase.firestore.core.OrderBy> r3 = r8.orderBys
            int r3 = r3.size()
            if (r2 >= r3) goto L8d
            java.util.List<com.google.firebase.firestore.core.OrderBy> r3 = r8.orderBys
            java.lang.Object r3 = r3.get(r2)
            com.google.firebase.firestore.core.OrderBy r3 = (com.google.firebase.firestore.core.OrderBy) r3
            com.google.firebase.firestore.model.FieldPath r4 = r3.getField()
            com.google.firebase.firestore.model.FieldPath r5 = r9.getFieldPath()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L8a
            java.util.List r4 = r10.getPosition()
            java.lang.Object r4 = r4.get(r2)
            com.google.firestore.v1.Value r4 = (com.google.firestore.v1.Value) r4
            boolean r5 = r10.isInclusive()
            int r5 = com.google.firebase.firestore.model.Values.upperBoundCompare(r0, r1, r4, r5)
            if (r5 <= 0) goto L8d
            r0 = r4
            boolean r1 = r10.isInclusive()
            goto L8d
        L8a:
            int r2 = r2 + 1
            goto L52
        L8d:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2.<init>(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.Target.getDescendingBound(com.google.firebase.firestore.model.FieldIndex$Segment, com.google.firebase.firestore.core.Bound):android.util.Pair");
    }

    public List<OrderBy> getOrderBy() {
        return this.orderBys;
    }

    public OrderBy.Direction getKeyOrder() {
        return this.orderBys.get(this.orderBys.size() - 1).getDirection();
    }

    public int getSegmentCount() {
        Set<FieldPath> fields = new HashSet<>();
        int i = 0;
        for (Filter filter : this.filters) {
            for (FieldFilter subFilter : filter.getFlattenedFilters()) {
                if (!subFilter.getField().isKeyField()) {
                    if (subFilter.getOperator().equals(FieldFilter.Operator.ARRAY_CONTAINS) || subFilter.getOperator().equals(FieldFilter.Operator.ARRAY_CONTAINS_ANY)) {
                        i = 1;
                    } else {
                        fields.add(subFilter.getField());
                    }
                }
            }
        }
        for (OrderBy orderBy : this.orderBys) {
            if (!orderBy.getField().isKeyField()) {
                fields.add(orderBy.getField());
            }
        }
        return fields.size() + i;
    }

    public String getCanonicalId() {
        if (this.memoizedCanonicalId != null) {
            return this.memoizedCanonicalId;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(getPath().canonicalString());
        if (this.collectionGroup != null) {
            builder.append("|cg:");
            builder.append(this.collectionGroup);
        }
        builder.append("|f:");
        for (Filter filter : getFilters()) {
            builder.append(filter.getCanonicalId());
        }
        builder.append("|ob:");
        for (OrderBy orderBy : getOrderBy()) {
            builder.append(orderBy.getField().canonicalString());
            builder.append(orderBy.getDirection().equals(OrderBy.Direction.ASCENDING) ? "asc" : "desc");
        }
        if (hasLimit()) {
            builder.append("|l:");
            builder.append(getLimit());
        }
        if (this.startAt != null) {
            builder.append("|lb:");
            builder.append(this.startAt.isInclusive() ? "b:" : "a:");
            builder.append(this.startAt.positionString());
        }
        if (this.endAt != null) {
            builder.append("|ub:");
            builder.append(this.endAt.isInclusive() ? "a:" : "b:");
            builder.append(this.endAt.positionString());
        }
        this.memoizedCanonicalId = builder.toString();
        return this.memoizedCanonicalId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Target target = (Target) o;
        if (this.collectionGroup == null ? target.collectionGroup != null : !this.collectionGroup.equals(target.collectionGroup)) {
            return false;
        }
        if (this.limit != target.limit || !this.orderBys.equals(target.orderBys) || !this.filters.equals(target.filters) || !this.path.equals(target.path)) {
            return false;
        }
        if (this.startAt == null ? target.startAt != null : !this.startAt.equals(target.startAt)) {
            return false;
        }
        if (this.endAt != null) {
            return this.endAt.equals(target.endAt);
        }
        if (target.endAt == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.orderBys.hashCode();
        return (((((((((((result * 31) + (this.collectionGroup != null ? this.collectionGroup.hashCode() : 0)) * 31) + this.filters.hashCode()) * 31) + this.path.hashCode()) * 31) + ((int) (this.limit ^ (this.limit >>> 32)))) * 31) + (this.startAt != null ? this.startAt.hashCode() : 0)) * 31) + (this.endAt != null ? this.endAt.hashCode() : 0);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Query(");
        builder.append(this.path.canonicalString());
        if (this.collectionGroup != null) {
            builder.append(" collectionGroup=");
            builder.append(this.collectionGroup);
        }
        if (!this.filters.isEmpty()) {
            builder.append(" where ");
            for (int i = 0; i < this.filters.size(); i++) {
                if (i > 0) {
                    builder.append(" and ");
                }
                builder.append(this.filters.get(i));
            }
        }
        if (!this.orderBys.isEmpty()) {
            builder.append(" order by ");
            for (int i2 = 0; i2 < this.orderBys.size(); i2++) {
                if (i2 > 0) {
                    builder.append(", ");
                }
                builder.append(this.orderBys.get(i2));
            }
        }
        builder.append(")");
        return builder.toString();
    }
}
