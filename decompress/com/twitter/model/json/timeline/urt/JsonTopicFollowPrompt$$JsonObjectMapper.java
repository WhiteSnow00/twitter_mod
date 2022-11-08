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
    public static final plt TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER;
    
    static {
        TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER = new plt();
    }
    
    public static JsonTopicFollowPrompt _parse(final khe khe) throws IOException {
        final JsonTopicFollowPrompt jsonTopicFollowPrompt = new JsonTopicFollowPrompt();
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
            parseField(jsonTopicFollowPrompt, d, khe);
            khe.m0();
        }
        return jsonTopicFollowPrompt;
    }
    
    public static void _serialize(final JsonTopicFollowPrompt jsonTopicFollowPrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonTopicFollowPrompt$$JsonObjectMapper.TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonTopicFollowPrompt.c, "displayType", true, tfe);
        tfe.u0("followIncentiveText", jsonTopicFollowPrompt.e);
        tfe.u0("followIncentiveTitle", jsonTopicFollowPrompt.d);
        if (jsonTopicFollowPrompt.b != null) {
            LoganSquare.typeConverterFor((Class)gxd.class).serialize((Object)jsonTopicFollowPrompt.b, "followPromptTopic", true, tfe);
        }
        tfe.u0("topicId", jsonTopicFollowPrompt.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTopicFollowPrompt jsonTopicFollowPrompt, final String s, final khe khe) throws IOException {
        if (!"displayType".equals(s) && !"followPromptDisplayType".equals(s)) {
            if ("followIncentiveText".equals(s)) {
                jsonTopicFollowPrompt.e = khe.T((String)null);
            }
            else if ("followIncentiveTitle".equals(s)) {
                jsonTopicFollowPrompt.d = khe.T((String)null);
            }
            else if ("followPromptTopic".equals(s)) {
                jsonTopicFollowPrompt.b = (gxd)LoganSquare.typeConverterFor((Class)gxd.class).parse(khe);
            }
            else if ("topicId".equals(s)) {
                jsonTopicFollowPrompt.a = khe.T((String)null);
            }
        }
        else {
            jsonTopicFollowPrompt.c = (int)((StringBasedTypeConverter)JsonTopicFollowPrompt$$JsonObjectMapper.TOPIC_FOLLOW_PROMPT_DISPLAY_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonTopicFollowPrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTopicFollowPrompt jsonTopicFollowPrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTopicFollowPrompt, tfe, b);
    }
}
