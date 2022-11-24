// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTAvatarMetadata$$JsonObjectMapper extends JsonMapper<JsonNFTAvatarMetadata>
{
    public static JsonNFTAvatarMetadata _parse(final qhe qhe) throws IOException {
        final JsonNFTAvatarMetadata jsonNFTAvatarMetadata = new JsonNFTAvatarMetadata();
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
            parseField(jsonNFTAvatarMetadata, d, qhe);
            qhe.m0();
        }
        return jsonNFTAvatarMetadata;
    }
    
    public static void _serialize(final JsonNFTAvatarMetadata jsonNFTAvatarMetadata, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNFTAvatarMetadata.b != null) {
            LoganSquare.typeConverterFor((Class)jmx.class).serialize((Object)jsonNFTAvatarMetadata.b, "collection_metadata", true, yfe);
        }
        if (jsonNFTAvatarMetadata.a != null) {
            LoganSquare.typeConverterFor((Class)u4i.class).serialize((Object)jsonNFTAvatarMetadata.a, "nft", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTAvatarMetadata jsonNFTAvatarMetadata, final String s, final qhe qhe) throws IOException {
        if ("collection_metadata".equals(s)) {
            jsonNFTAvatarMetadata.b = (jmx)LoganSquare.typeConverterFor((Class)jmx.class).parse(qhe);
        }
        else if ("nft".equals(s)) {
            jsonNFTAvatarMetadata.a = (u4i)LoganSquare.typeConverterFor((Class)u4i.class).parse(qhe);
        }
    }
    
    public JsonNFTAvatarMetadata parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTAvatarMetadata jsonNFTAvatarMetadata, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTAvatarMetadata, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTAvatarMetadata)o, yfe, b);
    }
}
