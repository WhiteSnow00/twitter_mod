// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEventSummary$$JsonObjectMapper extends JsonMapper<JsonEventSummary>
{
    public static final sea EVENT_SUMMARY_DISPLAY_TYPE_CONVERTER;
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
        EVENT_SUMMARY_DISPLAY_TYPE_CONVERTER = new sea();
    }
    
    public static JsonEventSummary _parse(final qhe qhe) throws IOException {
        final JsonEventSummary jsonEventSummary = new JsonEventSummary();
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
            parseField(jsonEventSummary, d, qhe);
            qhe.m0();
        }
        return jsonEventSummary;
    }
    
    public static void _serialize(final JsonEventSummary jsonEventSummary, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonEventSummary.m != null) {
            LoganSquare.typeConverterFor((Class)vg1.class).serialize((Object)jsonEventSummary.m, "badge", true, yfe);
        }
        ((StringBasedTypeConverter)JsonEventSummary$$JsonObjectMapper.EVENT_SUMMARY_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonEventSummary.d, "displayType", true, yfe);
        if (jsonEventSummary.b != null) {
            yfe.i("event");
            JsonEventSummary$JsonSemanticCoreEvent$$JsonObjectMapper._serialize(jsonEventSummary.b, yfe, true);
        }
        final ArrayList p3 = jsonEventSummary.p;
        if (p3 != null) {
            final Iterator e = d10.E(yfe, "groupedTrends", p3);
            while (e.hasNext()) {
                final q9c q9c = e.next();
                if (q9c != null) {
                    LoganSquare.typeConverterFor((Class)q9c.class).serialize((Object)q9c, "lslocalgroupedTrendsElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.W("id", jsonEventSummary.a);
        if (jsonEventSummary.k != null) {
            LoganSquare.typeConverterFor((Class)hpj.class).serialize((Object)jsonEventSummary.k, "image", true, yfe);
        }
        if (jsonEventSummary.l != null) {
            LoganSquare.typeConverterFor((Class)hwv.class).serialize((Object)jsonEventSummary.l, "media", true, yfe);
        }
        if (jsonEventSummary.n != null) {
            LoganSquare.typeConverterFor((Class)jwv.class).serialize((Object)jsonEventSummary.n, "promotedMetadata", true, yfe);
        }
        yfe.W("publisherId", jsonEventSummary.f);
        if (jsonEventSummary.g != null) {
            LoganSquare.typeConverterFor((Class)ziw.class).serialize((Object)jsonEventSummary.g, "publisherResult", true, yfe);
        }
        if (jsonEventSummary.o != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonEventSummary.o, "richContext", true, yfe);
        }
        if (jsonEventSummary.q != null) {
            LoganSquare.typeConverterFor((Class)pyo.class).serialize((Object)jsonEventSummary.q, "scoreEvent", true, yfe);
        }
        final o5t j = jsonEventSummary.j;
        if (j == null) {
            yfe.u0("supportingText", jsonEventSummary.e);
            yfe.u0("timeString", jsonEventSummary.h);
            yfe.u0("title", jsonEventSummary.c);
            if (jsonEventSummary.i != null) {
                LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonEventSummary.i, "url", true, yfe);
            }
            if (b) {
                yfe.h();
            }
            return;
        }
        ((nxj)JsonEventSummary$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize((Object)j, "socialContext", true, yfe);
        throw null;
    }
    
    public static void parseField(final JsonEventSummary jsonEventSummary, final String s, final qhe qhe) throws IOException {
        if ("badge".equals(s)) {
            jsonEventSummary.m = (vg1)LoganSquare.typeConverterFor((Class)vg1.class).parse(qhe);
        }
        else if (!"displayType".equals(s) && !"eventSummaryDisplayType".equals(s)) {
            if ("event".equals(s)) {
                jsonEventSummary.b = JsonEventSummary$JsonSemanticCoreEvent$$JsonObjectMapper._parse(qhe);
            }
            else if ("groupedTrends".equals(s)) {
                if (qhe.e() == rje.P0) {
                    final ArrayList p3 = new ArrayList();
                    while (qhe.i0() != rje.Q0) {
                        final q9c q9c = (q9c)LoganSquare.typeConverterFor((Class)q9c.class).parse(qhe);
                        if (q9c != null) {
                            p3.add(q9c);
                        }
                    }
                    jsonEventSummary.p = p3;
                }
                else {
                    jsonEventSummary.p = null;
                }
            }
            else if ("id".equals(s)) {
                jsonEventSummary.a = qhe.L();
            }
            else if ("image".equals(s)) {
                jsonEventSummary.k = (hpj)LoganSquare.typeConverterFor((Class)hpj.class).parse(qhe);
            }
            else if ("media".equals(s)) {
                jsonEventSummary.l = (hwv)LoganSquare.typeConverterFor((Class)hwv.class).parse(qhe);
            }
            else if ("promotedMetadata".equals(s)) {
                jsonEventSummary.n = (jwv)LoganSquare.typeConverterFor((Class)jwv.class).parse(qhe);
            }
            else if ("publisherId".equals(s)) {
                jsonEventSummary.f = qhe.L();
            }
            else if ("publisherResult".equals(s)) {
                jsonEventSummary.g = (ziw)LoganSquare.typeConverterFor((Class)ziw.class).parse(qhe);
            }
            else if ("richContext".equals(s)) {
                jsonEventSummary.o = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
            }
            else if ("scoreEvent".equals(s)) {
                jsonEventSummary.q = (pyo)LoganSquare.typeConverterFor((Class)pyo.class).parse(qhe);
            }
            else if ("socialContext".equals(s)) {
                jsonEventSummary.j = ((fge<o5t>)JsonEventSummary$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(qhe);
            }
            else if ("supportingText".equals(s)) {
                jsonEventSummary.e = qhe.T((String)null);
            }
            else if ("timeString".equals(s)) {
                jsonEventSummary.h = qhe.T((String)null);
            }
            else if (!"title".equals(s) && !"eventTitle".equals(s)) {
                if ("url".equals(s)) {
                    jsonEventSummary.i = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
                }
            }
            else {
                jsonEventSummary.c = qhe.T((String)null);
            }
        }
        else {
            jsonEventSummary.d = (int)((StringBasedTypeConverter)JsonEventSummary$$JsonObjectMapper.EVENT_SUMMARY_DISPLAY_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonEventSummary parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEventSummary jsonEventSummary, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEventSummary, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEventSummary)o, yfe, b);
    }
}
