// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWebModalSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonWebModalSubtaskInput>
{
    public static JsonWebModalSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonWebModalSubtaskInput jsonWebModalSubtaskInput = new JsonWebModalSubtaskInput();
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
            parseField(jsonWebModalSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonWebModalSubtaskInput;
    }
    
    public static void _serialize(final JsonWebModalSubtaskInput jsonWebModalSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("completion_deeplink", jsonWebModalSubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonWebModalSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonWebModalSubtaskInput jsonWebModalSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("completion_deeplink".equals(s)) {
            jsonWebModalSubtaskInput.b = qhe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonWebModalSubtaskInput, s, qhe);
        }
    }
    
    public JsonWebModalSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonWebModalSubtaskInput jsonWebModalSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonWebModalSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonWebModalSubtaskInput)o, yfe, b);
    }
}
