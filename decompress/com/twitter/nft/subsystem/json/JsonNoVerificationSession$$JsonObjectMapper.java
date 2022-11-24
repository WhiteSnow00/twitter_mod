// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNoVerificationSession$$JsonObjectMapper extends JsonMapper<JsonNoVerificationSession>
{
    public static JsonNoVerificationSession _parse(final qhe qhe) throws IOException {
        final JsonNoVerificationSession jsonNoVerificationSession = new JsonNoVerificationSession();
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
            parseField(jsonNoVerificationSession, d, qhe);
            qhe.m0();
        }
        return jsonNoVerificationSession;
    }
    
    public static void _serialize(final JsonNoVerificationSession jsonNoVerificationSession, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonNoVerificationSession.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNoVerificationSession jsonNoVerificationSession, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonNoVerificationSession.a = qhe.T((String)null);
        }
    }
    
    public JsonNoVerificationSession parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNoVerificationSession jsonNoVerificationSession, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNoVerificationSession, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNoVerificationSession)o, yfe, b);
    }
}
