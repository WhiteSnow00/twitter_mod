// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.ocf.JsonTimelineQuery$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetSelectionUrt$$JsonObjectMapper extends JsonMapper<JsonTweetSelectionUrt>
{
    public static JsonTweetSelectionUrt _parse(final tge tge) throws IOException {
        final JsonTweetSelectionUrt jsonTweetSelectionUrt = new JsonTweetSelectionUrt();
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
            parseField(jsonTweetSelectionUrt, d, tge);
            tge.l0();
        }
        return jsonTweetSelectionUrt;
    }
    
    public static void _serialize(final JsonTweetSelectionUrt jsonTweetSelectionUrt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTweetSelectionUrt.i != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonTweetSelectionUrt.i, afe, true);
        }
        if (jsonTweetSelectionUrt.h != null) {
            LoganSquare.typeConverterFor((Class)ucj.class).serialize((Object)jsonTweetSelectionUrt.h, "detail_rich_text_options", true, afe);
        }
        if (jsonTweetSelectionUrt.d != null) {
            afe.i("graphql_timeline_query");
            JsonTimelineQuery$$JsonObjectMapper._serialize(jsonTweetSelectionUrt.d, afe, true);
        }
        if (jsonTweetSelectionUrt.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonTweetSelectionUrt.a, "header", true, afe);
        }
        if (jsonTweetSelectionUrt.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonTweetSelectionUrt.b, "next_link", true, afe);
        }
        if (jsonTweetSelectionUrt.g != null) {
            LoganSquare.typeConverterFor((Class)cbi.class).serialize((Object)jsonTweetSelectionUrt.g, "next_link_options", true, afe);
        }
        if (jsonTweetSelectionUrt.f != null) {
            LoganSquare.typeConverterFor((Class)gej.class).serialize((Object)jsonTweetSelectionUrt.f, "scribe_config", true, afe);
        }
        if (jsonTweetSelectionUrt.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonTweetSelectionUrt.c, "skip_link", true, afe);
        }
        afe.t0("timeline_source", jsonTweetSelectionUrt.e);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetSelectionUrt jsonTweetSelectionUrt, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonTweetSelectionUrt.i = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_rich_text_options".equals(s)) {
            jsonTweetSelectionUrt.h = (ucj)LoganSquare.typeConverterFor((Class)ucj.class).parse(tge);
        }
        else if ("graphql_timeline_query".equals(s)) {
            jsonTweetSelectionUrt.d = JsonTimelineQuery$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            jsonTweetSelectionUrt.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonTweetSelectionUrt.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link_options".equals(s)) {
            jsonTweetSelectionUrt.g = (cbi)LoganSquare.typeConverterFor((Class)cbi.class).parse(tge);
        }
        else if ("scribe_config".equals(s)) {
            jsonTweetSelectionUrt.f = (gej)LoganSquare.typeConverterFor((Class)gej.class).parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonTweetSelectionUrt.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("timeline_source".equals(s)) {
            jsonTweetSelectionUrt.e = tge.T((String)null);
        }
    }
    
    public JsonTweetSelectionUrt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetSelectionUrt jsonTweetSelectionUrt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetSelectionUrt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetSelectionUrt)o, afe, b);
    }
}
