// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnhydratedTweetAttachedTopicFollowPrompt$$JsonObjectMapper extends JsonMapper<JsonUnhydratedTweetAttachedTopicFollowPrompt>
{
    public static JsonUnhydratedTweetAttachedTopicFollowPrompt _parse(final khe khe) throws IOException {
        final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt = new JsonUnhydratedTweetAttachedTopicFollowPrompt();
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
            parseField(jsonUnhydratedTweetAttachedTopicFollowPrompt, d, khe);
            khe.m0();
        }
        return jsonUnhydratedTweetAttachedTopicFollowPrompt;
    }
    
    public static void _serialize(final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)qzo.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.c, "clientEventInfo", true, tfe);
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.a != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.a, "description", true, tfe);
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.b != null) {
            LoganSquare.typeConverterFor((Class)zcu.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.b, "displayType", true, tfe);
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)cvs.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.d, "feedbackInfo", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt, final String s, final khe khe) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.c = (qzo)LoganSquare.typeConverterFor((Class)qzo.class).parse(khe);
        }
        else if ("description".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.a = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("displayType".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.b = (zcu)LoganSquare.typeConverterFor((Class)zcu.class).parse(khe);
        }
        else if ("feedbackInfo".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.d = (cvs)LoganSquare.typeConverterFor((Class)cvs.class).parse(khe);
        }
    }
    
    public JsonUnhydratedTweetAttachedTopicFollowPrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUnhydratedTweetAttachedTopicFollowPrompt, tfe, b);
    }
}
