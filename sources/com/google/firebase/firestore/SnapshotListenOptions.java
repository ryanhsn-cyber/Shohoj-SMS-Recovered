package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Preconditions;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class SnapshotListenOptions {
    private final Activity activity;
    private final Executor executor;
    private final MetadataChanges metadataChanges;
    private final ListenSource source;

    private SnapshotListenOptions(Builder builder) {
        this.metadataChanges = builder.metadataChanges;
        this.source = builder.source;
        this.executor = builder.executor;
        this.activity = builder.activity;
    }

    public MetadataChanges getMetadataChanges() {
        return this.metadataChanges;
    }

    public ListenSource getSource() {
        return this.source;
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public Activity getActivity() {
        return this.activity;
    }

    /* loaded from: classes12.dex */
    public static class Builder {
        private MetadataChanges metadataChanges = MetadataChanges.EXCLUDE;
        private ListenSource source = ListenSource.DEFAULT;
        private Executor executor = Executors.DEFAULT_CALLBACK_EXECUTOR;
        private Activity activity = null;

        public Builder setMetadataChanges(MetadataChanges metadataChanges) {
            Preconditions.checkNotNull(metadataChanges, "metadataChanges must not be null.");
            this.metadataChanges = metadataChanges;
            return this;
        }

        public Builder setSource(ListenSource source) {
            Preconditions.checkNotNull(source, "listen source must not be null.");
            this.source = source;
            return this;
        }

        public Builder setExecutor(Executor executor) {
            Preconditions.checkNotNull(executor, "executor must not be null.");
            this.executor = executor;
            return this;
        }

        public Builder setActivity(Activity activity) {
            Preconditions.checkNotNull(activity, "activity must not be null.");
            this.activity = activity;
            return this;
        }

        public SnapshotListenOptions build() {
            return new SnapshotListenOptions(this);
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotListenOptions that = (SnapshotListenOptions) o;
        if (this.metadataChanges == that.metadataChanges && this.source == that.source && this.executor.equals(that.executor) && this.activity.equals(that.activity)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.metadataChanges.hashCode();
        return (((((result * 31) + this.source.hashCode()) * 31) + this.executor.hashCode()) * 31) + (this.activity != null ? this.activity.hashCode() : 0);
    }

    public String toString() {
        return "SnapshotListenOptions{metadataChanges=" + this.metadataChanges + ", source=" + this.source + ", executor=" + this.executor + ", activity=" + this.activity + '}';
    }
}
