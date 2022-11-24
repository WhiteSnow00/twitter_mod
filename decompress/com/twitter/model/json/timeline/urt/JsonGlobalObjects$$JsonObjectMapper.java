// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.HashMap;
import com.bluelinelabs.logansquare.LoganSquare;
import tv.periscope.model.b;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGlobalObjects$$JsonObjectMapper extends JsonMapper<JsonGlobalObjects>
{
    public static JsonGlobalObjects _parse(final qhe qhe) throws IOException {
        final JsonGlobalObjects jsonGlobalObjects = new JsonGlobalObjects();
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
            parseField(jsonGlobalObjects, d, qhe);
            qhe.m0();
        }
        return jsonGlobalObjects;
    }
    
    public static void _serialize(final JsonGlobalObjects jsonGlobalObjects, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final HashMap h = jsonGlobalObjects.h;
        if (h != null) {
            final Iterator a = af.A(yfe, "broadcasts", h);
            while (a.hasNext()) {
                final Map.Entry<String, b> entry = a.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)b.class).serialize((Object)entry.getValue(), "lslocalbroadcastsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap d = jsonGlobalObjects.d;
        if (d != null) {
            final Iterator a2 = af.A(yfe, "cards", d);
            while (a2.hasNext()) {
                final Map.Entry<String, ck3> entry2 = a2.next();
                if (qee.r((String)entry2.getKey(), yfe, (Map.Entry)entry2) == null) {
                    yfe.j();
                }
                else {
                    if (entry2.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)ck3.class).serialize((Object)entry2.getValue(), "lslocalcardsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap k = jsonGlobalObjects.k;
        if (k != null) {
            final Iterator a3 = af.A(yfe, "communities", k);
            while (a3.hasNext()) {
                final Map.Entry<String, qj1> entry3 = a3.next();
                if (qee.r((String)entry3.getKey(), yfe, (Map.Entry)entry3) == null) {
                    yfe.j();
                }
                else {
                    if (entry3.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)qj1.class).serialize((Object)entry3.getValue(), "lslocalcommunitiesElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap i = jsonGlobalObjects.i;
        if (i != null) {
            final Iterator a4 = af.A(yfe, "topics", i);
            while (a4.hasNext()) {
                final Map.Entry<String, lxd> entry4 = a4.next();
                if (qee.r((String)entry4.getKey(), yfe, (Map.Entry)entry4) == null) {
                    yfe.j();
                }
                else {
                    if (entry4.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)lxd.class).serialize((Object)entry4.getValue(), "lslocaltopicsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap j = jsonGlobalObjects.j;
        if (j != null) {
            final Iterator a5 = af.A(yfe, "lists", j);
            while (a5.hasNext()) {
                final Map.Entry<String, gdv> entry5 = a5.next();
                if (qee.r((String)entry5.getKey(), yfe, (Map.Entry)entry5) == null) {
                    yfe.j();
                }
                else {
                    if (entry5.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)gdv.class).serialize((Object)entry5.getValue(), "lslocallistsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap g = jsonGlobalObjects.g;
        if (g != null) {
            final Iterator a6 = af.A(yfe, "media", g);
            while (a6.hasNext()) {
                final Map.Entry<String, wtg> entry6 = a6.next();
                if (qee.r((String)entry6.getKey(), yfe, (Map.Entry)entry6) == null) {
                    yfe.j();
                }
                else {
                    if (entry6.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)wtg.class).serialize((Object)entry6.getValue(), "lslocalmediaElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap c = jsonGlobalObjects.c;
        if (c != null) {
            final Iterator a7 = af.A(yfe, "moments", c);
            while (a7.hasNext()) {
                final Map.Entry<String, gph> entry7 = a7.next();
                if (qee.r((String)entry7.getKey(), yfe, (Map.Entry)entry7) == null) {
                    yfe.j();
                }
                else {
                    if (entry7.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)gph.class).serialize((Object)entry7.getValue(), "lslocalmomentsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap e = jsonGlobalObjects.e;
        if (e != null) {
            final Iterator a8 = af.A(yfe, "notifications", e);
            while (a8.hasNext()) {
                final Map.Entry<String, wpi> entry8 = a8.next();
                if (qee.r((String)entry8.getKey(), yfe, (Map.Entry)entry8) == null) {
                    yfe.j();
                }
                else {
                    if (entry8.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)wpi.class).serialize((Object)entry8.getValue(), "lslocalnotificationsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap f = jsonGlobalObjects.f;
        if (f != null) {
            final Iterator a9 = af.A(yfe, "places", f);
            while (a9.hasNext()) {
                final Map.Entry<String, efv> entry9 = a9.next();
                if (qee.r((String)entry9.getKey(), yfe, (Map.Entry)entry9) == null) {
                    yfe.j();
                }
                else {
                    if (entry9.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)efv.class).serialize((Object)entry9.getValue(), "lslocalplacesElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap a10 = jsonGlobalObjects.a;
        if (a10 != null) {
            final Iterator a11 = af.A(yfe, "tweets", a10);
            while (a11.hasNext()) {
                final Map.Entry<String, oh0$a> entry10 = a11.next();
                if (qee.r((String)entry10.getKey(), yfe, (Map.Entry)entry10) == null) {
                    yfe.j();
                }
                else {
                    if (entry10.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)oh0$a.class).serialize((Object)entry10.getValue(), "lslocaltweetsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap b2 = jsonGlobalObjects.b;
        if (b2 != null) {
            final Iterator a12 = af.A(yfe, "users", b2);
            while (a12.hasNext()) {
                final Map.Entry<String, qgv> entry11 = a12.next();
                if (qee.r((String)entry11.getKey(), yfe, (Map.Entry)entry11) == null) {
                    yfe.j();
                }
                else {
                    if (entry11.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)qgv.class).serialize((Object)entry11.getValue(), "lslocalusersElement", false, yfe);
                }
            }
            yfe.h();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonGlobalObjects jsonGlobalObjects, String s, final qhe qhe) throws IOException {
        if ("broadcasts".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap h = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        h.put(j, null);
                    }
                    else {
                        h.put(j, LoganSquare.typeConverterFor((Class)b.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.h = h;
            }
            else {
                jsonGlobalObjects.h = null;
            }
        }
        else if ("cards".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap d = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        d.put(s, null);
                    }
                    else {
                        d.put(s, LoganSquare.typeConverterFor((Class)ck3.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.d = d;
            }
            else {
                jsonGlobalObjects.d = null;
            }
        }
        else if ("communities".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap k = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String i = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        k.put(i, null);
                    }
                    else {
                        k.put(i, LoganSquare.typeConverterFor((Class)qj1.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.k = k;
            }
            else {
                jsonGlobalObjects.k = null;
            }
        }
        else if ("topics".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap l = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        l.put(s, null);
                    }
                    else {
                        l.put(s, LoganSquare.typeConverterFor((Class)lxd.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.i = l;
            }
            else {
                jsonGlobalObjects.i = null;
            }
        }
        else if ("lists".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap m = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j2 = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        m.put(j2, null);
                    }
                    else {
                        m.put(j2, LoganSquare.typeConverterFor((Class)gdv.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.j = m;
            }
            else {
                jsonGlobalObjects.j = null;
            }
        }
        else if ("media".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap g = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j3 = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        g.put(j3, null);
                    }
                    else {
                        g.put(j3, LoganSquare.typeConverterFor((Class)wtg.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.g = g;
            }
            else {
                jsonGlobalObjects.g = null;
            }
        }
        else if ("moments".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap c = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        c.put(s, null);
                    }
                    else {
                        c.put(s, LoganSquare.typeConverterFor((Class)gph.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.c = c;
            }
            else {
                jsonGlobalObjects.c = null;
            }
        }
        else if ("notifications".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap e = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j4 = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        e.put(j4, null);
                    }
                    else {
                        e.put(j4, LoganSquare.typeConverterFor((Class)wpi.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.e = e;
            }
            else {
                jsonGlobalObjects.e = null;
            }
        }
        else if ("places".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap f = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j5 = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        f.put(j5, null);
                    }
                    else {
                        f.put(j5, LoganSquare.typeConverterFor((Class)efv.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.f = f;
            }
            else {
                jsonGlobalObjects.f = null;
            }
        }
        else if ("tweets".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap a = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        a.put(s, null);
                    }
                    else {
                        a.put(s, LoganSquare.typeConverterFor((Class)oh0$a.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.a = a;
            }
            else {
                jsonGlobalObjects.a = null;
            }
        }
        else if ("users".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap b = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j6 = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        b.put(j6, null);
                    }
                    else {
                        b.put(j6, LoganSquare.typeConverterFor((Class)qgv.class).parse(qhe));
                    }
                }
                jsonGlobalObjects.b = b;
            }
            else {
                jsonGlobalObjects.b = null;
            }
        }
    }
    
    public JsonGlobalObjects parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonGlobalObjects jsonGlobalObjects, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonGlobalObjects, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonGlobalObjects)o, yfe, b);
    }
}
