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
    public static JsonTimelineTrend _parse(final khe khe) throws IOException {
        final JsonTimelineTrend jsonTimelineTrend = new JsonTimelineTrend();
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
            parseField(jsonTimelineTrend, d, khe);
            khe.m0();
        }
        return jsonTimelineTrend;
    }
    
    public static void _serialize(final JsonTimelineTrend jsonTimelineTrend, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList g = jsonTimelineTrend.g;
        if (g != null) {
            final Iterator g2 = q1a.g(tfe, "associatedCardUrls", g);
            while (g2.hasNext()) {
                tfe.s0((String)g2.next());
            }
            tfe.f();
        }
        final ArrayList h = jsonTimelineTrend.h;
        if (h != null) {
            final Iterator g3 = q1a.g(tfe, "associatedTweetIds", h);
            while (g3.hasNext()) {
                tfe.s0((String)g3.next());
            }
            tfe.f();
        }
        final ArrayList i = jsonTimelineTrend.i;
        if (i != null) {
            final Iterator g4 = q1a.g(tfe, "associatedUserIds", i);
            while (g4.hasNext()) {
                tfe.s0((String)g4.next());
            }
            tfe.f();
        }
        final ArrayList d = jsonTimelineTrend.d;
        if (d != null) {
            final Iterator g5 = q1a.g(tfe, "badges", d);
            while (g5.hasNext()) {
                final erv erv = g5.next();
                if (erv != null) {
                    LoganSquare.typeConverterFor((Class)erv.class).serialize((Object)erv, "lslocalbadgesElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("description", jsonTimelineTrend.c);
        final ArrayList k = jsonTimelineTrend.k;
        if (k != null) {
            final Iterator g6 = q1a.g(tfe, "groupedTrends", k);
            while (g6.hasNext()) {
                final o9c o9c = g6.next();
                if (o9c != null) {
                    LoganSquare.typeConverterFor((Class)o9c.class).serialize((Object)o9c, "lslocalgroupedTrendsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("name", jsonTimelineTrend.a);
        if (jsonTimelineTrend.e != null) {
            LoganSquare.typeConverterFor((Class)dvv.class).serialize((Object)jsonTimelineTrend.e, "promotedMetadata", true, tfe);
        }
        tfe.u0("rank", jsonTimelineTrend.j);
        if (jsonTimelineTrend.b != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonTimelineTrend.b, "url", true, tfe);
        }
        if (jsonTimelineTrend.f != null) {
            tfe.i("trendMetadata");
            JsonTrendMetadata$$JsonObjectMapper._serialize(jsonTimelineTrend.f, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineTrend jsonTimelineTrend, String s, final khe khe) throws IOException {
        if ("associatedCardUrls".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList g = new ArrayList();
                while (khe.i0() != lje.N0) {
                    s = khe.T((String)null);
                    if (s != null) {
                        g.add(s);
                    }
                }
                jsonTimelineTrend.g = g;
            }
            else {
                jsonTimelineTrend.g = null;
            }
        }
        else if ("associatedTweetIds".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList h = new ArrayList();
                while (khe.i0() != lje.N0) {
                    s = khe.T((String)null);
                    if (s != null) {
                        h.add(s);
                    }
                }
                jsonTimelineTrend.h = h;
            }
            else {
                jsonTimelineTrend.h = null;
            }
        }
        else if ("associatedUserIds".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList i = new ArrayList();
                while (khe.i0() != lje.N0) {
                    s = khe.T((String)null);
                    if (s != null) {
                        i.add(s);
                    }
                }
                jsonTimelineTrend.i = i;
            }
            else {
                jsonTimelineTrend.i = null;
            }
        }
        else if ("badges".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final erv erv = (erv)LoganSquare.typeConverterFor((Class)erv.class).parse(khe);
                    if (erv != null) {
                        d.add(erv);
                    }
                }
                jsonTimelineTrend.d = d;
            }
            else {
                jsonTimelineTrend.d = null;
            }
        }
        else if ("description".equals(s)) {
            jsonTimelineTrend.c = khe.T((String)null);
        }
        else if ("groupedTrends".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList k = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final o9c o9c = (o9c)LoganSquare.typeConverterFor((Class)o9c.class).parse(khe);
                    if (o9c != null) {
                        k.add(o9c);
                    }
                }
                jsonTimelineTrend.k = k;
            }
            else {
                jsonTimelineTrend.k = null;
            }
        }
        else if ("name".equals(s)) {
            jsonTimelineTrend.a = khe.T((String)null);
        }
        else if ("promotedMetadata".equals(s)) {
            jsonTimelineTrend.e = (dvv)LoganSquare.typeConverterFor((Class)dvv.class).parse(khe);
        }
        else if ("rank".equals(s)) {
            jsonTimelineTrend.j = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonTimelineTrend.b = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
        else if ("trendMetadata".equals(s)) {
            jsonTimelineTrend.f = JsonTrendMetadata$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonTimelineTrend parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineTrend jsonTimelineTrend, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineTrend, tfe, b);
    }
}
