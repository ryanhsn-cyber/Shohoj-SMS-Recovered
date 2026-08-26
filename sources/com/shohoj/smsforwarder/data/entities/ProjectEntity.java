package com.shohoj.smsforwarder.data.entities;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProjectEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, d2 = {"Lcom/shohoj/smsforwarder/data/entities/ProjectEntity;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "referenceKeyword", "autoApprove", "", "webhookUrl", "successKeyword", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAutoApprove", "()Z", "getId", "()I", "getName", "()Ljava/lang/String;", "getReferenceKeyword", "getSuccessKeyword", "getWebhookUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProjectEntity {
    public static final int $stable = 0;
    private final boolean autoApprove;
    private final int id;
    private final String name;
    private final String referenceKeyword;
    private final String successKeyword;
    private final String webhookUrl;

    public static /* synthetic */ ProjectEntity copy$default(ProjectEntity projectEntity, int i, String str, String str2, boolean z, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = projectEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = projectEntity.name;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = projectEntity.referenceKeyword;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            z = projectEntity.autoApprove;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = projectEntity.webhookUrl;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = projectEntity.successKeyword;
        }
        return projectEntity.copy(i, str5, str6, z2, str7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReferenceKeyword() {
        return this.referenceKeyword;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAutoApprove() {
        return this.autoApprove;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWebhookUrl() {
        return this.webhookUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSuccessKeyword() {
        return this.successKeyword;
    }

    public final ProjectEntity copy(int id, String name, String referenceKeyword, boolean autoApprove, String webhookUrl, String successKeyword) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(referenceKeyword, "referenceKeyword");
        Intrinsics.checkNotNullParameter(webhookUrl, "webhookUrl");
        Intrinsics.checkNotNullParameter(successKeyword, "successKeyword");
        return new ProjectEntity(id, name, referenceKeyword, autoApprove, webhookUrl, successKeyword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectEntity)) {
            return false;
        }
        ProjectEntity projectEntity = (ProjectEntity) other;
        return this.id == projectEntity.id && Intrinsics.areEqual(this.name, projectEntity.name) && Intrinsics.areEqual(this.referenceKeyword, projectEntity.referenceKeyword) && this.autoApprove == projectEntity.autoApprove && Intrinsics.areEqual(this.webhookUrl, projectEntity.webhookUrl) && Intrinsics.areEqual(this.successKeyword, projectEntity.successKeyword);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.referenceKeyword.hashCode()) * 31) + Boolean.hashCode(this.autoApprove)) * 31) + this.webhookUrl.hashCode()) * 31) + this.successKeyword.hashCode();
    }

    public String toString() {
        return "ProjectEntity(id=" + this.id + ", name=" + this.name + ", referenceKeyword=" + this.referenceKeyword + ", autoApprove=" + this.autoApprove + ", webhookUrl=" + this.webhookUrl + ", successKeyword=" + this.successKeyword + ')';
    }

    public ProjectEntity(int id, String name, String referenceKeyword, boolean autoApprove, String webhookUrl, String successKeyword) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(referenceKeyword, "referenceKeyword");
        Intrinsics.checkNotNullParameter(webhookUrl, "webhookUrl");
        Intrinsics.checkNotNullParameter(successKeyword, "successKeyword");
        this.id = id;
        this.name = name;
        this.referenceKeyword = referenceKeyword;
        this.autoApprove = autoApprove;
        this.webhookUrl = webhookUrl;
        this.successKeyword = successKeyword;
    }

    public /* synthetic */ ProjectEntity(int i, String str, String str2, boolean z, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReferenceKeyword() {
        return this.referenceKeyword;
    }

    public final boolean getAutoApprove() {
        return this.autoApprove;
    }

    public final String getWebhookUrl() {
        return this.webhookUrl;
    }

    public final String getSuccessKeyword() {
        return this.successKeyword;
    }
}
