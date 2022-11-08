// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAccessToken$$JsonObjectMapper extends JsonMapper<JsonAccessToken>
{
    public static JsonAccessToken _parse(final khe khe) throws IOException {
        final JsonAccessToken jsonAccessToken = new JsonAccessToken();
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
            parseField(jsonAccessToken, d, khe);
            khe.m0();
        }
        return jsonAccessToken;
    }
    
    public static void _serialize(final JsonAccessToken jsonAccessToken, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("access_token", jsonAccessToken.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonAccessToken jsonAccessToken, final String s, final khe khe) throws IOException {
        if ("access_token".equals(s)) {
            jsonAccessToken.a = khe.T((String)null);
        }
    }
    
    public JsonAccessToken parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonAccessToken jsonAccessToken, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonAccessToken, tfe, b);
    }
}
