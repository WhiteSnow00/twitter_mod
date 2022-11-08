// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDmUpdateEventBuilder$$JsonObjectMapper extends JsonMapper<JsonDmUpdateEventBuilder>
{
    public static JsonDmUpdateEventBuilder _parse(final khe khe) throws IOException {
        final JsonDmUpdateEventBuilder jsonDmUpdateEventBuilder = new JsonDmUpdateEventBuilder();
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
            parseField(jsonDmUpdateEventBuilder, d, khe);
            khe.m0();
        }
        return jsonDmUpdateEventBuilder;
    }
    
    public static void _serialize(final JsonDmUpdateEventBuilder jsonDmUpdateEventBuilder, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("conversation_id", jsonDmUpdateEventBuilder.a);
        tfe.W("user_id", jsonDmUpdateEventBuilder.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonDmUpdateEventBuilder jsonDmUpdateEventBuilder, final String s, final khe khe) throws IOException {
        final boolean equals = "conversation_id".equals(s);
        final Long n = null;
        if (equals) {
            jsonDmUpdateEventBuilder.a = khe.T((String)null);
        }
        else if ("user_id".equals(s)) {
            Long value;
            if (khe.e() == lje.U0) {
                value = n;
            }
            else {
                value = khe.L();
            }
            jsonDmUpdateEventBuilder.b = value;
        }
    }
    
    public JsonDmUpdateEventBuilder parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonDmUpdateEventBuilder jsonDmUpdateEventBuilder, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonDmUpdateEventBuilder, tfe, b);
    }
}
