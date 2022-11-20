// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.HashMap;
import tv.periscope.model.b;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventMetadataResponse$JsonTwitterObjects$$JsonObjectMapper extends JsonMapper<JsonLiveEventMetadataResponse.JsonTwitterObjects>
{
    public static JsonLiveEventMetadataResponse.JsonTwitterObjects _parse(final tge tge) throws IOException {
        final JsonLiveEventMetadataResponse.JsonTwitterObjects jsonTwitterObjects = new JsonLiveEventMetadataResponse.JsonTwitterObjects();
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
            parseField(jsonTwitterObjects, d, tge);
            tge.l0();
        }
        return jsonTwitterObjects;
    }
    
    public static void _serialize(final JsonLiveEventMetadataResponse.JsonTwitterObjects jsonTwitterObjects, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final HashMap b2 = jsonTwitterObjects.b;
        if (b2 != null) {
            final Iterator z = mw.z(afe, "audiospaces", b2);
            while (z.hasNext()) {
                final Map.Entry<String, rof> entry = z.next();
                if (sde.e((String)entry.getKey(), afe, (Map.Entry)entry) == null) {
                    afe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)rof.class).serialize((Object)entry.getValue(), "lslocalaudiospacesElement", false, afe);
                }
            }
            afe.h();
        }
        final HashMap a = jsonTwitterObjects.a;
        if (a != null) {
            final Iterator z2 = mw.z(afe, "broadcasts", a);
            while (z2.hasNext()) {
                final Map.Entry<String, b> entry2 = z2.next();
                if (sde.e((String)entry2.getKey(), afe, (Map.Entry)entry2) == null) {
                    afe.j();
                }
                else {
                    if (entry2.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)b.class).serialize((Object)entry2.getValue(), "lslocalbroadcastsElement", false, afe);
                }
            }
            afe.h();
        }
        final HashMap c = jsonTwitterObjects.c;
        if (c != null) {
            final Iterator z3 = mw.z(afe, "live_events", c);
            while (z3.hasNext()) {
                final Map.Entry<String, cof> entry3 = z3.next();
                if (sde.e((String)entry3.getKey(), afe, (Map.Entry)entry3) == null) {
                    afe.j();
                }
                else {
                    if (entry3.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)cof.class).serialize((Object)entry3.getValue(), "lslocallive_eventsElement", false, afe);
                }
            }
            afe.h();
        }
        final HashMap d = jsonTwitterObjects.d;
        if (d != null) {
            final Iterator z4 = mw.z(afe, "slates", d);
            while (z4.hasNext()) {
                final Map.Entry<String, deq> entry4 = z4.next();
                if (sde.e((String)entry4.getKey(), afe, (Map.Entry)entry4) == null) {
                    afe.j();
                }
                else {
                    if (entry4.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)deq.class).serialize((Object)entry4.getValue(), "lslocalslatesElement", false, afe);
                }
            }
            afe.h();
        }
        final HashMap e = jsonTwitterObjects.e;
        if (e != null) {
            final Iterator z5 = mw.z(afe, "tweets", e);
            while (z5.hasNext()) {
                final Map.Entry<String, nh0> entry5 = z5.next();
                if (sde.e((String)entry5.getKey(), afe, (Map.Entry)entry5) == null) {
                    afe.j();
                }
                else {
                    if (entry5.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)nh0.class).serialize((Object)entry5.getValue(), "lslocaltweetsElement", false, afe);
                }
            }
            afe.h();
        }
        final HashMap f = jsonTwitterObjects.f;
        if (f != null) {
            final Iterator z6 = mw.z(afe, "users", f);
            while (z6.hasNext()) {
                final Map.Entry<String, cgv> entry6 = z6.next();
                if (sde.e((String)entry6.getKey(), afe, (Map.Entry)entry6) == null) {
                    afe.j();
                }
                else {
                    if (entry6.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)cgv.class).serialize((Object)entry6.getValue(), "lslocalusersElement", false, afe);
                }
            }
            afe.h();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventMetadataResponse.JsonTwitterObjects jsonTwitterObjects, String j, final tge tge) throws IOException {
        if ("audiospaces".equals(j)) {
            if (tge.e() == vie.L0) {
                final HashMap b = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String i = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        b.put(i, null);
                    }
                    else {
                        b.put(i, LoganSquare.typeConverterFor((Class)rof.class).parse(tge));
                    }
                }
                jsonTwitterObjects.b = b;
            }
            else {
                jsonTwitterObjects.b = null;
            }
        }
        else if ("broadcasts".equals(j)) {
            if (tge.e() == vie.L0) {
                final HashMap a = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String k = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        a.put(k, null);
                    }
                    else {
                        a.put(k, LoganSquare.typeConverterFor((Class)b.class).parse(tge));
                    }
                }
                jsonTwitterObjects.a = a;
            }
            else {
                jsonTwitterObjects.a = null;
            }
        }
        else if ("live_events".equals(j)) {
            if (tge.e() == vie.L0) {
                final HashMap c = new HashMap();
                while (tge.h0() != vie.M0) {
                    j = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        c.put(j, null);
                    }
                    else {
                        c.put(j, LoganSquare.typeConverterFor((Class)cof.class).parse(tge));
                    }
                }
                jsonTwitterObjects.c = c;
            }
            else {
                jsonTwitterObjects.c = null;
            }
        }
        else if ("slates".equals(j)) {
            if (tge.e() == vie.L0) {
                final HashMap d = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String l = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        d.put(l, null);
                    }
                    else {
                        d.put(l, LoganSquare.typeConverterFor((Class)deq.class).parse(tge));
                    }
                }
                jsonTwitterObjects.d = d;
            }
            else {
                jsonTwitterObjects.d = null;
            }
        }
        else if ("tweets".equals(j)) {
            if (tge.e() == vie.L0) {
                final HashMap e = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String m = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        e.put(m, null);
                    }
                    else {
                        e.put(m, LoganSquare.typeConverterFor((Class)nh0.class).parse(tge));
                    }
                }
                jsonTwitterObjects.e = e;
            }
            else {
                jsonTwitterObjects.e = null;
            }
        }
        else if ("users".equals(j)) {
            if (tge.e() == vie.L0) {
                final HashMap f = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String j2 = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        f.put(j2, null);
                    }
                    else {
                        f.put(j2, LoganSquare.typeConverterFor((Class)cgv.class).parse(tge));
                    }
                }
                jsonTwitterObjects.f = f;
            }
            else {
                jsonTwitterObjects.f = null;
            }
        }
    }
    
    public JsonLiveEventMetadataResponse.JsonTwitterObjects parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventMetadataResponse.JsonTwitterObjects jsonTwitterObjects, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTwitterObjects, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventMetadataResponse.JsonTwitterObjects)o, afe, b);
    }
}
