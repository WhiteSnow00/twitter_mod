// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNFTContractAddressError$$JsonObjectMapper extends JsonMapper<JsonNFTContractAddressError>
{
    public static JsonNFTContractAddressError _parse(final qhe qhe) throws IOException {
        final JsonNFTContractAddressError jsonNFTContractAddressError = new JsonNFTContractAddressError();
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
            parseField(jsonNFTContractAddressError, d, qhe);
            qhe.m0();
        }
        return jsonNFTContractAddressError;
    }
    
    public static void _serialize(final JsonNFTContractAddressError jsonNFTContractAddressError, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonNFTContractAddressError.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNFTContractAddressError jsonNFTContractAddressError, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonNFTContractAddressError.a = qhe.T((String)null);
        }
    }
    
    public JsonNFTContractAddressError parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNFTContractAddressError jsonNFTContractAddressError, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNFTContractAddressError, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNFTContractAddressError)o, yfe, b);
    }
}
