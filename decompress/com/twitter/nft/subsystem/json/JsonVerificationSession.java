// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVerificationSession extends fih<csw>
{
    @JsonField(name = { "token" })
    public String a;
    @JsonField(name = { "message" })
    public String b;
    @JsonField(name = { "bridge_url" })
    public String c;
    
    public final Object s() {
        return new csw(this.a, this.b, this.c);
    }
}
