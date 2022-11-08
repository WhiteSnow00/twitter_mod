// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCropHint$$JsonObjectMapper extends JsonMapper<JsonCropHint>
{
    public static JsonCropHint _parse(final khe khe) throws IOException {
        final JsonCropHint jsonCropHint = new JsonCropHint();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonCropHint, d, khe);
            khe.m0();
        }
        return jsonCropHint;
    }
    
    public static void _serialize(final JsonCropHint jsonCropHint, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCropHint.d != null) {
            LoganSquare.typeConverterFor((Class)f77.a.class).serialize((Object)jsonCropHint.d, "landscape_16_9", true, tfe);
        }
        if (jsonCropHint.b != null) {
            LoganSquare.typeConverterFor((Class)f77.a.class).serialize((Object)jsonCropHint.b, "portrait_3_4", true, tfe);
        }
        if (jsonCropHint.c != null) {
            LoganSquare.typeConverterFor((Class)f77.a.class).serialize((Object)jsonCropHint.c, "portrait_9_16", true, tfe);
        }
        if (jsonCropHint.a != null) {
            LoganSquare.typeConverterFor((Class)f77.a.class).serialize((Object)jsonCropHint.a, "square", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCropHint jsonCropHint, final String s, final khe khe) throws IOException {
        if ("landscape_16_9".equals(s)) {
            jsonCropHint.d = (f77.a)LoganSquare.typeConverterFor((Class)f77.a.class).parse(khe);
        }
        else if ("portrait_3_4".equals(s)) {
            jsonCropHint.b = (f77.a)LoganSquare.typeConverterFor((Class)f77.a.class).parse(khe);
        }
        else if ("portrait_9_16".equals(s)) {
            jsonCropHint.c = (f77.a)LoganSquare.typeConverterFor((Class)f77.a.class).parse(khe);
        }
        else if ("square".equals(s)) {
            jsonCropHint.a = (f77.a)LoganSquare.typeConverterFor((Class)f77.a.class).parse(khe);
        }
    }
    
    public JsonCropHint parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCropHint jsonCropHint, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCropHint, tfe, b);
    }
}
