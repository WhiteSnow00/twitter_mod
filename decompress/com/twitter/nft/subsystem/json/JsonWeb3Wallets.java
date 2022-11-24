// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.nft.subsystem.model.Web3Wallet;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonWeb3Wallets extends tih<kmx>
{
    @JsonField
    public List<Web3Wallet> a;
    
    @Override
    public final Object s() {
        return new kmx(this.a);
    }
}
