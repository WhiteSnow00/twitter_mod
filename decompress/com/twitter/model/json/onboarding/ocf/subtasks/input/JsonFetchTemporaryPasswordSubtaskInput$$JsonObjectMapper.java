// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchTemporaryPasswordSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonFetchTemporaryPasswordSubtaskInput>
{
    public static JsonFetchTemporaryPasswordSubtaskInput _parse(final khe khe) throws IOException {
        final JsonFetchTemporaryPasswordSubtaskInput jsonFetchTemporaryPasswordSubtaskInput = new JsonFetchTemporaryPasswordSubtaskInput();
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
            parseField(jsonFetchTemporaryPasswordSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonFetchTemporaryPasswordSubtaskInput;
    }
    
    public static void _serialize(final JsonFetchTemporaryPasswordSubtaskInput jsonFetchTemporaryPasswordSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("password", jsonFetchTemporaryPasswordSubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonFetchTemporaryPasswordSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFetchTemporaryPasswordSubtaskInput jsonFetchTemporaryPasswordSubtaskInput, final String s, final khe khe) throws IOException {
        if ("password".equals(s)) {
            jsonFetchTemporaryPasswordSubtaskInput.b = khe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonFetchTemporaryPasswordSubtaskInput, s, khe);
        }
    }
    
    public JsonFetchTemporaryPasswordSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFetchTemporaryPasswordSubtaskInput jsonFetchTemporaryPasswordSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFetchTemporaryPasswordSubtaskInput, tfe, b);
    }
}
