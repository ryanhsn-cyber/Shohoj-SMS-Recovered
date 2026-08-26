package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* loaded from: classes11.dex */
public abstract class zzce implements InvocationHandler {
    private final Object zza;

    public zzce(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (!Intrinsics.areEqual(method.getName(), "toString") || method.getParameterTypes().length != 0) {
            if (!Intrinsics.areEqual(method.getName(), "hashCode") || method.getParameterTypes().length != 0) {
                if (!Intrinsics.areEqual(method.getName(), "equals") || method.getParameterTypes().length == 0) {
                    if (!zza(obj, method, objArr)) {
                        return Unit.INSTANCE;
                    }
                    if ((this.zza == null && Intrinsics.areEqual(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && Intrinsics.areEqual(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
                        Object obj3 = this.zza;
                        if (obj3 == null) {
                            return Unit.INSTANCE;
                        }
                        return obj3;
                    }
                    throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
                }
                boolean z = false;
                if (objArr != null && objArr.length != 0) {
                    Object obj4 = objArr[0];
                    if ((obj4 != null ? obj4.hashCode() : 0) == obj.hashCode()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
            return Integer.valueOf(System.identityHashCode(obj));
        }
        return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
