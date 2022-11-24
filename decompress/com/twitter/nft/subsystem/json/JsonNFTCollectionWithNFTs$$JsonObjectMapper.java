// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.nft.subsystem.model.NFTCollection;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTCollectionWithNFTs$$JsonObjectMapper extends JsonMapper<JsonNFTCollectionWithNFTs>
{
    public static JsonNFTCollectionWithNFTs _parse(final qhe qhe) throws IOException {
        final JsonNFTCollectionWithNFTs jsonNFTCollectionWithNFTs = new JsonNFTCollectionWithNFTs();
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
            parseField(jsonNFTCollectionWithNFTs, d, qhe);
            qhe.m0();
        }
        return jsonNFTCollectionWithNFTs;
    }
    
    public static void _serialize(final JsonNFTCollectionWithNFTs jsonNFTCollectionWithNFTs, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNFTCollectionWithNFTs.a != null) {
            LoganSquare.typeConverterFor((Class)NFTCollection.class).serialize((Object)jsonNFTCollectionWithNFTs.a, "collection", true, yfe);
        }
        final ArrayList b2 = jsonNFTCollectionWithNFTs.b;
        if (b2 != null) {
            final Iterator e = d10.E(yfe, "nfts", b2);
            while (e.hasNext()) {
                final u4i u4i = e.next();
                if (u4i != null) {
                    LoganSquare.typeConverterFor((Class)u4i.class).serialize((Object)u4i, "lslocalnftsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTCollectionWithNFTs jsonNFTCollectionWithNFTs, final String s, final qhe qhe) throws IOException {
        if ("collection".equals(s)) {
            jsonNFTCollectionWithNFTs.a = (NFTCollection)LoganSquare.typeConverterFor((Class)NFTCollection.class).parse(qhe);
        }
        else if ("nfts".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final u4i u4i = (u4i)LoganSquare.typeConverterFor((Class)u4i.class).parse(qhe);
                    if (u4i != null) {
                        b.add(u4i);
                    }
                }
                jsonNFTCollectionWithNFTs.b = b;
            }
            else {
                jsonNFTCollectionWithNFTs.b = null;
            }
        }
    }
    
    public JsonNFTCollectionWithNFTs parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTCollectionWithNFTs jsonNFTCollectionWithNFTs, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTCollectionWithNFTs, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTCollectionWithNFTs)o, yfe, b);
    }
}
