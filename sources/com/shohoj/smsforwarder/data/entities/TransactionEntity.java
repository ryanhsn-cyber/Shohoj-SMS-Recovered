package com.shohoj.smsforwarder.data.entities;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003Jt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u00060"}, d2 = {"Lcom/shohoj/smsforwarder/data/entities/TransactionEntity;", "", "id", "", "projectId", "senderNumber", "", "customerNumber", "amount", "trxId", "reference", "rawMessage", "timestamp", "", NotificationCompat.CATEGORY_STATUS, "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCustomerNumber", "getId", "()I", "getProjectId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRawMessage", "getReference", "getSenderNumber", "getStatus", "getTimestamp", "()J", "getTrxId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/shohoj/smsforwarder/data/entities/TransactionEntity;", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionEntity {
    public static final int $stable = 0;
    private final String amount;
    private final String customerNumber;
    private final int id;
    private final Integer projectId;
    private final String rawMessage;
    private final String reference;
    private final String senderNumber;
    private final String status;
    private final long timestamp;
    private final String trxId;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getProjectId() {
        return this.projectId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSenderNumber() {
        return this.senderNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTrxId() {
        return this.trxId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRawMessage() {
        return this.rawMessage;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final TransactionEntity copy(int id, Integer projectId, String senderNumber, String customerNumber, String amount, String trxId, String reference, String rawMessage, long timestamp, String status) {
        Intrinsics.checkNotNullParameter(senderNumber, "senderNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(trxId, "trxId");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(rawMessage, "rawMessage");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TransactionEntity(id, projectId, senderNumber, customerNumber, amount, trxId, reference, rawMessage, timestamp, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionEntity)) {
            return false;
        }
        TransactionEntity transactionEntity = (TransactionEntity) other;
        return this.id == transactionEntity.id && Intrinsics.areEqual(this.projectId, transactionEntity.projectId) && Intrinsics.areEqual(this.senderNumber, transactionEntity.senderNumber) && Intrinsics.areEqual(this.customerNumber, transactionEntity.customerNumber) && Intrinsics.areEqual(this.amount, transactionEntity.amount) && Intrinsics.areEqual(this.trxId, transactionEntity.trxId) && Intrinsics.areEqual(this.reference, transactionEntity.reference) && Intrinsics.areEqual(this.rawMessage, transactionEntity.rawMessage) && this.timestamp == transactionEntity.timestamp && Intrinsics.areEqual(this.status, transactionEntity.status);
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.id) * 31) + (this.projectId == null ? 0 : this.projectId.hashCode())) * 31) + this.senderNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.trxId.hashCode()) * 31) + this.reference.hashCode()) * 31) + this.rawMessage.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "TransactionEntity(id=" + this.id + ", projectId=" + this.projectId + ", senderNumber=" + this.senderNumber + ", customerNumber=" + this.customerNumber + ", amount=" + this.amount + ", trxId=" + this.trxId + ", reference=" + this.reference + ", rawMessage=" + this.rawMessage + ", timestamp=" + this.timestamp + ", status=" + this.status + ')';
    }

    public TransactionEntity(int id, Integer projectId, String senderNumber, String customerNumber, String amount, String trxId, String reference, String rawMessage, long timestamp, String status) {
        Intrinsics.checkNotNullParameter(senderNumber, "senderNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(trxId, "trxId");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(rawMessage, "rawMessage");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.projectId = projectId;
        this.senderNumber = senderNumber;
        this.customerNumber = customerNumber;
        this.amount = amount;
        this.trxId = trxId;
        this.reference = reference;
        this.rawMessage = rawMessage;
        this.timestamp = timestamp;
        this.status = status;
    }

    public /* synthetic */ TransactionEntity(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : num, str, str2, str3, str4, str5, str6, j, (i2 & 512) != 0 ? "PENDING" : str7);
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getProjectId() {
        return this.projectId;
    }

    public final String getSenderNumber() {
        return this.senderNumber;
    }

    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getTrxId() {
        return this.trxId;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getRawMessage() {
        return this.rawMessage;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getStatus() {
        return this.status;
    }
}
