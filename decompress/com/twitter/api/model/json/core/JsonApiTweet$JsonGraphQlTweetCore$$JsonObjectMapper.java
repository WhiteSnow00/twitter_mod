// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonApiTweet$JsonGraphQlTweetCore$$JsonObjectMapper extends JsonMapper<JsonApiTweet.JsonGraphQlTweetCore>
{
    public static JsonApiTweet.JsonGraphQlTweetCore _parse(final khe khe) throws IOException {
        final JsonApiTweet.JsonGraphQlTweetCore jsonGraphQlTweetCore = new JsonApiTweet.JsonGraphQlTweetCore();
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
            parseField(jsonGraphQlTweetCore, d, khe);
            khe.m0();
        }
        return jsonGraphQlTweetCore;
    }
    
    public static void _serialize(final JsonApiTweet.JsonGraphQlTweetCore jsonGraphQlTweetCore, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonGraphQlTweetCore.a != null) {
            LoganSquare.typeConverterFor((Class)rhw.class).serialize((Object)jsonGraphQlTweetCore.a, "user_result", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonApiTweet.JsonGraphQlTweetCore jsonGraphQlTweetCore, final String s, final khe khe) throws IOException {
        if ("user_result".equals(s)) {
            jsonGraphQlTweetCore.a = (rhw)LoganSquare.typeConverterFor((Class)rhw.class).parse(khe);
        }
    }
    
    public JsonApiTweet.JsonGraphQlTweetCore parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonApiTweet.JsonGraphQlTweetCore jsonGraphQlTweetCore, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGraphQlTweetCore, tfe, b);
    }
}
