// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWeb3NFTCollection$$JsonObjectMapper extends JsonMapper<JsonWeb3NFTCollection>
{
    public static JsonWeb3NFTCollection _parse(final qhe qhe) throws IOException {
        final JsonWeb3NFTCollection collection = new JsonWeb3NFTCollection();
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
    
    public static void _serialize(final JsonWeb3NFTCollection collection, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", collection.a);
        if (collection.d != null) {
            LoganSquare.typeConverterFor((Class)b5i.class).serialize((Object)collection.d, "nft_owners_slice", true, yfe);
        }
        yfe.T("owners_count", (int)collection.b);
        yfe.u0("rest_id", collection.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonWeb3NFTCollection collection, final String s, final qhe qhe) throws IOException {
        final boolean equals = "id".equals(s);
        final Integer n = null;
        if (equals) {
            collection.a = qhe.T((String)null);
        }
        else if ("nft_owners_slice".equals(s)) {
            collection.d = (b5i)LoganSquare.typeConverterFor((Class)b5i.class).parse(qhe);
        }
        else if ("owners_count".equals(s)) {
            Integer value;
            if (qhe.e() == rje.X0) {
                value = n;
            }
            else {
                value = qhe.z();
            }
            collection.b = value;
        }
        else if ("rest_id".equals(s)) {
            collection.c = qhe.T((String)null);
        }
    }
    
    public JsonWeb3NFTCollection parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonWeb3NFTCollection collection, final yfe yfe, final boolean b) throws IOException {
        _serialize(collection, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonWeb3NFTCollection)o, yfe, b);
    }
}
