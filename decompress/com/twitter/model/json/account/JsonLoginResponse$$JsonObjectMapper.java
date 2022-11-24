// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLoginResponse$$JsonObjectMapper extends JsonMapper<JsonLoginResponse>
{
    public static JsonLoginResponse _parse(final qhe qhe) throws IOException {
        final JsonLoginResponse jsonLoginResponse = new JsonLoginResponse();
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
            parseField(jsonLoginResponse, d, qhe);
            qhe.m0();
        }
        return jsonLoginResponse;
    }
    
    public static void _serialize(final JsonLoginResponse jsonLoginResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("kdt", jsonLoginResponse.e);
        yfe.u0("oauth_token", jsonLoginResponse.a);
        yfe.u0("oauth_token_secret", jsonLoginResponse.b);
        yfe.T("login_verification_request_cause", jsonLoginResponse.h);
        yfe.u0("login_verification_request_id", jsonLoginResponse.c);
        yfe.T("login_verification_request_type", jsonLoginResponse.g);
        yfe.u0("login_verification_request_url", jsonLoginResponse.d);
        yfe.W("login_verification_user_id", jsonLoginResponse.f);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonLoginResponse jsonLoginResponse, final String s, final qhe qhe) throws IOException {
        if ("kdt".equals(s)) {
            jsonLoginResponse.e = qhe.T((String)null);
        }
        else if ("oauth_token".equals(s)) {
            jsonLoginResponse.a = qhe.T((String)null);
        }
        else if ("oauth_token_secret".equals(s)) {
            jsonLoginResponse.b = qhe.T((String)null);
        }
        else if ("login_verification_request_cause".equals(s)) {
            jsonLoginResponse.h = qhe.z();
        }
        else if ("login_verification_request_id".equals(s)) {
            jsonLoginResponse.c = qhe.T((String)null);
        }
        else if ("login_verification_request_type".equals(s)) {
            jsonLoginResponse.g = qhe.z();
        }
        else if ("login_verification_request_url".equals(s)) {
            jsonLoginResponse.d = qhe.T((String)null);
        }
        else if ("login_verification_user_id".equals(s)) {
            jsonLoginResponse.f = qhe.L();
        }
    }
    
    public JsonLoginResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonLoginResponse jsonLoginResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonLoginResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonLoginResponse)o, yfe, b);
    }
}
