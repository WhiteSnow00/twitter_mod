// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.nft.subsystem.model.VerifyWalletResponse$InvalidSignature;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonInvalidSignature extends fih<VerifyWalletResponse$InvalidSignature>
{
    @JsonField
    public String a;
    
    public final Object s() {
        return new VerifyWalletResponse$InvalidSignature(this.a);
    }
}
