// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPhoneVerificationRequestInput$$JsonObjectMapper extends JsonMapper<JsonPhoneVerificationRequestInput>
{
    public static JsonPhoneVerificationRequestInput _parse(final qhe qhe) throws IOException {
        final JsonPhoneVerificationRequestInput jsonPhoneVerificationRequestInput = new JsonPhoneVerificationRequestInput();
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
            parseField(jsonPhoneVerificationRequestInput, d, qhe);
            qhe.m0();
        }
        return jsonPhoneVerificationRequestInput;
    }
    
    public static void _serialize(final JsonPhoneVerificationRequestInput jsonPhoneVerificationRequestInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("android_hash_string", jsonPhoneVerificationRequestInput.d);
        yfe.u0("flow_token", jsonPhoneVerificationRequestInput.a);
        yfe.u0("phone", jsonPhoneVerificationRequestInput.b);
        yfe.e("send_to_whatsapp", jsonPhoneVerificationRequestInput.f);
        yfe.u0("sim_country_code", jsonPhoneVerificationRequestInput.c);
        yfe.e("use_voice", jsonPhoneVerificationRequestInput.e);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPhoneVerificationRequestInput jsonPhoneVerificationRequestInput, final String s, final qhe qhe) throws IOException {
        if ("android_hash_string".equals(s)) {
            jsonPhoneVerificationRequestInput.d = qhe.T((String)null);
        }
        else if ("flow_token".equals(s)) {
            jsonPhoneVerificationRequestInput.a = qhe.T((String)null);
        }
        else if ("phone".equals(s)) {
            jsonPhoneVerificationRequestInput.b = qhe.T((String)null);
        }
        else if ("send_to_whatsapp".equals(s)) {
            jsonPhoneVerificationRequestInput.f = qhe.l();
        }
        else if ("sim_country_code".equals(s)) {
            jsonPhoneVerificationRequestInput.c = qhe.T((String)null);
        }
        else if ("use_voice".equals(s)) {
            jsonPhoneVerificationRequestInput.e = qhe.l();
        }
    }
    
    public JsonPhoneVerificationRequestInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPhoneVerificationRequestInput jsonPhoneVerificationRequestInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPhoneVerificationRequestInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPhoneVerificationRequestInput)o, yfe, b);
    }
}
