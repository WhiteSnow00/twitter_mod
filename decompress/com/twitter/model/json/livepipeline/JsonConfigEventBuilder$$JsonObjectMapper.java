// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConfigEventBuilder$$JsonObjectMapper extends JsonMapper<JsonConfigEventBuilder>
{
    public static JsonConfigEventBuilder _parse(final tge tge) throws IOException {
        final JsonConfigEventBuilder jsonConfigEventBuilder = new JsonConfigEventBuilder();
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
            parseField(jsonConfigEventBuilder, d, tge);
            tge.l0();
        }
        return jsonConfigEventBuilder;
    }
    
    public static void _serialize(final JsonConfigEventBuilder jsonConfigEventBuilder, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.V("heartbeat_millis", jsonConfigEventBuilder.c);
        afe.t0("session_id", jsonConfigEventBuilder.a);
        afe.V("subscription_ttl_millis", jsonConfigEventBuilder.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonConfigEventBuilder jsonConfigEventBuilder, final String s, final tge tge) throws IOException {
        if ("heartbeat_millis".equals(s)) {
            jsonConfigEventBuilder.c = tge.K();
        }
        else if ("session_id".equals(s)) {
            jsonConfigEventBuilder.a = tge.T((String)null);
        }
        else if ("subscription_ttl_millis".equals(s)) {
            jsonConfigEventBuilder.b = tge.K();
        }
    }
    
    public JsonConfigEventBuilder parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonConfigEventBuilder jsonConfigEventBuilder, final afe afe, final boolean b) throws IOException {
        _serialize(jsonConfigEventBuilder, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonConfigEventBuilder)o, afe, b);
    }
}
