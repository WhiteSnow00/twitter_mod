// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLoginVerificationRequest$$JsonObjectMapper extends JsonMapper<JsonLoginVerificationRequest>
{
    public static JsonLoginVerificationRequest _parse(final qhe qhe) throws IOException {
        final JsonLoginVerificationRequest jsonLoginVerificationRequest = new JsonLoginVerificationRequest();
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
            parseField(jsonLoginVerificationRequest, d, qhe);
            qhe.m0();
        }
        return jsonLoginVerificationRequest;
    }
    
    public static void _serialize(final JsonLoginVerificationRequest jsonLoginVerificationRequest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("browser", jsonLoginVerificationRequest.d);
        yfe.u0("challenge", jsonLoginVerificationRequest.b);
        yfe.u0("geo", jsonLoginVerificationRequest.c);
        yfe.u0("id", jsonLoginVerificationRequest.a);
        yfe.W("createdAt", jsonLoginVerificationRequest.e);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonLoginVerificationRequest jsonLoginVerificationRequest, final String s, final qhe qhe) throws IOException {
        if ("browser".equals(s)) {
            jsonLoginVerificationRequest.d = qhe.T((String)null);
        }
        else if ("challenge".equals(s)) {
            jsonLoginVerificationRequest.b = qhe.T((String)null);
        }
        else if ("geo".equals(s)) {
            jsonLoginVerificationRequest.c = qhe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonLoginVerificationRequest.a = qhe.T((String)null);
        }
        else if ("createdAt".equals(s)) {
            jsonLoginVerificationRequest.e = qhe.L();
        }
    }
    
    public JsonLoginVerificationRequest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonLoginVerificationRequest jsonLoginVerificationRequest, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonLoginVerificationRequest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonLoginVerificationRequest)o, yfe, b);
    }
}
