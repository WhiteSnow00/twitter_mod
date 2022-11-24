// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfRichTextQuantityPair$$JsonObjectMapper extends JsonMapper<JsonOcfRichTextQuantityPair>
{
    public static JsonOcfRichTextQuantityPair _parse(final qhe qhe) throws IOException {
        final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair = new JsonOcfRichTextQuantityPair();
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
            parseField(jsonOcfRichTextQuantityPair, d, qhe);
            qhe.m0();
        }
        return jsonOcfRichTextQuantityPair;
    }
    
    public static void _serialize(final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOcfRichTextQuantityPair.b != null) {
            yfe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfRichTextQuantityPair.b, yfe, true);
        }
        yfe.T("threshold", jsonOcfRichTextQuantityPair.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair, final String s, final qhe qhe) throws IOException {
        if ("text".equals(s)) {
            jsonOcfRichTextQuantityPair.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("threshold".equals(s)) {
            jsonOcfRichTextQuantityPair.a = qhe.z();
        }
    }
    
    public JsonOcfRichTextQuantityPair parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfRichTextQuantityPair, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfRichTextQuantityPair)o, yfe, b);
    }
}
