// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceInterestTopic$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceInterestTopic>
{
    public static JsonAudioSpaceInterestTopic _parse(final tge tge) throws IOException {
        final JsonAudioSpaceInterestTopic jsonAudioSpaceInterestTopic = new JsonAudioSpaceInterestTopic();
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
            parseField(jsonAudioSpaceInterestTopic, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceInterestTopic;
    }
    
    public static void _serialize(final JsonAudioSpaceInterestTopic jsonAudioSpaceInterestTopic, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonAudioSpaceInterestTopic.t();
        LoganSquare.typeConverterFor((Class)jwd.class).serialize((Object)jsonAudioSpaceInterestTopic.t(), "topic", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceInterestTopic jsonAudioSpaceInterestTopic, final String s, final tge tge) throws IOException {
        if ("topic".equals(s)) {
            final jwd a = (jwd)LoganSquare.typeConverterFor((Class)jwd.class).parse(tge);
            Objects.requireNonNull(jsonAudioSpaceInterestTopic);
            czd.f((Object)a, "<set-?>");
            jsonAudioSpaceInterestTopic.a = a;
        }
    }
    
    public JsonAudioSpaceInterestTopic parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceInterestTopic jsonAudioSpaceInterestTopic, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceInterestTopic, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceInterestTopic)o, afe, b);
    }
}
