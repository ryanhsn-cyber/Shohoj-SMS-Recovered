package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.CallOptions;

/* loaded from: classes12.dex */
public abstract class ClientStreamTracer extends StreamTracer {
    public static final CallOptions.Key<Long> NAME_RESOLUTION_DELAYED = CallOptions.Key.create("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    public void streamCreated(Attributes transportAttrs, Metadata headers) {
    }

    public void createPendingStream() {
    }

    public void outboundHeaders() {
    }

    public void inboundHeaders() {
    }

    public void inboundTrailers(Metadata trailers) {
    }

    /* loaded from: classes12.dex */
    public static abstract class Factory {
        public ClientStreamTracer newClientStreamTracer(StreamInfo info, Metadata headers) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* loaded from: classes12.dex */
    public static final class StreamInfo {
        private final CallOptions callOptions;
        private final boolean isTransparentRetry;
        private final int previousAttempts;

        StreamInfo(CallOptions callOptions, int previousAttempts, boolean isTransparentRetry) {
            this.callOptions = (CallOptions) Preconditions.checkNotNull(callOptions, "callOptions");
            this.previousAttempts = previousAttempts;
            this.isTransparentRetry = isTransparentRetry;
        }

        public CallOptions getCallOptions() {
            return this.callOptions;
        }

        public int getPreviousAttempts() {
            return this.previousAttempts;
        }

        public boolean isTransparentRetry() {
            return this.isTransparentRetry;
        }

        public Builder toBuilder() {
            return new Builder().setCallOptions(this.callOptions).setPreviousAttempts(this.previousAttempts).setIsTransparentRetry(this.isTransparentRetry);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("callOptions", this.callOptions).add("previousAttempts", this.previousAttempts).add("isTransparentRetry", this.isTransparentRetry).toString();
        }

        /* loaded from: classes12.dex */
        public static final class Builder {
            private CallOptions callOptions = CallOptions.DEFAULT;
            private boolean isTransparentRetry;
            private int previousAttempts;

            Builder() {
            }

            public Builder setCallOptions(CallOptions callOptions) {
                this.callOptions = (CallOptions) Preconditions.checkNotNull(callOptions, "callOptions cannot be null");
                return this;
            }

            public Builder setPreviousAttempts(int previousAttempts) {
                this.previousAttempts = previousAttempts;
                return this;
            }

            public Builder setIsTransparentRetry(boolean isTransparentRetry) {
                this.isTransparentRetry = isTransparentRetry;
                return this;
            }

            public StreamInfo build() {
                return new StreamInfo(this.callOptions, this.previousAttempts, this.isTransparentRetry);
            }
        }
    }
}
