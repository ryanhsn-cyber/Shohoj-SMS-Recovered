package com.shohoj.smsforwarder.ui.screens;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeaturesScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/shohoj/smsforwarder/ui/screens/FeatureItem;", "", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "route", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getRoute", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FeatureItem {
    public static final int $stable = 0;
    private final ImageVector icon;
    private final String route;
    private final String title;

    public static /* synthetic */ FeatureItem copy$default(FeatureItem featureItem, String str, ImageVector imageVector, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featureItem.title;
        }
        if ((i & 2) != 0) {
            imageVector = featureItem.icon;
        }
        if ((i & 4) != 0) {
            str2 = featureItem.route;
        }
        return featureItem.copy(str, imageVector, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageVector getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final FeatureItem copy(String title, ImageVector icon, String route) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(route, "route");
        return new FeatureItem(title, icon, route);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureItem)) {
            return false;
        }
        FeatureItem featureItem = (FeatureItem) other;
        return Intrinsics.areEqual(this.title, featureItem.title) && Intrinsics.areEqual(this.icon, featureItem.icon) && Intrinsics.areEqual(this.route, featureItem.route);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.icon.hashCode()) * 31) + this.route.hashCode();
    }

    public String toString() {
        return "FeatureItem(title=" + this.title + ", icon=" + this.icon + ", route=" + this.route + ')';
    }

    public FeatureItem(String title, ImageVector icon, String route) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(route, "route");
        this.title = title;
        this.icon = icon;
        this.route = route;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final String getRoute() {
        return this.route;
    }
}
