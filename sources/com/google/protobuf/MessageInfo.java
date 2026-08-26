package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes12.dex */
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
