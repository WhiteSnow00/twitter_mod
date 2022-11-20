// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypingIndicatorEventBuilder$$JsonObjectMapper extends JsonMapper<JsonTypingIndicatorEventBuilder>
{
    public static JsonTypingIndicatorEventBuilder _parse(final tge tge) throws IOException {
        final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder = new JsonTypingIndicatorEventBuilder();
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
            parseField(jsonTypingIndicatorEventBuilder, d, tge);
            tge.l0();
        }
        return jsonTypingIndicatorEventBuilder;
    }
    
    public static void _serialize(final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("conversation_id", jsonTypingIndicatorEventBuilder.a);
        afe.V("user_id", (long)jsonTypingIndicatorEventBuilder.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder, final String s, final tge tge) throws IOException {
        final boolean equals = "conversation_id".equals(s);
        final Long n = null;
        if (equals) {
            jsonTypingIndicatorEventBuilder.a = tge.T((String)null);
        }
        else if ("user_id".equals(s)) {
            Long value;
            if (tge.e() == vie.V0) {
                value = n;
            }
            else {
                value = tge.K();
            }
            jsonTypingIndicatorEventBuilder.b = value;
        }
    }
    
    public JsonTypingIndicatorEventBuilder parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTypingIndicatorEventBuilder jsonTypingIndicatorEventBuilder, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTypingIndicatorEventBuilder, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTypingIndicatorEventBuilder)o, afe, b);
    }
}
