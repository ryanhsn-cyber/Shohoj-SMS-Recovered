package io.grpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes12.dex */
public interface Codec extends Compressor, Decompressor {

    /* loaded from: classes12.dex */
    public static final class Gzip implements Codec {
        @Override // io.grpc.Compressor, io.grpc.Decompressor
        public String getMessageEncoding() {
            return "gzip";
        }

        @Override // io.grpc.Compressor
        public OutputStream compress(OutputStream os) throws IOException {
            return new GZIPOutputStream(os);
        }

        @Override // io.grpc.Decompressor
        public InputStream decompress(InputStream is) throws IOException {
            return new GZIPInputStream(is);
        }
    }

    /* loaded from: classes12.dex */
    public static final class Identity implements Codec {
        public static final Codec NONE = new Identity();

        @Override // io.grpc.Decompressor
        public InputStream decompress(InputStream is) {
            return is;
        }

        @Override // io.grpc.Compressor, io.grpc.Decompressor
        public String getMessageEncoding() {
            return "identity";
        }

        @Override // io.grpc.Compressor
        public OutputStream compress(OutputStream os) {
            return os;
        }

        private Identity() {
        }
    }
}
