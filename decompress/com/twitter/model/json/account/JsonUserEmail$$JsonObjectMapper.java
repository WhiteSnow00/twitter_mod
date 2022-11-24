// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserEmail$$JsonObjectMapper extends JsonMapper<JsonUserEmail>
{
    public static JsonUserEmail _parse(final qhe qhe) throws IOException {
        final JsonUserEmail jsonUserEmail = new JsonUserEmail();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonUserEmail, d, qhe);
            qhe.m0();
        }
        return jsonUserEmail;
    }
    
    public static void _serialize(final JsonUserEmail jsonUserEmail, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("email", jsonUserEmail.a);
        yfe.e("email_verified", jsonUserEmail.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserEmail jsonUserEmail, final String s, final qhe qhe) throws IOException {
        if ("email".equals(s)) {
            jsonUserEmail.a = qhe.T((String)null);
        }
        else if ("email_verified".equals(s)) {
            jsonUserEmail.b = qhe.l();
        }
    }
    
    public JsonUserEmail parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserEmail jsonUserEmail, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserEmail, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserEmail)o, yfe, b);
    }
}
