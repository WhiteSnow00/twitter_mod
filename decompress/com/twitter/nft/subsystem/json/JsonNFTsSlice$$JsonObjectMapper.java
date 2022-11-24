// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTsSlice$$JsonObjectMapper extends JsonMapper<JsonNFTsSlice>
{
    public static JsonNFTsSlice _parse(final qhe qhe) throws IOException {
        final JsonNFTsSlice jsonNFTsSlice = new JsonNFTsSlice();
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
            parseField(jsonNFTsSlice, d, qhe);
            qhe.m0();
        }
        return jsonNFTsSlice;
    }
    
    public static void _serialize(final JsonNFTsSlice jsonNFTsSlice, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonNFTsSlice.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "items", a);
            while (e.hasNext()) {
                final u4i u4i = e.next();
                if (u4i != null) {
                    LoganSquare.typeConverterFor((Class)u4i.class).serialize((Object)u4i, "lslocalitemsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (jsonNFTsSlice.b != null) {
            LoganSquare.typeConverterFor((Class)qfq.class).serialize((Object)jsonNFTsSlice.b, "slice_info", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTsSlice jsonNFTsSlice, final String s, final qhe qhe) throws IOException {
        if ("items".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final u4i u4i = (u4i)LoganSquare.typeConverterFor((Class)u4i.class).parse(qhe);
                    if (u4i != null) {
                        a.add(u4i);
                    }
                }
                jsonNFTsSlice.a = a;
            }
            else {
                jsonNFTsSlice.a = null;
            }
        }
        else if ("slice_info".equals(s)) {
            jsonNFTsSlice.b = (qfq)LoganSquare.typeConverterFor((Class)qfq.class).parse(qhe);
        }
    }
    
    public JsonNFTsSlice parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTsSlice jsonNFTsSlice, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTsSlice, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTsSlice)o, yfe, b);
    }
}
