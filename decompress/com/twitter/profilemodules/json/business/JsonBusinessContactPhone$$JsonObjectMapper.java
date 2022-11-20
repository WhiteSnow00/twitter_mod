// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessContactPhone$$JsonObjectMapper extends JsonMapper<JsonBusinessContactPhone>
{
    public static JsonBusinessContactPhone _parse(final tge tge) throws IOException {
        final JsonBusinessContactPhone jsonBusinessContactPhone = new JsonBusinessContactPhone();
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
            parseField(jsonBusinessContactPhone, d, tge);
            tge.l0();
        }
        return jsonBusinessContactPhone;
    }
    
    public static void _serialize(final JsonBusinessContactPhone jsonBusinessContactPhone, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("country_code", jsonBusinessContactPhone.a);
        afe.t0("country_iso_code", jsonBusinessContactPhone.c);
        afe.t0("number", jsonBusinessContactPhone.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessContactPhone jsonBusinessContactPhone, final String s, final tge tge) throws IOException {
        if ("country_code".equals(s)) {
            jsonBusinessContactPhone.a = tge.T((String)null);
        }
        else if ("country_iso_code".equals(s)) {
            jsonBusinessContactPhone.c = tge.T((String)null);
        }
        else if ("number".equals(s)) {
            jsonBusinessContactPhone.b = tge.T((String)null);
        }
    }
    
    public JsonBusinessContactPhone parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessContactPhone jsonBusinessContactPhone, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessContactPhone, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessContactPhone)o, afe, b);
    }
}
