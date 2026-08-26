package com.journeyapps.barcodescanner;

import com.google.zxing.DecodeHintType;
import java.util.Map;

/* loaded from: classes12.dex */
public interface DecoderFactory {
    Decoder createDecoder(Map<DecodeHintType, ?> map);
}
