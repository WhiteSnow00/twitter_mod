// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenseaNFTTrait$$JsonObjectMapper extends JsonMapper<JsonOpenseaNFTTrait>
{
    public static JsonOpenseaNFTTrait _parse(final qhe qhe) throws IOException {
        final JsonOpenseaNFTTrait jsonOpenseaNFTTrait = new JsonOpenseaNFTTrait();
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
            parseField(jsonOpenseaNFTTrait, d, qhe);
            qhe.m0();
        }
        return jsonOpenseaNFTTrait;
    }
    
    public static void _serialize(final JsonOpenseaNFTTrait jsonOpenseaNFTTrait, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("display_type", jsonOpenseaNFTTrait.a);
        yfe.u0("trait_type", jsonOpenseaNFTTrait.c);
        yfe.u0("value", jsonOpenseaNFTTrait.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenseaNFTTrait jsonOpenseaNFTTrait, final String s, final qhe qhe) throws IOException {
        if ("display_type".equals(s)) {
            jsonOpenseaNFTTrait.a = qhe.T((String)null);
        }
        else if ("trait_type".equals(s)) {
            jsonOpenseaNFTTrait.c = qhe.T((String)null);
        }
        else if ("value".equals(s)) {
            jsonOpenseaNFTTrait.b = qhe.T((String)null);
        }
    }
    
    public JsonOpenseaNFTTrait parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenseaNFTTrait jsonOpenseaNFTTrait, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenseaNFTTrait, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenseaNFTTrait)o, yfe, b);
    }
}
