// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRichFeedbackBehaviorToggleFollowTopic$$JsonObjectMapper extends JsonMapper<JsonTimelineRichFeedbackBehaviorToggleFollowTopic>
{
    public static JsonTimelineRichFeedbackBehaviorToggleFollowTopic _parse(final tge tge) throws IOException {
        final JsonTimelineRichFeedbackBehaviorToggleFollowTopic jsonTimelineRichFeedbackBehaviorToggleFollowTopic = new JsonTimelineRichFeedbackBehaviorToggleFollowTopic();
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
            parseField(jsonTimelineRichFeedbackBehaviorToggleFollowTopic, d, tge);
            tge.l0();
        }
        return jsonTimelineRichFeedbackBehaviorToggleFollowTopic;
    }
    
    public static void _serialize(final JsonTimelineRichFeedbackBehaviorToggleFollowTopic jsonTimelineRichFeedbackBehaviorToggleFollowTopic, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineRichFeedbackBehaviorToggleFollowTopic.b != null) {
            afe.i("topic");
            JsonIdWrapper$$JsonObjectMapper._serialize(jsonTimelineRichFeedbackBehaviorToggleFollowTopic.b, afe, true);
        }
        afe.t0("topicId", jsonTimelineRichFeedbackBehaviorToggleFollowTopic.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRichFeedbackBehaviorToggleFollowTopic jsonTimelineRichFeedbackBehaviorToggleFollowTopic, final String s, final tge tge) throws IOException {
        if ("topic".equals(s)) {
            jsonTimelineRichFeedbackBehaviorToggleFollowTopic.b = JsonIdWrapper$$JsonObjectMapper._parse(tge);
        }
        else if ("topicId".equals(s)) {
            jsonTimelineRichFeedbackBehaviorToggleFollowTopic.a = tge.T((String)null);
        }
    }
    
    public JsonTimelineRichFeedbackBehaviorToggleFollowTopic parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineRichFeedbackBehaviorToggleFollowTopic jsonTimelineRichFeedbackBehaviorToggleFollowTopic, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineRichFeedbackBehaviorToggleFollowTopic, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineRichFeedbackBehaviorToggleFollowTopic)o, afe, b);
    }
}
