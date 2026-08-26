package com.shohoj.smsforwarder.domain;

import com.shohoj.smsforwarder.data.entities.RuleEntity;
import com.shohoj.smsforwarder.data.entities.SenderEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/shohoj/smsforwarder/domain/ExportData;", "", "senders", "", "Lcom/shohoj/smsforwarder/data/entities/SenderEntity;", "rules", "Lcom/shohoj/smsforwarder/data/entities/RuleEntity;", "(Ljava/util/List;Ljava/util/List;)V", "getRules", "()Ljava/util/List;", "getSenders", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ExportData {
    public static final int $stable = 8;
    private final List<RuleEntity> rules;
    private final List<SenderEntity> senders;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExportData copy$default(ExportData exportData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = exportData.senders;
        }
        if ((i & 2) != 0) {
            list2 = exportData.rules;
        }
        return exportData.copy(list, list2);
    }

    public final List<SenderEntity> component1() {
        return this.senders;
    }

    public final List<RuleEntity> component2() {
        return this.rules;
    }

    public final ExportData copy(List<SenderEntity> senders, List<RuleEntity> rules) {
        Intrinsics.checkNotNullParameter(senders, "senders");
        Intrinsics.checkNotNullParameter(rules, "rules");
        return new ExportData(senders, rules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExportData)) {
            return false;
        }
        ExportData exportData = (ExportData) other;
        return Intrinsics.areEqual(this.senders, exportData.senders) && Intrinsics.areEqual(this.rules, exportData.rules);
    }

    public int hashCode() {
        return (this.senders.hashCode() * 31) + this.rules.hashCode();
    }

    public String toString() {
        return "ExportData(senders=" + this.senders + ", rules=" + this.rules + ')';
    }

    public ExportData(List<SenderEntity> senders, List<RuleEntity> rules) {
        Intrinsics.checkNotNullParameter(senders, "senders");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.senders = senders;
        this.rules = rules;
    }

    public final List<SenderEntity> getSenders() {
        return this.senders;
    }

    public final List<RuleEntity> getRules() {
        return this.rules;
    }
}
