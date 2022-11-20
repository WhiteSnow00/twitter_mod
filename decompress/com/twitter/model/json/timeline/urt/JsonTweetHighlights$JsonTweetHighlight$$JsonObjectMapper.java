// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetHighlights$JsonTweetHighlight$$JsonObjectMapper extends JsonMapper<JsonTweetHighlights$JsonTweetHighlight>
{
    public static JsonTweetHighlights$JsonTweetHighlight _parse(final tge tge) throws IOException {
        final JsonTweetHighlights$JsonTweetHighlight jsonTweetHighlights$JsonTweetHighlight = new JsonTweetHighlights$JsonTweetHighlight();
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
            parseField(jsonTweetHighlights$JsonTweetHighlight, d, tge);
            tge.l0();
        }
        return jsonTweetHighlights$JsonTweetHighlight;
    }
    
    public static void _serialize(final JsonTweetHighlights$JsonTweetHighlight jsonTweetHighlights$JsonTweetHighlight, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("endIndex", jsonTweetHighlights$JsonTweetHighlight.b);
        afe.T("startIndex", jsonTweetHighlights$JsonTweetHighlight.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetHighlights$JsonTweetHighlight jsonTweetHighlights$JsonTweetHighlight, final String s, final tge tge) throws IOException {
        if ("endIndex".equals(s)) {
            jsonTweetHighlights$JsonTweetHighlight.b = tge.y();
        }
        else if ("startIndex".equals(s)) {
            jsonTweetHighlights$JsonTweetHighlight.a = tge.y();
        }
    }
    
    public JsonTweetHighlights$JsonTweetHighlight parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetHighlights$JsonTweetHighlight jsonTweetHighlights$JsonTweetHighlight, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetHighlights$JsonTweetHighlight, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetHighlights$JsonTweetHighlight)o, afe, b);
    }
}
