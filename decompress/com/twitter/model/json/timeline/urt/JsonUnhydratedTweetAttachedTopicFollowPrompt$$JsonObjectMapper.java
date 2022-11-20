// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnhydratedTweetAttachedTopicFollowPrompt$$JsonObjectMapper extends JsonMapper<JsonUnhydratedTweetAttachedTopicFollowPrompt>
{
    public static JsonUnhydratedTweetAttachedTopicFollowPrompt _parse(final tge tge) throws IOException {
        final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt = new JsonUnhydratedTweetAttachedTopicFollowPrompt();
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
            parseField(jsonUnhydratedTweetAttachedTopicFollowPrompt, d, tge);
            tge.l0();
        }
        return jsonUnhydratedTweetAttachedTopicFollowPrompt;
    }
    
    public static void _serialize(final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)h0p.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.c, "clientEventInfo", true, afe);
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.a != null) {
            LoganSquare.typeConverterFor((Class)oxm.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.a, "description", true, afe);
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.b != null) {
            LoganSquare.typeConverterFor((Class)pdu.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.b, "displayType", true, afe);
        }
        if (jsonUnhydratedTweetAttachedTopicFollowPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)qvs.class).serialize((Object)jsonUnhydratedTweetAttachedTopicFollowPrompt.d, "feedbackInfo", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt, final String s, final tge tge) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.c = (h0p)LoganSquare.typeConverterFor((Class)h0p.class).parse(tge);
        }
        else if ("description".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.a = (oxm)LoganSquare.typeConverterFor((Class)oxm.class).parse(tge);
        }
        else if ("displayType".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.b = (pdu)LoganSquare.typeConverterFor((Class)pdu.class).parse(tge);
        }
        else if ("feedbackInfo".equals(s)) {
            jsonUnhydratedTweetAttachedTopicFollowPrompt.d = (qvs)LoganSquare.typeConverterFor((Class)qvs.class).parse(tge);
        }
    }
    
    public JsonUnhydratedTweetAttachedTopicFollowPrompt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUnhydratedTweetAttachedTopicFollowPrompt jsonUnhydratedTweetAttachedTopicFollowPrompt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUnhydratedTweetAttachedTopicFollowPrompt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUnhydratedTweetAttachedTopicFollowPrompt)o, afe, b);
    }
}
