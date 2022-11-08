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
    public static final jke JSON_TWEET_ACTION_TYPE_CONVERTER;
    
    static {
        JSON_TWEET_ACTION_TYPE_CONVERTER = new jke();
    }
    
    public static JsonTweetReactiveTrigger _parse(final khe khe) throws IOException {
        final JsonTweetReactiveTrigger jsonTweetReactiveTrigger = new JsonTweetReactiveTrigger();
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
            parseField(jsonTweetReactiveTrigger, d, khe);
            khe.m0();
        }
        return jsonTweetReactiveTrigger;
    }
    
    public static void _serialize(final JsonTweetReactiveTrigger jsonTweetReactiveTrigger, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTweetReactiveTrigger.b != null) {
            LoganSquare.typeConverterFor((Class)j1t.class).serialize((Object)jsonTweetReactiveTrigger.b, "reaction", true, tfe);
        }
        final ozl$b$a a = jsonTweetReactiveTrigger.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonTweetReactiveTrigger$$JsonObjectMapper.JSON_TWEET_ACTION_TYPE_CONVERTER).serialize((Object)a, "tweetAction", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetReactiveTrigger jsonTweetReactiveTrigger, final String s, final khe khe) throws IOException {
        if ("reaction".equals(s)) {
            jsonTweetReactiveTrigger.b = (j1t)LoganSquare.typeConverterFor((Class)j1t.class).parse(khe);
        }
        else if ("tweetAction".equals(s)) {
            jsonTweetReactiveTrigger.a = (ozl$b$a)((StringBasedTypeConverter)JsonTweetReactiveTrigger$$JsonObjectMapper.JSON_TWEET_ACTION_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonTweetReactiveTrigger parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetReactiveTrigger jsonTweetReactiveTrigger, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetReactiveTrigger, tfe, b);
    }
}
