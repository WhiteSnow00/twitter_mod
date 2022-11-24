// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.nft.subsystem.model.Network;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonERC721$$JsonObjectMapper extends JsonMapper<JsonERC721>
{
    public static JsonERC721 _parse(final qhe qhe) throws IOException {
        final JsonERC721 jsonERC721 = new JsonERC721();
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
            parseField(jsonERC721, d, qhe);
            qhe.m0();
        }
        return jsonERC721;
    }
    
    public static void _serialize(final JsonERC721 jsonERC721, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("address", jsonERC721.b);
        yfe.u0("name", jsonERC721.a);
        if (jsonERC721.d != null) {
            LoganSquare.typeConverterFor((Class)Network.class).serialize((Object)jsonERC721.d, "network", true, yfe);
        }
        yfe.u0("symbol", jsonERC721.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonERC721 jsonERC721, final String s, final qhe qhe) throws IOException {
        if ("address".equals(s)) {
            jsonERC721.b = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonERC721.a = qhe.T((String)null);
        }
        else if ("network".equals(s)) {
            jsonERC721.d = (Network)LoganSquare.typeConverterFor((Class)Network.class).parse(qhe);
        }
        else if ("symbol".equals(s)) {
            jsonERC721.c = qhe.T((String)null);
        }
    }
    
    public JsonERC721 parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonERC721 jsonERC721, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonERC721, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonERC721)o, yfe, b);
    }
}
