// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSmsVerifyBeginResponse$$JsonObjectMapper extends JsonMapper<JsonSmsVerifyBeginResponse>
{
    public static JsonSmsVerifyBeginResponse _parse(final qhe qhe) throws IOException {
        final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse = new JsonSmsVerifyBeginResponse();
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
            parseField(jsonSmsVerifyBeginResponse, d, qhe);
            qhe.m0();
        }
        return jsonSmsVerifyBeginResponse;
    }
    
    public static void _serialize(final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("is_numeric", jsonSmsVerifyBeginResponse.a);
        yfe.u0("phone_number", jsonSmsVerifyBeginResponse.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse, final String s, final qhe qhe) throws IOException {
        if ("is_numeric".equals(s)) {
            jsonSmsVerifyBeginResponse.a = qhe.l();
        }
        else if ("phone_number".equals(s)) {
            jsonSmsVerifyBeginResponse.b = qhe.T((String)null);
        }
    }
    
    public JsonSmsVerifyBeginResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSmsVerifyBeginResponse jsonSmsVerifyBeginResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSmsVerifyBeginResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSmsVerifyBeginResponse)o, yfe, b);
    }
}
