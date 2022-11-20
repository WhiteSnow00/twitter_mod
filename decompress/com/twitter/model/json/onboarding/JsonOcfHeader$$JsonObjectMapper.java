// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfHeader$$JsonObjectMapper extends JsonMapper<JsonOcfHeader>
{
    public static JsonOcfHeader _parse(final tge tge) throws IOException {
        final JsonOcfHeader jsonOcfHeader = new JsonOcfHeader();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonOcfHeader, d, tge);
            tge.l0();
        }
        return jsonOcfHeader;
    }
    
    public static void _serialize(final JsonOcfHeader jsonOcfHeader, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOcfHeader.c != null) {
            LoganSquare.typeConverterFor((Class)pdj.class).serialize((Object)jsonOcfHeader.c, "header_image", true, afe);
        }
        if (jsonOcfHeader.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfHeader.a, afe, true);
        }
        if (jsonOcfHeader.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfHeader.b, afe, true);
        }
        if (jsonOcfHeader.d != null) {
            LoganSquare.typeConverterFor((Class)cgv.class).serialize((Object)jsonOcfHeader.d, "user", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfHeader jsonOcfHeader, final String s, final tge tge) throws IOException {
        if ("header_image".equals(s)) {
            jsonOcfHeader.c = (pdj)LoganSquare.typeConverterFor((Class)pdj.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonOcfHeader.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonOcfHeader.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("user".equals(s)) {
            jsonOcfHeader.d = (cgv)LoganSquare.typeConverterFor((Class)cgv.class).parse(tge);
        }
    }
    
    public JsonOcfHeader parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfHeader jsonOcfHeader, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfHeader, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfHeader)o, afe, b);
    }
}
