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
    public static JsonGetPlacesResponse _parse(final tge tge) throws IOException {
        final JsonGetPlacesResponse jsonGetPlacesResponse = new JsonGetPlacesResponse();
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
            parseField(jsonGetPlacesResponse, d, tge);
            tge.l0();
        }
        return jsonGetPlacesResponse;
    }
    
    public static void _serialize(final JsonGetPlacesResponse jsonGetPlacesResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList c = jsonGetPlacesResponse.c;
        if (c != null) {
            final Iterator a = br.A(afe, "attributions", c);
            while (a.hasNext()) {
                final zfk zfk = a.next();
                if (zfk != null) {
                    LoganSquare.typeConverterFor((Class)zfk.class).serialize((Object)zfk, "lslocalattributionsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("autotag_place_id", jsonGetPlacesResponse.a);
        final ArrayList d = jsonGetPlacesResponse.d;
        if (d != null) {
            final Iterator a2 = br.A(afe, "places", d);
            while (a2.hasNext()) {
                final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper = a2.next();
                if (jsonTwitterPlaceWrapper != null) {
                    JsonGetPlacesResponse$JsonTwitterPlaceWrapper$$JsonObjectMapper._serialize(jsonTwitterPlaceWrapper, afe, true);
                }
            }
            afe.f();
        }
        afe.t0("geo_search_request_id", jsonGetPlacesResponse.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGetPlacesResponse jsonGetPlacesResponse, final String s, final tge tge) throws IOException {
        if ("attributions".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final zfk zfk = (zfk)LoganSquare.typeConverterFor((Class)zfk.class).parse(tge);
                    if (zfk != null) {
                        c.add(zfk);
                    }
                }
                jsonGetPlacesResponse.c = c;
            }
            else {
                jsonGetPlacesResponse.c = null;
            }
        }
        else if ("autotag_place_id".equals(s)) {
            jsonGetPlacesResponse.a = tge.T((String)null);
        }
        else if ("places".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonGetPlacesResponse.JsonTwitterPlaceWrapper parse = JsonGetPlacesResponse$JsonTwitterPlaceWrapper$$JsonObjectMapper._parse(tge);
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
            jsonGetPlacesResponse.b = tge.T((String)null);
        }
    }
    
    public JsonGetPlacesResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGetPlacesResponse jsonGetPlacesResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGetPlacesResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGetPlacesResponse)o, afe, b);
    }
}
