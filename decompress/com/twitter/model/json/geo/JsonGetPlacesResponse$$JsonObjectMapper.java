// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGetPlacesResponse$$JsonObjectMapper extends JsonMapper<JsonGetPlacesResponse>
{
    public static JsonGetPlacesResponse _parse(final khe khe) throws IOException {
        final JsonGetPlacesResponse jsonGetPlacesResponse = new JsonGetPlacesResponse();
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
            parseField(jsonGetPlacesResponse, d, khe);
            khe.m0();
        }
        return jsonGetPlacesResponse;
    }
    
    public static void _serialize(final JsonGetPlacesResponse jsonGetPlacesResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList c = jsonGetPlacesResponse.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "attributions", c);
            while (g.hasNext()) {
                final tfk tfk = g.next();
                if (tfk != null) {
                    LoganSquare.typeConverterFor((Class)tfk.class).serialize((Object)tfk, "lslocalattributionsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("autotag_place_id", jsonGetPlacesResponse.a);
        final ArrayList d = jsonGetPlacesResponse.d;
        if (d != null) {
            final Iterator g2 = q1a.g(tfe, "places", d);
            while (g2.hasNext()) {
                final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper = g2.next();
                if (jsonTwitterPlaceWrapper != null) {
                    JsonGetPlacesResponse$JsonTwitterPlaceWrapper$$JsonObjectMapper._serialize(jsonTwitterPlaceWrapper, tfe, true);
                }
            }
            tfe.f();
        }
        tfe.u0("geo_search_request_id", jsonGetPlacesResponse.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGetPlacesResponse jsonGetPlacesResponse, final String s, final khe khe) throws IOException {
        if ("attributions".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final tfk tfk = (tfk)LoganSquare.typeConverterFor((Class)tfk.class).parse(khe);
                    if (tfk != null) {
                        c.add(tfk);
                    }
                }
                jsonGetPlacesResponse.c = c;
            }
            else {
                jsonGetPlacesResponse.c = null;
            }
        }
        else if ("autotag_place_id".equals(s)) {
            jsonGetPlacesResponse.a = khe.T((String)null);
        }
        else if ("places".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonGetPlacesResponse.JsonTwitterPlaceWrapper parse = JsonGetPlacesResponse$JsonTwitterPlaceWrapper$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        d.add(parse);
                    }
                }
                jsonGetPlacesResponse.d = d;
            }
            else {
                jsonGetPlacesResponse.d = null;
            }
        }
        else if ("geo_search_request_id".equals(s)) {
            jsonGetPlacesResponse.b = khe.T((String)null);
        }
    }
    
    public JsonGetPlacesResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGetPlacesResponse jsonGetPlacesResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGetPlacesResponse, tfe, b);
    }
}
