package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        Object m5491constructorimpl;
        android.graphics.Typeface typeface;
        android.graphics.Typeface load;
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont.TypefaceLoader typefaceLoader = ((AndroidFont) font).getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.loadBlocking(context, (AndroidFont) font);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        if (FontLoadingStrategy.m4503equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m4508getBlockingPKNRLFQ())) {
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            typeface = AndroidFontLoader_androidKt.load((ResourceFont) font, context2);
        } else if (FontLoadingStrategy.m4503equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m4509getOptionalLocalPKNRLFQ())) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AndroidFontLoader $this$loadBlocking_u24lambda_u240 = this;
                Context context3 = $this$loadBlocking_u24lambda_u240.context;
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                load = AndroidFontLoader_androidKt.load((ResourceFont) font, context3);
                m5491constructorimpl = Result.m5491constructorimpl(load);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m5491constructorimpl = Result.m5491constructorimpl(ResultKt.createFailure(th));
            }
            typeface = (android.graphics.Typeface) (Result.m5497isFailureimpl(m5491constructorimpl) ? null : m5491constructorimpl);
        } else {
            if (FontLoadingStrategy.m4503equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m4507getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m4505toStringimpl(font.getLoadingStrategy())));
        }
        FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
        Context context4 = this.context;
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        return PlatformTypefacesKt.setFontVariationSettings(typeface, variationSettings, context4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font r8, kotlin.coroutines.Continuation<? super android.graphics.Typeface> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r7, r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            java.lang.String r3 = "context"
            switch(r2) {
                case 0: goto L43;
                case 1: goto L3e;
                case 2: goto L31;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            java.lang.Object r8 = r9.L$1
            androidx.compose.ui.text.font.Font r8 = (androidx.compose.ui.text.font.Font) r8
            java.lang.Object r1 = r9.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r1 = (androidx.compose.ui.text.font.AndroidFontLoader) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r4 = r0
            goto L81
        L3e:
            kotlin.ResultKt.throwOnFailure(r0)
            r8 = r0
            goto L65
        L43:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r7
            boolean r4 = r8 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r4 == 0) goto L66
            r4 = r8
            androidx.compose.ui.text.font.AndroidFont r4 = (androidx.compose.ui.text.font.AndroidFont) r4
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r4 = r4.getTypefaceLoader()
            android.content.Context r5 = r2.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r2 = r8
            androidx.compose.ui.text.font.AndroidFont r2 = (androidx.compose.ui.text.font.AndroidFont) r2
            r3 = 1
            r9.label = r3
            java.lang.Object r8 = r4.awaitLoad(r5, r2, r9)
            if (r8 != r1) goto L65
            return r1
        L65:
            return r8
        L66:
            boolean r4 = r8 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r4 == 0) goto L94
            r4 = r8
            androidx.compose.ui.text.font.ResourceFont r4 = (androidx.compose.ui.text.font.ResourceFont) r4
            android.content.Context r5 = r2.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r9.L$0 = r2
            r9.L$1 = r8
            r6 = 2
            r9.label = r6
            java.lang.Object r4 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r4, r5, r9)
            if (r4 != r1) goto L80
            return r1
        L80:
            r1 = r2
        L81:
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            r2 = r8
            androidx.compose.ui.text.font.ResourceFont r2 = (androidx.compose.ui.text.font.ResourceFont) r2
            androidx.compose.ui.text.font.FontVariation$Settings r2 = r2.getVariationSettings()
            android.content.Context r5 = r1.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            android.graphics.Typeface r2 = androidx.compose.ui.text.font.PlatformTypefacesKt.setFontVariationSettings(r4, r2, r5)
            return r2
        L94:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown font type: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
