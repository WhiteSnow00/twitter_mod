// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubscriptionError$$JsonObjectMapper extends JsonMapper<JsonSubscriptionError>
{
    public static JsonSubscriptionError _parse(final tge tge) throws IOException {
        final JsonSubscriptionError jsonSubscriptionError = new JsonSubscriptionError();
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
            parseField(jsonSubscriptionError, d, tge);
            tge.l0();
        }
        return jsonSubscriptionError;
    }
    
    public static void _serialize(final JsonSubscriptionError jsonSubscriptionError, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("code", jsonSubscriptionError.b);
        afe.t0("message", jsonSubscriptionError.c);
        afe.t0("topic", jsonSubscriptionError.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSubscriptionError jsonSubscriptionError, final String s, final tge tge) throws IOException {
        if ("code".equals(s)) {
            jsonSubscriptionError.b = tge.y();
        }
        else if ("message".equals(s)) {
            jsonSubscriptionError.c = tge.T((String)null);
        }
        else if ("topic".equals(s)) {
            jsonSubscriptionError.a = tge.T((String)null);
        }
    }
    
    public JsonSubscriptionError parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSubscriptionError jsonSubscriptionError, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSubscriptionError, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSubscriptionError)o, afe, b);
    }
}
