// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnmentions$$JsonObjectMapper extends JsonMapper<JsonUnmentions>
{
    public static JsonUnmentions _parse(final qhe qhe) throws IOException {
        final JsonUnmentions jsonUnmentions = new JsonUnmentions();
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
            parseField(jsonUnmentions, d, qhe);
            qhe.m0();
        }
        return jsonUnmentions;
    }
    
    public static void _serialize(final JsonUnmentions jsonUnmentions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonUnmentions.a != null) {
            LoganSquare.typeConverterFor((Class)m0w.class).serialize((Object)jsonUnmentions.a, "hydrate", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUnmentions jsonUnmentions, final String s, final qhe qhe) throws IOException {
        if ("hydrate".equals(s)) {
            jsonUnmentions.a = (m0w)LoganSquare.typeConverterFor((Class)m0w.class).parse(qhe);
        }
    }
    
    public JsonUnmentions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUnmentions jsonUnmentions, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUnmentions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUnmentions)o, yfe, b);
    }
}
