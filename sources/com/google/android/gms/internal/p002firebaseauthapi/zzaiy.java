package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public enum zzaiy {
    DOUBLE(0, zzaja.SCALAR, zzajm.DOUBLE),
    FLOAT(1, zzaja.SCALAR, zzajm.FLOAT),
    INT64(2, zzaja.SCALAR, zzajm.LONG),
    UINT64(3, zzaja.SCALAR, zzajm.LONG),
    INT32(4, zzaja.SCALAR, zzajm.INT),
    FIXED64(5, zzaja.SCALAR, zzajm.LONG),
    FIXED32(6, zzaja.SCALAR, zzajm.INT),
    BOOL(7, zzaja.SCALAR, zzajm.BOOLEAN),
    STRING(8, zzaja.SCALAR, zzajm.STRING),
    MESSAGE(9, zzaja.SCALAR, zzajm.MESSAGE),
    BYTES(10, zzaja.SCALAR, zzajm.BYTE_STRING),
    UINT32(11, zzaja.SCALAR, zzajm.INT),
    ENUM(12, zzaja.SCALAR, zzajm.ENUM),
    SFIXED32(13, zzaja.SCALAR, zzajm.INT),
    SFIXED64(14, zzaja.SCALAR, zzajm.LONG),
    SINT32(15, zzaja.SCALAR, zzajm.INT),
    SINT64(16, zzaja.SCALAR, zzajm.LONG),
    GROUP(17, zzaja.SCALAR, zzajm.MESSAGE),
    DOUBLE_LIST(18, zzaja.VECTOR, zzajm.DOUBLE),
    FLOAT_LIST(19, zzaja.VECTOR, zzajm.FLOAT),
    INT64_LIST(20, zzaja.VECTOR, zzajm.LONG),
    UINT64_LIST(21, zzaja.VECTOR, zzajm.LONG),
    INT32_LIST(22, zzaja.VECTOR, zzajm.INT),
    FIXED64_LIST(23, zzaja.VECTOR, zzajm.LONG),
    FIXED32_LIST(24, zzaja.VECTOR, zzajm.INT),
    BOOL_LIST(25, zzaja.VECTOR, zzajm.BOOLEAN),
    STRING_LIST(26, zzaja.VECTOR, zzajm.STRING),
    MESSAGE_LIST(27, zzaja.VECTOR, zzajm.MESSAGE),
    BYTES_LIST(28, zzaja.VECTOR, zzajm.BYTE_STRING),
    UINT32_LIST(29, zzaja.VECTOR, zzajm.INT),
    ENUM_LIST(30, zzaja.VECTOR, zzajm.ENUM),
    SFIXED32_LIST(31, zzaja.VECTOR, zzajm.INT),
    SFIXED64_LIST(32, zzaja.VECTOR, zzajm.LONG),
    SINT32_LIST(33, zzaja.VECTOR, zzajm.INT),
    SINT64_LIST(34, zzaja.VECTOR, zzajm.LONG),
    DOUBLE_LIST_PACKED(35, zzaja.PACKED_VECTOR, zzajm.DOUBLE),
    FLOAT_LIST_PACKED(36, zzaja.PACKED_VECTOR, zzajm.FLOAT),
    INT64_LIST_PACKED(37, zzaja.PACKED_VECTOR, zzajm.LONG),
    UINT64_LIST_PACKED(38, zzaja.PACKED_VECTOR, zzajm.LONG),
    INT32_LIST_PACKED(39, zzaja.PACKED_VECTOR, zzajm.INT),
    FIXED64_LIST_PACKED(40, zzaja.PACKED_VECTOR, zzajm.LONG),
    FIXED32_LIST_PACKED(41, zzaja.PACKED_VECTOR, zzajm.INT),
    BOOL_LIST_PACKED(42, zzaja.PACKED_VECTOR, zzajm.BOOLEAN),
    UINT32_LIST_PACKED(43, zzaja.PACKED_VECTOR, zzajm.INT),
    ENUM_LIST_PACKED(44, zzaja.PACKED_VECTOR, zzajm.ENUM),
    SFIXED32_LIST_PACKED(45, zzaja.PACKED_VECTOR, zzajm.INT),
    SFIXED64_LIST_PACKED(46, zzaja.PACKED_VECTOR, zzajm.LONG),
    SINT32_LIST_PACKED(47, zzaja.PACKED_VECTOR, zzajm.INT),
    SINT64_LIST_PACKED(48, zzaja.PACKED_VECTOR, zzajm.LONG),
    GROUP_LIST(49, zzaja.VECTOR, zzajm.MESSAGE),
    MAP(50, zzaja.MAP, zzajm.VOID);

    private static final zzaiy[] zzaz;
    private static final Type[] zzba = new Type[0];
    private final zzajm zzbc;
    private final int zzbd;
    private final zzaja zzbe;
    private final Class<?> zzbf;
    private final boolean zzbg;

    public final int zza() {
        return this.zzbd;
    }

    static {
        zzaiy[] values = values();
        zzaz = new zzaiy[values.length];
        for (zzaiy zzaiyVar : values) {
            zzaz[zzaiyVar.zzbd] = zzaiyVar;
        }
    }

    zzaiy(int i, zzaja zzajaVar, zzajm zzajmVar) {
        boolean z;
        this.zzbd = i;
        this.zzbe = zzajaVar;
        this.zzbc = zzajmVar;
        switch (zzajaVar.ordinal()) {
            case 1:
                this.zzbf = zzajmVar.zza();
                break;
            case 2:
            default:
                this.zzbf = null;
                break;
            case 3:
                this.zzbf = zzajmVar.zza();
                break;
        }
        if (zzajaVar == zzaja.SCALAR) {
            switch (zzajmVar) {
                case BYTE_STRING:
                case MESSAGE:
                case STRING:
                    break;
                default:
                    z = true;
                    break;
            }
            this.zzbg = z;
        }
        z = false;
        this.zzbg = z;
    }
}
