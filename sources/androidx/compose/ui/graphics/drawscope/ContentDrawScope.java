package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentDrawScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m3135drawImageAZ2fEMs(ContentDrawScope $this, ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            ContentDrawScope.super.mo3092drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3136getCenterF1C5BW0(ContentDrawScope $this) {
            return ContentDrawScope.super.mo3185getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3137getSizeNHjbRc(ContentDrawScope $this) {
            return ContentDrawScope.super.mo3186getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3138roundToPxR2X_6o(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.super.mo320roundToPxR2X_6o($receiver);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3139roundToPx0680j_4(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.super.mo321roundToPx0680j_4($receiver);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3140toDpGaN1DYA(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.super.mo322toDpGaN1DYA($receiver);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3141toDpu2uoSUM(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.super.mo323toDpu2uoSUM($receiver);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3142toDpu2uoSUM(ContentDrawScope $this, int $receiver) {
            return ContentDrawScope.super.mo324toDpu2uoSUM($receiver);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3143toDpSizekrfVVM(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.super.mo325toDpSizekrfVVM($receiver);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3144toPxR2X_6o(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.super.mo326toPxR2X_6o($receiver);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3145toPx0680j_4(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.super.mo327toPx0680j_4($receiver);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope $this, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return ContentDrawScope.super.toRect(receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3146toSizeXkaWNTQ(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.super.mo328toSizeXkaWNTQ($receiver);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3147toSp0xMU5do(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.super.mo329toSp0xMU5do($receiver);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3148toSpkPz2Gy4(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.super.mo330toSpkPz2Gy4($receiver);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3149toSpkPz2Gy4(ContentDrawScope $this, int $receiver) {
            return ContentDrawScope.super.mo331toSpkPz2Gy4($receiver);
        }
    }
}
