// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRelevancePrompt$$JsonObjectMapper extends JsonMapper<JsonTimelineRelevancePrompt>
{
    public static final acm RELEVANCE_PROMPT_DISPLAY_TYPE_CONVERTER;
    
    static {
        RELEVANCE_PROMPT_DISPLAY_TYPE_CONVERTER = new acm();
    }
    
    public static JsonTimelineRelevancePrompt _parse(final tge tge) throws IOException {
        final JsonTimelineRelevancePrompt jsonTimelineRelevancePrompt = new JsonTimelineRelevancePrompt();
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
            parseField(jsonTimelineRelevancePrompt, d, tge);
            tge.l0();
        }
        return jsonTimelineRelevancePrompt;
    }
    
    public static void _serialize(final JsonTimelineRelevancePrompt jsonTimelineRelevancePrompt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("confirmation", jsonTimelineRelevancePrompt.c);
        ((StringBasedTypeConverter)JsonTimelineRelevancePrompt$$JsonObjectMapper.RELEVANCE_PROMPT_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonTimelineRelevancePrompt.h, "displayType", true, afe);
        if (jsonTimelineRelevancePrompt.f != null) {
            LoganSquare.typeConverterFor((Class)jov.class).serialize((Object)jsonTimelineRelevancePrompt.f, "isRelevantCallback", true, afe);
        }
        afe.t0("isRelevantText", jsonTimelineRelevancePrompt.d);
        if (jsonTimelineRelevancePrompt.g != null) {
            LoganSquare.typeConverterFor((Class)jov.class).serialize((Object)jsonTimelineRelevancePrompt.g, "notRelevantCallback", true, afe);
        }
        afe.t0("notRelevantText", jsonTimelineRelevancePrompt.e);
        final HashMap i = jsonTimelineRelevancePrompt.i;
        if (i != null) {
            final Iterator z = mw.z(afe, "reactiveTriggers", i);
            while (z.hasNext()) {
                final Map.Entry<String, JsonTimelineReaction> entry = z.next();
                if (sde.e((String)entry.getKey(), afe, (Map.Entry)entry) == null) {
                    afe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonTimelineReaction$$JsonObjectMapper._serialize(entry.getValue(), afe, true);
                }
            }
            afe.h();
        }
        afe.t0("subtitle", jsonTimelineRelevancePrompt.b);
        afe.t0("title", jsonTimelineRelevancePrompt.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRelevancePrompt jsonTimelineRelevancePrompt, final String s, final tge tge) throws IOException {
        if ("confirmation".equals(s)) {
            jsonTimelineRelevancePrompt.c = tge.T((String)null);
        }
        else if ("displayType".equals(s)) {
            jsonTimelineRelevancePrompt.h = (int)((StringBasedTypeConverter)JsonTimelineRelevancePrompt$$JsonObjectMapper.RELEVANCE_PROMPT_DISPLAY_TYPE_CONVERTER).parse(tge);
        }
        else if ("isRelevantCallback".equals(s)) {
            jsonTimelineRelevancePrompt.f = (jov)LoganSquare.typeConverterFor((Class)jov.class).parse(tge);
        }
        else if ("isRelevantText".equals(s)) {
            jsonTimelineRelevancePrompt.d = tge.T((String)null);
        }
        else if ("notRelevantCallback".equals(s)) {
            jsonTimelineRelevancePrompt.g = (jov)LoganSquare.typeConverterFor((Class)jov.class).parse(tge);
        }
        else if ("notRelevantText".equals(s)) {
            jsonTimelineRelevancePrompt.e = tge.T((String)null);
        }
        else if ("reactiveTriggers".equals(s)) {
            if (tge.e() == vie.L0) {
                final HashMap i = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String j = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        i.put(j, null);
                    }
                    else {
                        i.put(j, JsonTimelineReaction$$JsonObjectMapper._parse(tge));
                    }
                }
                jsonTimelineRelevancePrompt.i = i;
            }
            else {
                jsonTimelineRelevancePrompt.i = null;
            }
        }
        else if ("subtitle".equals(s)) {
            jsonTimelineRelevancePrompt.b = tge.T((String)null);
        }
        else if ("title".equals(s) || "relevanceTitle".equals(s)) {
            jsonTimelineRelevancePrompt.a = tge.T((String)null);
        }
    }
    
    public JsonTimelineRelevancePrompt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineRelevancePrompt jsonTimelineRelevancePrompt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineRelevancePrompt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineRelevancePrompt)o, afe, b);
    }
}
