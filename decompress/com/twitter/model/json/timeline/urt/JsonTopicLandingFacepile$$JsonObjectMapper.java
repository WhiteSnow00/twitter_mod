// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicLandingFacepile$$JsonObjectMapper extends JsonMapper<JsonTopicLandingFacepile>
{
    public static JsonTopicLandingFacepile _parse(final tge tge) throws IOException {
        final JsonTopicLandingFacepile jsonTopicLandingFacepile = new JsonTopicLandingFacepile();
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
            parseField(jsonTopicLandingFacepile, d, tge);
            tge.l0();
        }
        return jsonTopicLandingFacepile;
    }
    
    public static void _serialize(final JsonTopicLandingFacepile jsonTopicLandingFacepile, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTopicLandingFacepile.a != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTopicLandingFacepile.a, "facepileUrl", true, afe);
        }
        final List b2 = jsonTopicLandingFacepile.b;
        if (b2 != null) {
            final Iterator g = hee.g(afe, "userIds", b2);
            while (g.hasNext()) {
                afe.r0((String)g.next());
            }
            afe.f();
        }
        final ArrayList c = jsonTopicLandingFacepile.c;
        if (c != null) {
            final Iterator a = br.A(afe, "users", c);
            while (a.hasNext()) {
                final cgv cgv = a.next();
                if (cgv != null) {
                    LoganSquare.typeConverterFor((Class)cgv.class).serialize((Object)cgv, "lslocalusersElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTopicLandingFacepile jsonTopicLandingFacepile, String t, final tge tge) throws IOException {
        if ("facepileUrl".equals(t)) {
            jsonTopicLandingFacepile.a = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
        else if ("userIds".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    t = tge.T((String)null);
                    if (t != null) {
                        b.add(t);
                    }
                }
                jsonTopicLandingFacepile.b = b;
            }
            else {
                jsonTopicLandingFacepile.b = null;
            }
        }
        else if ("users".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final cgv cgv = (cgv)LoganSquare.typeConverterFor((Class)cgv.class).parse(tge);
                    if (cgv != null) {
                        c.add(cgv);
                    }
                }
                jsonTopicLandingFacepile.c = c;
            }
            else {
                jsonTopicLandingFacepile.c = null;
            }
        }
    }
    
    public JsonTopicLandingFacepile parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTopicLandingFacepile jsonTopicLandingFacepile, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTopicLandingFacepile, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTopicLandingFacepile)o, afe, b);
    }
}
