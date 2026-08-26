package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.remote.WatchChangeAggregator;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public final class TestingHooks {
    private static final TestingHooks instance = new TestingHooks();
    private final CopyOnWriteArrayList<AtomicReference<ExistenceFilterMismatchListener>> existenceFilterMismatchListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes12.dex */
    public interface ExistenceFilterMismatchListener {
        void onExistenceFilterMismatch(ExistenceFilterMismatchInfo existenceFilterMismatchInfo);
    }

    private TestingHooks() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TestingHooks getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyOnExistenceFilterMismatch(ExistenceFilterMismatchInfo info) {
        Iterator<AtomicReference<ExistenceFilterMismatchListener>> it = this.existenceFilterMismatchListeners.iterator();
        while (it.hasNext()) {
            AtomicReference<ExistenceFilterMismatchListener> listenerRef = it.next();
            ExistenceFilterMismatchListener listener = listenerRef.get();
            if (listener != null) {
                listener.onExistenceFilterMismatch(info);
            }
        }
    }

    ListenerRegistration addExistenceFilterMismatchListener(ExistenceFilterMismatchListener listener) {
        Preconditions.checkNotNull(listener, "a null listener is not allowed");
        final AtomicReference<ExistenceFilterMismatchListener> listenerRef = new AtomicReference<>(listener);
        this.existenceFilterMismatchListeners.add(listenerRef);
        return new ListenerRegistration() { // from class: com.google.firebase.firestore.remote.TestingHooks$$ExternalSyntheticLambda0
            @Override // com.google.firebase.firestore.ListenerRegistration
            public final void remove() {
                TestingHooks.this.m5396xc9d8f707(listenerRef);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$addExistenceFilterMismatchListener$0$com-google-firebase-firestore-remote-TestingHooks, reason: not valid java name */
    public /* synthetic */ void m5396xc9d8f707(AtomicReference listenerRef) {
        listenerRef.set(null);
        this.existenceFilterMismatchListeners.remove(listenerRef);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes12.dex */
    public static abstract class ExistenceFilterMismatchInfo {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract ExistenceFilterBloomFilterInfo bloomFilter();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract String databaseId();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int existenceFilterCount();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int localCacheCount();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract String projectId();

        static ExistenceFilterMismatchInfo create(int localCacheCount, int existenceFilterCount, String projectId, String databaseId, ExistenceFilterBloomFilterInfo bloomFilter) {
            return new AutoValue_TestingHooks_ExistenceFilterMismatchInfo(localCacheCount, existenceFilterCount, projectId, databaseId, bloomFilter);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static ExistenceFilterMismatchInfo from(int localCacheCount, ExistenceFilter existenceFilter, DatabaseId databaseId, BloomFilter bloomFilter, WatchChangeAggregator.BloomFilterApplicationStatus bloomFilterStatus) {
            return create(localCacheCount, existenceFilter.getCount(), databaseId.getProjectId(), databaseId.getDatabaseId(), ExistenceFilterBloomFilterInfo.from(bloomFilter, bloomFilterStatus, existenceFilter));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes12.dex */
    public static abstract class ExistenceFilterBloomFilterInfo {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract boolean applied();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int bitmapLength();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract BloomFilter bloomFilter();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int hashCount();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int padding();

        static ExistenceFilterBloomFilterInfo create(BloomFilter bloomFilter, boolean applied, int hashCount, int bitmapLength, int padding) {
            return new AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo(bloomFilter, applied, hashCount, bitmapLength, padding);
        }

        static ExistenceFilterBloomFilterInfo from(BloomFilter bloomFilter, WatchChangeAggregator.BloomFilterApplicationStatus bloomFilterStatus, ExistenceFilter existenceFilter) {
            com.google.firestore.v1.BloomFilter unchangedNames = existenceFilter.getUnchangedNames();
            if (unchangedNames == null) {
                return null;
            }
            return create(bloomFilter, bloomFilterStatus == WatchChangeAggregator.BloomFilterApplicationStatus.SUCCESS, unchangedNames.getHashCount(), unchangedNames.getBits().getBitmap().size(), unchangedNames.getBits().getPadding());
        }
    }
}
