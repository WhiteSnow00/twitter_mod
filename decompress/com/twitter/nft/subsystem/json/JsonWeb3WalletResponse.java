// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import android.annotation.SuppressLint;
import com.twitter.nft.subsystem.model.Network;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.nft.subsystem.model.Web3Wallet;

@JsonObject
public class JsonWeb3WalletResponse extends fih<Web3Wallet>
{
    @JsonField(name = { "nickname" })
    public String a;
    @JsonField(name = { "address" })
    public String b;
    @SuppressLint({ "NullableEnum" })
    @JsonField(name = { "network" })
    public Network c;
    
    public final Object s() {
        return new Web3Wallet(this.a, this.b, this.c);
    }
}
