// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import com.twitter.model.json.onboarding.JsonDate$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSignUpSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonSignUpSubtaskInput>
{
    public static JsonSignUpSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonSignUpSubtaskInput jsonSignUpSubtaskInput = new JsonSignUpSubtaskInput();
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
            parseField(jsonSignUpSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonSignUpSubtaskInput;
    }
    
    public static void _serialize(final JsonSignUpSubtaskInput jsonSignUpSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSignUpSubtaskInput.e != null) {
            yfe.i("birthday");
            JsonDate$$JsonObjectMapper._serialize(jsonSignUpSubtaskInput.e, yfe, true);
        }
        yfe.u0("email", jsonSignUpSubtaskInput.d);
        if (jsonSignUpSubtaskInput.f != null) {
            yfe.i("js_instrumentation");
            JsonSignUpSubtaskInput$JsonJsInstrumentationResult$$JsonObjectMapper._serialize(jsonSignUpSubtaskInput.f, yfe, true);
        }
        yfe.u0("name", jsonSignUpSubtaskInput.b);
        yfe.u0("phone_number", jsonSignUpSubtaskInput.c);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonSignUpSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSignUpSubtaskInput jsonSignUpSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("birthday".equals(s)) {
            jsonSignUpSubtaskInput.e = JsonDate$$JsonObjectMapper._parse(qhe);
        }
        else if ("email".equals(s)) {
            jsonSignUpSubtaskInput.d = qhe.T((String)null);
        }
        else if ("js_instrumentation".equals(s)) {
            jsonSignUpSubtaskInput.f = JsonSignUpSubtaskInput$JsonJsInstrumentationResult$$JsonObjectMapper._parse(qhe);
        }
        else if ("name".equals(s)) {
            jsonSignUpSubtaskInput.b = qhe.T((String)null);
        }
        else if ("phone_number".equals(s)) {
            jsonSignUpSubtaskInput.c = qhe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonSignUpSubtaskInput, s, qhe);
        }
    }
    
    public JsonSignUpSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSignUpSubtaskInput jsonSignUpSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSignUpSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSignUpSubtaskInput)o, yfe, b);
    }
}
