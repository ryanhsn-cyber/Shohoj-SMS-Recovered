package com.google.common.hash;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

@DoNotMock("Implement with a lambda")
@ElementTypesAreNonnullByDefault
/* loaded from: classes12.dex */
public interface Funnel<T> extends Serializable {
    void funnel(@ParametricNullness T from, PrimitiveSink into);
}
