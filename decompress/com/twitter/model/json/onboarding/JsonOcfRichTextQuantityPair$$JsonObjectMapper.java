// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfRichTextQuantityPair$$JsonObjectMapper extends JsonMapper<JsonOcfRichTextQuantityPair>
{
    public static JsonOcfRichTextQuantityPair _parse(final tge tge) throws IOException {
        final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair = new JsonOcfRichTextQuantityPair();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonOcfRichTextQuantityPair, d, tge);
            tge.l0();
        }
        return jsonOcfRichTextQuantityPair;
    }
    
    public static void _serialize(final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOcfRichTextQuantityPair.b != null) {
            afe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfRichTextQuantityPair.b, afe, true);
        }
        afe.T("threshold", jsonOcfRichTextQuantityPair.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair, final String s, final tge tge) throws IOException {
        if ("text".equals(s)) {
            jsonOcfRichTextQuantityPair.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("threshold".equals(s)) {
            jsonOcfRichTextQuantityPair.a = tge.y();
        }
    }
    
    public JsonOcfRichTextQuantityPair parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfRichTextQuantityPair jsonOcfRichTextQuantityPair, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfRichTextQuantityPair, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfRichTextQuantityPair)o, afe, b);
    }
}
