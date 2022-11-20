// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.core.JsonTwitterList$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRichFeedbackBehaviorToggleMuteList$$JsonObjectMapper extends JsonMapper<JsonTimelineRichFeedbackBehaviorToggleMuteList>
{
    public static JsonTimelineRichFeedbackBehaviorToggleMuteList _parse(final tge tge) throws IOException {
        final JsonTimelineRichFeedbackBehaviorToggleMuteList list = new JsonTimelineRichFeedbackBehaviorToggleMuteList();
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
            parseField(list, d, tge);
            tge.l0();
        }
        return list;
    }
    
    public static void _serialize(final JsonTimelineRichFeedbackBehaviorToggleMuteList list, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (list.b != null) {
            afe.i("list");
            JsonTwitterList$$JsonObjectMapper._serialize(list.b, afe, true);
        }
        afe.V("listId", list.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRichFeedbackBehaviorToggleMuteList list, final String s, final tge tge) throws IOException {
        if ("list".equals(s)) {
            list.b = JsonTwitterList$$JsonObjectMapper._parse(tge);
        }
        else if ("listId".equals(s)) {
            list.a = tge.K();
        }
    }
    
    public JsonTimelineRichFeedbackBehaviorToggleMuteList parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineRichFeedbackBehaviorToggleMuteList list, final afe afe, final boolean b) throws IOException {
        _serialize(list, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineRichFeedbackBehaviorToggleMuteList)o, afe, b);
    }
}
