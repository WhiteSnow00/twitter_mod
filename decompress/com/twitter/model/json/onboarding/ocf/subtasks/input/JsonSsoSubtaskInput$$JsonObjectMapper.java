// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSsoSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonSsoSubtaskInput>
{
    public static JsonSsoSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonSsoSubtaskInput jsonSsoSubtaskInput = new JsonSsoSubtaskInput();
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
            parseField(jsonSsoSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonSsoSubtaskInput;
    }
    
    public static void _serialize(final JsonSsoSubtaskInput jsonSsoSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("auth_code", jsonSsoSubtaskInput.e);
        yfe.u0("id_token", jsonSsoSubtaskInput.c);
        yfe.u0("provider", jsonSsoSubtaskInput.b);
        yfe.u0("scopes", jsonSsoSubtaskInput.f);
        yfe.u0("state", jsonSsoSubtaskInput.d);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonSsoSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSsoSubtaskInput jsonSsoSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("auth_code".equals(s)) {
            jsonSsoSubtaskInput.e = qhe.T((String)null);
        }
        else if ("id_token".equals(s)) {
            jsonSsoSubtaskInput.c = qhe.T((String)null);
        }
        else if ("provider".equals(s)) {
            jsonSsoSubtaskInput.b = qhe.T((String)null);
        }
        else if ("scopes".equals(s)) {
            jsonSsoSubtaskInput.f = qhe.T((String)null);
        }
        else if ("state".equals(s)) {
            jsonSsoSubtaskInput.d = qhe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonSsoSubtaskInput, s, qhe);
        }
    }
    
    public JsonSsoSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSsoSubtaskInput jsonSsoSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSsoSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSsoSubtaskInput)o, yfe, b);
    }
}
