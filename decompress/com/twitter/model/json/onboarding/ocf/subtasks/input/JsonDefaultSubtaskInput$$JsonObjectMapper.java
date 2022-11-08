// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDefaultSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonDefaultSubtaskInput>
{
    public static JsonDefaultSubtaskInput _parse(final khe khe) throws IOException {
        final JsonDefaultSubtaskInput jsonDefaultSubtaskInput = new JsonDefaultSubtaskInput();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonDefaultSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonDefaultSubtaskInput;
    }
    
    public static void _serialize(final JsonDefaultSubtaskInput jsonDefaultSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("link", jsonDefaultSubtaskInput.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonDefaultSubtaskInput jsonDefaultSubtaskInput, final String s, final khe khe) throws IOException {
        if ("link".equals(s)) {
            jsonDefaultSubtaskInput.a = khe.T((String)null);
        }
    }
    
    public JsonDefaultSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonDefaultSubtaskInput jsonDefaultSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonDefaultSubtaskInput, tfe, b);
    }
}
