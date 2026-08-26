package androidx.datastore.preferences.protobuf;

/* loaded from: classes11.dex */
final class NewInstanceSchemas {
    private static final NewInstanceSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final NewInstanceSchema LITE_SCHEMA = new NewInstanceSchemaLite();

    NewInstanceSchemas() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NewInstanceSchema full() {
        return FULL_SCHEMA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NewInstanceSchema lite() {
        return LITE_SCHEMA;
    }

    private static NewInstanceSchema loadSchemaForFullRuntime() {
        try {
            Class<?> clazz = Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull");
            return (NewInstanceSchema) clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
