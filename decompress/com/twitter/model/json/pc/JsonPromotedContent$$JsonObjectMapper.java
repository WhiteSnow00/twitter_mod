// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.util.ArrayList;
import com.twitter.model.json.core.JsonUserName;
import java.util.Map;
import java.util.Iterator;
import java.util.HashSet;
import com.twitter.model.json.core.JsonUserName$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPromotedContent$$JsonObjectMapper extends JsonMapper<JsonPromotedContent>
{
    public static final JsonPromotedContent$a EXPERIMENT_VALUES_MAP_CONVERTER;
    
    static {
        EXPERIMENT_VALUES_MAP_CONVERTER = new JsonPromotedContent$a();
    }
    
    public static JsonPromotedContent _parse(final qhe qhe) throws IOException {
        final JsonPromotedContent jsonPromotedContent = new JsonPromotedContent();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonPromotedContent, d, qhe);
            qhe.m0();
        }
        return jsonPromotedContent;
    }
    
    public static void _serialize(final JsonPromotedContent jsonPromotedContent, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonPromotedContent.f != null) {
            yfe.i("advertiser");
            JsonPromotedContent$PromotedContentAdvertiser$$JsonObjectMapper._serialize(jsonPromotedContent.f, yfe, true);
        }
        yfe.u0("advertiser_name", jsonPromotedContent.c);
        if (jsonPromotedContent.k != null) {
            LoganSquare.typeConverterFor((Class)de4.class).serialize((Object)jsonPromotedContent.k, "click_tracking_info", true, yfe);
        }
        final HashSet j = jsonPromotedContent.j;
        if (j != null) {
            yfe.i("dedupe_ids");
            yfe.q0();
            final Iterator iterator = j.iterator();
            while (iterator.hasNext()) {
                yfe.s0((String)iterator.next());
            }
            yfe.f();
        }
        yfe.u0("disclosure_type", jsonPromotedContent.b);
        final Map e = jsonPromotedContent.e;
        if (e == null) {
            yfe.u0("impression_id", jsonPromotedContent.a);
            if (jsonPromotedContent.h != null) {
                yfe.i("promoted_context");
                JsonPromotedContent$PromotedContext$$JsonObjectMapper._serialize(jsonPromotedContent.h, yfe, true);
            }
            if (jsonPromotedContent.g != null) {
                yfe.i("promoted_trend");
                JsonPromotedContent$PromotedContentTrend$$JsonObjectMapper._serialize(jsonPromotedContent.g, yfe, true);
            }
            yfe.W("promoted_trend_id_str", jsonPromotedContent.d);
            final JsonUserName[] i = jsonPromotedContent.i;
            if (i != null) {
                yfe.i("social_context");
                yfe.q0();
                for (final JsonUserName jsonUserName : i) {
                    if (jsonUserName != null) {
                        JsonUserName$$JsonObjectMapper._serialize(jsonUserName, yfe, true);
                    }
                }
                yfe.f();
            }
            if (b) {
                yfe.h();
            }
            return;
        }
        ((nxj)JsonPromotedContent$$JsonObjectMapper.EXPERIMENT_VALUES_MAP_CONVERTER).serialize((Object)e, "experiment_values", true, yfe);
        throw null;
    }
    
    public static void parseField(final JsonPromotedContent jsonPromotedContent, String t, final qhe qhe) throws IOException {
        if ("advertiser".equals(t)) {
            jsonPromotedContent.f = JsonPromotedContent$PromotedContentAdvertiser$$JsonObjectMapper._parse(qhe);
        }
        else if ("advertiser_name".equals(t)) {
            jsonPromotedContent.c = qhe.T((String)null);
        }
        else if ("click_tracking_info".equals(t)) {
            jsonPromotedContent.k = (de4)LoganSquare.typeConverterFor((Class)de4.class).parse(qhe);
        }
        else if ("dedupe_ids".equals(t)) {
            if (qhe.e() == rje.P0) {
                final HashSet j = new HashSet();
                while (qhe.i0() != rje.Q0) {
                    t = qhe.T((String)null);
                    if (t != null) {
                        j.add(t);
                    }
                }
                jsonPromotedContent.j = j;
            }
            else {
                jsonPromotedContent.j = null;
            }
        }
        else if ("disclosure_type".equals(t)) {
            jsonPromotedContent.b = qhe.T((String)null);
        }
        else if ("experiment_values".equals(t)) {
            jsonPromotedContent.e = ((dlg)JsonPromotedContent$$JsonObjectMapper.EXPERIMENT_VALUES_MAP_CONVERTER).a(qhe);
        }
        else if ("impression_id".equals(t)) {
            jsonPromotedContent.a = qhe.T((String)null);
        }
        else if ("promoted_context".equals(t)) {
            jsonPromotedContent.h = JsonPromotedContent$PromotedContext$$JsonObjectMapper._parse(qhe);
        }
        else if ("promoted_trend".equals(t)) {
            jsonPromotedContent.g = JsonPromotedContent$PromotedContentTrend$$JsonObjectMapper._parse(qhe);
        }
        else if (!"promoted_trend_id_str".equals(t) && !"promoted_trend_id".equals(t)) {
            if ("social_context".equals(t)) {
                if (qhe.e() == rje.P0) {
                    final ArrayList list = new ArrayList();
                    while (qhe.i0() != rje.Q0) {
                        final JsonUserName parse = JsonUserName$$JsonObjectMapper._parse(qhe);
                        if (parse != null) {
                            list.add(parse);
                        }
                    }
                    jsonPromotedContent.i = list.toArray(new JsonUserName[list.size()]);
                }
                else {
                    jsonPromotedContent.i = null;
                }
            }
        }
        else {
            jsonPromotedContent.d = qhe.L();
        }
    }
    
    public JsonPromotedContent parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPromotedContent jsonPromotedContent, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPromotedContent, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPromotedContent)o, yfe, b);
    }
}
