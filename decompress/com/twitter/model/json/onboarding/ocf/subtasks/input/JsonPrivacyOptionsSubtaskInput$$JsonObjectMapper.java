// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPrivacyOptionsSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonPrivacyOptionsSubtaskInput>
{
    public static JsonPrivacyOptionsSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonPrivacyOptionsSubtaskInput jsonPrivacyOptionsSubtaskInput = new JsonPrivacyOptionsSubtaskInput();
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
            parseField(jsonPrivacyOptionsSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonPrivacyOptionsSubtaskInput;
    }
    
    public static void _serialize(final JsonPrivacyOptionsSubtaskInput jsonPrivacyOptionsSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("discoverable_by_email", jsonPrivacyOptionsSubtaskInput.c);
        yfe.e("discoverable_by_phone", jsonPrivacyOptionsSubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonPrivacyOptionsSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPrivacyOptionsSubtaskInput jsonPrivacyOptionsSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("discoverable_by_email".equals(s)) {
            jsonPrivacyOptionsSubtaskInput.c = qhe.l();
        }
        else if ("discoverable_by_phone".equals(s)) {
            jsonPrivacyOptionsSubtaskInput.b = qhe.l();
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonPrivacyOptionsSubtaskInput, s, qhe);
        }
    }
    
    public JsonPrivacyOptionsSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPrivacyOptionsSubtaskInput jsonPrivacyOptionsSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPrivacyOptionsSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPrivacyOptionsSubtaskInput)o, yfe, b);
    }
}
