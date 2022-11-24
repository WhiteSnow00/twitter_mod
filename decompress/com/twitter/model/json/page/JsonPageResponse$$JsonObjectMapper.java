// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPageResponse$$JsonObjectMapper extends JsonMapper<JsonPageResponse>
{
    public static JsonPageResponse _parse(final qhe qhe) throws IOException {
        final JsonPageResponse jsonPageResponse = new JsonPageResponse();
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
            parseField(jsonPageResponse, d, qhe);
            qhe.m0();
        }
        return jsonPageResponse;
    }
    
    public static void _serialize(final JsonPageResponse jsonPageResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonPageResponse.a != null) {
            LoganSquare.typeConverterFor((Class)y4c$a.class).serialize((Object)jsonPageResponse.a, "globalObjects", true, yfe);
        }
        if (jsonPageResponse.c != null) {
            LoganSquare.typeConverterFor((Class)tsj.class).serialize((Object)jsonPageResponse.c, "pageConfiguration", true, yfe);
        }
        if (jsonPageResponse.b != null) {
            LoganSquare.typeConverterFor((Class)rss.a.class).serialize((Object)jsonPageResponse.b, "timeline", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPageResponse jsonPageResponse, final String s, final qhe qhe) throws IOException {
        if ("globalObjects".equals(s)) {
            jsonPageResponse.a = (y4c$a)LoganSquare.typeConverterFor((Class)y4c$a.class).parse(qhe);
        }
        else if ("pageConfiguration".equals(s)) {
            jsonPageResponse.c = (tsj)LoganSquare.typeConverterFor((Class)tsj.class).parse(qhe);
        }
        else if ("timeline".equals(s)) {
            jsonPageResponse.b = (rss.a)LoganSquare.typeConverterFor((Class)rss.a.class).parse(qhe);
        }
    }
    
    public JsonPageResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPageResponse jsonPageResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPageResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPageResponse)o, yfe, b);
    }
}
