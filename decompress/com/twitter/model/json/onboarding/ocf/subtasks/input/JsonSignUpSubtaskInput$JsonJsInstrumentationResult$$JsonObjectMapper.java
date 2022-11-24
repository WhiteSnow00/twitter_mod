// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSignUpSubtaskInput$JsonJsInstrumentationResult$$JsonObjectMapper extends JsonMapper<JsonSignUpSubtaskInput.JsonJsInstrumentationResult>
{
    public static JsonSignUpSubtaskInput.JsonJsInstrumentationResult _parse(final qhe qhe) throws IOException {
        final JsonSignUpSubtaskInput.JsonJsInstrumentationResult jsonJsInstrumentationResult = new JsonSignUpSubtaskInput.JsonJsInstrumentationResult();
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
            parseField(jsonJsInstrumentationResult, d, qhe);
            qhe.m0();
        }
        return jsonJsInstrumentationResult;
    }
    
    public static void _serialize(final JsonSignUpSubtaskInput.JsonJsInstrumentationResult jsonJsInstrumentationResult, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("response", jsonJsInstrumentationResult.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSignUpSubtaskInput.JsonJsInstrumentationResult jsonJsInstrumentationResult, final String s, final qhe qhe) throws IOException {
        if ("response".equals(s)) {
            jsonJsInstrumentationResult.a = qhe.T((String)null);
        }
    }
    
    public JsonSignUpSubtaskInput.JsonJsInstrumentationResult parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSignUpSubtaskInput.JsonJsInstrumentationResult jsonJsInstrumentationResult, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonJsInstrumentationResult, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSignUpSubtaskInput.JsonJsInstrumentationResult)o, yfe, b);
    }
}
