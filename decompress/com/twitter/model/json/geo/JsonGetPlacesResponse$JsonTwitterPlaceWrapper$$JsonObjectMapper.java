// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGetPlacesResponse$JsonTwitterPlaceWrapper$$JsonObjectMapper extends JsonMapper<JsonGetPlacesResponse.JsonTwitterPlaceWrapper>
{
    public static JsonGetPlacesResponse.JsonTwitterPlaceWrapper _parse(final khe khe) throws IOException {
        final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper = new JsonGetPlacesResponse.JsonTwitterPlaceWrapper();
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
            parseField(jsonTwitterPlaceWrapper, d, khe);
            khe.m0();
        }
        return jsonTwitterPlaceWrapper;
    }
    
    public static void _serialize(final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTwitterPlaceWrapper.a != null) {
            LoganSquare.typeConverterFor((Class)vdv.class).serialize((Object)jsonTwitterPlaceWrapper.a, "place", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper, final String s, final khe khe) throws IOException {
        if ("place".equals(s)) {
            jsonTwitterPlaceWrapper.a = (vdv)LoganSquare.typeConverterFor((Class)vdv.class).parse(khe);
        }
    }
    
    public JsonGetPlacesResponse.JsonTwitterPlaceWrapper parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTwitterPlaceWrapper, tfe, b);
    }
}
