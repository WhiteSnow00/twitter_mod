// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEvent$$JsonObjectMapper extends JsonMapper<JsonLiveEvent>
{
    public static JsonLiveEvent _parse(final khe khe) throws IOException {
        final JsonLiveEvent jsonLiveEvent = new JsonLiveEvent();
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
            parseField(jsonLiveEvent, d, khe);
            khe.m0();
        }
        return jsonLiveEvent;
    }
    
    public static void _serialize(final JsonLiveEvent jsonLiveEvent, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("attribution_user_id", jsonLiveEvent.g);
        tfe.u0("category", jsonLiveEvent.f);
        tfe.u0("time_string", jsonLiveEvent.j);
        tfe.u0("description", jsonLiveEvent.i);
        final ArrayList m = jsonLiveEvent.m;
        if (m != null) {
            final Iterator g = q1a.g(tfe, "description_entities", m);
            while (g.hasNext()) {
                final ptf ptf = g.next();
                if (ptf != null) {
                    LoganSquare.typeConverterFor((Class)ptf.class).serialize((Object)ptf, "lslocaldescription_entitiesElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("hashtag", jsonLiveEvent.c);
        tfe.u0("id", jsonLiveEvent.a);
        if (jsonLiveEvent.e != null) {
            LoganSquare.typeConverterFor((Class)jxf.class).serialize((Object)jsonLiveEvent.e, "remind_me_subscription", true, tfe);
        }
        tfe.e("sensitive", jsonLiveEvent.k);
        tfe.u0("short_title", jsonLiveEvent.h);
        final ArrayList l = jsonLiveEvent.l;
        if (l != null) {
            final Iterator g2 = q1a.g(tfe, "social_context", l);
            while (g2.hasNext()) {
                final ayf ayf = g2.next();
                if (ayf != null) {
                    LoganSquare.typeConverterFor((Class)ayf.class).serialize((Object)ayf, "lslocalsocial_contextElement", false, tfe);
                }
            }
            tfe.f();
        }
        final ArrayList d = jsonLiveEvent.d;
        if (d != null) {
            final Iterator g3 = q1a.g(tfe, "timelines", d);
            while (g3.hasNext()) {
                final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo = g3.next();
                if (jsonLiveEventTimelineInfo != null) {
                    JsonLiveEventTimelineInfo$$JsonObjectMapper._serialize(jsonLiveEventTimelineInfo, tfe, true);
                }
            }
            tfe.f();
        }
        tfe.u0("title", jsonLiveEvent.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEvent jsonLiveEvent, final String s, final khe khe) throws IOException {
        if ("attribution_user_id".equals(s)) {
            jsonLiveEvent.g = khe.L();
        }
        else if ("category".equals(s)) {
            jsonLiveEvent.f = khe.T((String)null);
        }
        else if ("time_string".equals(s)) {
            jsonLiveEvent.j = khe.T((String)null);
        }
        else if ("description".equals(s)) {
            jsonLiveEvent.i = khe.T((String)null);
        }
        else if ("description_entities".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList m = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final ptf ptf = (ptf)LoganSquare.typeConverterFor((Class)ptf.class).parse(khe);
                    if (ptf != null) {
                        m.add(ptf);
                    }
                }
                jsonLiveEvent.m = m;
            }
            else {
                jsonLiveEvent.m = null;
            }
        }
        else if ("hashtag".equals(s)) {
            jsonLiveEvent.c = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonLiveEvent.a = khe.T((String)null);
        }
        else if ("remind_me_subscription".equals(s)) {
            jsonLiveEvent.e = (jxf)LoganSquare.typeConverterFor((Class)jxf.class).parse(khe);
        }
        else if ("sensitive".equals(s)) {
            jsonLiveEvent.k = khe.k();
        }
        else if ("short_title".equals(s)) {
            jsonLiveEvent.h = khe.T((String)null);
        }
        else if ("social_context".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList l = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final ayf ayf = (ayf)LoganSquare.typeConverterFor((Class)ayf.class).parse(khe);
                    if (ayf != null) {
                        l.add(ayf);
                    }
                }
                jsonLiveEvent.l = l;
            }
            else {
                jsonLiveEvent.l = null;
            }
        }
        else if ("timelines".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonLiveEventTimelineInfo parse = JsonLiveEventTimelineInfo$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        d.add(parse);
                    }
                }
                jsonLiveEvent.d = d;
            }
            else {
                jsonLiveEvent.d = null;
            }
        }
        else if ("title".equals(s)) {
            jsonLiveEvent.b = khe.T((String)null);
        }
    }
    
    public JsonLiveEvent parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEvent jsonLiveEvent, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEvent, tfe, b);
    }
}
