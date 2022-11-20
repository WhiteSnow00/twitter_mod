// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessAddressResponse$$JsonObjectMapper extends JsonMapper<JsonBusinessAddressResponse>
{
    public static JsonBusinessAddressResponse _parse(final tge tge) throws IOException {
        final JsonBusinessAddressResponse jsonBusinessAddressResponse = new JsonBusinessAddressResponse();
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
            parseField(jsonBusinessAddressResponse, d, tge);
            tge.l0();
        }
        return jsonBusinessAddressResponse;
    }
    
    public static void _serialize(final JsonBusinessAddressResponse jsonBusinessAddressResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("address_line1", jsonBusinessAddressResponse.a);
        afe.t0("administrative_area", jsonBusinessAddressResponse.b);
        afe.t0("city", jsonBusinessAddressResponse.c);
        afe.t0("country", jsonBusinessAddressResponse.d);
        afe.t0("formatted_address", jsonBusinessAddressResponse.g);
        if (jsonBusinessAddressResponse.f != null) {
            LoganSquare.typeConverterFor((Class)u0c.class).serialize((Object)jsonBusinessAddressResponse.f, "geo", true, afe);
        }
        afe.t0("postal_code", jsonBusinessAddressResponse.e);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessAddressResponse jsonBusinessAddressResponse, final String s, final tge tge) throws IOException {
        if ("address_line1".equals(s)) {
            jsonBusinessAddressResponse.a = tge.T((String)null);
        }
        else if ("administrative_area".equals(s)) {
            jsonBusinessAddressResponse.b = tge.T((String)null);
        }
        else if ("city".equals(s)) {
            jsonBusinessAddressResponse.c = tge.T((String)null);
        }
        else if ("country".equals(s)) {
            jsonBusinessAddressResponse.d = tge.T((String)null);
        }
        else if ("formatted_address".equals(s)) {
            jsonBusinessAddressResponse.g = tge.T((String)null);
        }
        else if ("geo".equals(s)) {
            jsonBusinessAddressResponse.f = (u0c)LoganSquare.typeConverterFor((Class)u0c.class).parse(tge);
        }
        else if ("postal_code".equals(s)) {
            jsonBusinessAddressResponse.e = tge.T((String)null);
        }
    }
    
    public JsonBusinessAddressResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessAddressResponse jsonBusinessAddressResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessAddressResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessAddressResponse)o, afe, b);
    }
}
