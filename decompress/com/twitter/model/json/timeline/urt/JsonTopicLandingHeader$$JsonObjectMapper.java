// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicLandingHeader$$JsonObjectMapper extends JsonMapper<JsonTopicLandingHeader>
{
    public static JsonTopicLandingHeader _parse(final khe khe) throws IOException {
        final JsonTopicLandingHeader jsonTopicLandingHeader = new JsonTopicLandingHeader();
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
            parseField(jsonTopicLandingHeader, d, khe);
            khe.m0();
        }
        return jsonTopicLandingHeader;
    }
    
    public static void _serialize(final JsonTopicLandingHeader jsonTopicLandingHeader, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTopicLandingHeader.b != null) {
            LoganSquare.typeConverterFor((Class)gxd.class).serialize((Object)jsonTopicLandingHeader.b, "interestTopic", true, tfe);
        }
        tfe.u0("topicId", jsonTopicLandingHeader.a);
        tfe.u0("topicLandingContext", jsonTopicLandingHeader.c);
        if (jsonTopicLandingHeader.d != null) {
            LoganSquare.typeConverterFor((Class)jvv.class).serialize((Object)jsonTopicLandingHeader.d, "facepile", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTopicLandingHeader jsonTopicLandingHeader, final String s, final khe khe) throws IOException {
        if ("interestTopic".equals(s)) {
            jsonTopicLandingHeader.b = (gxd)LoganSquare.typeConverterFor((Class)gxd.class).parse(khe);
        }
        else if ("topicId".equals(s)) {
            jsonTopicLandingHeader.a = khe.T((String)null);
        }
        else if ("topicLandingContext".equals(s)) {
            jsonTopicLandingHeader.c = khe.T((String)null);
        }
        else if ("facepile".equals(s)) {
            jsonTopicLandingHeader.d = (jvv)LoganSquare.typeConverterFor((Class)jvv.class).parse(khe);
        }
    }
    
    public JsonTopicLandingHeader parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTopicLandingHeader jsonTopicLandingHeader, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTopicLandingHeader, tfe, b);
    }
}
