// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInvalidSignature$$JsonObjectMapper extends JsonMapper<JsonInvalidSignature>
{
    public static JsonInvalidSignature _parse(final qhe qhe) throws IOException {
        final JsonInvalidSignature jsonInvalidSignature = new JsonInvalidSignature();
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
            parseField(jsonInvalidSignature, d, qhe);
            qhe.m0();
        }
        return jsonInvalidSignature;
    }
    
    public static void _serialize(final JsonInvalidSignature jsonInvalidSignature, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonInvalidSignature.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInvalidSignature jsonInvalidSignature, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonInvalidSignature.a = qhe.T((String)null);
        }
    }
    
    public JsonInvalidSignature parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInvalidSignature jsonInvalidSignature, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonInvalidSignature, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInvalidSignature)o, yfe, b);
    }
}
