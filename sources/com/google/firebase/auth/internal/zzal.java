package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.compose.material3.MenuKt;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.api.Service;
import com.google.firebase.FirebaseError;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.zxing.client.android.Intents;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes12.dex */
public final class zzal {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Status zza(String str, String str2) {
        char c;
        int i;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c = Typography.greater;
                    break;
                }
                c = 65535;
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c = Typography.less;
                    break;
                }
                c = 65535;
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -595928767:
                if (str.equals(Intents.Scan.TIMEOUT)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c = Typography.quote;
                    break;
                }
                c = 65535;
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                i = FirebaseError.ERROR_NO_SUCH_PROVIDER;
                break;
            case 1:
                i = FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH;
                break;
            case 2:
                i = FirebaseError.ERROR_INVALID_CUSTOM_TOKEN;
                break;
            case 3:
            case 4:
            case 5:
                i = FirebaseError.ERROR_INVALID_CREDENTIAL;
                break;
            case 6:
                i = FirebaseError.ERROR_USER_DISABLED;
                break;
            case 7:
            case '\b':
                i = FirebaseError.ERROR_INVALID_EMAIL;
                break;
            case '\t':
            case '\n':
                i = FirebaseError.ERROR_USER_NOT_FOUND;
                break;
            case 11:
                i = FirebaseError.ERROR_EMAIL_ALREADY_IN_USE;
                break;
            case '\f':
                i = FirebaseError.ERROR_WRONG_PASSWORD;
                break;
            case '\r':
                i = FirebaseError.ERROR_CREDENTIAL_ALREADY_IN_USE;
                break;
            case 14:
                i = FirebaseError.ERROR_INVALID_USER_TOKEN;
                break;
            case 15:
            case 16:
                i = FirebaseError.ERROR_NETWORK_REQUEST_FAILED;
                break;
            case 17:
                i = FirebaseError.ERROR_WEAK_PASSWORD;
                break;
            case 18:
            case 19:
                i = FirebaseError.ERROR_OPERATION_NOT_ALLOWED;
                break;
            case 20:
                i = FirebaseError.ERROR_APP_NOT_AUTHORIZED;
                break;
            case 21:
                i = FirebaseError.ERROR_REQUIRES_RECENT_LOGIN;
                break;
            case 22:
            case 23:
                i = FirebaseError.ERROR_TOO_MANY_REQUESTS;
                break;
            case 24:
                i = FirebaseError.ERROR_USER_TOKEN_EXPIRED;
                break;
            case 25:
                i = 17030;
                break;
            case 26:
                i = 17029;
                break;
            case 27:
                i = 17031;
                break;
            case 28:
                i = 17032;
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                i = 17033;
                break;
            case 30:
                i = 17034;
                break;
            case 31:
                i = 17035;
                break;
            case ' ':
                i = 17041;
                break;
            case '!':
                i = 17042;
                break;
            case '\"':
                i = 17043;
                break;
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                i = 17044;
                break;
            case '$':
                i = 17045;
                break;
            case '%':
                i = 17046;
                break;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                i = 17049;
                break;
            case '\'':
                i = 17051;
                break;
            case '(':
                i = 17052;
                break;
            case ')':
                i = 17064;
                break;
            case '*':
                i = 17061;
                break;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                i = 17062;
                break;
            case ',':
                i = 17065;
                break;
            case '-':
                i = 17038;
                break;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                i = 17040;
                break;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                i = 17068;
                break;
            case '0':
                i = 17071;
                break;
            case '1':
                i = 17057;
                break;
            case '2':
                i = 17058;
                break;
            case '3':
                i = 17073;
                break;
            case '4':
                i = 17079;
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_VECTOR /* 53 */:
                i = 17074;
                break;
            case '6':
                i = 17075;
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                i = 17078;
                break;
            case '8':
                i = 17081;
                break;
            case '9':
                i = 17082;
                break;
            case ':':
                i = 17083;
                break;
            case ';':
                i = 17084;
                break;
            case '<':
                i = 17085;
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                i = 17086;
                break;
            case '>':
                i = 17087;
                break;
            case '?':
                i = 17088;
                break;
            case '@':
                i = 17089;
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                i = 17090;
                break;
            case 'B':
                i = 17091;
                break;
            case 'C':
                i = 17093;
                break;
            case 'D':
                i = 17094;
                break;
            case 'E':
                i = 18001;
                break;
            case 'F':
                i = 17095;
                break;
            case 'G':
                i = 17201;
                break;
            case 'H':
                i = 17202;
                break;
            case 'I':
                i = 17203;
                break;
            case 'J':
                i = 17200;
                break;
            case MenuKt.OutTransitionDuration /* 75 */:
                i = 17204;
                break;
            case Base64.mimeLineLength /* 76 */:
                i = 17205;
                break;
            case 'M':
                i = 17206;
                break;
            case 'N':
                i = 17207;
                break;
            case 'O':
                i = 17056;
                break;
            case 'P':
                i = 18002;
                break;
            default:
                i = 17499;
                break;
        }
        if (i == 17499) {
            if (str2 != null) {
                return new Status(i, str + ":" + str2);
            }
            return new Status(i, str);
        }
        return new Status(i, str2);
    }

    public static Status zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Status(FirebaseError.ERROR_INTERNAL_ERROR);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && split[1] != null) {
            split[1] = split[1].trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return zza((String) asList.get(0), (String) asList.get(1));
        }
        return zza((String) asList.get(0), null);
    }
}
