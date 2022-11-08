// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGuestToken$$JsonObjectMapper extends JsonMapper<JsonGuestToken>
{
    public static JsonGuestToken _parse(final khe khe) throws IOException {
        final JsonGuestToken jsonGuestToken = new JsonGuestToken();
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
            parseField(jsonGuestToken, d, khe);
            khe.m0();
        }
        return jsonGuestToken;
    }
    
    public static void _serialize(final JsonGuestToken jsonGuestToken, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("guest_token", jsonGuestToken.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGuestToken jsonGuestToken, final String s, final khe khe) throws IOException {
        if ("guest_token".equals(s)) {
            jsonGuestToken.a = khe.T((String)null);
        }
    }
    
    public JsonGuestToken parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGuestToken jsonGuestToken, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGuestToken, tfe, b);
    }
}
