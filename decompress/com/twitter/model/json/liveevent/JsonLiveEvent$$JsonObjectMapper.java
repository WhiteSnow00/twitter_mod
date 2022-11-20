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
    public static JsonLiveEvent _parse(final tge tge) throws IOException {
        final JsonLiveEvent jsonLiveEvent = new JsonLiveEvent();
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
            parseField(jsonLiveEvent, d, tge);
            tge.l0();
        }
        return jsonLiveEvent;
    }
    
    public static void _serialize(final JsonLiveEvent jsonLiveEvent, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.V("attribution_user_id", jsonLiveEvent.g);
        afe.t0("category", jsonLiveEvent.f);
        afe.t0("time_string", jsonLiveEvent.j);
        afe.t0("description", jsonLiveEvent.i);
        final ArrayList m = jsonLiveEvent.m;
        if (m != null) {
            final Iterator a = br.A(afe, "description_entities", m);
            while (a.hasNext()) {
                final atf atf = a.next();
                if (atf != null) {
                    LoganSquare.typeConverterFor((Class)atf.class).serialize((Object)atf, "lslocaldescription_entitiesElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("hashtag", jsonLiveEvent.c);
        afe.t0("id", jsonLiveEvent.a);
        if (jsonLiveEvent.e != null) {
            LoganSquare.typeConverterFor((Class)vwf.class).serialize((Object)jsonLiveEvent.e, "remind_me_subscription", true, afe);
        }
        afe.e("sensitive", jsonLiveEvent.k);
        afe.t0("short_title", jsonLiveEvent.h);
        final ArrayList l = jsonLiveEvent.l;
        if (l != null) {
            final Iterator a2 = br.A(afe, "social_context", l);
            while (a2.hasNext()) {
                final mxf mxf = a2.next();
                if (mxf != null) {
                    LoganSquare.typeConverterFor((Class)mxf.class).serialize((Object)mxf, "lslocalsocial_contextElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList d = jsonLiveEvent.d;
        if (d != null) {
            final Iterator a3 = br.A(afe, "timelines", d);
            while (a3.hasNext()) {
                final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo = a3.next();
                if (jsonLiveEventTimelineInfo != null) {
                    JsonLiveEventTimelineInfo$$JsonObjectMapper._serialize(jsonLiveEventTimelineInfo, afe, true);
                }
            }
            afe.f();
        }
        afe.t0("title", jsonLiveEvent.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEvent jsonLiveEvent, final String s, final tge tge) throws IOException {
        if ("attribution_user_id".equals(s)) {
            jsonLiveEvent.g = tge.K();
        }
        else if ("category".equals(s)) {
            jsonLiveEvent.f = tge.T((String)null);
        }
        else if ("time_string".equals(s)) {
            jsonLiveEvent.j = tge.T((String)null);
        }
        else if ("description".equals(s)) {
            jsonLiveEvent.i = tge.T((String)null);
        }
        else if ("description_entities".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList m = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final atf atf = (atf)LoganSquare.typeConverterFor((Class)atf.class).parse(tge);
                    if (atf != null) {
                        m.add(atf);
                    }
                }
                jsonLiveEvent.m = m;
            }
            else {
                jsonLiveEvent.m = null;
            }
        }
        else if ("hashtag".equals(s)) {
            jsonLiveEvent.c = tge.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonLiveEvent.a = tge.T((String)null);
        }
        else if ("remind_me_subscription".equals(s)) {
            jsonLiveEvent.e = (vwf)LoganSquare.typeConverterFor((Class)vwf.class).parse(tge);
        }
        else if ("sensitive".equals(s)) {
            jsonLiveEvent.k = tge.k();
        }
        else if ("short_title".equals(s)) {
            jsonLiveEvent.h = tge.T((String)null);
        }
        else if ("social_context".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList l = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mxf mxf = (mxf)LoganSquare.typeConverterFor((Class)mxf.class).parse(tge);
                    if (mxf != null) {
                        l.add(mxf);
                    }
                }
                jsonLiveEvent.l = l;
            }
            else {
                jsonLiveEvent.l = null;
            }
        }
        else if ("timelines".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonLiveEventTimelineInfo parse = JsonLiveEventTimelineInfo$$JsonObjectMapper._parse(tge);
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
            jsonLiveEvent.b = tge.T((String)null);
        }
    }
    
    public JsonLiveEvent parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEvent jsonLiveEvent, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEvent, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEvent)o, afe, b);
    }
}
