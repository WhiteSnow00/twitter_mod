// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterTextSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonEnterTextSubtaskInput>
{
    public static JsonEnterTextSubtaskInput _parse(final khe khe) throws IOException {
        final JsonEnterTextSubtaskInput jsonEnterTextSubtaskInput = new JsonEnterTextSubtaskInput();
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
            parseField(jsonEnterTextSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonEnterTextSubtaskInput;
    }
    
    public static void _serialize(final JsonEnterTextSubtaskInput jsonEnterTextSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("suggestion_id", jsonEnterTextSubtaskInput.c);
        tfe.u0("text", jsonEnterTextSubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonEnterTextSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterTextSubtaskInput jsonEnterTextSubtaskInput, final String s, final khe khe) throws IOException {
        if ("suggestion_id".equals(s)) {
            jsonEnterTextSubtaskInput.c = khe.T((String)null);
        }
        else if ("text".equals(s)) {
            jsonEnterTextSubtaskInput.b = khe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonEnterTextSubtaskInput, s, khe);
        }
    }
    
    public JsonEnterTextSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterTextSubtaskInput jsonEnterTextSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterTextSubtaskInput, tfe, b);
    }
}
