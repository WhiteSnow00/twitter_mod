// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTimelineMessage$$JsonObjectMapper extends JsonMapper<JsonURTTimelineMessage>
{
    public static final vzs TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER;
    
    static {
        TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER = new vzs();
    }
    
    public static JsonURTTimelineMessage _parse(final tge tge) throws IOException {
        final JsonURTTimelineMessage jsonURTTimelineMessage = new JsonURTTimelineMessage();
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
            parseField(jsonURTTimelineMessage, d, tge);
            tge.l0();
        }
        return jsonURTTimelineMessage;
    }
    
    public static void _serialize(final JsonURTTimelineMessage jsonURTTimelineMessage, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList b2 = jsonURTTimelineMessage.b;
        if (b2 != null) {
            final Iterator a = br.A(afe, "impressionCallbacks", b2);
            while (a.hasNext()) {
                final jov jov = a.next();
                if (jov != null) {
                    LoganSquare.typeConverterFor((Class)jov.class).serialize((Object)jov, "lslocalimpressionCallbacksElement", false, afe);
                }
            }
            afe.f();
        }
        final orv a2 = jsonURTTimelineMessage.a;
        if (a2 == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<orv>)JsonURTTimelineMessage$$JsonObjectMapper.TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER).serialize(a2, "content", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonURTTimelineMessage jsonURTTimelineMessage, final String s, final tge tge) throws IOException {
        if ("impressionCallbacks".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final jov jov = (jov)LoganSquare.typeConverterFor((Class)jov.class).parse(tge);
                    if (jov != null) {
                        b.add(jov);
                    }
                }
                jsonURTTimelineMessage.b = b;
            }
            else {
                jsonURTTimelineMessage.b = null;
            }
        }
        else if ("content".equals(s)) {
            jsonURTTimelineMessage.a = ((hfe<orv>)JsonURTTimelineMessage$$JsonObjectMapper.TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER).parse(tge);
        }
    }
    
    public JsonURTTimelineMessage parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTTimelineMessage jsonURTTimelineMessage, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTTimelineMessage, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTTimelineMessage)o, afe, b);
    }
}
