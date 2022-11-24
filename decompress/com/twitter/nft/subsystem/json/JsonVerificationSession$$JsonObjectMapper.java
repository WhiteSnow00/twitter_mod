// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVerificationSession$$JsonObjectMapper extends JsonMapper<JsonVerificationSession>
{
    public static JsonVerificationSession _parse(final qhe qhe) throws IOException {
        final JsonVerificationSession jsonVerificationSession = new JsonVerificationSession();
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
            parseField(jsonVerificationSession, d, qhe);
            qhe.m0();
        }
        return jsonVerificationSession;
    }
    
    public static void _serialize(final JsonVerificationSession jsonVerificationSession, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("bridge_url", jsonVerificationSession.c);
        yfe.u0("message", jsonVerificationSession.b);
        yfe.u0("token", jsonVerificationSession.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonVerificationSession jsonVerificationSession, final String s, final qhe qhe) throws IOException {
        if ("bridge_url".equals(s)) {
            jsonVerificationSession.c = qhe.T((String)null);
        }
        else if ("message".equals(s)) {
            jsonVerificationSession.b = qhe.T((String)null);
        }
        else if ("token".equals(s)) {
            jsonVerificationSession.a = qhe.T((String)null);
        }
    }
    
    public JsonVerificationSession parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonVerificationSession jsonVerificationSession, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonVerificationSession, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonVerificationSession)o, yfe, b);
    }
}
