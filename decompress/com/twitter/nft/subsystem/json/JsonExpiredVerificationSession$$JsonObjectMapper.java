// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExpiredVerificationSession$$JsonObjectMapper extends JsonMapper<JsonExpiredVerificationSession>
{
    public static JsonExpiredVerificationSession _parse(final qhe qhe) throws IOException {
        final JsonExpiredVerificationSession jsonExpiredVerificationSession = new JsonExpiredVerificationSession();
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
            parseField(jsonExpiredVerificationSession, d, qhe);
            qhe.m0();
        }
        return jsonExpiredVerificationSession;
    }
    
    public static void _serialize(final JsonExpiredVerificationSession jsonExpiredVerificationSession, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonExpiredVerificationSession.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonExpiredVerificationSession jsonExpiredVerificationSession, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonExpiredVerificationSession.a = qhe.T((String)null);
        }
    }
    
    public JsonExpiredVerificationSession parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonExpiredVerificationSession jsonExpiredVerificationSession, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonExpiredVerificationSession, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonExpiredVerificationSession)o, yfe, b);
    }
}
