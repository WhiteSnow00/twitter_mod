// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConversationalCardDetailsInput$$JsonObjectMapper extends JsonMapper<JsonConversationalCardDetailsInput>
{
    public static JsonConversationalCardDetailsInput _parse(final qhe qhe) throws IOException {
        final JsonConversationalCardDetailsInput jsonConversationalCardDetailsInput = new JsonConversationalCardDetailsInput();
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
            parseField(jsonConversationalCardDetailsInput, d, qhe);
            qhe.m0();
        }
        return jsonConversationalCardDetailsInput;
    }
    
    public static void _serialize(final JsonConversationalCardDetailsInput jsonConversationalCardDetailsInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("button_index", jsonConversationalCardDetailsInput.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonConversationalCardDetailsInput jsonConversationalCardDetailsInput, final String s, final qhe qhe) throws IOException {
        if ("button_index".equals(s)) {
            jsonConversationalCardDetailsInput.a = qhe.z();
        }
    }
    
    public JsonConversationalCardDetailsInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonConversationalCardDetailsInput jsonConversationalCardDetailsInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonConversationalCardDetailsInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonConversationalCardDetailsInput)o, yfe, b);
    }
}
