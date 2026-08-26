package com.shohoj.smsforwarder.data.entities;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuleEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\u0013\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019¨\u00064"}, d2 = {"Lcom/shohoj/smsforwarder/data/entities/RuleEntity;", "", "id", "", "senderId", HintConstants.AUTOFILL_HINT_NAME, "", "simSlot", "matchField", "matchLogic", "matchValue", "isEnabled", "", "useGlobalTemplate", "useRegularReplacement", "disablePeriodStart", "disablePeriodEnd", "disableDays", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisableDays", "()Ljava/lang/String;", "getDisablePeriodEnd", "getDisablePeriodStart", "getId", "()I", "()Z", "getMatchField", "getMatchLogic", "getMatchValue", "getName", "getSenderId", "getSimSlot", "getUseGlobalTemplate", "getUseRegularReplacement", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RuleEntity {
    public static final int $stable = 0;
    private final String disableDays;
    private final String disablePeriodEnd;
    private final String disablePeriodStart;
    private final int id;
    private final boolean isEnabled;
    private final String matchField;
    private final String matchLogic;
    private final String matchValue;
    private final String name;
    private final int senderId;
    private final String simSlot;
    private final boolean useGlobalTemplate;
    private final boolean useRegularReplacement;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getUseRegularReplacement() {
        return this.useRegularReplacement;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDisablePeriodStart() {
        return this.disablePeriodStart;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDisablePeriodEnd() {
        return this.disablePeriodEnd;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDisableDays() {
        return this.disableDays;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSenderId() {
        return this.senderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSimSlot() {
        return this.simSlot;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMatchField() {
        return this.matchField;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMatchLogic() {
        return this.matchLogic;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMatchValue() {
        return this.matchValue;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getUseGlobalTemplate() {
        return this.useGlobalTemplate;
    }

    public final RuleEntity copy(int id, int senderId, String name, String simSlot, String matchField, String matchLogic, String matchValue, boolean isEnabled, boolean useGlobalTemplate, boolean useRegularReplacement, String disablePeriodStart, String disablePeriodEnd, String disableDays) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(simSlot, "simSlot");
        Intrinsics.checkNotNullParameter(matchField, "matchField");
        Intrinsics.checkNotNullParameter(matchLogic, "matchLogic");
        Intrinsics.checkNotNullParameter(matchValue, "matchValue");
        Intrinsics.checkNotNullParameter(disablePeriodStart, "disablePeriodStart");
        Intrinsics.checkNotNullParameter(disablePeriodEnd, "disablePeriodEnd");
        Intrinsics.checkNotNullParameter(disableDays, "disableDays");
        return new RuleEntity(id, senderId, name, simSlot, matchField, matchLogic, matchValue, isEnabled, useGlobalTemplate, useRegularReplacement, disablePeriodStart, disablePeriodEnd, disableDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuleEntity)) {
            return false;
        }
        RuleEntity ruleEntity = (RuleEntity) other;
        return this.id == ruleEntity.id && this.senderId == ruleEntity.senderId && Intrinsics.areEqual(this.name, ruleEntity.name) && Intrinsics.areEqual(this.simSlot, ruleEntity.simSlot) && Intrinsics.areEqual(this.matchField, ruleEntity.matchField) && Intrinsics.areEqual(this.matchLogic, ruleEntity.matchLogic) && Intrinsics.areEqual(this.matchValue, ruleEntity.matchValue) && this.isEnabled == ruleEntity.isEnabled && this.useGlobalTemplate == ruleEntity.useGlobalTemplate && this.useRegularReplacement == ruleEntity.useRegularReplacement && Intrinsics.areEqual(this.disablePeriodStart, ruleEntity.disablePeriodStart) && Intrinsics.areEqual(this.disablePeriodEnd, ruleEntity.disablePeriodEnd) && Intrinsics.areEqual(this.disableDays, ruleEntity.disableDays);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.senderId)) * 31) + this.name.hashCode()) * 31) + this.simSlot.hashCode()) * 31) + this.matchField.hashCode()) * 31) + this.matchLogic.hashCode()) * 31) + this.matchValue.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.useGlobalTemplate)) * 31) + Boolean.hashCode(this.useRegularReplacement)) * 31) + this.disablePeriodStart.hashCode()) * 31) + this.disablePeriodEnd.hashCode()) * 31) + this.disableDays.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RuleEntity(id=").append(this.id).append(", senderId=").append(this.senderId).append(", name=").append(this.name).append(", simSlot=").append(this.simSlot).append(", matchField=").append(this.matchField).append(", matchLogic=").append(this.matchLogic).append(", matchValue=").append(this.matchValue).append(", isEnabled=").append(this.isEnabled).append(", useGlobalTemplate=").append(this.useGlobalTemplate).append(", useRegularReplacement=").append(this.useRegularReplacement).append(", disablePeriodStart=").append(this.disablePeriodStart).append(", disablePeriodEnd=");
        sb.append(this.disablePeriodEnd).append(", disableDays=").append(this.disableDays).append(')');
        return sb.toString();
    }

    public RuleEntity(int id, int senderId, String name, String simSlot, String matchField, String matchLogic, String matchValue, boolean isEnabled, boolean useGlobalTemplate, boolean useRegularReplacement, String disablePeriodStart, String disablePeriodEnd, String disableDays) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(simSlot, "simSlot");
        Intrinsics.checkNotNullParameter(matchField, "matchField");
        Intrinsics.checkNotNullParameter(matchLogic, "matchLogic");
        Intrinsics.checkNotNullParameter(matchValue, "matchValue");
        Intrinsics.checkNotNullParameter(disablePeriodStart, "disablePeriodStart");
        Intrinsics.checkNotNullParameter(disablePeriodEnd, "disablePeriodEnd");
        Intrinsics.checkNotNullParameter(disableDays, "disableDays");
        this.id = id;
        this.senderId = senderId;
        this.name = name;
        this.simSlot = simSlot;
        this.matchField = matchField;
        this.matchLogic = matchLogic;
        this.matchValue = matchValue;
        this.isEnabled = isEnabled;
        this.useGlobalTemplate = useGlobalTemplate;
        this.useRegularReplacement = useRegularReplacement;
        this.disablePeriodStart = disablePeriodStart;
        this.disablePeriodEnd = disablePeriodEnd;
        this.disableDays = disableDays;
    }

    public /* synthetic */ RuleEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, i2, str, str2, str3, str4, str5, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? "" : str6, (i3 & 2048) != 0 ? "" : str7, (i3 & 4096) != 0 ? "" : str8);
    }

    public final int getId() {
        return this.id;
    }

    public final int getSenderId() {
        return this.senderId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSimSlot() {
        return this.simSlot;
    }

    public final String getMatchField() {
        return this.matchField;
    }

    public final String getMatchLogic() {
        return this.matchLogic;
    }

    public final String getMatchValue() {
        return this.matchValue;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean getUseGlobalTemplate() {
        return this.useGlobalTemplate;
    }

    public final boolean getUseRegularReplacement() {
        return this.useRegularReplacement;
    }

    public final String getDisablePeriodStart() {
        return this.disablePeriodStart;
    }

    public final String getDisablePeriodEnd() {
        return this.disablePeriodEnd;
    }

    public final String getDisableDays() {
        return this.disableDays;
    }
}
