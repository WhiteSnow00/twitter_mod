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
public class JsonWeb3Wallets extends fih<ulx>
{
    @JsonField
    public List<Web3Wallet> a;
    
    public final Object s() {
        return new ulx(this.a);
    }
}
