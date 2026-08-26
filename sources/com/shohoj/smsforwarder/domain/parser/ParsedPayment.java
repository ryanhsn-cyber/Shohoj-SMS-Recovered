package com.shohoj.smsforwarder.domain.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SmsPaymentParser.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/shohoj/smsforwarder/domain/parser/ParsedPayment;", "", "trxId", "", "amount", "customerNumber", "reference", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCustomerNumber", "getReference", "getTrxId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ParsedPayment {
    public static final int $stable = 0;
    private final String amount;
    private final String customerNumber;
    private final String reference;
    private final String trxId;

    public static /* synthetic */ ParsedPayment copy$default(ParsedPayment parsedPayment, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedPayment.trxId;
        }
        if ((i & 2) != 0) {
            str2 = parsedPayment.amount;
        }
        if ((i & 4) != 0) {
            str3 = parsedPayment.customerNumber;
        }
        if ((i & 8) != 0) {
            str4 = parsedPayment.reference;
        }
        return parsedPayment.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTrxId() {
        return this.trxId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    public final ParsedPayment copy(String trxId, String amount, String customerNumber, String reference) {
        Intrinsics.checkNotNullParameter(trxId, "trxId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(reference, "reference");
        return new ParsedPayment(trxId, amount, customerNumber, reference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedPayment)) {
            return false;
        }
        ParsedPayment parsedPayment = (ParsedPayment) other;
        return Intrinsics.areEqual(this.trxId, parsedPayment.trxId) && Intrinsics.areEqual(this.amount, parsedPayment.amount) && Intrinsics.areEqual(this.customerNumber, parsedPayment.customerNumber) && Intrinsics.areEqual(this.reference, parsedPayment.reference);
    }

    public int hashCode() {
        return (((((this.trxId.hashCode() * 31) + this.amount.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.reference.hashCode();
    }

    public String toString() {
        return "ParsedPayment(trxId=" + this.trxId + ", amount=" + this.amount + ", customerNumber=" + this.customerNumber + ", reference=" + this.reference + ')';
    }

    public ParsedPayment(String trxId, String amount, String customerNumber, String reference) {
        Intrinsics.checkNotNullParameter(trxId, "trxId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.trxId = trxId;
        this.amount = amount;
        this.customerNumber = customerNumber;
        this.reference = reference;
    }

    public final String getTrxId() {
        return this.trxId;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    public final String getReference() {
        return this.reference;
    }
}
