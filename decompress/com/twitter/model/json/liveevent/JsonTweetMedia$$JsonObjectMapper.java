// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetMedia$$JsonObjectMapper extends JsonMapper<JsonTweetMedia>
{
    public static JsonTweetMedia _parse(final khe khe) throws IOException {
        final JsonTweetMedia jsonTweetMedia = new JsonTweetMedia();
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
            parseField(jsonTweetMedia, d, khe);
            khe.m0();
        }
        return jsonTweetMedia;
    }
    
    public static void _serialize(final JsonTweetMedia jsonTweetMedia, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonTweetMedia.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetMedia jsonTweetMedia, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonTweetMedia.a = khe.T((String)null);
        }
    }
    
    public JsonTweetMedia parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetMedia jsonTweetMedia, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetMedia, tfe, b);
    }
}
