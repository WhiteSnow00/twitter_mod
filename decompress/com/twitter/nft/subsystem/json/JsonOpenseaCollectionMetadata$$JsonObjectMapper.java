// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenseaCollectionMetadata$$JsonObjectMapper extends JsonMapper<JsonOpenseaCollectionMetadata>
{
    public static JsonOpenseaCollectionMetadata _parse(final qhe qhe) throws IOException {
        final JsonOpenseaCollectionMetadata jsonOpenseaCollectionMetadata = new JsonOpenseaCollectionMetadata();
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
            parseField(jsonOpenseaCollectionMetadata, d, qhe);
            qhe.m0();
        }
        return jsonOpenseaCollectionMetadata;
    }
    
    public static void _serialize(final JsonOpenseaCollectionMetadata jsonOpenseaCollectionMetadata, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("banner_image_url", jsonOpenseaCollectionMetadata.a);
        yfe.W("created_date_msec", (long)jsonOpenseaCollectionMetadata.b);
        yfe.u0("description", jsonOpenseaCollectionMetadata.c);
        yfe.e("featured", (boolean)jsonOpenseaCollectionMetadata.d);
        yfe.u0("featured_image_url", jsonOpenseaCollectionMetadata.e);
        yfe.u0("image_url", jsonOpenseaCollectionMetadata.f);
        yfe.u0("name", jsonOpenseaCollectionMetadata.g);
        yfe.u0("slug", jsonOpenseaCollectionMetadata.h);
        yfe.e("verified", (boolean)jsonOpenseaCollectionMetadata.i);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenseaCollectionMetadata jsonOpenseaCollectionMetadata, final String s, final qhe qhe) throws IOException {
        final boolean equals = "banner_image_url".equals(s);
        final Boolean b = null;
        final Boolean b2 = null;
        final Long n = null;
        if (equals) {
            jsonOpenseaCollectionMetadata.a = qhe.T((String)null);
        }
        else if ("created_date_msec".equals(s)) {
            Long value;
            if (qhe.e() == rje.X0) {
                value = n;
            }
            else {
                value = qhe.L();
            }
            jsonOpenseaCollectionMetadata.b = value;
        }
        else if ("description".equals(s)) {
            jsonOpenseaCollectionMetadata.c = qhe.T((String)null);
        }
        else if ("featured".equals(s)) {
            Boolean value2;
            if (qhe.e() == rje.X0) {
                value2 = b;
            }
            else {
                value2 = qhe.l();
            }
            jsonOpenseaCollectionMetadata.d = value2;
        }
        else if ("featured_image_url".equals(s)) {
            jsonOpenseaCollectionMetadata.e = qhe.T((String)null);
        }
        else if ("image_url".equals(s)) {
            jsonOpenseaCollectionMetadata.f = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonOpenseaCollectionMetadata.g = qhe.T((String)null);
        }
        else if ("slug".equals(s)) {
            jsonOpenseaCollectionMetadata.h = qhe.T((String)null);
        }
        else if ("verified".equals(s)) {
            Boolean value3;
            if (qhe.e() == rje.X0) {
                value3 = b2;
            }
            else {
                value3 = qhe.l();
            }
            jsonOpenseaCollectionMetadata.i = value3;
        }
    }
    
    public JsonOpenseaCollectionMetadata parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenseaCollectionMetadata jsonOpenseaCollectionMetadata, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenseaCollectionMetadata, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenseaCollectionMetadata)o, yfe, b);
    }
}
