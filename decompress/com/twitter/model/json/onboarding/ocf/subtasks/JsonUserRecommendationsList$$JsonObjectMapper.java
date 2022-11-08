// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserRecommendationsList$$JsonObjectMapper extends JsonMapper<JsonUserRecommendationsList>
{
    public static final mib FOLLOW_BUTTON_TYPE_CONVERTER;
    public static final ngw USER_RECOMMENDATIONS_LOCATION_TYPE_CONVERTER;
    
    static {
        USER_RECOMMENDATIONS_LOCATION_TYPE_CONVERTER = new ngw();
        FOLLOW_BUTTON_TYPE_CONVERTER = new mib();
    }
    
    public static JsonUserRecommendationsList _parse(final khe khe) throws IOException {
        final JsonUserRecommendationsList list = new JsonUserRecommendationsList();
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
            parseField(list, d, khe);
            khe.m0();
        }
        return list;
    }
    
    public static void _serialize(final JsonUserRecommendationsList list, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (list.m != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(list.m, tfe, true);
        }
        ((StringBasedTypeConverter)JsonUserRecommendationsList$$JsonObjectMapper.USER_RECOMMENDATIONS_LOCATION_TYPE_CONVERTER).serialize((Object)list.l, "fetch_user_recommendations_location", true, tfe);
        ((StringBasedTypeConverter)JsonUserRecommendationsList$$JsonObjectMapper.FOLLOW_BUTTON_TYPE_CONVERTER).serialize((Object)list.d, "follow_button_type", true, tfe);
        tfe.u0("follow_format_text", list.e);
        final ArrayList c = list.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "groups", c);
            while (g.hasNext()) {
                final egw egw = g.next();
                if (egw != null) {
                    LoganSquare.typeConverterFor((Class)egw.class).serialize((Object)egw, "lslocalgroupsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.T("min_follow_count", list.f);
        if (list.g != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)list.g, "next_link", true, tfe);
        }
        if (list.j != null) {
            tfe.i("next_link_label_disabled_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.j, tfe, true);
        }
        if (list.i != null) {
            tfe.i("next_link_label_enabled_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.i, tfe, true);
        }
        final ArrayList k = list.k;
        if (k != null) {
            final Iterator g2 = q1a.g(tfe, "next_link_threshold_text", k);
            while (g2.hasNext()) {
                final mxm mxm = g2.next();
                if (mxm != null) {
                    LoganSquare.typeConverterFor((Class)mxm.class).serialize((Object)mxm, "lslocalnext_link_threshold_textElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (list.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.a, tfe, true);
        }
        if (list.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.b, tfe, true);
        }
        if (list.h != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)list.h, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUserRecommendationsList list, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            list.m = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("fetch_user_recommendations_location".equals(s)) {
            list.l = (int)((StringBasedTypeConverter)JsonUserRecommendationsList$$JsonObjectMapper.USER_RECOMMENDATIONS_LOCATION_TYPE_CONVERTER).parse(khe);
        }
        else if ("follow_button_type".equals(s)) {
            list.d = (int)((StringBasedTypeConverter)JsonUserRecommendationsList$$JsonObjectMapper.FOLLOW_BUTTON_TYPE_CONVERTER).parse(khe);
        }
        else if ("follow_format_text".equals(s)) {
            list.e = khe.T((String)null);
        }
        else if ("groups".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final egw egw = (egw)LoganSquare.typeConverterFor((Class)egw.class).parse(khe);
                    if (egw != null) {
                        c.add(egw);
                    }
                }
                list.c = c;
            }
            else {
                list.c = null;
            }
        }
        else if ("min_follow_count".equals(s)) {
            list.f = khe.z();
        }
        else if ("next_link".equals(s)) {
            list.g = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link_label_disabled_text".equals(s)) {
            list.j = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link_label_enabled_text".equals(s)) {
            list.i = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link_threshold_text".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList k = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final mxm mxm = (mxm)LoganSquare.typeConverterFor((Class)mxm.class).parse(khe);
                    if (mxm != null) {
                        k.add(mxm);
                    }
                }
                list.k = k;
            }
            else {
                list.k = null;
            }
        }
        else if ("primary_text".equals(s)) {
            list.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            list.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("skip_link".equals(s)) {
            list.h = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonUserRecommendationsList parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUserRecommendationsList list, final tfe tfe, final boolean b) throws IOException {
        _serialize(list, tfe, b);
    }
}
