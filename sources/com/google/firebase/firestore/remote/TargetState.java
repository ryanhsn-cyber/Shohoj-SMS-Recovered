package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public final class TargetState {
    private int outstandingResponses = 0;
    private final Map<DocumentKey, DocumentViewChange.Type> documentChanges = new HashMap();
    private boolean hasChanges = true;
    private ByteString resumeToken = ByteString.EMPTY;
    private boolean current = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isCurrent() {
        return this.current;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPending() {
        return this.outstandingResponses != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasChanges() {
        return this.hasChanges;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateResumeToken(ByteString resumeToken) {
        if (!resumeToken.isEmpty()) {
            this.hasChanges = true;
            this.resumeToken = resumeToken;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TargetChange toTargetChange() {
        ImmutableSortedSet<DocumentKey> addedDocuments = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> modifiedDocuments = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> removedDocuments = DocumentKey.emptyKeySet();
        for (Map.Entry<DocumentKey, DocumentViewChange.Type> entry : this.documentChanges.entrySet()) {
            DocumentKey key = entry.getKey();
            DocumentViewChange.Type changeType = entry.getValue();
            switch (changeType) {
                case ADDED:
                    addedDocuments = addedDocuments.insert(key);
                    break;
                case MODIFIED:
                    modifiedDocuments = modifiedDocuments.insert(key);
                    break;
                case REMOVED:
                    removedDocuments = removedDocuments.insert(key);
                    break;
                default:
                    throw Assert.fail("Encountered invalid change type: %s", changeType);
            }
        }
        return new TargetChange(this.resumeToken, this.current, addedDocuments, modifiedDocuments, removedDocuments);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearChanges() {
        this.hasChanges = false;
        this.documentChanges.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addDocumentChange(DocumentKey key, DocumentViewChange.Type changeType) {
        this.hasChanges = true;
        this.documentChanges.put(key, changeType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeDocumentChange(DocumentKey key) {
        this.hasChanges = true;
        this.documentChanges.remove(key);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void recordPendingTargetRequest() {
        this.outstandingResponses++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void recordTargetResponse() {
        this.outstandingResponses--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void markCurrent() {
        this.hasChanges = true;
        this.current = true;
    }
}
