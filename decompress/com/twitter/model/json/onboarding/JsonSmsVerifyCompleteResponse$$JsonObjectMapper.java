// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSmsVerifyCompleteResponse$$JsonObjectMapper extends JsonMapper<JsonSmsVerifyCompleteResponse>
{
    public static JsonSmsVerifyCompleteResponse _parse(final qhe qhe) throws IOException {
        final JsonSmsVerifyCompleteResponse jsonSmsVerifyCompleteResponse = new JsonSmsVerifyCompleteResponse();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonSmsVerifyCompleteResponse, d, qhe);
            qhe.m0();
        }
        return jsonSmsVerifyCompleteResponse;
    }
    
    public static void _serialize(final JsonSmsVerifyCompleteResponse jsonSmsVerifyCompleteResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("is_valid", jsonSmsVerifyCompleteResponse.a);
        yfe.u0("phone_number", jsonSmsVerifyCompleteResponse.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSmsVerifyCompleteResponse jsonSmsVerifyCompleteResponse, final String s, final qhe qhe) throws IOException {
        if ("is_valid".equals(s)) {
            jsonSmsVerifyCompleteResponse.a = qhe.l();
        }
        else if ("phone_number".equals(s)) {
            jsonSmsVerifyCompleteResponse.b = qhe.T((String)null);
        }
    }
    
    public JsonSmsVerifyCompleteResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSmsVerifyCompleteResponse jsonSmsVerifyCompleteResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSmsVerifyCompleteResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSmsVerifyCompleteResponse)o, yfe, b);
    }
}
