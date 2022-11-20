// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineTrend$$JsonObjectMapper extends JsonMapper<JsonTimelineTrend>
{
    public static JsonTimelineTrend _parse(final tge tge) throws IOException {
        final JsonTimelineTrend jsonTimelineTrend = new JsonTimelineTrend();
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
            parseField(jsonTimelineTrend, d, tge);
            tge.l0();
        }
        return jsonTimelineTrend;
    }
    
    public static void _serialize(final JsonTimelineTrend jsonTimelineTrend, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList g = jsonTimelineTrend.g;
        if (g != null) {
            final Iterator a = br.A(afe, "associatedCardUrls", g);
            while (a.hasNext()) {
                afe.r0((String)a.next());
            }
            afe.f();
        }
        final ArrayList h = jsonTimelineTrend.h;
        if (h != null) {
            final Iterator a2 = br.A(afe, "associatedTweetIds", h);
            while (a2.hasNext()) {
                afe.r0((String)a2.next());
            }
            afe.f();
        }
        final ArrayList i = jsonTimelineTrend.i;
        if (i != null) {
            final Iterator a3 = br.A(afe, "associatedUserIds", i);
            while (a3.hasNext()) {
                afe.r0((String)a3.next());
            }
            afe.f();
        }
        final ArrayList d = jsonTimelineTrend.d;
        if (d != null) {
            final Iterator a4 = br.A(afe, "badges", d);
            while (a4.hasNext()) {
                final zrv zrv = a4.next();
                if (zrv != null) {
                    LoganSquare.typeConverterFor((Class)zrv.class).serialize((Object)zrv, "lslocalbadgesElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("description", jsonTimelineTrend.c);
        final ArrayList k = jsonTimelineTrend.k;
        if (k != null) {
            final Iterator a5 = br.A(afe, "groupedTrends", k);
            while (a5.hasNext()) {
                final o8c o8c = a5.next();
                if (o8c != null) {
                    LoganSquare.typeConverterFor((Class)o8c.class).serialize((Object)o8c, "lslocalgroupedTrendsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("name", jsonTimelineTrend.a);
        if (jsonTimelineTrend.e != null) {
            LoganSquare.typeConverterFor((Class)wvv.class).serialize((Object)jsonTimelineTrend.e, "promotedMetadata", true, afe);
        }
        afe.t0("rank", jsonTimelineTrend.j);
        if (jsonTimelineTrend.b != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTimelineTrend.b, "url", true, afe);
        }
        if (jsonTimelineTrend.f != null) {
            afe.i("trendMetadata");
            JsonTrendMetadata$$JsonObjectMapper._serialize(jsonTimelineTrend.f, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineTrend jsonTimelineTrend, String t, final tge tge) throws IOException {
        if ("associatedCardUrls".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList g = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t2 = tge.T((String)null);
                    if (t2 != null) {
                        g.add(t2);
                    }
                }
                jsonTimelineTrend.g = g;
            }
            else {
                jsonTimelineTrend.g = null;
            }
        }
        else if ("associatedTweetIds".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList h = new ArrayList();
                while (tge.h0() != vie.O0) {
                    t = tge.T((String)null);
                    if (t != null) {
                        h.add(t);
                    }
                }
                jsonTimelineTrend.h = h;
            }
            else {
                jsonTimelineTrend.h = null;
            }
        }
        else if ("associatedUserIds".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList i = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t3 = tge.T((String)null);
                    if (t3 != null) {
                        i.add(t3);
                    }
                }
                jsonTimelineTrend.i = i;
            }
            else {
                jsonTimelineTrend.i = null;
            }
        }
        else if ("badges".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final zrv zrv = (zrv)LoganSquare.typeConverterFor((Class)zrv.class).parse(tge);
                    if (zrv != null) {
                        d.add(zrv);
                    }
                }
                jsonTimelineTrend.d = d;
            }
            else {
                jsonTimelineTrend.d = null;
            }
        }
        else if ("description".equals(t)) {
            jsonTimelineTrend.c = tge.T((String)null);
        }
        else if ("groupedTrends".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList k = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final o8c o8c = (o8c)LoganSquare.typeConverterFor((Class)o8c.class).parse(tge);
                    if (o8c != null) {
                        k.add(o8c);
                    }
                }
                jsonTimelineTrend.k = k;
            }
            else {
                jsonTimelineTrend.k = null;
            }
        }
        else if ("name".equals(t)) {
            jsonTimelineTrend.a = tge.T((String)null);
        }
        else if ("promotedMetadata".equals(t)) {
            jsonTimelineTrend.e = (wvv)LoganSquare.typeConverterFor((Class)wvv.class).parse(tge);
        }
        else if ("rank".equals(t)) {
            jsonTimelineTrend.j = tge.T((String)null);
        }
        else if ("url".equals(t)) {
            jsonTimelineTrend.b = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
        else if ("trendMetadata".equals(t)) {
            jsonTimelineTrend.f = JsonTrendMetadata$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonTimelineTrend parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineTrend jsonTimelineTrend, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineTrend, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineTrend)o, afe, b);
    }
}
