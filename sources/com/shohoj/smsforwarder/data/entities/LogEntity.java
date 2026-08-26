package com.shohoj.smsforwarder.data.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010#\u001a\u00020\rHÆ\u0003Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/shohoj/smsforwarder/data/entities/LogEntity;", "", "id", "", "ruleId", "senderId", "timestamp", "", "originalSender", "", "messageBody", "httpStatusCode", "isSuccess", "", "(ILjava/lang/Integer;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getHttpStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()I", "()Z", "getMessageBody", "()Ljava/lang/String;", "getOriginalSender", "getRuleId", "getSenderId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/shohoj/smsforwarder/data/entities/LogEntity;", "equals", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LogEntity {
    public static final int $stable = 0;
    private final Integer httpStatusCode;
    private final int id;
    private final boolean isSuccess;
    private final String messageBody;
    private final String originalSender;
    private final Integer ruleId;
    private final Integer senderId;
    private final long timestamp;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRuleId() {
        return this.ruleId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSenderId() {
        return this.senderId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOriginalSender() {
        return this.originalSender;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMessageBody() {
        return this.messageBody;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final LogEntity copy(int id, Integer ruleId, Integer senderId, long timestamp, String originalSender, String messageBody, Integer httpStatusCode, boolean isSuccess) {
        Intrinsics.checkNotNullParameter(originalSender, "originalSender");
        Intrinsics.checkNotNullParameter(messageBody, "messageBody");
        return new LogEntity(id, ruleId, senderId, timestamp, originalSender, messageBody, httpStatusCode, isSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEntity)) {
            return false;
        }
        LogEntity logEntity = (LogEntity) other;
        return this.id == logEntity.id && Intrinsics.areEqual(this.ruleId, logEntity.ruleId) && Intrinsics.areEqual(this.senderId, logEntity.senderId) && this.timestamp == logEntity.timestamp && Intrinsics.areEqual(this.originalSender, logEntity.originalSender) && Intrinsics.areEqual(this.messageBody, logEntity.messageBody) && Intrinsics.areEqual(this.httpStatusCode, logEntity.httpStatusCode) && this.isSuccess == logEntity.isSuccess;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.id) * 31) + (this.ruleId == null ? 0 : this.ruleId.hashCode())) * 31) + (this.senderId == null ? 0 : this.senderId.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31) + this.originalSender.hashCode()) * 31) + this.messageBody.hashCode()) * 31) + (this.httpStatusCode != null ? this.httpStatusCode.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSuccess);
    }

    public String toString() {
        return "LogEntity(id=" + this.id + ", ruleId=" + this.ruleId + ", senderId=" + this.senderId + ", timestamp=" + this.timestamp + ", originalSender=" + this.originalSender + ", messageBody=" + this.messageBody + ", httpStatusCode=" + this.httpStatusCode + ", isSuccess=" + this.isSuccess + ')';
    }

    public LogEntity(int id, Integer ruleId, Integer senderId, long timestamp, String originalSender, String messageBody, Integer httpStatusCode, boolean isSuccess) {
        Intrinsics.checkNotNullParameter(originalSender, "originalSender");
        Intrinsics.checkNotNullParameter(messageBody, "messageBody");
        this.id = id;
        this.ruleId = ruleId;
        this.senderId = senderId;
        this.timestamp = timestamp;
        this.originalSender = originalSender;
        this.messageBody = messageBody;
        this.httpStatusCode = httpStatusCode;
        this.isSuccess = isSuccess;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LogEntity(int r12, java.lang.Integer r13, java.lang.Integer r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L7
            r0 = 0
            r2 = r0
            goto L8
        L7:
            r2 = r12
        L8:
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shohoj.smsforwarder.data.entities.LogEntity.<init>(int, java.lang.Integer, java.lang.Integer, long, java.lang.String, java.lang.String, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getRuleId() {
        return this.ruleId;
    }

    public final Integer getSenderId() {
        return this.senderId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getOriginalSender() {
        return this.originalSender;
    }

    public final String getMessageBody() {
        return this.messageBody;
    }

    public final Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
