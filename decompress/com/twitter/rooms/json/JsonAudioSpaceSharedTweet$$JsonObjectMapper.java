// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceSharedTweet$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceSharedTweet>
{
    public static JsonAudioSpaceSharedTweet _parse(final tge tge) throws IOException {
        final JsonAudioSpaceSharedTweet jsonAudioSpaceSharedTweet = new JsonAudioSpaceSharedTweet();
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
            parseField(jsonAudioSpaceSharedTweet, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceSharedTweet;
    }
    
    public static void _serialize(final JsonAudioSpaceSharedTweet jsonAudioSpaceSharedTweet, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonAudioSpaceSharedTweet.a != null) {
            LoganSquare.typeConverterFor((Class)upu.a.class).serialize((Object)jsonAudioSpaceSharedTweet.a, "tweet_results", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceSharedTweet jsonAudioSpaceSharedTweet, final String s, final tge tge) throws IOException {
        if ("tweet_results".equals(s)) {
            jsonAudioSpaceSharedTweet.a = (upu.a)LoganSquare.typeConverterFor((Class)upu.a.class).parse(tge);
        }
    }
    
    public JsonAudioSpaceSharedTweet parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceSharedTweet jsonAudioSpaceSharedTweet, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceSharedTweet, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceSharedTweet)o, afe, b);
    }
}
