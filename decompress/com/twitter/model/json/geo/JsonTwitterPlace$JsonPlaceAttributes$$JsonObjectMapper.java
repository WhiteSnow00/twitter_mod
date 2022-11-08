// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterPlace$JsonPlaceAttributes$$JsonObjectMapper extends JsonMapper<JsonTwitterPlace.JsonPlaceAttributes>
{
    public static JsonTwitterPlace.JsonPlaceAttributes _parse(final khe khe) throws IOException {
        final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes = new JsonTwitterPlace.JsonPlaceAttributes();
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
            parseField(jsonPlaceAttributes, d, khe);
            khe.m0();
        }
        return jsonPlaceAttributes;
    }
    
    public static void _serialize(final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("twitter", jsonPlaceAttributes.b);
        tfe.u0("street_address", jsonPlaceAttributes.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes, final String s, final khe khe) throws IOException {
        if ("twitter".equals(s)) {
            jsonPlaceAttributes.b = khe.T((String)null);
        }
        else if ("street_address".equals(s)) {
            jsonPlaceAttributes.a = khe.T((String)null);
        }
    }
    
    public JsonTwitterPlace.JsonPlaceAttributes parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonPlaceAttributes, tfe, b);
    }
}
