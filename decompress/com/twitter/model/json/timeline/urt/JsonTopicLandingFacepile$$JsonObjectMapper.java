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
    public static JsonTopicLandingFacepile _parse(final khe khe) throws IOException {
        final JsonTopicLandingFacepile jsonTopicLandingFacepile = new JsonTopicLandingFacepile();
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
            parseField(jsonTopicLandingFacepile, d, khe);
            khe.m0();
        }
        return jsonTopicLandingFacepile;
    }
    
    public static void _serialize(final JsonTopicLandingFacepile jsonTopicLandingFacepile, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTopicLandingFacepile.a != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonTopicLandingFacepile.a, "facepileUrl", true, tfe);
        }
        final List<String> b2 = jsonTopicLandingFacepile.b;
        if (b2 != null) {
            final Iterator f = x30.F(tfe, "userIds", (List)b2);
            while (f.hasNext()) {
                tfe.s0((String)f.next());
            }
            tfe.f();
        }
        final ArrayList c = jsonTopicLandingFacepile.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "users", c);
            while (g.hasNext()) {
                final hfv hfv = g.next();
                if (hfv != null) {
                    LoganSquare.typeConverterFor((Class)hfv.class).serialize((Object)hfv, "lslocalusersElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTopicLandingFacepile jsonTopicLandingFacepile, String t, final khe khe) throws IOException {
        if ("facepileUrl".equals(t)) {
            jsonTopicLandingFacepile.a = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
        else if ("userIds".equals(t)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    t = khe.T((String)null);
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
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final hfv hfv = (hfv)LoganSquare.typeConverterFor((Class)hfv.class).parse(khe);
                    if (hfv != null) {
                        c.add(hfv);
                    }
                }
                jsonTopicLandingFacepile.c = c;
            }
            else {
                jsonTopicLandingFacepile.c = null;
            }
        }
    }
    
    public JsonTopicLandingFacepile parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTopicLandingFacepile jsonTopicLandingFacepile, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTopicLandingFacepile, tfe, b);
    }
}
