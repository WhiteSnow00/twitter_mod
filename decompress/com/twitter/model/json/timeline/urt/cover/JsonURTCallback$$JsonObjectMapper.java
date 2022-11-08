// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTCallback$$JsonObjectMapper extends JsonMapper<JsonURTCallback>
{
    public static JsonURTCallback _parse(final khe khe) throws IOException {
        final JsonURTCallback jsonURTCallback = new JsonURTCallback();
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
            parseField(jsonURTCallback, d, khe);
            khe.m0();
        }
        return jsonURTCallback;
    }
    
    public static void _serialize(final JsonURTCallback jsonURTCallback, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("endpoint", jsonURTCallback.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTCallback jsonURTCallback, final String s, final khe khe) throws IOException {
        if ("endpoint".equals(s)) {
            jsonURTCallback.a = khe.T((String)null);
        }
    }
    
    public JsonURTCallback parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTCallback jsonURTCallback, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTCallback, tfe, b);
    }
}
