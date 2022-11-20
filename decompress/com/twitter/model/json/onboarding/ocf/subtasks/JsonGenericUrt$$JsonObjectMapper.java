// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.ocf.JsonTimelineQuery$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGenericUrt$$JsonObjectMapper extends JsonMapper<JsonGenericUrt>
{
    public static JsonGenericUrt _parse(final tge tge) throws IOException {
        final JsonGenericUrt jsonGenericUrt = new JsonGenericUrt();
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
            parseField(jsonGenericUrt, d, tge);
            tge.l0();
        }
        return jsonGenericUrt;
    }
    
    public static void _serialize(final JsonGenericUrt jsonGenericUrt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonGenericUrt.h != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonGenericUrt.h, afe, true);
        }
        if (jsonGenericUrt.g != null) {
            LoganSquare.typeConverterFor((Class)ucj.class).serialize((Object)jsonGenericUrt.g, "detail_rich_text_options", true, afe);
        }
        if (jsonGenericUrt.c != null) {
            afe.i("graphql_timeline_query");
            JsonTimelineQuery$$JsonObjectMapper._serialize(jsonGenericUrt.c, afe, true);
        }
        if (jsonGenericUrt.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonGenericUrt.a, "header", true, afe);
        }
        if (jsonGenericUrt.f != null) {
            LoganSquare.typeConverterFor((Class)cbi.class).serialize((Object)jsonGenericUrt.f, "navigation_link_options", true, afe);
        }
        if (jsonGenericUrt.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonGenericUrt.b, "next_link", true, afe);
        }
        if (jsonGenericUrt.e != null) {
            LoganSquare.typeConverterFor((Class)gej.class).serialize((Object)jsonGenericUrt.e, "scribe_config", true, afe);
        }
        afe.t0("timeline_source", jsonGenericUrt.d);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGenericUrt jsonGenericUrt, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonGenericUrt.h = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_rich_text_options".equals(s)) {
            jsonGenericUrt.g = (ucj)LoganSquare.typeConverterFor((Class)ucj.class).parse(tge);
        }
        else if ("graphql_timeline_query".equals(s)) {
            jsonGenericUrt.c = JsonTimelineQuery$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            jsonGenericUrt.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("navigation_link_options".equals(s)) {
            jsonGenericUrt.f = (cbi)LoganSquare.typeConverterFor((Class)cbi.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonGenericUrt.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("scribe_config".equals(s)) {
            jsonGenericUrt.e = (gej)LoganSquare.typeConverterFor((Class)gej.class).parse(tge);
        }
        else if ("timeline_source".equals(s)) {
            jsonGenericUrt.d = tge.T((String)null);
        }
    }
    
    public JsonGenericUrt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGenericUrt jsonGenericUrt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGenericUrt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGenericUrt)o, afe, b);
    }
}
