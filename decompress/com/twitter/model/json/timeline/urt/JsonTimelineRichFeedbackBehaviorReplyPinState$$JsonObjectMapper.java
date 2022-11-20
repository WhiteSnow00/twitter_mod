// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRichFeedbackBehaviorReplyPinState$$JsonObjectMapper extends JsonMapper<JsonTimelineRichFeedbackBehaviorReplyPinState>
{
    public static final fdk PIN_STATE_TYPE_CONVERTER;
    
    static {
        PIN_STATE_TYPE_CONVERTER = new fdk();
    }
    
    public static JsonTimelineRichFeedbackBehaviorReplyPinState _parse(final tge tge) throws IOException {
        final JsonTimelineRichFeedbackBehaviorReplyPinState jsonTimelineRichFeedbackBehaviorReplyPinState = new JsonTimelineRichFeedbackBehaviorReplyPinState();
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
            parseField(jsonTimelineRichFeedbackBehaviorReplyPinState, d, tge);
            tge.l0();
        }
        return jsonTimelineRichFeedbackBehaviorReplyPinState;
    }
    
    public static void _serialize(final JsonTimelineRichFeedbackBehaviorReplyPinState jsonTimelineRichFeedbackBehaviorReplyPinState, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final edk a = jsonTimelineRichFeedbackBehaviorReplyPinState.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonTimelineRichFeedbackBehaviorReplyPinState$$JsonObjectMapper.PIN_STATE_TYPE_CONVERTER).serialize((Object)a, "reply_pin_state", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRichFeedbackBehaviorReplyPinState jsonTimelineRichFeedbackBehaviorReplyPinState, final String s, final tge tge) throws IOException {
        if ("reply_pin_state".equals(s)) {
            jsonTimelineRichFeedbackBehaviorReplyPinState.a = (edk)((StringBasedTypeConverter)JsonTimelineRichFeedbackBehaviorReplyPinState$$JsonObjectMapper.PIN_STATE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonTimelineRichFeedbackBehaviorReplyPinState parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineRichFeedbackBehaviorReplyPinState jsonTimelineRichFeedbackBehaviorReplyPinState, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineRichFeedbackBehaviorReplyPinState, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineRichFeedbackBehaviorReplyPinState)o, afe, b);
    }
}
