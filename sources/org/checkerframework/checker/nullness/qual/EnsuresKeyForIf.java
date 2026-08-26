package org.checkerframework.checker.nullness.qual;

import com.google.firebase.firestore.model.Values;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.ConditionalPostconditionAnnotation;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.JavaExpression;
import org.checkerframework.framework.qual.QualifierArgument;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@InheritedAnnotation
@ConditionalPostconditionAnnotation(qualifier = KeyFor.class)
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes14.dex */
public @interface EnsuresKeyForIf {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InheritedAnnotation
    @ConditionalPostconditionAnnotation(qualifier = KeyFor.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes14.dex */
    public @interface List {
        EnsuresKeyForIf[] value();
    }

    String[] expression();

    @QualifierArgument(Values.VECTOR_MAP_VECTORS_KEY)
    @JavaExpression
    String[] map();

    boolean result();
}
