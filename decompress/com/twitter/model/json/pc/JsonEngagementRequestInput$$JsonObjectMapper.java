// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEngagementRequestInput$$JsonObjectMapper extends JsonMapper<JsonEngagementRequestInput>
{
    public static JsonEngagementRequestInput _parse(final qhe qhe) throws IOException {
        final JsonEngagementRequestInput jsonEngagementRequestInput = new JsonEngagementRequestInput();
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
            parseField(jsonEngagementRequestInput, d, qhe);
            qhe.m0();
        }
        return jsonEngagementRequestInput;
    }
    
    public static void _serialize(final JsonEngagementRequestInput jsonEngagementRequestInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("earned", jsonEngagementRequestInput.b);
        if (jsonEngagementRequestInput.c != null) {
            yfe.i("engagement_metadata");
            JsonEngagementMetadataInput$$JsonObjectMapper._serialize(jsonEngagementRequestInput.c, yfe, true);
        }
        yfe.u0("impression_id", jsonEngagementRequestInput.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEngagementRequestInput jsonEngagementRequestInput, final String s, final qhe qhe) throws IOException {
        if ("earned".equals(s)) {
            jsonEngagementRequestInput.b = qhe.l();
        }
        else if ("engagement_metadata".equals(s)) {
            jsonEngagementRequestInput.c = JsonEngagementMetadataInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("impression_id".equals(s)) {
            jsonEngagementRequestInput.a = qhe.T((String)null);
        }
    }
    
    public JsonEngagementRequestInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEngagementRequestInput jsonEngagementRequestInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEngagementRequestInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEngagementRequestInput)o, yfe, b);
    }
}
