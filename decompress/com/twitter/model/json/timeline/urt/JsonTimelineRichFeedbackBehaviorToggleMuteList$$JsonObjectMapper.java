// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.core.JsonTwitterList$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRichFeedbackBehaviorToggleMuteList$$JsonObjectMapper extends JsonMapper<JsonTimelineRichFeedbackBehaviorToggleMuteList>
{
    public static JsonTimelineRichFeedbackBehaviorToggleMuteList _parse(final khe khe) throws IOException {
        final JsonTimelineRichFeedbackBehaviorToggleMuteList list = new JsonTimelineRichFeedbackBehaviorToggleMuteList();
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
            parseField(list, d, khe);
            khe.m0();
        }
        return list;
    }
    
    public static void _serialize(final JsonTimelineRichFeedbackBehaviorToggleMuteList list, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (list.b != null) {
            tfe.i("list");
            JsonTwitterList$$JsonObjectMapper._serialize(list.b, tfe, true);
        }
        tfe.W("listId", list.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRichFeedbackBehaviorToggleMuteList list, final String s, final khe khe) throws IOException {
        if ("list".equals(s)) {
            list.b = JsonTwitterList$$JsonObjectMapper._parse(khe);
        }
        else if ("listId".equals(s)) {
            list.a = khe.L();
        }
    }
    
    public JsonTimelineRichFeedbackBehaviorToggleMuteList parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineRichFeedbackBehaviorToggleMuteList list, final tfe tfe, final boolean b) throws IOException {
        _serialize(list, tfe, b);
    }
}
