// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubscriptionError$$JsonObjectMapper extends JsonMapper<JsonSubscriptionError>
{
    public static JsonSubscriptionError _parse(final khe khe) throws IOException {
        final JsonSubscriptionError jsonSubscriptionError = new JsonSubscriptionError();
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
            parseField(jsonSubscriptionError, d, khe);
            khe.m0();
        }
        return jsonSubscriptionError;
    }
    
    public static void _serialize(final JsonSubscriptionError jsonSubscriptionError, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("code", jsonSubscriptionError.b);
        tfe.u0("message", jsonSubscriptionError.c);
        tfe.u0("topic", jsonSubscriptionError.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSubscriptionError jsonSubscriptionError, final String s, final khe khe) throws IOException {
        if ("code".equals(s)) {
            jsonSubscriptionError.b = khe.z();
        }
        else if ("message".equals(s)) {
            jsonSubscriptionError.c = khe.T((String)null);
        }
        else if ("topic".equals(s)) {
            jsonSubscriptionError.a = khe.T((String)null);
        }
    }
    
    public JsonSubscriptionError parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSubscriptionError jsonSubscriptionError, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSubscriptionError, tfe, b);
    }
}
