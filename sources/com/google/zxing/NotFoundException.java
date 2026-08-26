package com.google.zxing;

/* loaded from: classes12.dex */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException INSTANCE = new NotFoundException();

    static {
        INSTANCE.setStackTrace(NO_TRACE);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return isStackTrace ? new NotFoundException() : INSTANCE;
    }
}
