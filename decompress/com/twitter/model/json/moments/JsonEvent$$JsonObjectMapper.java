// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEvent$$JsonObjectMapper extends JsonMapper<JsonEvent>
{
    public static JsonEvent _parse(final khe khe) throws IOException {
        final JsonEvent jsonEvent = new JsonEvent();
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
            parseField(jsonEvent, d, khe);
            khe.m0();
        }
        return jsonEvent;
    }
    
    public static void _serialize(final JsonEvent jsonEvent, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonEvent.a);
        tfe.u0("type", jsonEvent.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEvent jsonEvent, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonEvent.a = khe.T((String)null);
        }
        else if ("type".equals(s)) {
            jsonEvent.b = khe.T((String)null);
        }
    }
    
    public JsonEvent parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEvent jsonEvent, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEvent, tfe, b);
    }
}
