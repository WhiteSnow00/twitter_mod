// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfSmsVerifyBeginResponse$$JsonObjectMapper extends JsonMapper<JsonOcfSmsVerifyBeginResponse>
{
    public static JsonOcfSmsVerifyBeginResponse _parse(final qhe qhe) throws IOException {
        final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse = new JsonOcfSmsVerifyBeginResponse();
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
            parseField(jsonOcfSmsVerifyBeginResponse, d, qhe);
            qhe.m0();
        }
        return jsonOcfSmsVerifyBeginResponse;
    }
    
    public static void _serialize(final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("normalized_phone_number", jsonOcfSmsVerifyBeginResponse.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse, final String s, final qhe qhe) throws IOException {
        if ("normalized_phone_number".equals(s)) {
            jsonOcfSmsVerifyBeginResponse.a = qhe.T((String)null);
        }
    }
    
    public JsonOcfSmsVerifyBeginResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfSmsVerifyBeginResponse jsonOcfSmsVerifyBeginResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfSmsVerifyBeginResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfSmsVerifyBeginResponse)o, yfe, b);
    }
}
