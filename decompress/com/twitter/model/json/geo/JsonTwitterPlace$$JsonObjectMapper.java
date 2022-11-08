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
    public static JsonTwitterPlace _parse(final khe khe) throws IOException {
        final JsonTwitterPlace jsonTwitterPlace = new JsonTwitterPlace();
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
            parseField(jsonTwitterPlace, d, khe);
            khe.m0();
        }
        return jsonTwitterPlace;
    }
    
    public static void _serialize(final JsonTwitterPlace jsonTwitterPlace, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTwitterPlace.j != null) {
            tfe.i("attributes");
            JsonTwitterPlace$JsonPlaceAttributes$$JsonObjectMapper._serialize(jsonTwitterPlace.j, tfe, true);
        }
        if (jsonTwitterPlace.i != null) {
            tfe.i("bounding_box");
            JsonTwitterPlace$CoordinateArray$$JsonObjectMapper._serialize(jsonTwitterPlace.i, tfe, true);
        }
        final double[] h = jsonTwitterPlace.h;
        if (h != null) {
            tfe.i("centroid");
            tfe.q0();
            for (int length = h.length, i = 0; i < length; ++i) {
                tfe.k(h[i]);
            }
            tfe.f();
        }
        final vdv[] g = jsonTwitterPlace.g;
        if (g != null) {
            tfe.i("contained_within");
            tfe.q0();
            for (final vdv vdv : g) {
                if (vdv != null) {
                    LoganSquare.typeConverterFor((Class)vdv.class).serialize((Object)vdv, "lslocalcontained_withinElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("country", jsonTwitterPlace.e);
        tfe.u0("country_code", jsonTwitterPlace.f);
        tfe.u0("full_name", jsonTwitterPlace.a);
        tfe.u0("id", jsonTwitterPlace.d);
        tfe.u0("name", jsonTwitterPlace.b);
        if (jsonTwitterPlace.c != null) {
            LoganSquare.typeConverterFor((Class)vdv$b.class).serialize((Object)jsonTwitterPlace.c, "place_type", true, tfe);
        }
        if (jsonTwitterPlace.k != null) {
            LoganSquare.typeConverterFor((Class)vpw.class).serialize((Object)jsonTwitterPlace.k, "vendor_info", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTwitterPlace jsonTwitterPlace, final String s, final khe khe) throws IOException {
        if ("attributes".equals(s)) {
            jsonTwitterPlace.j = JsonTwitterPlace$JsonPlaceAttributes$$JsonObjectMapper._parse(khe);
        }
        else if ("bounding_box".equals(s)) {
            jsonTwitterPlace.i = JsonTwitterPlace$CoordinateArray$$JsonObjectMapper._parse(khe);
        }
        else if ("centroid".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list = new ArrayList();
                while (khe.i0() != lje.N0) {
                    list.add(khe.p());
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
            if (khe.e() == lje.M0) {
                final ArrayList list2 = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final vdv vdv = (vdv)LoganSquare.typeConverterFor((Class)vdv.class).parse(khe);
                    if (vdv != null) {
                        list2.add(vdv);
                    }
                }
                jsonTwitterPlace.g = list2.toArray(new vdv[list2.size()]);
            }
            else {
                jsonTwitterPlace.g = null;
            }
        }
        else if ("country".equals(s)) {
            jsonTwitterPlace.e = khe.T((String)null);
        }
        else if ("country_code".equals(s)) {
            jsonTwitterPlace.f = khe.T((String)null);
        }
        else if ("full_name".equals(s)) {
            jsonTwitterPlace.a = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonTwitterPlace.d = khe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonTwitterPlace.b = khe.T((String)null);
        }
        else if ("place_type".equals(s)) {
            jsonTwitterPlace.c = (vdv$b)LoganSquare.typeConverterFor((Class)vdv$b.class).parse(khe);
        }
        else if ("vendor_info".equals(s)) {
            jsonTwitterPlace.k = (vpw)LoganSquare.typeConverterFor((Class)vpw.class).parse(khe);
        }
    }
    
    public JsonTwitterPlace parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTwitterPlace jsonTwitterPlace, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTwitterPlace, tfe, b);
    }
}
