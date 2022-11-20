// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenHomeTimeline$$JsonObjectMapper extends JsonMapper<JsonOpenHomeTimeline>
{
    public static JsonOpenHomeTimeline _parse(final tge tge) throws IOException {
        final JsonOpenHomeTimeline jsonOpenHomeTimeline = new JsonOpenHomeTimeline();
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
            parseField(jsonOpenHomeTimeline, d, tge);
            tge.l0();
        }
        return jsonOpenHomeTimeline;
    }
    
    public static void _serialize(final JsonOpenHomeTimeline jsonOpenHomeTimeline, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOpenHomeTimeline.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOpenHomeTimeline.c, "cta_link", true, afe);
        }
        if (jsonOpenHomeTimeline.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOpenHomeTimeline.d, "next_link", true, afe);
        }
        if (jsonOpenHomeTimeline.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOpenHomeTimeline.a, afe, true);
        }
        if (jsonOpenHomeTimeline.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOpenHomeTimeline.b, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOpenHomeTimeline jsonOpenHomeTimeline, final String s, final tge tge) throws IOException {
        if ("cta_link".equals(s)) {
            jsonOpenHomeTimeline.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonOpenHomeTimeline.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonOpenHomeTimeline.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonOpenHomeTimeline.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonOpenHomeTimeline parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOpenHomeTimeline jsonOpenHomeTimeline, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOpenHomeTimeline, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOpenHomeTimeline)o, afe, b);
    }
}
