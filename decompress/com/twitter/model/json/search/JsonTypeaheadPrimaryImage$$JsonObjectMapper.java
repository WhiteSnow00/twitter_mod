// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import com.twitter.model.json.media.JsonOriginalInfo$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadPrimaryImage$$JsonObjectMapper extends JsonMapper<JsonTypeaheadPrimaryImage>
{
    public static JsonTypeaheadPrimaryImage _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadPrimaryImage jsonTypeaheadPrimaryImage = new JsonTypeaheadPrimaryImage();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonTypeaheadPrimaryImage, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadPrimaryImage;
    }
    
    public static void _serialize(final JsonTypeaheadPrimaryImage jsonTypeaheadPrimaryImage, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTypeaheadPrimaryImage.a != null) {
            yfe.i("original_info");
            JsonOriginalInfo$$JsonObjectMapper._serialize(jsonTypeaheadPrimaryImage.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadPrimaryImage jsonTypeaheadPrimaryImage, final String s, final qhe qhe) throws IOException {
        if ("original_info".equals(s)) {
            jsonTypeaheadPrimaryImage.a = JsonOriginalInfo$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonTypeaheadPrimaryImage parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadPrimaryImage jsonTypeaheadPrimaryImage, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadPrimaryImage, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadPrimaryImage)o, yfe, b);
    }
}
