// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.twitter.nft.subsystem.model.NFTSmartContract;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTMetadata$$JsonObjectMapper extends JsonMapper<JsonNFTMetadata>
{
    public static JsonNFTMetadata _parse(final qhe qhe) throws IOException {
        final JsonNFTMetadata jsonNFTMetadata = new JsonNFTMetadata();
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
            parseField(jsonNFTMetadata, d, qhe);
            qhe.m0();
        }
        return jsonNFTMetadata;
    }
    
    public static void _serialize(final JsonNFTMetadata jsonNFTMetadata, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNFTMetadata.b != null) {
            LoganSquare.typeConverterFor((Class)a5i.class).serialize((Object)jsonNFTMetadata.b, "metadata", true, yfe);
        }
        if (jsonNFTMetadata.c != null) {
            LoganSquare.typeConverterFor((Class)NFTSmartContract.class).serialize((Object)jsonNFTMetadata.c, "smart_contract", true, yfe);
        }
        yfe.u0("token_id", jsonNFTMetadata.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTMetadata jsonNFTMetadata, final String s, final qhe qhe) throws IOException {
        if ("metadata".equals(s)) {
            jsonNFTMetadata.b = (a5i)LoganSquare.typeConverterFor((Class)a5i.class).parse(qhe);
        }
        else if ("smart_contract".equals(s)) {
            jsonNFTMetadata.c = (NFTSmartContract)LoganSquare.typeConverterFor((Class)NFTSmartContract.class).parse(qhe);
        }
        else if ("token_id".equals(s)) {
            jsonNFTMetadata.a = qhe.T((String)null);
        }
    }
    
    public JsonNFTMetadata parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTMetadata jsonNFTMetadata, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTMetadata, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTMetadata)o, yfe, b);
    }
}
