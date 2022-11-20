// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic$$JsonObjectMapper extends JsonMapper<JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic>
{
    public static JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic _parse(final tge tge) throws IOException {
        final JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic = new JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic();
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
            parseField(jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic, d, tge);
            tge.l0();
        }
        return jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic;
    }
    
    public static void _serialize(final JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic.b != null) {
            afe.i("topic");
            JsonIdWrapper$$JsonObjectMapper._serialize(jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic.b, afe, true);
        }
        afe.t0("topicId", jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic, final String s, final tge tge) throws IOException {
        if ("topic".equals(s)) {
            jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic.b = JsonIdWrapper$$JsonObjectMapper._parse(tge);
        }
        else if ("topicId".equals(s)) {
            jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic.a = tge.T((String)null);
        }
    }
    
    public JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineRichFeedbackBehaviorMarkNotInterestedTopic)o, afe, b);
    }
}
