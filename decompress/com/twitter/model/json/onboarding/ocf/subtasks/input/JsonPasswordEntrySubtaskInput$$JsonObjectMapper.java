// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPasswordEntrySubtaskInput$$JsonObjectMapper extends JsonMapper<JsonPasswordEntrySubtaskInput>
{
    public static JsonPasswordEntrySubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonPasswordEntrySubtaskInput jsonPasswordEntrySubtaskInput = new JsonPasswordEntrySubtaskInput();
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
            parseField(jsonPasswordEntrySubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonPasswordEntrySubtaskInput;
    }
    
    public static void _serialize(final JsonPasswordEntrySubtaskInput jsonPasswordEntrySubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("password", jsonPasswordEntrySubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonPasswordEntrySubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPasswordEntrySubtaskInput jsonPasswordEntrySubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("password".equals(s)) {
            jsonPasswordEntrySubtaskInput.b = qhe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonPasswordEntrySubtaskInput, s, qhe);
        }
    }
    
    public JsonPasswordEntrySubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPasswordEntrySubtaskInput jsonPasswordEntrySubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPasswordEntrySubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPasswordEntrySubtaskInput)o, yfe, b);
    }
}
