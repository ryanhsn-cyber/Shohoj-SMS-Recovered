package com.shohoj.smsforwarder.data.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectedSiteEntity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/shohoj/smsforwarder/data/entities/ConnectedSiteEntity;", "", "id", "", "siteName", "", "connectedAt", "", "(ILjava/lang/String;J)V", "getConnectedAt", "()J", "getId", "()I", "getSiteName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConnectedSiteEntity {
    public static final int $stable = 0;
    private final long connectedAt;
    private final int id;
    private final String siteName;

    public static /* synthetic */ ConnectedSiteEntity copy$default(ConnectedSiteEntity connectedSiteEntity, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = connectedSiteEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = connectedSiteEntity.siteName;
        }
        if ((i2 & 4) != 0) {
            j = connectedSiteEntity.connectedAt;
        }
        return connectedSiteEntity.copy(i, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSiteName() {
        return this.siteName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getConnectedAt() {
        return this.connectedAt;
    }

    public final ConnectedSiteEntity copy(int id, String siteName, long connectedAt) {
        Intrinsics.checkNotNullParameter(siteName, "siteName");
        return new ConnectedSiteEntity(id, siteName, connectedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedSiteEntity)) {
            return false;
        }
        ConnectedSiteEntity connectedSiteEntity = (ConnectedSiteEntity) other;
        return this.id == connectedSiteEntity.id && Intrinsics.areEqual(this.siteName, connectedSiteEntity.siteName) && this.connectedAt == connectedSiteEntity.connectedAt;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.siteName.hashCode()) * 31) + Long.hashCode(this.connectedAt);
    }

    public String toString() {
        return "ConnectedSiteEntity(id=" + this.id + ", siteName=" + this.siteName + ", connectedAt=" + this.connectedAt + ')';
    }

    public ConnectedSiteEntity(int id, String siteName, long connectedAt) {
        Intrinsics.checkNotNullParameter(siteName, "siteName");
        this.id = id;
        this.siteName = siteName;
        this.connectedAt = connectedAt;
    }

    public /* synthetic */ ConnectedSiteEntity(int i, String str, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final int getId() {
        return this.id;
    }

    public final String getSiteName() {
        return this.siteName;
    }

    public final long getConnectedAt() {
        return this.connectedAt;
    }
}
