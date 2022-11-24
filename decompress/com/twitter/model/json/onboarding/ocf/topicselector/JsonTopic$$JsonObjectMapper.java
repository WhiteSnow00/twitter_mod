// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopic$$JsonObjectMapper extends JsonMapper<JsonTopic>
{
    public static JsonTopic _parse(final qhe qhe) throws IOException {
        final JsonTopic jsonTopic = new JsonTopic();
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
            parseField(jsonTopic, d, qhe);
            qhe.m0();
        }
        return jsonTopic;
    }
    
    public static void _serialize(final JsonTopic jsonTopic, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTopic.c != null) {
            yfe.i("description");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopic.c, yfe, true);
        }
        yfe.u0("id", jsonTopic.a);
        if (jsonTopic.b != null) {
            yfe.i("title");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopic.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopic jsonTopic, final String s, final qhe qhe) throws IOException {
        if ("description".equals(s)) {
            jsonTopic.c = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("id".equals(s)) {
            jsonTopic.a = qhe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonTopic.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonTopic parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopic jsonTopic, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopic, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopic)o, yfe, b);
    }
}
