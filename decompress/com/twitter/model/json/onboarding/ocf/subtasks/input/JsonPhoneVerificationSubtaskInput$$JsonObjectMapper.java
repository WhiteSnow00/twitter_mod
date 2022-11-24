// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPhoneVerificationSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonPhoneVerificationSubtaskInput>
{
    public static JsonPhoneVerificationSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonPhoneVerificationSubtaskInput jsonPhoneVerificationSubtaskInput = new JsonPhoneVerificationSubtaskInput();
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
            parseField(jsonPhoneVerificationSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonPhoneVerificationSubtaskInput;
    }
    
    public static void _serialize(final JsonPhoneVerificationSubtaskInput jsonPhoneVerificationSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("code", jsonPhoneVerificationSubtaskInput.b);
        yfe.u0("country_code", jsonPhoneVerificationSubtaskInput.d);
        yfe.u0("normalized_phone", jsonPhoneVerificationSubtaskInput.c);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonPhoneVerificationSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPhoneVerificationSubtaskInput jsonPhoneVerificationSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("code".equals(s)) {
            jsonPhoneVerificationSubtaskInput.b = qhe.T((String)null);
        }
        else if ("country_code".equals(s)) {
            jsonPhoneVerificationSubtaskInput.d = qhe.T((String)null);
        }
        else if ("normalized_phone".equals(s)) {
            jsonPhoneVerificationSubtaskInput.c = qhe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonPhoneVerificationSubtaskInput, s, qhe);
        }
    }
    
    public JsonPhoneVerificationSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPhoneVerificationSubtaskInput jsonPhoneVerificationSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPhoneVerificationSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPhoneVerificationSubtaskInput)o, yfe, b);
    }
}
