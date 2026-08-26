package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes11.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final String[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    public static AuthenticatorAttestationResponse deserializeFromBytes(byte[] serializedBytes) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(serializedBytes, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.zza, authenticatorAttestationResponse.zza) && Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) && Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public byte[] getAttestationObject() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza;
    }

    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        com.google.android.gms.internal.fido.zzam zza = com.google.android.gms.internal.fido.zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.zza;
        zza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.zzb;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.zzc;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(dest);
        SafeParcelWriter.writeByteArray(dest, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(dest, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(dest, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(dest, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(dest, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01e8 A[Catch: JSONException -> 0x023f, TRY_LEAVE, TryCatch #6 {JSONException -> 0x023f, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0014, B:8:0x0018, B:9:0x0021, B:10:0x0028, B:12:0x002d, B:14:0x003b, B:16:0x0048, B:17:0x0041, B:20:0x004b, B:22:0x0052, B:24:0x005a, B:26:0x006c, B:27:0x0074, B:29:0x0078, B:31:0x008a, B:33:0x00a8, B:34:0x00c0, B:39:0x00e6, B:45:0x01d4, B:47:0x01e8, B:50:0x0106, B:52:0x0118, B:57:0x012c, B:60:0x014e, B:62:0x0164, B:64:0x016a, B:65:0x0181, B:66:0x0186, B:67:0x0187, B:68:0x018c, B:73:0x0197, B:75:0x01a7, B:77:0x01b5, B:78:0x01c8, B:79:0x01cd, B:80:0x01ce, B:81:0x01d3, B:82:0x01f2, B:83:0x01f7, B:85:0x01f9, B:86:0x0200, B:87:0x0201, B:88:0x0206, B:92:0x020a, B:93:0x0211, B:95:0x0212, B:96:0x0219, B:98:0x021b, B:99:0x0222, B:100:0x0223, B:101:0x022a, B:103:0x022c, B:104:0x0233, B:108:0x0237, B:109:0x023e), top: B:2:0x0002, inners: #3, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject zza() {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.zza():org.json.JSONObject");
    }
}
