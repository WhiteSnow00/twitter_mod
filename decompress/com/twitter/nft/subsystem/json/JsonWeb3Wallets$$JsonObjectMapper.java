// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.nft.subsystem.model.Web3Wallet;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWeb3Wallets$$JsonObjectMapper extends JsonMapper<JsonWeb3Wallets>
{
    public static JsonWeb3Wallets _parse(final qhe qhe) throws IOException {
        final JsonWeb3Wallets jsonWeb3Wallets = new JsonWeb3Wallets();
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
            parseField(jsonWeb3Wallets, d, qhe);
            qhe.m0();
        }
        return jsonWeb3Wallets;
    }
    
    public static void _serialize(final JsonWeb3Wallets jsonWeb3Wallets, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonWeb3Wallets.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "web3_wallets", a);
            while (e.hasNext()) {
                final Web3Wallet web3Wallet = e.next();
                if (web3Wallet != null) {
                    LoganSquare.typeConverterFor((Class)Web3Wallet.class).serialize((Object)web3Wallet, "lslocalweb3_walletsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonWeb3Wallets jsonWeb3Wallets, final String s, final qhe qhe) throws IOException {
        if ("web3_wallets".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final Web3Wallet web3Wallet = (Web3Wallet)LoganSquare.typeConverterFor((Class)Web3Wallet.class).parse(qhe);
                    if (web3Wallet != null) {
                        a.add(web3Wallet);
                    }
                }
                jsonWeb3Wallets.a = a;
            }
            else {
                jsonWeb3Wallets.a = null;
            }
        }
    }
    
    public JsonWeb3Wallets parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonWeb3Wallets jsonWeb3Wallets, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonWeb3Wallets, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonWeb3Wallets)o, yfe, b);
    }
}
