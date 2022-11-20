// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineReaction$$JsonObjectMapper extends JsonMapper<JsonTimelineReaction>
{
    public static JsonTimelineReaction _parse(final tge tge) throws IOException {
        final JsonTimelineReaction jsonTimelineReaction = new JsonTimelineReaction();
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
            parseField(jsonTimelineReaction, d, tge);
            tge.l0();
        }
        return jsonTimelineReaction;
    }
    
    public static void _serialize(final JsonTimelineReaction jsonTimelineReaction, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineReaction.a != null) {
            LoganSquare.typeConverterFor((Class)a2t.class).serialize((Object)jsonTimelineReaction.a, "execution", true, afe);
        }
        afe.T("maxExecutionCount", (int)jsonTimelineReaction.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineReaction jsonTimelineReaction, final String s, final tge tge) throws IOException {
        if ("execution".equals(s)) {
            jsonTimelineReaction.a = (a2t)LoganSquare.typeConverterFor((Class)a2t.class).parse(tge);
        }
        else if ("maxExecutionCount".equals(s)) {
            Integer value;
            if (tge.e() == vie.V0) {
                value = null;
            }
            else {
                value = tge.y();
            }
            jsonTimelineReaction.b = value;
        }
    }
    
    public JsonTimelineReaction parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineReaction jsonTimelineReaction, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineReaction, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineReaction)o, afe, b);
    }
}
