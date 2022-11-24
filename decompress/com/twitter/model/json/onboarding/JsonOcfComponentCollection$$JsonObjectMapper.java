// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfComponentCollection$$JsonObjectMapper extends JsonMapper<JsonOcfComponentCollection>
{
    public static JsonOcfComponentCollection _parse(final qhe qhe) throws IOException {
        final JsonOcfComponentCollection collection = new JsonOcfComponentCollection();
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
            parseField(collection, d, qhe);
            qhe.m0();
        }
        return collection;
    }
    
    public static void _serialize(final JsonOcfComponentCollection collection, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList d = collection.d;
        if (d != null) {
            final Iterator e = d10.E(yfe, "content_footer_components", d);
            while (e.hasNext()) {
                final rrp rrp = e.next();
                if (rrp != null) {
                    LoganSquare.typeConverterFor((Class)rrp.class).serialize((Object)rrp, "lslocalcontent_footer_componentsElement", false, yfe);
                }
            }
            yfe.f();
        }
        final ArrayList b2 = collection.b;
        if (b2 != null) {
            final Iterator e2 = d10.E(yfe, "content_header_components", b2);
            while (e2.hasNext()) {
                final rrp rrp2 = e2.next();
                if (rrp2 != null) {
                    LoganSquare.typeConverterFor((Class)rrp.class).serialize((Object)rrp2, "lslocalcontent_header_componentsElement", false, yfe);
                }
            }
            yfe.f();
        }
        final ArrayList c = collection.c;
        if (c != null) {
            final Iterator e3 = d10.E(yfe, "footer_components", c);
            while (e3.hasNext()) {
                final rrp rrp3 = e3.next();
                if (rrp3 != null) {
                    LoganSquare.typeConverterFor((Class)rrp.class).serialize((Object)rrp3, "lslocalfooter_componentsElement", false, yfe);
                }
            }
            yfe.f();
        }
        final ArrayList a = collection.a;
        if (a != null) {
            final Iterator e4 = d10.E(yfe, "header_components", a);
            while (e4.hasNext()) {
                final rrp rrp4 = e4.next();
                if (rrp4 != null) {
                    LoganSquare.typeConverterFor((Class)rrp.class).serialize((Object)rrp4, "lslocalheader_componentsElement", false, yfe);
                }
            }
            yfe.f();
        }
        final ArrayList e5 = collection.e;
        if (e5 != null) {
            final Iterator e6 = d10.E(yfe, "pinned_footer_components", e5);
            while (e6.hasNext()) {
                final rrp rrp5 = e6.next();
                if (rrp5 != null) {
                    LoganSquare.typeConverterFor((Class)rrp.class).serialize((Object)rrp5, "lslocalpinned_footer_componentsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfComponentCollection collection, final String s, final qhe qhe) throws IOException {
        if ("content_footer_components".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final rrp rrp = (rrp)LoganSquare.typeConverterFor((Class)rrp.class).parse(qhe);
                    if (rrp != null) {
                        d.add(rrp);
                    }
                }
                collection.d = d;
            }
            else {
                collection.d = null;
            }
        }
        else if ("content_header_components".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final rrp rrp2 = (rrp)LoganSquare.typeConverterFor((Class)rrp.class).parse(qhe);
                    if (rrp2 != null) {
                        b.add(rrp2);
                    }
                }
                collection.b = b;
            }
            else {
                collection.b = null;
            }
        }
        else if ("footer_components".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final rrp rrp3 = (rrp)LoganSquare.typeConverterFor((Class)rrp.class).parse(qhe);
                    if (rrp3 != null) {
                        c.add(rrp3);
                    }
                }
                collection.c = c;
            }
            else {
                collection.c = null;
            }
        }
        else if ("header_components".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final rrp rrp4 = (rrp)LoganSquare.typeConverterFor((Class)rrp.class).parse(qhe);
                    if (rrp4 != null) {
                        a.add(rrp4);
                    }
                }
                collection.a = a;
            }
            else {
                collection.a = null;
            }
        }
        else if ("pinned_footer_components".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList e = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final rrp rrp5 = (rrp)LoganSquare.typeConverterFor((Class)rrp.class).parse(qhe);
                    if (rrp5 != null) {
                        e.add(rrp5);
                    }
                }
                collection.e = e;
            }
            else {
                collection.e = null;
            }
        }
    }
    
    public JsonOcfComponentCollection parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfComponentCollection collection, final yfe yfe, final boolean b) throws IOException {
        _serialize(collection, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfComponentCollection)o, yfe, b);
    }
}
