// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTemporaryAppPwRequest$$JsonObjectMapper extends JsonMapper<JsonTemporaryAppPwRequest>
{
    public static JsonTemporaryAppPwRequest _parse(final qhe qhe) throws IOException {
        final JsonTemporaryAppPwRequest jsonTemporaryAppPwRequest = new JsonTemporaryAppPwRequest();
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
            parseField(jsonTemporaryAppPwRequest, d, qhe);
            qhe.m0();
        }
        return jsonTemporaryAppPwRequest;
    }
    
    public static void _serialize(final JsonTemporaryAppPwRequest jsonTemporaryAppPwRequest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("temporary_password", jsonTemporaryAppPwRequest.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTemporaryAppPwRequest jsonTemporaryAppPwRequest, final String s, final qhe qhe) throws IOException {
        if ("temporary_password".equals(s)) {
            jsonTemporaryAppPwRequest.a = qhe.T((String)null);
        }
    }
    
    public JsonTemporaryAppPwRequest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTemporaryAppPwRequest jsonTemporaryAppPwRequest, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTemporaryAppPwRequest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTemporaryAppPwRequest)o, yfe, b);
    }
}
