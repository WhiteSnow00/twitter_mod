// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessContactEmail$$JsonObjectMapper extends JsonMapper<JsonBusinessContactEmail>
{
    public static JsonBusinessContactEmail _parse(final tge tge) throws IOException {
        final JsonBusinessContactEmail jsonBusinessContactEmail = new JsonBusinessContactEmail();
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
            parseField(jsonBusinessContactEmail, d, tge);
            tge.l0();
        }
        return jsonBusinessContactEmail;
    }
    
    public static void _serialize(final JsonBusinessContactEmail jsonBusinessContactEmail, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("email_address", jsonBusinessContactEmail.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessContactEmail jsonBusinessContactEmail, final String s, final tge tge) throws IOException {
        if ("email_address".equals(s)) {
            jsonBusinessContactEmail.a = tge.T((String)null);
        }
    }
    
    public JsonBusinessContactEmail parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessContactEmail jsonBusinessContactEmail, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessContactEmail, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessContactEmail)o, afe, b);
    }
}
