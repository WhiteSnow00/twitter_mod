// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelinePrompt$$JsonObjectMapper extends JsonMapper<JsonTimelinePrompt>
{
    public static final s1t TIMELINE_PROMPT_UNION_CONVERTER;
    
    static {
        TIMELINE_PROMPT_UNION_CONVERTER = new s1t();
    }
    
    public static JsonTimelinePrompt _parse(final tge tge) throws IOException {
        final JsonTimelinePrompt jsonTimelinePrompt = new JsonTimelinePrompt();
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
            parseField(jsonTimelinePrompt, d, tge);
            tge.l0();
        }
        return jsonTimelinePrompt;
    }
    
    public static void _serialize(final JsonTimelinePrompt jsonTimelinePrompt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelinePrompt.b != null) {
            LoganSquare.typeConverterFor((Class)h0p.class).serialize((Object)jsonTimelinePrompt.b, "clientEventInfo", true, afe);
        }
        final k1t a = jsonTimelinePrompt.a;
        if (a == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        JsonTimelinePrompt$$JsonObjectMapper.TIMELINE_PROMPT_UNION_CONVERTER.serialize(a, "content", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelinePrompt jsonTimelinePrompt, final String s, final tge tge) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonTimelinePrompt.b = (h0p)LoganSquare.typeConverterFor((Class)h0p.class).parse(tge);
        }
        else if ("content".equals(s)) {
            jsonTimelinePrompt.a = JsonTimelinePrompt$$JsonObjectMapper.TIMELINE_PROMPT_UNION_CONVERTER.parse(tge);
        }
    }
    
    public JsonTimelinePrompt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelinePrompt jsonTimelinePrompt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelinePrompt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelinePrompt)o, afe, b);
    }
}
