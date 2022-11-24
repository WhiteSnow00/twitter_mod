// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.twitter.nft.subsystem.model.Network;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.nft.subsystem.model.NFTSmartContract;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonERC1155 extends tih<NFTSmartContract.ERC1155>
{
    @JsonField(name = { "name" })
    public String a;
    @JsonField(name = { "address" })
    public String b;
    @JsonField(name = { "symbol" })
    public String c;
    @JsonField(name = { "network" })
    public Network d;
    
    @Override
    public final Object s() {
        return new NFTSmartContract.ERC1155(this.a, this.b, this.c, this.d);
    }
}
