// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTCollectionsUnverifiedWallet$$JsonObjectMapper extends JsonMapper<JsonNFTCollectionsUnverifiedWallet>
{
    public static JsonNFTCollectionsUnverifiedWallet _parse(final qhe qhe) throws IOException {
        final JsonNFTCollectionsUnverifiedWallet jsonNFTCollectionsUnverifiedWallet = new JsonNFTCollectionsUnverifiedWallet();
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
            parseField(jsonNFTCollectionsUnverifiedWallet, d, qhe);
            qhe.m0();
        }
        return jsonNFTCollectionsUnverifiedWallet;
    }
    
    public static void _serialize(final JsonNFTCollectionsUnverifiedWallet jsonNFTCollectionsUnverifiedWallet, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonNFTCollectionsUnverifiedWallet.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTCollectionsUnverifiedWallet jsonNFTCollectionsUnverifiedWallet, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonNFTCollectionsUnverifiedWallet.a = qhe.T((String)null);
        }
    }
    
    public JsonNFTCollectionsUnverifiedWallet parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTCollectionsUnverifiedWallet jsonNFTCollectionsUnverifiedWallet, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTCollectionsUnverifiedWallet, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTCollectionsUnverifiedWallet)o, yfe, b);
    }
}
