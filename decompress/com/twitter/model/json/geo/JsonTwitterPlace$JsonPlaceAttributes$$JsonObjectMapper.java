// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterPlace$JsonPlaceAttributes$$JsonObjectMapper extends JsonMapper<JsonTwitterPlace.JsonPlaceAttributes>
{
    public static JsonTwitterPlace.JsonPlaceAttributes _parse(final tge tge) throws IOException {
        final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes = new JsonTwitterPlace.JsonPlaceAttributes();
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
            parseField(jsonPlaceAttributes, d, tge);
            tge.l0();
        }
        return jsonPlaceAttributes;
    }
    
    public static void _serialize(final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("twitter", jsonPlaceAttributes.b);
        afe.t0("street_address", jsonPlaceAttributes.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes, final String s, final tge tge) throws IOException {
        if ("twitter".equals(s)) {
            jsonPlaceAttributes.b = tge.T((String)null);
        }
        else if ("street_address".equals(s)) {
            jsonPlaceAttributes.a = tge.T((String)null);
        }
    }
    
    public JsonTwitterPlace.JsonPlaceAttributes parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTwitterPlace.JsonPlaceAttributes jsonPlaceAttributes, final afe afe, final boolean b) throws IOException {
        _serialize(jsonPlaceAttributes, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTwitterPlace.JsonPlaceAttributes)o, afe, b);
    }
}
