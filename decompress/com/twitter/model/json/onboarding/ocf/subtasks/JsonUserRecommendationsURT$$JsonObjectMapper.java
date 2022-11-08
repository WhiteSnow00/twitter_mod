// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.ocf.JsonTimelineQuery$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserRecommendationsURT$$JsonObjectMapper extends JsonMapper<JsonUserRecommendationsURT>
{
    public static JsonUserRecommendationsURT _parse(final khe khe) throws IOException {
        final JsonUserRecommendationsURT jsonUserRecommendationsURT = new JsonUserRecommendationsURT();
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
            parseField(jsonUserRecommendationsURT, d, khe);
            khe.m0();
        }
        return jsonUserRecommendationsURT;
    }
    
    public static void _serialize(final JsonUserRecommendationsURT jsonUserRecommendationsURT, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUserRecommendationsURT.i != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonUserRecommendationsURT.i, tfe, true);
        }
        if (jsonUserRecommendationsURT.g != null) {
            tfe.i("graphql_timeline_query");
            JsonTimelineQuery$$JsonObjectMapper._serialize(jsonUserRecommendationsURT.g, tfe, true);
        }
        tfe.T("min_follow_count", jsonUserRecommendationsURT.c);
        if (jsonUserRecommendationsURT.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonUserRecommendationsURT.d, "next_link", true, tfe);
        }
        final ArrayList f = jsonUserRecommendationsURT.f;
        if (f != null) {
            final Iterator g = q1a.g(tfe, "next_link_threshold_text", f);
            while (g.hasNext()) {
                final mxm mxm = g.next();
                if (mxm != null) {
                    LoganSquare.typeConverterFor((Class)mxm.class).serialize((Object)mxm, "lslocalnext_link_threshold_textElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonUserRecommendationsURT.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonUserRecommendationsURT.a, tfe, true);
        }
        if (jsonUserRecommendationsURT.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonUserRecommendationsURT.b, tfe, true);
        }
        if (jsonUserRecommendationsURT.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonUserRecommendationsURT.e, "skip_link", true, tfe);
        }
        tfe.e("urp_enabled", jsonUserRecommendationsURT.h);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUserRecommendationsURT jsonUserRecommendationsURT, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonUserRecommendationsURT.i = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("graphql_timeline_query".equals(s)) {
            jsonUserRecommendationsURT.g = JsonTimelineQuery$$JsonObjectMapper._parse(khe);
        }
        else if ("min_follow_count".equals(s)) {
            jsonUserRecommendationsURT.c = khe.z();
        }
        else if ("next_link".equals(s)) {
            jsonUserRecommendationsURT.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link_threshold_text".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList f = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final mxm mxm = (mxm)LoganSquare.typeConverterFor((Class)mxm.class).parse(khe);
                    if (mxm != null) {
                        f.add(mxm);
                    }
                }
                jsonUserRecommendationsURT.f = f;
            }
            else {
                jsonUserRecommendationsURT.f = null;
            }
        }
        else if ("primary_text".equals(s)) {
            jsonUserRecommendationsURT.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonUserRecommendationsURT.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonUserRecommendationsURT.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("urp_enabled".equals(s)) {
            jsonUserRecommendationsURT.h = khe.k();
        }
    }
    
    public JsonUserRecommendationsURT parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUserRecommendationsURT jsonUserRecommendationsURT, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUserRecommendationsURT, tfe, b);
    }
}
