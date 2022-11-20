// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterPlace$$JsonObjectMapper extends JsonMapper<JsonTwitterPlace>
{
    public static JsonTwitterPlace _parse(final tge tge) throws IOException {
        final JsonTwitterPlace jsonTwitterPlace = new JsonTwitterPlace();
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
            parseField(jsonTwitterPlace, d, tge);
            tge.l0();
        }
        return jsonTwitterPlace;
    }
    
    public static void _serialize(final JsonTwitterPlace jsonTwitterPlace, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTwitterPlace.j != null) {
            afe.i("attributes");
            JsonTwitterPlace$JsonPlaceAttributes$$JsonObjectMapper._serialize(jsonTwitterPlace.j, afe, true);
        }
        if (jsonTwitterPlace.i != null) {
            afe.i("bounding_box");
            JsonTwitterPlace$CoordinateArray$$JsonObjectMapper._serialize(jsonTwitterPlace.i, afe, true);
        }
        final double[] h = jsonTwitterPlace.h;
        if (h != null) {
            afe.i("centroid");
            afe.p0();
            for (int length = h.length, i = 0; i < length; ++i) {
                afe.k(h[i]);
            }
            afe.f();
        }
        final qev[] g = jsonTwitterPlace.g;
        if (g != null) {
            afe.i("contained_within");
            afe.p0();
            for (final qev qev : g) {
                if (qev != null) {
                    LoganSquare.typeConverterFor((Class)qev.class).serialize((Object)qev, "lslocalcontained_withinElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("country", jsonTwitterPlace.e);
        afe.t0("country_code", jsonTwitterPlace.f);
        afe.t0("full_name", jsonTwitterPlace.a);
        afe.t0("id", jsonTwitterPlace.d);
        afe.t0("name", jsonTwitterPlace.b);
        if (jsonTwitterPlace.c != null) {
            LoganSquare.typeConverterFor((Class)qev.b.class).serialize((Object)jsonTwitterPlace.c, "place_type", true, afe);
        }
        if (jsonTwitterPlace.k != null) {
            LoganSquare.typeConverterFor((Class)pqw.class).serialize((Object)jsonTwitterPlace.k, "vendor_info", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTwitterPlace jsonTwitterPlace, final String s, final tge tge) throws IOException {
        if ("attributes".equals(s)) {
            jsonTwitterPlace.j = JsonTwitterPlace$JsonPlaceAttributes$$JsonObjectMapper._parse(tge);
        }
        else if ("bounding_box".equals(s)) {
            jsonTwitterPlace.i = JsonTwitterPlace$CoordinateArray$$JsonObjectMapper._parse(tge);
        }
        else if ("centroid".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList list = new ArrayList();
                while (tge.h0() != vie.O0) {
                    list.add(tge.p());
                }
                final double[] h = new double[list.size()];
                int n = 0;
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    h[n] = (double)iterator.next();
                    ++n;
                }
                jsonTwitterPlace.h = h;
            }
            else {
                jsonTwitterPlace.h = null;
            }
        }
        else if ("contained_within".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList list2 = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final qev qev = (qev)LoganSquare.typeConverterFor((Class)qev.class).parse(tge);
                    if (qev != null) {
                        list2.add(qev);
                    }
                }
                jsonTwitterPlace.g = list2.toArray(new qev[list2.size()]);
            }
            else {
                jsonTwitterPlace.g = null;
            }
        }
        else if ("country".equals(s)) {
            jsonTwitterPlace.e = tge.T((String)null);
        }
        else if ("country_code".equals(s)) {
            jsonTwitterPlace.f = tge.T((String)null);
        }
        else if ("full_name".equals(s)) {
            jsonTwitterPlace.a = tge.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonTwitterPlace.d = tge.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonTwitterPlace.b = tge.T((String)null);
        }
        else if ("place_type".equals(s)) {
            jsonTwitterPlace.c = (qev.b)LoganSquare.typeConverterFor((Class)qev.b.class).parse(tge);
        }
        else if ("vendor_info".equals(s)) {
            jsonTwitterPlace.k = (pqw)LoganSquare.typeConverterFor((Class)pqw.class).parse(tge);
        }
    }
    
    public JsonTwitterPlace parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTwitterPlace jsonTwitterPlace, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTwitterPlace, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTwitterPlace)o, afe, b);
    }
}
