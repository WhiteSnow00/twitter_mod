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
    public static JsonGenericUrt _parse(final khe khe) throws IOException {
        final JsonGenericUrt jsonGenericUrt = new JsonGenericUrt();
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
            parseField(jsonGenericUrt, d, khe);
            khe.m0();
        }
        return jsonGenericUrt;
    }
    
    public static void _serialize(final JsonGenericUrt jsonGenericUrt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonGenericUrt.h != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonGenericUrt.h, tfe, true);
        }
        if (jsonGenericUrt.g != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonGenericUrt.g, "detail_rich_text_options", true, tfe);
        }
        if (jsonGenericUrt.c != null) {
            tfe.i("graphql_timeline_query");
            JsonTimelineQuery$$JsonObjectMapper._serialize(jsonGenericUrt.c, tfe, true);
        }
        if (jsonGenericUrt.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonGenericUrt.a, "header", true, tfe);
        }
        if (jsonGenericUrt.f != null) {
            LoganSquare.typeConverterFor((Class)abi.class).serialize((Object)jsonGenericUrt.f, "navigation_link_options", true, tfe);
        }
        if (jsonGenericUrt.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonGenericUrt.b, "next_link", true, tfe);
        }
        if (jsonGenericUrt.e != null) {
            LoganSquare.typeConverterFor((Class)bej.class).serialize((Object)jsonGenericUrt.e, "scribe_config", true, tfe);
        }
        tfe.u0("timeline_source", jsonGenericUrt.d);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGenericUrt jsonGenericUrt, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonGenericUrt.h = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_rich_text_options".equals(s)) {
            jsonGenericUrt.g = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(khe);
        }
        else if ("graphql_timeline_query".equals(s)) {
            jsonGenericUrt.c = JsonTimelineQuery$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            jsonGenericUrt.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("navigation_link_options".equals(s)) {
            jsonGenericUrt.f = (abi)LoganSquare.typeConverterFor((Class)abi.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonGenericUrt.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("scribe_config".equals(s)) {
            jsonGenericUrt.e = (bej)LoganSquare.typeConverterFor((Class)bej.class).parse(khe);
        }
        else if ("timeline_source".equals(s)) {
            jsonGenericUrt.d = khe.T((String)null);
        }
    }
    
    public JsonGenericUrt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGenericUrt jsonGenericUrt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGenericUrt, tfe, b);
    }
}
