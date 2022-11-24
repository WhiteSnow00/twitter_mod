// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.util.Map;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicsSelectorSubtask$$JsonObjectMapper extends JsonMapper<JsonTopicsSelectorSubtask>
{
    public static final trt TOPIC_SELECTOR_TYPE_CONVERTER;
    
    static {
        TOPIC_SELECTOR_TYPE_CONVERTER = new trt();
    }
    
    public static JsonTopicsSelectorSubtask _parse(final qhe qhe) throws IOException {
        final JsonTopicsSelectorSubtask jsonTopicsSelectorSubtask = new JsonTopicsSelectorSubtask();
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
            parseField(jsonTopicsSelectorSubtask, d, qhe);
            qhe.m0();
        }
        return jsonTopicsSelectorSubtask;
    }
    
    public static void _serialize(final JsonTopicsSelectorSubtask jsonTopicsSelectorSubtask, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTopicsSelectorSubtask.i != null) {
            LoganSquare.typeConverterFor((Class)lrt.class).serialize((Object)jsonTopicsSelectorSubtask.i, "banner", true, yfe);
        }
        final HashMap e = jsonTopicsSelectorSubtask.e;
        if (e != null) {
            final Iterator a = af.A(yfe, "category_by_id_list", e);
            while (a.hasNext()) {
                final Map.Entry<String, ult> entry = a.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)ult.class).serialize((Object)entry.getValue(), "lslocalcategory_by_id_listElement", false, yfe);
                }
            }
            yfe.h();
        }
        if (jsonTopicsSelectorSubtask.o != null) {
            yfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonTopicsSelectorSubtask.o, yfe, true);
        }
        final ArrayList g = jsonTopicsSelectorSubtask.g;
        if (g != null) {
            final Iterator e2 = d10.E(yfe, "default_category_ids", g);
            while (e2.hasNext()) {
                yfe.s0((String)e2.next());
            }
            yfe.f();
        }
        if (jsonTopicsSelectorSubtask.k != null) {
            yfe.i("deselect_label");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicsSelectorSubtask.k, yfe, true);
        }
        if (jsonTopicsSelectorSubtask.l != null) {
            LoganSquare.typeConverterFor((Class)dtv.class).serialize((Object)jsonTopicsSelectorSubtask.l, "next_link", true, yfe);
        }
        if (jsonTopicsSelectorSubtask.a != null) {
            yfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicsSelectorSubtask.a, yfe, true);
        }
        if (jsonTopicsSelectorSubtask.c != null) {
            LoganSquare.typeConverterFor((Class)z6p.class).serialize((Object)jsonTopicsSelectorSubtask.c, "search_details", true, yfe);
        }
        if (jsonTopicsSelectorSubtask.b != null) {
            yfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicsSelectorSubtask.b, yfe, true);
        }
        if (jsonTopicsSelectorSubtask.j != null) {
            yfe.i("select_label");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicsSelectorSubtask.j, yfe, true);
        }
        if (jsonTopicsSelectorSubtask.h != null) {
            LoganSquare.typeConverterFor((Class)mrt.class).serialize((Object)jsonTopicsSelectorSubtask.h, "selected_topics_cart", true, yfe);
        }
        if (jsonTopicsSelectorSubtask.m != null) {
            LoganSquare.typeConverterFor((Class)dtv.class).serialize((Object)jsonTopicsSelectorSubtask.m, "skip_link", true, yfe);
        }
        ((StringBasedTypeConverter)JsonTopicsSelectorSubtask$$JsonObjectMapper.TOPIC_SELECTOR_TYPE_CONVERTER).serialize((Object)jsonTopicsSelectorSubtask.n, "style", true, yfe);
        final ArrayList d = jsonTopicsSelectorSubtask.d;
        if (d != null) {
            final Iterator e3 = d10.E(yfe, "top_category_ids", d);
            while (e3.hasNext()) {
                yfe.s0((String)e3.next());
            }
            yfe.f();
        }
        final HashMap f = jsonTopicsSelectorSubtask.f;
        if (f != null) {
            final Iterator a2 = af.A(yfe, "topic_by_id_list", f);
            while (a2.hasNext()) {
                final Map.Entry<String, ilt> entry2 = a2.next();
                if (qee.r((String)entry2.getKey(), yfe, (Map.Entry)entry2) == null) {
                    yfe.j();
                }
                else {
                    if (entry2.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)ilt.class).serialize((Object)entry2.getValue(), "lslocaltopic_by_id_listElement", false, yfe);
                }
            }
            yfe.h();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicsSelectorSubtask jsonTopicsSelectorSubtask, String s, final qhe qhe) throws IOException {
        if ("banner".equals(s)) {
            jsonTopicsSelectorSubtask.i = (lrt)LoganSquare.typeConverterFor((Class)lrt.class).parse(qhe);
        }
        else if ("category_by_id_list".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap e = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        e.put(s, null);
                    }
                    else {
                        e.put(s, LoganSquare.typeConverterFor((Class)ult.class).parse(qhe));
                    }
                }
                jsonTopicsSelectorSubtask.e = e;
            }
            else {
                jsonTopicsSelectorSubtask.e = null;
            }
        }
        else if ("component_collection".equals(s)) {
            jsonTopicsSelectorSubtask.o = JsonOcfComponentCollection$$JsonObjectMapper._parse(qhe);
        }
        else if ("default_category_ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList g = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        g.add(t);
                    }
                }
                jsonTopicsSelectorSubtask.g = g;
            }
            else {
                jsonTopicsSelectorSubtask.g = null;
            }
        }
        else if ("deselect_label".equals(s)) {
            jsonTopicsSelectorSubtask.k = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("next_link".equals(s)) {
            jsonTopicsSelectorSubtask.l = (dtv)LoganSquare.typeConverterFor((Class)dtv.class).parse(qhe);
        }
        else if ("primary_text".equals(s)) {
            jsonTopicsSelectorSubtask.a = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("search_details".equals(s)) {
            jsonTopicsSelectorSubtask.c = (z6p)LoganSquare.typeConverterFor((Class)z6p.class).parse(qhe);
        }
        else if ("secondary_text".equals(s)) {
            jsonTopicsSelectorSubtask.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("select_label".equals(s)) {
            jsonTopicsSelectorSubtask.j = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("selected_topics_cart".equals(s)) {
            jsonTopicsSelectorSubtask.h = (mrt)LoganSquare.typeConverterFor((Class)mrt.class).parse(qhe);
        }
        else if ("skip_link".equals(s)) {
            jsonTopicsSelectorSubtask.m = (dtv)LoganSquare.typeConverterFor((Class)dtv.class).parse(qhe);
        }
        else if ("style".equals(s)) {
            jsonTopicsSelectorSubtask.n = (int)((StringBasedTypeConverter)JsonTopicsSelectorSubtask$$JsonObjectMapper.TOPIC_SELECTOR_TYPE_CONVERTER).parse(qhe);
        }
        else if ("top_category_ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t2 = qhe.T((String)null);
                    if (t2 != null) {
                        d.add(t2);
                    }
                }
                jsonTopicsSelectorSubtask.d = d;
            }
            else {
                jsonTopicsSelectorSubtask.d = null;
            }
        }
        else if ("topic_by_id_list".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap f = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        f.put(s, null);
                    }
                    else {
                        f.put(s, LoganSquare.typeConverterFor((Class)ilt.class).parse(qhe));
                    }
                }
                jsonTopicsSelectorSubtask.f = f;
            }
            else {
                jsonTopicsSelectorSubtask.f = null;
            }
        }
    }
    
    public JsonTopicsSelectorSubtask parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicsSelectorSubtask jsonTopicsSelectorSubtask, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicsSelectorSubtask, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicsSelectorSubtask)o, yfe, b);
    }
}
