package com.google.zxing;

/* loaded from: classes12.dex */
public abstract class ReaderException extends Exception {
    protected static final StackTraceElement[] NO_TRACE;
    protected static boolean isStackTrace;

    static {
        isStackTrace = System.getProperty("surefire.test.class.path") != null;
        NO_TRACE = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException(Throwable cause) {
        super(cause);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public static void setStackTrace(boolean enabled) {
        isStackTrace = enabled;
    }
}
