// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonImmediateTimelineReaction$$JsonObjectMapper extends JsonMapper<JsonImmediateTimelineReaction>
{
    public static JsonImmediateTimelineReaction _parse(final qhe qhe) throws IOException {
        final JsonImmediateTimelineReaction jsonImmediateTimelineReaction = new JsonImmediateTimelineReaction();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonImmediateTimelineReaction, d, qhe);
            qhe.m0();
        }
        return jsonImmediateTimelineReaction;
    }
    
    public static void _serialize(final JsonImmediateTimelineReaction jsonImmediateTimelineReaction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("key", jsonImmediateTimelineReaction.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonImmediateTimelineReaction jsonImmediateTimelineReaction, final String s, final qhe qhe) throws IOException {
        if ("key".equals(s)) {
            jsonImmediateTimelineReaction.a = qhe.T((String)null);
        }
    }
    
    public JsonImmediateTimelineReaction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonImmediateTimelineReaction jsonImmediateTimelineReaction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonImmediateTimelineReaction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonImmediateTimelineReaction)o, yfe, b);
    }
}
