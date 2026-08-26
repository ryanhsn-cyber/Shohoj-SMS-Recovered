package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext $this$asDrawTransform) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo3116getSizeNHjbRc() {
                return DrawContext.this.mo3111getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo3115getCenterF1C5BW0() {
                return SizeKt.m2482getCenteruvyYCjk(mo3116getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                Canvas it = DrawContext.this.getCanvas();
                DrawContext drawContext = DrawContext.this;
                long updatedSize = SizeKt.Size(Size.m2472getWidthimpl(mo3116getSizeNHjbRc()) - (left + right), Size.m2469getHeightimpl(mo3116getSizeNHjbRc()) - (top + bottom));
                if (!(Size.m2472getWidthimpl(updatedSize) >= 0.0f && Size.m2469getHeightimpl(updatedSize) >= 0.0f)) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext.mo3112setSizeuvyYCjk(updatedSize);
                it.translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo3114clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                DrawContext.this.getCanvas().mo2498clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo3113clipPathmtrdDE(Path path, int clipOp) {
                Intrinsics.checkNotNullParameter(path, "path");
                DrawContext.this.getCanvas().mo2497clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                DrawContext.this.getCanvas().translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo3117rotateUv8p0NA(float degrees, long pivot) {
                Canvas $this$rotate_Uv8p0NA_u24lambda_u242 = DrawContext.this.getCanvas();
                $this$rotate_Uv8p0NA_u24lambda_u242.translate(Offset.m2403getXimpl(pivot), Offset.m2404getYimpl(pivot));
                $this$rotate_Uv8p0NA_u24lambda_u242.rotate(degrees);
                $this$rotate_Uv8p0NA_u24lambda_u242.translate(-Offset.m2403getXimpl(pivot), -Offset.m2404getYimpl(pivot));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo3118scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas $this$scale_0AR0LA0_u24lambda_u243 = DrawContext.this.getCanvas();
                $this$scale_0AR0LA0_u24lambda_u243.translate(Offset.m2403getXimpl(pivot), Offset.m2404getYimpl(pivot));
                $this$scale_0AR0LA0_u24lambda_u243.scale(scaleX, scaleY);
                $this$scale_0AR0LA0_u24lambda_u243.translate(-Offset.m2403getXimpl(pivot), -Offset.m2404getYimpl(pivot));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo3119transform58bKbWc(float[] matrix) {
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                DrawContext.this.getCanvas().mo2499concat58bKbWc(matrix);
            }
        };
    }
}
