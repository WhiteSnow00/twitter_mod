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

public final class JsonNFTOpenseaNFTMetadata$$JsonObjectMapper extends JsonMapper<JsonNFTOpenseaNFTMetadata>
{
    public static JsonNFTOpenseaNFTMetadata _parse(final qhe qhe) throws IOException {
        final JsonNFTOpenseaNFTMetadata jsonNFTOpenseaNFTMetadata = new JsonNFTOpenseaNFTMetadata();
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
            parseField(jsonNFTOpenseaNFTMetadata, d, qhe);
            qhe.m0();
        }
        return jsonNFTOpenseaNFTMetadata;
    }
    
    public static void _serialize(final JsonNFTOpenseaNFTMetadata jsonNFTOpenseaNFTMetadata, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNFTOpenseaNFTMetadata.h != null) {
            LoganSquare.typeConverterFor((Class)NFTCollection.class).serialize((Object)jsonNFTOpenseaNFTMetadata.h, "collection", true, yfe);
        }
        yfe.u0("creator_address", jsonNFTOpenseaNFTMetadata.e);
        yfe.u0("creator_profile_image_url", jsonNFTOpenseaNFTMetadata.g);
        yfe.u0("creator_username", jsonNFTOpenseaNFTMetadata.f);
        yfe.u0("description", jsonNFTOpenseaNFTMetadata.c);
        yfe.u0("image_url", jsonNFTOpenseaNFTMetadata.d);
        yfe.u0("name", jsonNFTOpenseaNFTMetadata.a);
        yfe.u0("schema", jsonNFTOpenseaNFTMetadata.b);
        final ArrayList i = jsonNFTOpenseaNFTMetadata.i;
        if (i != null) {
            final Iterator e = d10.E(yfe, "traits", i);
            while (e.hasNext()) {
                final aoj aoj = e.next();
                if (aoj != null) {
                    LoganSquare.typeConverterFor((Class)aoj.class).serialize((Object)aoj, "lslocaltraitsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTOpenseaNFTMetadata jsonNFTOpenseaNFTMetadata, final String s, final qhe qhe) throws IOException {
        if ("collection".equals(s)) {
            jsonNFTOpenseaNFTMetadata.h = (NFTCollection)LoganSquare.typeConverterFor((Class)NFTCollection.class).parse(qhe);
        }
        else if ("creator_address".equals(s)) {
            jsonNFTOpenseaNFTMetadata.e = qhe.T((String)null);
        }
        else if ("creator_profile_image_url".equals(s)) {
            jsonNFTOpenseaNFTMetadata.g = qhe.T((String)null);
        }
        else if ("creator_username".equals(s)) {
            jsonNFTOpenseaNFTMetadata.f = qhe.T((String)null);
        }
        else if ("description".equals(s)) {
            jsonNFTOpenseaNFTMetadata.c = qhe.T((String)null);
        }
        else if ("image_url".equals(s)) {
            jsonNFTOpenseaNFTMetadata.d = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonNFTOpenseaNFTMetadata.a = qhe.T((String)null);
        }
        else if ("schema".equals(s)) {
            jsonNFTOpenseaNFTMetadata.b = qhe.T((String)null);
        }
        else if ("traits".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList i = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final aoj aoj = (aoj)LoganSquare.typeConverterFor((Class)aoj.class).parse(qhe);
                    if (aoj != null) {
                        i.add(aoj);
                    }
                }
                jsonNFTOpenseaNFTMetadata.i = i;
            }
            else {
                jsonNFTOpenseaNFTMetadata.i = null;
            }
        }
    }
    
    public JsonNFTOpenseaNFTMetadata parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTOpenseaNFTMetadata jsonNFTOpenseaNFTMetadata, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTOpenseaNFTMetadata, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTOpenseaNFTMetadata)o, yfe, b);
    }
}
