// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.periscope;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAuthenticatePeriscopeResponse$$JsonObjectMapper extends JsonMapper<JsonAuthenticatePeriscopeResponse>
{
    public static JsonAuthenticatePeriscopeResponse _parse(final qhe qhe) throws IOException {
        final JsonAuthenticatePeriscopeResponse jsonAuthenticatePeriscopeResponse = new JsonAuthenticatePeriscopeResponse();
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
            parseField(jsonAuthenticatePeriscopeResponse, d, qhe);
            qhe.m0();
        }
        return jsonAuthenticatePeriscopeResponse;
    }
    
    public static void _serialize(final JsonAuthenticatePeriscopeResponse jsonAuthenticatePeriscopeResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("token", jsonAuthenticatePeriscopeResponse.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAuthenticatePeriscopeResponse jsonAuthenticatePeriscopeResponse, final String s, final qhe qhe) throws IOException {
        if ("token".equals(s)) {
            jsonAuthenticatePeriscopeResponse.a = qhe.T((String)null);
        }
    }
    
    public JsonAuthenticatePeriscopeResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAuthenticatePeriscopeResponse jsonAuthenticatePeriscopeResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAuthenticatePeriscopeResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAuthenticatePeriscopeResponse)o, yfe, b);
    }
}
