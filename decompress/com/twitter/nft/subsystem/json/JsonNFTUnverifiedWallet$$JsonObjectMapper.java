// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTUnverifiedWallet$$JsonObjectMapper extends JsonMapper<JsonNFTUnverifiedWallet>
{
    public static JsonNFTUnverifiedWallet _parse(final qhe qhe) throws IOException {
        final JsonNFTUnverifiedWallet jsonNFTUnverifiedWallet = new JsonNFTUnverifiedWallet();
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
            parseField(jsonNFTUnverifiedWallet, d, qhe);
            qhe.m0();
        }
        return jsonNFTUnverifiedWallet;
    }
    
    public static void _serialize(final JsonNFTUnverifiedWallet jsonNFTUnverifiedWallet, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonNFTUnverifiedWallet.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTUnverifiedWallet jsonNFTUnverifiedWallet, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonNFTUnverifiedWallet.a = qhe.T((String)null);
        }
    }
    
    public JsonNFTUnverifiedWallet parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTUnverifiedWallet jsonNFTUnverifiedWallet, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTUnverifiedWallet, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTUnverifiedWallet)o, yfe, b);
    }
}
