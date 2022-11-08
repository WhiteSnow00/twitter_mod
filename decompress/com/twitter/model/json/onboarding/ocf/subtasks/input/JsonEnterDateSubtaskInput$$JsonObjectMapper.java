// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import com.twitter.model.json.onboarding.JsonDate$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterDateSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonEnterDateSubtaskInput>
{
    public static JsonEnterDateSubtaskInput _parse(final khe khe) throws IOException {
        final JsonEnterDateSubtaskInput jsonEnterDateSubtaskInput = new JsonEnterDateSubtaskInput();
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
            parseField(jsonEnterDateSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonEnterDateSubtaskInput;
    }
    
    public static void _serialize(final JsonEnterDateSubtaskInput jsonEnterDateSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEnterDateSubtaskInput.b != null) {
            tfe.i("date");
            JsonDate$$JsonObjectMapper._serialize(jsonEnterDateSubtaskInput.b, tfe, true);
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonEnterDateSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterDateSubtaskInput jsonEnterDateSubtaskInput, final String s, final khe khe) throws IOException {
        if ("date".equals(s)) {
            jsonEnterDateSubtaskInput.b = JsonDate$$JsonObjectMapper._parse(khe);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonEnterDateSubtaskInput, s, khe);
        }
    }
    
    public JsonEnterDateSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterDateSubtaskInput jsonEnterDateSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterDateSubtaskInput, tfe, b);
    }
}
