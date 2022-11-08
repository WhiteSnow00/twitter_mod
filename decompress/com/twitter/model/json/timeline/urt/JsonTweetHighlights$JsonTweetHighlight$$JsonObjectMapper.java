// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetHighlights$JsonTweetHighlight$$JsonObjectMapper extends JsonMapper<JsonTweetHighlights.JsonTweetHighlight>
{
    public static JsonTweetHighlights.JsonTweetHighlight _parse(final khe khe) throws IOException {
        final JsonTweetHighlights.JsonTweetHighlight jsonTweetHighlight = new JsonTweetHighlights.JsonTweetHighlight();
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
            parseField(jsonTweetHighlight, d, khe);
            khe.m0();
        }
        return jsonTweetHighlight;
    }
    
    public static void _serialize(final JsonTweetHighlights.JsonTweetHighlight jsonTweetHighlight, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("endIndex", jsonTweetHighlight.b);
        tfe.T("startIndex", jsonTweetHighlight.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetHighlights.JsonTweetHighlight jsonTweetHighlight, final String s, final khe khe) throws IOException {
        if ("endIndex".equals(s)) {
            jsonTweetHighlight.b = khe.z();
        }
        else if ("startIndex".equals(s)) {
            jsonTweetHighlight.a = khe.z();
        }
    }
    
    public JsonTweetHighlights.JsonTweetHighlight parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetHighlights.JsonTweetHighlight jsonTweetHighlight, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetHighlight, tfe, b);
    }
}
