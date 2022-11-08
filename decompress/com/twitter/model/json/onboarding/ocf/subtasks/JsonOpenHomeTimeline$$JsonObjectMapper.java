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
    public static JsonOpenHomeTimeline _parse(final khe khe) throws IOException {
        final JsonOpenHomeTimeline jsonOpenHomeTimeline = new JsonOpenHomeTimeline();
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
            parseField(jsonOpenHomeTimeline, d, khe);
            khe.m0();
        }
        return jsonOpenHomeTimeline;
    }
    
    public static void _serialize(final JsonOpenHomeTimeline jsonOpenHomeTimeline, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonOpenHomeTimeline.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonOpenHomeTimeline.c, "cta_link", true, tfe);
        }
        if (jsonOpenHomeTimeline.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonOpenHomeTimeline.d, "next_link", true, tfe);
        }
        if (jsonOpenHomeTimeline.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOpenHomeTimeline.a, tfe, true);
        }
        if (jsonOpenHomeTimeline.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOpenHomeTimeline.b, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOpenHomeTimeline jsonOpenHomeTimeline, final String s, final khe khe) throws IOException {
        if ("cta_link".equals(s)) {
            jsonOpenHomeTimeline.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonOpenHomeTimeline.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonOpenHomeTimeline.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonOpenHomeTimeline.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonOpenHomeTimeline parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOpenHomeTimeline jsonOpenHomeTimeline, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOpenHomeTimeline, tfe, b);
    }
}
