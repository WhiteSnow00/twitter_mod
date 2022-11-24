// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTCollectionsSlice$$JsonObjectMapper extends JsonMapper<JsonNFTCollectionsSlice>
{
    public static JsonNFTCollectionsSlice _parse(final qhe qhe) throws IOException {
        final JsonNFTCollectionsSlice jsonNFTCollectionsSlice = new JsonNFTCollectionsSlice();
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
            parseField(jsonNFTCollectionsSlice, d, qhe);
            qhe.m0();
        }
        return jsonNFTCollectionsSlice;
    }
    
    public static void _serialize(final JsonNFTCollectionsSlice jsonNFTCollectionsSlice, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNFTCollectionsSlice.b != null) {
            LoganSquare.typeConverterFor((Class)qfq.class).serialize((Object)jsonNFTCollectionsSlice.b, "collections_slice_info", true, yfe);
        }
        final ArrayList a = jsonNFTCollectionsSlice.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "items", a);
            while (e.hasNext()) {
                final t1i t1i = e.next();
                if (t1i != null) {
                    LoganSquare.typeConverterFor((Class)t1i.class).serialize((Object)t1i, "lslocalitemsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTCollectionsSlice jsonNFTCollectionsSlice, final String s, final qhe qhe) throws IOException {
        if ("collections_slice_info".equals(s)) {
            jsonNFTCollectionsSlice.b = (qfq)LoganSquare.typeConverterFor((Class)qfq.class).parse(qhe);
        }
        else if ("items".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final t1i t1i = (t1i)LoganSquare.typeConverterFor((Class)t1i.class).parse(qhe);
                    if (t1i != null) {
                        a.add(t1i);
                    }
                }
                jsonNFTCollectionsSlice.a = a;
            }
            else {
                jsonNFTCollectionsSlice.a = null;
            }
        }
    }
    
    public JsonNFTCollectionsSlice parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTCollectionsSlice jsonNFTCollectionsSlice, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTCollectionsSlice, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTCollectionsSlice)o, yfe, b);
    }
}
