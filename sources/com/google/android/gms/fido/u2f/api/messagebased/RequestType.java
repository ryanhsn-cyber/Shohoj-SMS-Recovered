package com.google.android.gms.fido.u2f.api.messagebased;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
@Deprecated
/* loaded from: classes11.dex */
public enum RequestType {
    REGISTER("u2f_register_request"),
    SIGN("u2f_sign_request");

    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
    /* loaded from: classes11.dex */
    public static class UnsupportedRequestTypeException extends Exception {
        public UnsupportedRequestTypeException(String value) {
            super("Unsupported request type ".concat(String.valueOf(value)));
        }
    }

    RequestType(String str) {
        this.zzb = str;
    }

    public static RequestType fromString(String value) throws UnsupportedRequestTypeException {
        for (RequestType requestType : values()) {
            if (value.equals(requestType.zzb)) {
                return requestType;
            }
        }
        throw new UnsupportedRequestTypeException(value);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }
}
