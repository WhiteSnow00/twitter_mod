// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRenderData$$JsonObjectMapper extends JsonMapper<JsonRenderData>
{
    public static JsonRenderData _parse(final khe khe) throws IOException {
        final JsonRenderData jsonRenderData = new JsonRenderData();
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
            parseField(jsonRenderData, d, khe);
            khe.m0();
        }
        return jsonRenderData;
    }
    
    public static void _serialize(final JsonRenderData jsonRenderData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonRenderData.a != null) {
            LoganSquare.typeConverterFor((Class)h77$a.class).serialize((Object)jsonRenderData.a, "crops", true, tfe);
        }
        tfe.e("no_crop", jsonRenderData.c);
        if (jsonRenderData.b != null) {
            LoganSquare.typeConverterFor((Class)fks.class).serialize((Object)jsonRenderData.b, "theme", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonRenderData jsonRenderData, final String s, final khe khe) throws IOException {
        if ("crops".equals(s)) {
            jsonRenderData.a = (h77$a)LoganSquare.typeConverterFor((Class)h77$a.class).parse(khe);
        }
        else if ("no_crop".equals(s)) {
            jsonRenderData.c = khe.k();
        }
        else if ("theme".equals(s)) {
            jsonRenderData.b = (fks)LoganSquare.typeConverterFor((Class)fks.class).parse(khe);
        }
    }
    
    public JsonRenderData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonRenderData jsonRenderData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonRenderData, tfe, b);
    }
}
