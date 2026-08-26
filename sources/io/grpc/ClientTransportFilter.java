package io.grpc;

/* loaded from: classes12.dex */
public abstract class ClientTransportFilter {
    public Attributes transportReady(Attributes transportAttrs) {
        return transportAttrs;
    }

    public void transportTerminated(Attributes transportAttrs) {
    }
}
