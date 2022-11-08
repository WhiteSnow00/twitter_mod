// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConfigEventBuilder$$JsonObjectMapper extends JsonMapper<JsonConfigEventBuilder>
{
    public static JsonConfigEventBuilder _parse(final khe khe) throws IOException {
        final JsonConfigEventBuilder jsonConfigEventBuilder = new JsonConfigEventBuilder();
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
            parseField(jsonConfigEventBuilder, d, khe);
            khe.m0();
        }
        return jsonConfigEventBuilder;
    }
    
    public static void _serialize(final JsonConfigEventBuilder jsonConfigEventBuilder, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("heartbeat_millis", jsonConfigEventBuilder.c);
        tfe.u0("session_id", jsonConfigEventBuilder.a);
        tfe.W("subscription_ttl_millis", jsonConfigEventBuilder.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonConfigEventBuilder jsonConfigEventBuilder, final String s, final khe khe) throws IOException {
        if ("heartbeat_millis".equals(s)) {
            jsonConfigEventBuilder.c = khe.L();
        }
        else if ("session_id".equals(s)) {
            jsonConfigEventBuilder.a = khe.T((String)null);
        }
        else if ("subscription_ttl_millis".equals(s)) {
            jsonConfigEventBuilder.b = khe.L();
        }
    }
    
    public JsonConfigEventBuilder parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonConfigEventBuilder jsonConfigEventBuilder, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonConfigEventBuilder, tfe, b);
    }
}
