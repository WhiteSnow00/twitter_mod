// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSmsVerifyBeginResponse$$JsonObjectMapper extends JsonMapper<JsonSmsVerifyBeginResponse>
{
    public static JsonSmsVerifyBeginResponse _parse(final tge tge) throws IOException {
        final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse = new JsonSmsVerifyBeginResponse();
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
            parseField(jsonSmsVerifyBeginResponse, d, tge);
            tge.l0();
        }
        return jsonSmsVerifyBeginResponse;
    }
    
    public static void _serialize(final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("is_numeric", jsonSmsVerifyBeginResponse.a);
        afe.t0("phone_number", jsonSmsVerifyBeginResponse.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse, final String s, final tge tge) throws IOException {
        if ("is_numeric".equals(s)) {
            jsonSmsVerifyBeginResponse.a = tge.k();
        }
        else if ("phone_number".equals(s)) {
            jsonSmsVerifyBeginResponse.b = tge.T((String)null);
        }
    }
    
    public JsonSmsVerifyBeginResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSmsVerifyBeginResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSmsVerifyBeginResponse)o, afe, b);
    }
}
