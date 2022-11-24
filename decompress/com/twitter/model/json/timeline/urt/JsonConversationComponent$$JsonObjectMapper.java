// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConversationComponent$$JsonObjectMapper extends JsonMapper<JsonConversationComponent>
{
    public static JsonConversationComponent _parse(final qhe qhe) throws IOException {
        final JsonConversationComponent jsonConversationComponent = new JsonConversationComponent();
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
            parseField(jsonConversationComponent, d, qhe);
            qhe.m0();
        }
        return jsonConversationComponent;
    }
    
    public static void _serialize(final JsonConversationComponent jsonConversationComponent, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonConversationComponent.a != null) {
            LoganSquare.typeConverterFor((Class)wu6.class).serialize((Object)jsonConversationComponent.a, "conversationTweetComponent", true, yfe);
        }
        if (jsonConversationComponent.b != null) {
            LoganSquare.typeConverterFor((Class)csv.class).serialize((Object)jsonConversationComponent.b, "tombstoneComponent", true, yfe);
        }
        if (jsonConversationComponent.c != null) {
            LoganSquare.typeConverterFor((Class)s7t.class).serialize((Object)jsonConversationComponent.c, "tweetComposerComponent", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonConversationComponent jsonConversationComponent, final String s, final qhe qhe) throws IOException {
        if ("conversationTweetComponent".equals(s)) {
            jsonConversationComponent.a = (wu6)LoganSquare.typeConverterFor((Class)wu6.class).parse(qhe);
        }
        else if ("tombstoneComponent".equals(s)) {
            jsonConversationComponent.b = (csv)LoganSquare.typeConverterFor((Class)csv.class).parse(qhe);
        }
        else if ("tweetComposerComponent".equals(s)) {
            jsonConversationComponent.c = (s7t)LoganSquare.typeConverterFor((Class)s7t.class).parse(qhe);
        }
    }
    
    public JsonConversationComponent parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonConversationComponent jsonConversationComponent, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonConversationComponent, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonConversationComponent)o, yfe, b);
    }
}
