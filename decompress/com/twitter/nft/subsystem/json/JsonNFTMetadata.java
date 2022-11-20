// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.twitter.nft.subsystem.model.NFTSmartContract;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTMetadata extends fih<b4i>
{
    @JsonField(name = { "token_id" })
    public String a;
    @JsonField(name = { "metadata" })
    public h4i b;
    @JsonField(name = { "smart_contract" })
    public NFTSmartContract c;
    
    public final Object s() {
        return new b4i(this.a, this.b, this.c);
    }
}
