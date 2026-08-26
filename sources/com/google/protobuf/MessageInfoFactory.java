package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes12.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> clazz);

    MessageInfo messageInfoFor(Class<?> clazz);
}
