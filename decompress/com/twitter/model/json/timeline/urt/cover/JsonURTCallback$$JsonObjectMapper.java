// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTCallback$$JsonObjectMapper extends JsonMapper<JsonURTCallback>
{
    public static JsonURTCallback _parse(final tge tge) throws IOException {
        final JsonURTCallback jsonURTCallback = new JsonURTCallback();
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
            parseField(jsonURTCallback, d, tge);
            tge.l0();
        }
        return jsonURTCallback;
    }
    
    public static void _serialize(final JsonURTCallback jsonURTCallback, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("endpoint", jsonURTCallback.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTCallback jsonURTCallback, final String s, final tge tge) throws IOException {
        if ("endpoint".equals(s)) {
            jsonURTCallback.a = tge.T((String)null);
        }
    }
    
    public JsonURTCallback parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTCallback jsonURTCallback, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTCallback, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTCallback)o, afe, b);
    }
}
