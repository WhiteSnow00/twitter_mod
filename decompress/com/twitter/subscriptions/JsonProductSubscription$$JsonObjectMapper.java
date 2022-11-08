// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonProductSubscription$$JsonObjectMapper extends JsonMapper<JsonProductSubscription>
{
    public static JsonProductSubscription _parse(final khe khe) throws IOException {
        final JsonProductSubscription jsonProductSubscription = new JsonProductSubscription();
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
            parseField(jsonProductSubscription, d, khe);
            khe.m0();
        }
        return jsonProductSubscription;
    }
    
    public static void _serialize(final JsonProductSubscription jsonProductSubscription, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("payment_source", jsonProductSubscription.b);
        tfe.u0("state", jsonProductSubscription.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonProductSubscription jsonProductSubscription, final String s, final khe khe) throws IOException {
        if ("payment_source".equals(s)) {
            jsonProductSubscription.b = khe.T((String)null);
        }
        else if ("state".equals(s)) {
            jsonProductSubscription.a = khe.T((String)null);
        }
    }
    
    public JsonProductSubscription parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonProductSubscription jsonProductSubscription, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonProductSubscription, tfe, b);
    }
}
