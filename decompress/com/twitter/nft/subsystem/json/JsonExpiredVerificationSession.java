// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.nft.subsystem.model.VerifyWalletResponse$ExpiredVerificationSession;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonExpiredVerificationSession extends fih<VerifyWalletResponse$ExpiredVerificationSession>
{
    @JsonField
    public String a;
    
    public final Object s() {
        return new VerifyWalletResponse$ExpiredVerificationSession(this.a);
    }
}
