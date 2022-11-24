// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEngagementMetadataInput$$JsonObjectMapper extends JsonMapper<JsonEngagementMetadataInput>
{
    public static JsonEngagementMetadataInput _parse(final qhe qhe) throws IOException {
        final JsonEngagementMetadataInput jsonEngagementMetadataInput = new JsonEngagementMetadataInput();
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
            parseField(jsonEngagementMetadataInput, d, qhe);
            qhe.m0();
        }
        return jsonEngagementMetadataInput;
    }
    
    public static void _serialize(final JsonEngagementMetadataInput jsonEngagementMetadataInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonEngagementMetadataInput.a != null) {
            yfe.i("conversational_card_details");
            JsonConversationalCardDetailsInput$$JsonObjectMapper._serialize(jsonEngagementMetadataInput.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEngagementMetadataInput jsonEngagementMetadataInput, final String s, final qhe qhe) throws IOException {
        if ("conversational_card_details".equals(s)) {
            jsonEngagementMetadataInput.a = JsonConversationalCardDetailsInput$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonEngagementMetadataInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEngagementMetadataInput jsonEngagementMetadataInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEngagementMetadataInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEngagementMetadataInput)o, yfe, b);
    }
}
