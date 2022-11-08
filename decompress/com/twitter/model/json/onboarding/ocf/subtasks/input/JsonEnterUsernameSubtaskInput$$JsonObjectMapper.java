// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterUsernameSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonEnterUsernameSubtaskInput>
{
    public static JsonEnterUsernameSubtaskInput _parse(final khe khe) throws IOException {
        final JsonEnterUsernameSubtaskInput jsonEnterUsernameSubtaskInput = new JsonEnterUsernameSubtaskInput();
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
            parseField(jsonEnterUsernameSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonEnterUsernameSubtaskInput;
    }
    
    public static void _serialize(final JsonEnterUsernameSubtaskInput jsonEnterUsernameSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("username", jsonEnterUsernameSubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonEnterUsernameSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterUsernameSubtaskInput jsonEnterUsernameSubtaskInput, final String s, final khe khe) throws IOException {
        if ("username".equals(s)) {
            jsonEnterUsernameSubtaskInput.b = khe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonEnterUsernameSubtaskInput, s, khe);
        }
    }
    
    public JsonEnterUsernameSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterUsernameSubtaskInput jsonEnterUsernameSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterUsernameSubtaskInput, tfe, b);
    }
}
