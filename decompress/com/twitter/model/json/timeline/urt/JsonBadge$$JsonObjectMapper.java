// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBadge$$JsonObjectMapper extends JsonMapper<JsonBadge>
{
    public static JsonBadge _parse(final qhe qhe) throws IOException {
        final JsonBadge jsonBadge = new JsonBadge();
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
            parseField(jsonBadge, d, qhe);
            qhe.m0();
        }
        return jsonBadge;
    }
    
    public static void _serialize(final JsonBadge jsonBadge, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonBadge.c != null) {
            LoganSquare.typeConverterFor((Class)wov.class).serialize((Object)jsonBadge.c, "backgroundColorName", true, yfe);
        }
        yfe.u0("text", jsonBadge.a);
        if (jsonBadge.b != null) {
            LoganSquare.typeConverterFor((Class)wov.class).serialize((Object)jsonBadge.b, "textColorName", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonBadge jsonBadge, final String s, final qhe qhe) throws IOException {
        if ("backgroundColorName".equals(s)) {
            jsonBadge.c = (wov)LoganSquare.typeConverterFor((Class)wov.class).parse(qhe);
        }
        else if ("text".equals(s)) {
            jsonBadge.a = qhe.T((String)null);
        }
        else if ("textColorName".equals(s)) {
            jsonBadge.b = (wov)LoganSquare.typeConverterFor((Class)wov.class).parse(qhe);
        }
    }
    
    public JsonBadge parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonBadge jsonBadge, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonBadge, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonBadge)o, yfe, b);
    }
}
