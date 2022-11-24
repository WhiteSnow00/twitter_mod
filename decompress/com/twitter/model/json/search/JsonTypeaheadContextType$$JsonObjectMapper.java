// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadContextType$$JsonObjectMapper extends JsonMapper<JsonTypeaheadContextType>
{
    public static JsonTypeaheadContextType _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadContextType jsonTypeaheadContextType = new JsonTypeaheadContextType();
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
            parseField(jsonTypeaheadContextType, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadContextType;
    }
    
    public static void _serialize(final JsonTypeaheadContextType jsonTypeaheadContextType, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTypeaheadContextType.a != null) {
            LoganSquare.typeConverterFor((Class)ulv.class).serialize((Object)jsonTypeaheadContextType.a, "type", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadContextType jsonTypeaheadContextType, final String s, final qhe qhe) throws IOException {
        if ("type".equals(s)) {
            jsonTypeaheadContextType.a = (ulv)LoganSquare.typeConverterFor((Class)ulv.class).parse(qhe);
        }
    }
    
    public JsonTypeaheadContextType parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadContextType jsonTypeaheadContextType, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadContextType, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadContextType)o, yfe, b);
    }
}
