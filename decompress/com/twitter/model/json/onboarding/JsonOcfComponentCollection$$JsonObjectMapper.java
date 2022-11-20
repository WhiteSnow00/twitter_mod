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
    public static JsonOcfComponentCollection _parse(final tge tge) throws IOException {
        final JsonOcfComponentCollection collection = new JsonOcfComponentCollection();
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
            parseField(collection, d, tge);
            tge.l0();
        }
        return collection;
    }
    
    public static void _serialize(final JsonOcfComponentCollection collection, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList d = collection.d;
        if (d != null) {
            final Iterator a = br.A(afe, "content_footer_components", d);
            while (a.hasNext()) {
                final wqp wqp = a.next();
                if (wqp != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp, "lslocalcontent_footer_componentsElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList b2 = collection.b;
        if (b2 != null) {
            final Iterator a2 = br.A(afe, "content_header_components", b2);
            while (a2.hasNext()) {
                final wqp wqp2 = a2.next();
                if (wqp2 != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp2, "lslocalcontent_header_componentsElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList c = collection.c;
        if (c != null) {
            final Iterator a3 = br.A(afe, "footer_components", c);
            while (a3.hasNext()) {
                final wqp wqp3 = a3.next();
                if (wqp3 != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp3, "lslocalfooter_componentsElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList a4 = collection.a;
        if (a4 != null) {
            final Iterator a5 = br.A(afe, "header_components", a4);
            while (a5.hasNext()) {
                final wqp wqp4 = a5.next();
                if (wqp4 != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp4, "lslocalheader_componentsElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList e = collection.e;
        if (e != null) {
            final Iterator a6 = br.A(afe, "pinned_footer_components", e);
            while (a6.hasNext()) {
                final wqp wqp5 = a6.next();
                if (wqp5 != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp5, "lslocalpinned_footer_componentsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfComponentCollection collection, final String s, final tge tge) throws IOException {
        if ("content_footer_components".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp != null) {
                        d.add(wqp);
                    }
                }
                collection.d = d;
            }
            else {
                collection.d = null;
            }
        }
        else if ("content_header_components".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp2 = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp2 != null) {
                        b.add(wqp2);
                    }
                }
                collection.b = b;
            }
            else {
                collection.b = null;
            }
        }
        else if ("footer_components".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp3 = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp3 != null) {
                        c.add(wqp3);
                    }
                }
                collection.c = c;
            }
            else {
                collection.c = null;
            }
        }
        else if ("header_components".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp4 = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp4 != null) {
                        a.add(wqp4);
                    }
                }
                collection.a = a;
            }
            else {
                collection.a = null;
            }
        }
        else if ("pinned_footer_components".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp5 = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp5 != null) {
                        e.add(wqp5);
                    }
                }
                collection.e = e;
            }
            else {
                collection.e = null;
            }
        }
    }
    
    public JsonOcfComponentCollection parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfComponentCollection collection, final afe afe, final boolean b) throws IOException {
        _serialize(collection, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfComponentCollection)o, afe, b);
    }
}
