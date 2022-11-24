// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetCompositionNudge$$JsonObjectMapper extends JsonMapper<JsonTweetCompositionNudge>
{
    public static JsonTweetCompositionNudge _parse(final qhe qhe) throws IOException {
        final JsonTweetCompositionNudge jsonTweetCompositionNudge = new JsonTweetCompositionNudge();
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
            parseField(jsonTweetCompositionNudge, d, qhe);
            qhe.m0();
        }
        return jsonTweetCompositionNudge;
    }
    
    public static void _serialize(final JsonTweetCompositionNudge jsonTweetCompositionNudge, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTweetCompositionNudge.a != null) {
            LoganSquare.typeConverterFor((Class)o0j$b.class).serialize((Object)jsonTweetCompositionNudge.a, "tweet_composition_nudge_payload", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetCompositionNudge jsonTweetCompositionNudge, final String s, final qhe qhe) throws IOException {
        if ("tweet_composition_nudge_payload".equals(s)) {
            jsonTweetCompositionNudge.a = (o0j$b)LoganSquare.typeConverterFor((Class)o0j$b.class).parse(qhe);
        }
    }
    
    public JsonTweetCompositionNudge parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetCompositionNudge jsonTweetCompositionNudge, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetCompositionNudge, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetCompositionNudge)o, yfe, b);
    }
}
