// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetReactiveTrigger$$JsonObjectMapper extends JsonMapper<JsonTweetReactiveTrigger>
{
    public static final tje JSON_TWEET_ACTION_TYPE_CONVERTER;
    
    static {
        JSON_TWEET_ACTION_TYPE_CONVERTER = new tje();
    }
    
    public static JsonTweetReactiveTrigger _parse(final tge tge) throws IOException {
        final JsonTweetReactiveTrigger jsonTweetReactiveTrigger = new JsonTweetReactiveTrigger();
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
            parseField(jsonTweetReactiveTrigger, d, tge);
            tge.l0();
        }
        return jsonTweetReactiveTrigger;
    }
    
    public static void _serialize(final JsonTweetReactiveTrigger jsonTweetReactiveTrigger, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTweetReactiveTrigger.b != null) {
            LoganSquare.typeConverterFor((Class)z1t.class).serialize((Object)jsonTweetReactiveTrigger.b, "reaction", true, afe);
        }
        final d0m$b$a a = jsonTweetReactiveTrigger.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonTweetReactiveTrigger$$JsonObjectMapper.JSON_TWEET_ACTION_TYPE_CONVERTER).serialize((Object)a, "tweetAction", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetReactiveTrigger jsonTweetReactiveTrigger, final String s, final tge tge) throws IOException {
        if ("reaction".equals(s)) {
            jsonTweetReactiveTrigger.b = (z1t)LoganSquare.typeConverterFor((Class)z1t.class).parse(tge);
        }
        else if ("tweetAction".equals(s)) {
            jsonTweetReactiveTrigger.a = (d0m$b$a)((StringBasedTypeConverter)JsonTweetReactiveTrigger$$JsonObjectMapper.JSON_TWEET_ACTION_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonTweetReactiveTrigger parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetReactiveTrigger jsonTweetReactiveTrigger, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetReactiveTrigger, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetReactiveTrigger)o, afe, b);
    }
}
