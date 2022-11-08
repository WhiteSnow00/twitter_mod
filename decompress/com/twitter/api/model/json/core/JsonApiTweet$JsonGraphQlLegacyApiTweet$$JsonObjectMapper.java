// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonApiTweet$JsonGraphQlLegacyApiTweet$$JsonObjectMapper extends JsonMapper<JsonApiTweet$JsonGraphQlLegacyApiTweet>
{
    public static JsonApiTweet$JsonGraphQlLegacyApiTweet _parse(final khe khe) throws IOException {
        final JsonApiTweet$JsonGraphQlLegacyApiTweet jsonApiTweet$JsonGraphQlLegacyApiTweet = new JsonApiTweet$JsonGraphQlLegacyApiTweet();
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
            parseField(jsonApiTweet$JsonGraphQlLegacyApiTweet, d, khe);
            khe.m0();
        }
        return jsonApiTweet$JsonGraphQlLegacyApiTweet;
    }
    
    public static void _serialize(final JsonApiTweet$JsonGraphQlLegacyApiTweet jsonApiTweet$JsonGraphQlLegacyApiTweet, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonApiTweet$JsonGraphQlLegacyApiTweet.U != null) {
            LoganSquare.typeConverterFor((Class)apu$a.class).serialize((Object)jsonApiTweet$JsonGraphQlLegacyApiTweet.U, "retweeted_status_result", true, tfe);
        }
        BaseJsonApiTweet$$JsonObjectMapper._serialize((BaseJsonApiTweet)jsonApiTweet$JsonGraphQlLegacyApiTweet, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonApiTweet$JsonGraphQlLegacyApiTweet jsonApiTweet$JsonGraphQlLegacyApiTweet, final String s, final khe khe) throws IOException {
        if ("retweeted_status_result".equals(s)) {
            jsonApiTweet$JsonGraphQlLegacyApiTweet.U = (apu$a)LoganSquare.typeConverterFor((Class)apu$a.class).parse(khe);
        }
        else {
            BaseJsonApiTweet$$JsonObjectMapper.parseField((BaseJsonApiTweet)jsonApiTweet$JsonGraphQlLegacyApiTweet, s, khe);
        }
    }
    
    public JsonApiTweet$JsonGraphQlLegacyApiTweet parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonApiTweet$JsonGraphQlLegacyApiTweet jsonApiTweet$JsonGraphQlLegacyApiTweet, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonApiTweet$JsonGraphQlLegacyApiTweet, tfe, b);
    }
}
