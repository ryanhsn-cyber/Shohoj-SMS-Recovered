package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import io.grpc.Status;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class OnlineStateTracker {
    private static final String LOG_TAG = "OnlineStateTracker";
    private static final int MAX_WATCH_STREAM_FAILURES = 1;
    private static final int ONLINE_STATE_TIMEOUT_MS = 10000;
    private final OnlineStateCallback onlineStateCallback;
    private AsyncQueue.DelayedTask onlineStateTimer;
    private int watchStreamFailures;
    private final AsyncQueue workerQueue;
    private OnlineState state = OnlineState.UNKNOWN;
    private boolean shouldWarnClientIsOffline = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes12.dex */
    public interface OnlineStateCallback {
        void handleOnlineStateChange(OnlineState onlineState);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnlineStateTracker(AsyncQueue workerQueue, OnlineStateCallback onlineStateCallback) {
        this.workerQueue = workerQueue;
        this.onlineStateCallback = onlineStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnlineState getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handleWatchStreamStart() {
        if (this.watchStreamFailures == 0) {
            setAndBroadcastState(OnlineState.UNKNOWN);
            Assert.hardAssert(this.onlineStateTimer == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.onlineStateTimer = this.workerQueue.enqueueAfterDelay(AsyncQueue.TimerId.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: com.google.firebase.firestore.remote.OnlineStateTracker$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    OnlineStateTracker.this.m5393x16bdafa1();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$handleWatchStreamStart$0$com-google-firebase-firestore-remote-OnlineStateTracker, reason: not valid java name */
    public /* synthetic */ void m5393x16bdafa1() {
        this.onlineStateTimer = null;
        Assert.hardAssert(this.state == OnlineState.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        logClientOfflineWarningIfNecessary(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        setAndBroadcastState(OnlineState.OFFLINE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handleWatchStreamFailure(Status status) {
        if (this.state == OnlineState.ONLINE) {
            setAndBroadcastState(OnlineState.UNKNOWN);
            Assert.hardAssert(this.watchStreamFailures == 0, "watchStreamFailures must be 0", new Object[0]);
            Assert.hardAssert(this.onlineStateTimer == null, "onlineStateTimer must be null", new Object[0]);
        } else {
            this.watchStreamFailures++;
            if (this.watchStreamFailures >= 1) {
                clearOnlineStateTimer();
                logClientOfflineWarningIfNecessary(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, status));
                setAndBroadcastState(OnlineState.OFFLINE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateState(OnlineState newState) {
        clearOnlineStateTimer();
        this.watchStreamFailures = 0;
        if (newState == OnlineState.ONLINE) {
            this.shouldWarnClientIsOffline = false;
        }
        setAndBroadcastState(newState);
    }

    private void setAndBroadcastState(OnlineState newState) {
        if (newState != this.state) {
            this.state = newState;
            this.onlineStateCallback.handleOnlineStateChange(newState);
        }
    }

    private void logClientOfflineWarningIfNecessary(String reason) {
        String message = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", reason);
        if (this.shouldWarnClientIsOffline) {
            Logger.warn(LOG_TAG, "%s", message);
            this.shouldWarnClientIsOffline = false;
        } else {
            Logger.debug(LOG_TAG, "%s", message);
        }
    }

    private void clearOnlineStateTimer() {
        if (this.onlineStateTimer != null) {
            this.onlineStateTimer.cancel();
            this.onlineStateTimer = null;
        }
    }
}
