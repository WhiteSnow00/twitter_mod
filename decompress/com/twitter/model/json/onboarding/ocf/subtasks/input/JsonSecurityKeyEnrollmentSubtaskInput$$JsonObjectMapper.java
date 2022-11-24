// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSecurityKeyEnrollmentSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonSecurityKeyEnrollmentSubtaskInput>
{
    public static JsonSecurityKeyEnrollmentSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonSecurityKeyEnrollmentSubtaskInput jsonSecurityKeyEnrollmentSubtaskInput = new JsonSecurityKeyEnrollmentSubtaskInput();
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
            parseField(jsonSecurityKeyEnrollmentSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonSecurityKeyEnrollmentSubtaskInput;
    }
    
    public static void _serialize(final JsonSecurityKeyEnrollmentSubtaskInput jsonSecurityKeyEnrollmentSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("challenge_response", jsonSecurityKeyEnrollmentSubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonSecurityKeyEnrollmentSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSecurityKeyEnrollmentSubtaskInput jsonSecurityKeyEnrollmentSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("challenge_response".equals(s)) {
            jsonSecurityKeyEnrollmentSubtaskInput.b = qhe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonSecurityKeyEnrollmentSubtaskInput, s, qhe);
        }
    }
    
    public JsonSecurityKeyEnrollmentSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSecurityKeyEnrollmentSubtaskInput jsonSecurityKeyEnrollmentSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSecurityKeyEnrollmentSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSecurityKeyEnrollmentSubtaskInput)o, yfe, b);
    }
}
