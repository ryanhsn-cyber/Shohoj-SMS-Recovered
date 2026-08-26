package com.google.rpc;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes12.dex */
public interface RetryInfoOrBuilder extends MessageLiteOrBuilder {
    Duration getRetryDelay();

    boolean hasRetryDelay();
}
