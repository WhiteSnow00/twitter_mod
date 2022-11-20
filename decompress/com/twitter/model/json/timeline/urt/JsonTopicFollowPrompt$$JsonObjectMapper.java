// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicFollowPrompt$$JsonObjectMapper extends JsonMapper<JsonTopicFollowPrompt>
{
    public static final gmt TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER;
    
    static {
        TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER = new gmt();
    }
    
    public static JsonTopicFollowPrompt _parse(final tge tge) throws IOException {
        final JsonTopicFollowPrompt jsonTopicFollowPrompt = new JsonTopicFollowPrompt();
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
            parseField(jsonTopicFollowPrompt, d, tge);
            tge.l0();
        }
        return jsonTopicFollowPrompt;
    }
    
    public static void _serialize(final JsonTopicFollowPrompt jsonTopicFollowPrompt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonTopicFollowPrompt$$JsonObjectMapper.TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonTopicFollowPrompt.c, "displayType", true, afe);
        afe.t0("followIncentiveText", jsonTopicFollowPrompt.e);
        afe.t0("followIncentiveTitle", jsonTopicFollowPrompt.d);
        if (jsonTopicFollowPrompt.b != null) {
            LoganSquare.typeConverterFor((Class)jwd.class).serialize((Object)jsonTopicFollowPrompt.b, "followPromptTopic", true, afe);
        }
        afe.t0("topicId", jsonTopicFollowPrompt.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTopicFollowPrompt jsonTopicFollowPrompt, final String s, final tge tge) throws IOException {
        if (!"displayType".equals(s) && !"followPromptDisplayType".equals(s)) {
            if ("followIncentiveText".equals(s)) {
                jsonTopicFollowPrompt.e = tge.T((String)null);
            }
            else if ("followIncentiveTitle".equals(s)) {
                jsonTopicFollowPrompt.d = tge.T((String)null);
            }
            else if ("followPromptTopic".equals(s)) {
                jsonTopicFollowPrompt.b = (jwd)LoganSquare.typeConverterFor((Class)jwd.class).parse(tge);
            }
            else if ("topicId".equals(s)) {
                jsonTopicFollowPrompt.a = tge.T((String)null);
            }
        }
        else {
            jsonTopicFollowPrompt.c = (int)((StringBasedTypeConverter)JsonTopicFollowPrompt$$JsonObjectMapper.TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonTopicFollowPrompt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTopicFollowPrompt jsonTopicFollowPrompt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTopicFollowPrompt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTopicFollowPrompt)o, afe, b);
    }
}
