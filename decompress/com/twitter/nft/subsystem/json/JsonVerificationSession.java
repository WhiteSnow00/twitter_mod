// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVerificationSession extends tih<rsw>
{
    @JsonField(name = { "token" })
    public String a;
    @JsonField(name = { "message" })
    public String b;
    @JsonField(name = { "bridge_url" })
    public String c;
    
    @Override
    public final Object s() {
        return new rsw(this.a, this.b, this.c);
    }
}
