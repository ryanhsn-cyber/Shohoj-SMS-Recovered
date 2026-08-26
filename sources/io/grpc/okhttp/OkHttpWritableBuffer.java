package io.grpc.okhttp;

import io.grpc.internal.WritableBuffer;
import okio.Buffer;

/* loaded from: classes12.dex */
class OkHttpWritableBuffer implements WritableBuffer {
    private final Buffer buffer;
    private int readableBytes;
    private int writableBytes;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpWritableBuffer(Buffer buffer, int capacity) {
        this.buffer = buffer;
        this.writableBytes = capacity;
    }

    @Override // io.grpc.internal.WritableBuffer
    public void write(byte[] src, int srcIndex, int length) {
        this.buffer.write(src, srcIndex, length);
        this.writableBytes -= length;
        this.readableBytes += length;
    }

    @Override // io.grpc.internal.WritableBuffer
    public void write(byte b) {
        this.buffer.writeByte((int) b);
        this.writableBytes--;
        this.readableBytes++;
    }

    @Override // io.grpc.internal.WritableBuffer
    public int writableBytes() {
        return this.writableBytes;
    }

    @Override // io.grpc.internal.WritableBuffer
    public int readableBytes() {
        return this.readableBytes;
    }

    @Override // io.grpc.internal.WritableBuffer
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Buffer buffer() {
        return this.buffer;
    }
}
