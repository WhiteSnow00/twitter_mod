// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConversationTweet$$JsonObjectMapper extends JsonMapper<JsonConversationTweet>
{
    public static JsonConversationTweet _parse(final qhe qhe) throws IOException {
        final JsonConversationTweet jsonConversationTweet = new JsonConversationTweet();
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
            parseField(jsonConversationTweet, d, qhe);
            qhe.m0();
        }
        return jsonConversationTweet;
    }
    
    public static void _serialize(final JsonConversationTweet jsonConversationTweet, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonConversationTweet.a != null) {
            LoganSquare.typeConverterFor((Class)o7t.class).serialize((Object)jsonConversationTweet.a, "tweet", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonConversationTweet jsonConversationTweet, final String s, final qhe qhe) throws IOException {
        if ("tweet".equals(s)) {
            jsonConversationTweet.a = (o7t)LoganSquare.typeConverterFor((Class)o7t.class).parse(qhe);
        }
    }
    
    public JsonConversationTweet parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonConversationTweet jsonConversationTweet, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonConversationTweet, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonConversationTweet)o, yfe, b);
    }
}
