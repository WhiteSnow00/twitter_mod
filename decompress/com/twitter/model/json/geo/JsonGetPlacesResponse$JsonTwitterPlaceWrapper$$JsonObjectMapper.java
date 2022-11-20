// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGetPlacesResponse$JsonTwitterPlaceWrapper$$JsonObjectMapper extends JsonMapper<JsonGetPlacesResponse.JsonTwitterPlaceWrapper>
{
    public static JsonGetPlacesResponse.JsonTwitterPlaceWrapper _parse(final tge tge) throws IOException {
        final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper = new JsonGetPlacesResponse.JsonTwitterPlaceWrapper();
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
            parseField(jsonTwitterPlaceWrapper, d, tge);
            tge.l0();
        }
        return jsonTwitterPlaceWrapper;
    }
    
    public static void _serialize(final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTwitterPlaceWrapper.a != null) {
            LoganSquare.typeConverterFor((Class)qev.class).serialize((Object)jsonTwitterPlaceWrapper.a, "place", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper, final String s, final tge tge) throws IOException {
        if ("place".equals(s)) {
            jsonTwitterPlaceWrapper.a = (qev)LoganSquare.typeConverterFor((Class)qev.class).parse(tge);
        }
    }
    
    public JsonGetPlacesResponse.JsonTwitterPlaceWrapper parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGetPlacesResponse.JsonTwitterPlaceWrapper jsonTwitterPlaceWrapper, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTwitterPlaceWrapper, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGetPlacesResponse.JsonTwitterPlaceWrapper)o, afe, b);
    }
}
