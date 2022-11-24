// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTOwnersSlice$$JsonObjectMapper extends JsonMapper<JsonNFTOwnersSlice>
{
    public static JsonNFTOwnersSlice _parse(final qhe qhe) throws IOException {
        final JsonNFTOwnersSlice jsonNFTOwnersSlice = new JsonNFTOwnersSlice();
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
            parseField(jsonNFTOwnersSlice, d, qhe);
            qhe.m0();
        }
        return jsonNFTOwnersSlice;
    }
    
    public static void _serialize(final JsonNFTOwnersSlice jsonNFTOwnersSlice, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonNFTOwnersSlice.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "items", a);
            while (e.hasNext()) {
                final ziw ziw = e.next();
                if (ziw != null) {
                    LoganSquare.typeConverterFor((Class)ziw.class).serialize((Object)ziw, "lslocalitemsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTOwnersSlice jsonNFTOwnersSlice, final String s, final qhe qhe) throws IOException {
        if ("items".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final ziw ziw = (ziw)LoganSquare.typeConverterFor((Class)ziw.class).parse(qhe);
                    if (ziw != null) {
                        a.add(ziw);
                    }
                }
                jsonNFTOwnersSlice.a = a;
            }
            else {
                jsonNFTOwnersSlice.a = null;
            }
        }
    }
    
    public JsonNFTOwnersSlice parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTOwnersSlice jsonNFTOwnersSlice, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTOwnersSlice, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTOwnersSlice)o, yfe, b);
    }
}
