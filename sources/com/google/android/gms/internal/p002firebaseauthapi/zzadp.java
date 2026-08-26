package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.common.net.HttpHeaders;
import com.google.zxing.client.android.Intents;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* loaded from: classes11.dex */
public final class zzadp {
    private static void zza(HttpURLConnection httpURLConnection, zzadm<?> zzadmVar, Type type) {
        InputStream errorStream;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (zza(responseCode)) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (!zza(responseCode)) {
                    zzadmVar.zza((String) zzacs.zza(sb2, String.class));
                } else {
                    zzadmVar.zza((zzadm<?>) zzacs.zza(sb2, type));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                httpURLConnection.disconnect();
                throw th3;
            }
        } catch (zzaah e) {
            e = e;
            zzadmVar.zza(e.getMessage());
            httpURLConnection.disconnect();
        } catch (SocketTimeoutException e2) {
            zzadmVar.zza(Intents.Scan.TIMEOUT);
            httpURLConnection.disconnect();
        } catch (IOException e3) {
            e = e3;
            zzadmVar.zza(e.getMessage());
            httpURLConnection.disconnect();
        }
    }

    public static void zza(String str, zzadm<?> zzadmVar, Type type, zzacv zzacvVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzacvVar.zza(httpURLConnection);
            zza(httpURLConnection, zzadmVar, type);
        } catch (SocketTimeoutException e) {
            zzadmVar.zza(Intents.Scan.TIMEOUT);
        } catch (UnknownHostException e2) {
            zzadmVar.zza("<<Network Error>>");
        } catch (IOException e3) {
            zzadmVar.zza(e3.getMessage());
        }
    }

    public static void zza(String str, zzacr zzacrVar, zzadm<?> zzadmVar, Type type, zzacv zzacvVar) {
        try {
            Preconditions.checkNotNull(zzacrVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzacrVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzacvVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzadmVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (NullPointerException e) {
            e = e;
            zzadmVar.zza(e.getMessage());
        } catch (SocketTimeoutException e2) {
            zzadmVar.zza(Intents.Scan.TIMEOUT);
        } catch (UnknownHostException e3) {
            zzadmVar.zza("<<Network Error>>");
        } catch (IOException e4) {
            e = e4;
            zzadmVar.zza(e.getMessage());
        } catch (JSONException e5) {
            e = e5;
            zzadmVar.zza(e.getMessage());
        }
    }

    private static final boolean zza(int i) {
        return i >= 200 && i < 300;
    }
}
