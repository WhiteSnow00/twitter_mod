// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.nft.subsystem.model.Network;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWeb3WalletResponse$$JsonObjectMapper extends JsonMapper<JsonWeb3WalletResponse>
{
    public static JsonWeb3WalletResponse _parse(final qhe qhe) throws IOException {
        final JsonWeb3WalletResponse jsonWeb3WalletResponse = new JsonWeb3WalletResponse();
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
            parseField(jsonWeb3WalletResponse, d, qhe);
            qhe.m0();
        }
        return jsonWeb3WalletResponse;
    }
    
    public static void _serialize(final JsonWeb3WalletResponse jsonWeb3WalletResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("address", jsonWeb3WalletResponse.b);
        if (jsonWeb3WalletResponse.c != null) {
            LoganSquare.typeConverterFor((Class)Network.class).serialize((Object)jsonWeb3WalletResponse.c, "network", true, yfe);
        }
        yfe.u0("nickname", jsonWeb3WalletResponse.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonWeb3WalletResponse jsonWeb3WalletResponse, final String s, final qhe qhe) throws IOException {
        if ("address".equals(s)) {
            jsonWeb3WalletResponse.b = qhe.T((String)null);
        }
        else if ("network".equals(s)) {
            jsonWeb3WalletResponse.c = (Network)LoganSquare.typeConverterFor((Class)Network.class).parse(qhe);
        }
        else if ("nickname".equals(s)) {
            jsonWeb3WalletResponse.a = qhe.T((String)null);
        }
    }
    
    public JsonWeb3WalletResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonWeb3WalletResponse jsonWeb3WalletResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonWeb3WalletResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonWeb3WalletResponse)o, yfe, b);
    }
}
