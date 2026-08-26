package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes12.dex */
final class BlockParsedResult {
    private final DecodedInformation decodedInformation;
    private final boolean finished;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlockParsedResult() {
        this(null, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlockParsedResult(DecodedInformation information, boolean finished) {
        this.finished = finished;
        this.decodedInformation = information;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFinished() {
        return this.finished;
    }
}
