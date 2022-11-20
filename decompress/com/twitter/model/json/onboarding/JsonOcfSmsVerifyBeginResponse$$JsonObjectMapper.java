// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfSmsVerifyBeginResponse$$JsonObjectMapper extends JsonMapper<JsonOcfSmsVerifyBeginResponse>
{
    public static JsonOcfSmsVerifyBeginResponse _parse(final tge tge) throws IOException {
        final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse = new JsonOcfSmsVerifyBeginResponse();
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
            parseField(jsonOcfSmsVerifyBeginResponse, d, tge);
            tge.l0();
        }
        return jsonOcfSmsVerifyBeginResponse;
    }
    
    public static void _serialize(final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("normalized_phone_number", jsonOcfSmsVerifyBeginResponse.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse, final String s, final tge tge) throws IOException {
        if ("normalized_phone_number".equals(s)) {
            jsonOcfSmsVerifyBeginResponse.a = tge.T((String)null);
        }
    }
    
    public JsonOcfSmsVerifyBeginResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfSmsVerifyBeginResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfSmsVerifyBeginResponse)o, afe, b);
    }
}
