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
    public static final fzs TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER;
    
    static {
        TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER = new fzs();
    }
    
    public static JsonURTTimelineMessage _parse(final khe khe) throws IOException {
        final JsonURTTimelineMessage jsonURTTimelineMessage = new JsonURTTimelineMessage();
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
            parseField(jsonURTTimelineMessage, d, khe);
            khe.m0();
        }
        return jsonURTTimelineMessage;
    }
    
    public static void _serialize(final JsonURTTimelineMessage jsonURTTimelineMessage, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList b2 = jsonURTTimelineMessage.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "impressionCallbacks", b2);
            while (g.hasNext()) {
                final lnv lnv = g.next();
                if (lnv != null) {
                    LoganSquare.typeConverterFor((Class)lnv.class).serialize((Object)lnv, "lslocalimpressionCallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        final tqv a = jsonURTTimelineMessage.a;
        if (a == null) {
            if (b) {
                tfe.h();
            }
            return;
        }
        ((twj<tqv>)JsonURTTimelineMessage$$JsonObjectMapper.TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER).serialize(a, "content", true, tfe);
        throw null;
    }
    
    public static void parseField(final JsonURTTimelineMessage jsonURTTimelineMessage, final String s, final khe khe) throws IOException {
        if ("impressionCallbacks".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final lnv lnv = (lnv)LoganSquare.typeConverterFor((Class)lnv.class).parse(khe);
                    if (lnv != null) {
                        b.add(lnv);
                    }
                }
                jsonURTTimelineMessage.b = b;
            }
            else {
                jsonURTTimelineMessage.b = null;
            }
        }
        else if ("content".equals(s)) {
            jsonURTTimelineMessage.a = (tqv)((age)JsonURTTimelineMessage$$JsonObjectMapper.TIMELINE_MESSAGE_PROMPT_UNION_CONVERTER).parse(khe);
        }
    }
    
    public JsonURTTimelineMessage parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTTimelineMessage jsonURTTimelineMessage, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTTimelineMessage, tfe, b);
    }
}
