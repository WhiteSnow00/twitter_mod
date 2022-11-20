// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetMedia$$JsonObjectMapper extends JsonMapper<JsonTweetMedia>
{
    public static JsonTweetMedia _parse(final tge tge) throws IOException {
        final JsonTweetMedia jsonTweetMedia = new JsonTweetMedia();
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
            parseField(jsonTweetMedia, d, tge);
            tge.l0();
        }
        return jsonTweetMedia;
    }
    
    public static void _serialize(final JsonTweetMedia jsonTweetMedia, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("id", jsonTweetMedia.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetMedia jsonTweetMedia, final String s, final tge tge) throws IOException {
        if ("id".equals(s)) {
            jsonTweetMedia.a = tge.T((String)null);
        }
    }
    
    public JsonTweetMedia parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetMedia jsonTweetMedia, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetMedia, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetMedia)o, afe, b);
    }
}
