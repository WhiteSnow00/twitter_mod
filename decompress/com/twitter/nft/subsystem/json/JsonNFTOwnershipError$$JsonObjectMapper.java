// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTOwnershipError$$JsonObjectMapper extends JsonMapper<JsonNFTOwnershipError>
{
    public static JsonNFTOwnershipError _parse(final qhe qhe) throws IOException {
        final JsonNFTOwnershipError jsonNFTOwnershipError = new JsonNFTOwnershipError();
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
            parseField(jsonNFTOwnershipError, d, qhe);
            qhe.m0();
        }
        return jsonNFTOwnershipError;
    }
    
    public static void _serialize(final JsonNFTOwnershipError jsonNFTOwnershipError, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonNFTOwnershipError.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTOwnershipError jsonNFTOwnershipError, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonNFTOwnershipError.a = qhe.T((String)null);
        }
    }
    
    public JsonNFTOwnershipError parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTOwnershipError jsonNFTOwnershipError, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTOwnershipError, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTOwnershipError)o, yfe, b);
    }
}
