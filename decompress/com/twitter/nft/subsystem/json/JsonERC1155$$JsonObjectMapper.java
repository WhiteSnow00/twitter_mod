// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.nft.subsystem.model.Network;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonERC1155$$JsonObjectMapper extends JsonMapper<JsonERC1155>
{
    public static JsonERC1155 _parse(final qhe qhe) throws IOException {
        final JsonERC1155 jsonERC1155 = new JsonERC1155();
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
            parseField(jsonERC1155, d, qhe);
            qhe.m0();
        }
        return jsonERC1155;
    }
    
    public static void _serialize(final JsonERC1155 jsonERC1155, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("address", jsonERC1155.b);
        yfe.u0("name", jsonERC1155.a);
        if (jsonERC1155.d != null) {
            LoganSquare.typeConverterFor((Class)Network.class).serialize((Object)jsonERC1155.d, "network", true, yfe);
        }
        yfe.u0("symbol", jsonERC1155.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonERC1155 jsonERC1155, final String s, final qhe qhe) throws IOException {
        if ("address".equals(s)) {
            jsonERC1155.b = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonERC1155.a = qhe.T((String)null);
        }
        else if ("network".equals(s)) {
            jsonERC1155.d = (Network)LoganSquare.typeConverterFor((Class)Network.class).parse(qhe);
        }
        else if ("symbol".equals(s)) {
            jsonERC1155.c = qhe.T((String)null);
        }
    }
    
    public JsonERC1155 parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonERC1155 jsonERC1155, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonERC1155, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonERC1155)o, yfe, b);
    }
}
