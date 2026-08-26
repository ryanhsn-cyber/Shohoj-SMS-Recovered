package com.google.firebase.firestore.local;

import com.google.protobuf.ByteString;

/* loaded from: classes12.dex */
final class MemoryGlobalsCache implements GlobalsCache {
    private ByteString sessionToken = ByteString.EMPTY;

    @Override // com.google.firebase.firestore.local.GlobalsCache
    public ByteString getSessionsToken() {
        return this.sessionToken;
    }

    @Override // com.google.firebase.firestore.local.GlobalsCache
    public void setSessionToken(ByteString value) {
        this.sessionToken = value;
    }
}
