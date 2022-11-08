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

public final class JsonLiveEventMetadataResponse$JsonTwitterObjects$$JsonObjectMapper extends JsonMapper<JsonLiveEventMetadataResponse$JsonTwitterObjects>
{
    public static JsonLiveEventMetadataResponse$JsonTwitterObjects _parse(final khe khe) throws IOException {
        final JsonLiveEventMetadataResponse$JsonTwitterObjects jsonLiveEventMetadataResponse$JsonTwitterObjects = new JsonLiveEventMetadataResponse$JsonTwitterObjects();
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
            parseField(jsonLiveEventMetadataResponse$JsonTwitterObjects, d, khe);
            khe.m0();
        }
        return jsonLiveEventMetadataResponse$JsonTwitterObjects;
    }
    
    public static void _serialize(final JsonLiveEventMetadataResponse$JsonTwitterObjects jsonLiveEventMetadataResponse$JsonTwitterObjects, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final HashMap b2 = jsonLiveEventMetadataResponse$JsonTwitterObjects.b;
        if (b2 != null) {
            final Iterator h = q1a.h(tfe, "audiospaces", b2);
            while (h.hasNext()) {
                final Map.Entry<String, fpf> entry = h.next();
                if (o1a.g((String)entry.getKey(), tfe, (Map.Entry)entry) == null) {
                    tfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)fpf.class).serialize((Object)entry.getValue(), "lslocalaudiospacesElement", false, tfe);
                }
            }
            tfe.h();
        }
        final HashMap a = jsonLiveEventMetadataResponse$JsonTwitterObjects.a;
        if (a != null) {
            final Iterator h2 = q1a.h(tfe, "broadcasts", a);
            while (h2.hasNext()) {
                final Map.Entry<String, b> entry2 = h2.next();
                if (o1a.g((String)entry2.getKey(), tfe, (Map.Entry)entry2) == null) {
                    tfe.j();
                }
                else {
                    if (entry2.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)b.class).serialize((Object)entry2.getValue(), "lslocalbroadcastsElement", false, tfe);
                }
            }
            tfe.h();
        }
        final HashMap c = jsonLiveEventMetadataResponse$JsonTwitterObjects.c;
        if (c != null) {
            final Iterator h3 = q1a.h(tfe, "live_events", c);
            while (h3.hasNext()) {
                final Map.Entry<String, qof> entry3 = h3.next();
                if (o1a.g((String)entry3.getKey(), tfe, (Map.Entry)entry3) == null) {
                    tfe.j();
                }
                else {
                    if (entry3.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)qof.class).serialize((Object)entry3.getValue(), "lslocallive_eventsElement", false, tfe);
                }
            }
            tfe.h();
        }
        final HashMap d = jsonLiveEventMetadataResponse$JsonTwitterObjects.d;
        if (d != null) {
            final Iterator h4 = q1a.h(tfe, "slates", d);
            while (h4.hasNext()) {
                final Map.Entry<String, mdq> entry4 = h4.next();
                if (o1a.g((String)entry4.getKey(), tfe, (Map.Entry)entry4) == null) {
                    tfe.j();
                }
                else {
                    if (entry4.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)mdq.class).serialize((Object)entry4.getValue(), "lslocalslatesElement", false, tfe);
                }
            }
            tfe.h();
        }
        final HashMap e = jsonLiveEventMetadataResponse$JsonTwitterObjects.e;
        if (e != null) {
            final Iterator h5 = q1a.h(tfe, "tweets", e);
            while (h5.hasNext()) {
                final Map.Entry<String, rh0> entry5 = h5.next();
                if (o1a.g((String)entry5.getKey(), tfe, (Map.Entry)entry5) == null) {
                    tfe.j();
                }
                else {
                    if (entry5.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)rh0.class).serialize((Object)entry5.getValue(), "lslocaltweetsElement", false, tfe);
                }
            }
            tfe.h();
        }
        final HashMap f = jsonLiveEventMetadataResponse$JsonTwitterObjects.f;
        if (f != null) {
            final Iterator h6 = q1a.h(tfe, "users", f);
            while (h6.hasNext()) {
                final Map.Entry<String, hfv> entry6 = h6.next();
                if (o1a.g((String)entry6.getKey(), tfe, (Map.Entry)entry6) == null) {
                    tfe.j();
                }
                else {
                    if (entry6.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)hfv.class).serialize((Object)entry6.getValue(), "lslocalusersElement", false, tfe);
                }
            }
            tfe.h();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventMetadataResponse$JsonTwitterObjects jsonLiveEventMetadataResponse$JsonTwitterObjects, String s, final khe khe) throws IOException {
        if ("audiospaces".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap b = new HashMap();
                while (khe.i0() != lje.L0) {
                    final String j = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        b.put(j, null);
                    }
                    else {
                        b.put(j, LoganSquare.typeConverterFor((Class)fpf.class).parse(khe));
                    }
                }
                jsonLiveEventMetadataResponse$JsonTwitterObjects.b = b;
            }
            else {
                jsonLiveEventMetadataResponse$JsonTwitterObjects.b = null;
            }
        }
        else if ("broadcasts".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap a = new HashMap();
                while (khe.i0() != lje.L0) {
                    s = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        a.put(s, null);
                    }
                    else {
                        a.put(s, LoganSquare.typeConverterFor((Class)b.class).parse(khe));
                    }
                }
                jsonLiveEventMetadataResponse$JsonTwitterObjects.a = a;
            }
            else {
                jsonLiveEventMetadataResponse$JsonTwitterObjects.a = null;
            }
        }
        else if ("live_events".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap c = new HashMap();
                while (khe.i0() != lje.L0) {
                    s = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        c.put(s, null);
                    }
                    else {
                        c.put(s, LoganSquare.typeConverterFor((Class)qof.class).parse(khe));
                    }
                }
                jsonLiveEventMetadataResponse$JsonTwitterObjects.c = c;
            }
            else {
                jsonLiveEventMetadataResponse$JsonTwitterObjects.c = null;
            }
        }
        else if ("slates".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap d = new HashMap();
                while (khe.i0() != lje.L0) {
                    final String i = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        d.put(i, null);
                    }
                    else {
                        d.put(i, LoganSquare.typeConverterFor((Class)mdq.class).parse(khe));
                    }
                }
                jsonLiveEventMetadataResponse$JsonTwitterObjects.d = d;
            }
            else {
                jsonLiveEventMetadataResponse$JsonTwitterObjects.d = null;
            }
        }
        else if ("tweets".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap e = new HashMap();
                while (khe.i0() != lje.L0) {
                    final String k = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        e.put(k, null);
                    }
                    else {
                        e.put(k, LoganSquare.typeConverterFor((Class)rh0.class).parse(khe));
                    }
                }
                jsonLiveEventMetadataResponse$JsonTwitterObjects.e = e;
            }
            else {
                jsonLiveEventMetadataResponse$JsonTwitterObjects.e = null;
            }
        }
        else if ("users".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap f = new HashMap();
                while (khe.i0() != lje.L0) {
                    final String l = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        f.put(l, null);
                    }
                    else {
                        f.put(l, LoganSquare.typeConverterFor((Class)hfv.class).parse(khe));
                    }
                }
                jsonLiveEventMetadataResponse$JsonTwitterObjects.f = f;
            }
            else {
                jsonLiveEventMetadataResponse$JsonTwitterObjects.f = null;
            }
        }
    }
    
    public JsonLiveEventMetadataResponse$JsonTwitterObjects parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventMetadataResponse$JsonTwitterObjects jsonLiveEventMetadataResponse$JsonTwitterObjects, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventMetadataResponse$JsonTwitterObjects, tfe, b);
    }
}
