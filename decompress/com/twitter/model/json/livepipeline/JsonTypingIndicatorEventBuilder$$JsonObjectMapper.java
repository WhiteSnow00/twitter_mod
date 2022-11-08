// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypingIndicatorEventBuilder$$JsonObjectMapper extends JsonMapper<JsonTypingIndicatorEventBuilder>
{
    public static JsonTypingIndicatorEventBuilder _parse(final khe khe) throws IOException {
        final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder = new JsonTypingIndicatorEventBuilder();
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
            parseField(jsonTypingIndicatorEventBuilder, d, khe);
            khe.m0();
        }
        return jsonTypingIndicatorEventBuilder;
    }
    
    public static void _serialize(final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("conversation_id", jsonTypingIndicatorEventBuilder.a);
        tfe.W("user_id", jsonTypingIndicatorEventBuilder.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder, final String s, final khe khe) throws IOException {
        final boolean equals = "conversation_id".equals(s);
        final Long n = null;
        if (equals) {
            jsonTypingIndicatorEventBuilder.a = khe.T((String)null);
        }
        else if ("user_id".equals(s)) {
            Long value;
            if (khe.e() == lje.U0) {
                value = n;
            }
            else {
                value = khe.L();
            }
            jsonTypingIndicatorEventBuilder.b = value;
        }
    }
    
    public JsonTypingIndicatorEventBuilder parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTypingIndicatorEventBuilder, tfe, b);
    }
}
