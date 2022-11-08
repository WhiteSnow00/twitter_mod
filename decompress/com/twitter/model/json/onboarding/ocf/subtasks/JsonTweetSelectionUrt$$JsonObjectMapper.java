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
    public static JsonTweetSelectionUrt _parse(final khe khe) throws IOException {
        final JsonTweetSelectionUrt jsonTweetSelectionUrt = new JsonTweetSelectionUrt();
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
            parseField(jsonTweetSelectionUrt, d, khe);
            khe.m0();
        }
        return jsonTweetSelectionUrt;
    }
    
    public static void _serialize(final JsonTweetSelectionUrt jsonTweetSelectionUrt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTweetSelectionUrt.i != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonTweetSelectionUrt.i, tfe, true);
        }
        if (jsonTweetSelectionUrt.h != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonTweetSelectionUrt.h, "detail_rich_text_options", true, tfe);
        }
        if (jsonTweetSelectionUrt.d != null) {
            tfe.i("graphql_timeline_query");
            JsonTimelineQuery$$JsonObjectMapper._serialize(jsonTweetSelectionUrt.d, tfe, true);
        }
        if (jsonTweetSelectionUrt.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonTweetSelectionUrt.a, "header", true, tfe);
        }
        if (jsonTweetSelectionUrt.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonTweetSelectionUrt.b, "next_link", true, tfe);
        }
        if (jsonTweetSelectionUrt.g != null) {
            LoganSquare.typeConverterFor((Class)abi.class).serialize((Object)jsonTweetSelectionUrt.g, "next_link_options", true, tfe);
        }
        if (jsonTweetSelectionUrt.f != null) {
            LoganSquare.typeConverterFor((Class)bej.class).serialize((Object)jsonTweetSelectionUrt.f, "scribe_config", true, tfe);
        }
        if (jsonTweetSelectionUrt.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonTweetSelectionUrt.c, "skip_link", true, tfe);
        }
        tfe.u0("timeline_source", jsonTweetSelectionUrt.e);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetSelectionUrt jsonTweetSelectionUrt, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonTweetSelectionUrt.i = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_rich_text_options".equals(s)) {
            jsonTweetSelectionUrt.h = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(khe);
        }
        else if ("graphql_timeline_query".equals(s)) {
            jsonTweetSelectionUrt.d = JsonTimelineQuery$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            jsonTweetSelectionUrt.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonTweetSelectionUrt.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link_options".equals(s)) {
            jsonTweetSelectionUrt.g = (abi)LoganSquare.typeConverterFor((Class)abi.class).parse(khe);
        }
        else if ("scribe_config".equals(s)) {
            jsonTweetSelectionUrt.f = (bej)LoganSquare.typeConverterFor((Class)bej.class).parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonTweetSelectionUrt.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("timeline_source".equals(s)) {
            jsonTweetSelectionUrt.e = khe.T((String)null);
        }
    }
    
    public JsonTweetSelectionUrt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetSelectionUrt jsonTweetSelectionUrt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetSelectionUrt, tfe, b);
    }
}
