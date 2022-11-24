// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.nft.subsystem.model.NFTOpenseaCollectionMetadata;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTCollection$$JsonObjectMapper extends JsonMapper<JsonNFTCollection>
{
    public static JsonNFTCollection _parse(final qhe qhe) throws IOException {
        final JsonNFTCollection collection = new JsonNFTCollection();
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
            parseField(collection, d, qhe);
            qhe.m0();
        }
        return collection;
    }
    
    public static void _serialize(final JsonNFTCollection collection, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (collection.b != null) {
            LoganSquare.typeConverterFor((Class)NFTOpenseaCollectionMetadata.class).serialize((Object)collection.b, "metadata", true, yfe);
        }
        yfe.u0("name", collection.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTCollection collection, final String s, final qhe qhe) throws IOException {
        if ("metadata".equals(s)) {
            collection.b = (NFTOpenseaCollectionMetadata)LoganSquare.typeConverterFor((Class)NFTOpenseaCollectionMetadata.class).parse(qhe);
        }
        else if ("name".equals(s)) {
            collection.a = qhe.T((String)null);
        }
    }
    
    public JsonNFTCollection parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTCollection collection, final yfe yfe, final boolean b) throws IOException {
        _serialize(collection, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTCollection)o, yfe, b);
    }
}
