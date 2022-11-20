// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicLandingHeader$$JsonObjectMapper extends JsonMapper<JsonTopicLandingHeader>
{
    public static JsonTopicLandingHeader _parse(final tge tge) throws IOException {
        final JsonTopicLandingHeader jsonTopicLandingHeader = new JsonTopicLandingHeader();
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
            parseField(jsonTopicLandingHeader, d, tge);
            tge.l0();
        }
        return jsonTopicLandingHeader;
    }
    
    public static void _serialize(final JsonTopicLandingHeader jsonTopicLandingHeader, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTopicLandingHeader.b != null) {
            LoganSquare.typeConverterFor((Class)jwd.class).serialize((Object)jsonTopicLandingHeader.b, "interestTopic", true, afe);
        }
        afe.t0("topicId", jsonTopicLandingHeader.a);
        afe.t0("topicLandingContext", jsonTopicLandingHeader.c);
        if (jsonTopicLandingHeader.d != null) {
            LoganSquare.typeConverterFor((Class)cwv.class).serialize((Object)jsonTopicLandingHeader.d, "facepile", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTopicLandingHeader jsonTopicLandingHeader, final String s, final tge tge) throws IOException {
        if ("interestTopic".equals(s)) {
            jsonTopicLandingHeader.b = (jwd)LoganSquare.typeConverterFor((Class)jwd.class).parse(tge);
        }
        else if ("topicId".equals(s)) {
            jsonTopicLandingHeader.a = tge.T((String)null);
        }
        else if ("topicLandingContext".equals(s)) {
            jsonTopicLandingHeader.c = tge.T((String)null);
        }
        else if ("facepile".equals(s)) {
            jsonTopicLandingHeader.d = (cwv)LoganSquare.typeConverterFor((Class)cwv.class).parse(tge);
        }
    }
    
    public JsonTopicLandingHeader parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTopicLandingHeader jsonTopicLandingHeader, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTopicLandingHeader, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTopicLandingHeader)o, afe, b);
    }
}
