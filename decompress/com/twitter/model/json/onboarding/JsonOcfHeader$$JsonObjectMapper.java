// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfHeader$$JsonObjectMapper extends JsonMapper<JsonOcfHeader>
{
    public static JsonOcfHeader _parse(final qhe qhe) throws IOException {
        final JsonOcfHeader jsonOcfHeader = new JsonOcfHeader();
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
            parseField(jsonOcfHeader, d, qhe);
            qhe.m0();
        }
        return jsonOcfHeader;
    }
    
    public static void _serialize(final JsonOcfHeader jsonOcfHeader, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOcfHeader.c != null) {
            LoganSquare.typeConverterFor((Class)cej.class).serialize((Object)jsonOcfHeader.c, "header_image", true, yfe);
        }
        if (jsonOcfHeader.a != null) {
            yfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfHeader.a, yfe, true);
        }
        if (jsonOcfHeader.b != null) {
            yfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfHeader.b, yfe, true);
        }
        if (jsonOcfHeader.d != null) {
            LoganSquare.typeConverterFor((Class)qgv.class).serialize((Object)jsonOcfHeader.d, "user", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfHeader jsonOcfHeader, final String s, final qhe qhe) throws IOException {
        if ("header_image".equals(s)) {
            jsonOcfHeader.c = (cej)LoganSquare.typeConverterFor((Class)cej.class).parse(qhe);
        }
        else if ("primary_text".equals(s)) {
            jsonOcfHeader.a = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("secondary_text".equals(s)) {
            jsonOcfHeader.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("user".equals(s)) {
            jsonOcfHeader.d = (qgv)LoganSquare.typeConverterFor((Class)qgv.class).parse(qhe);
        }
    }
    
    public JsonOcfHeader parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfHeader jsonOcfHeader, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfHeader, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfHeader)o, yfe, b);
    }
}
