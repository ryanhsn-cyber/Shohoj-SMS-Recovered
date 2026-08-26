package io.grpc;

/* loaded from: classes12.dex */
public final class InternalDecompressorRegistry {
    private InternalDecompressorRegistry() {
    }

    public static byte[] getRawAdvertisedMessageEncodings(DecompressorRegistry reg) {
        return reg.getRawAdvertisedMessageEncodings();
    }
}
