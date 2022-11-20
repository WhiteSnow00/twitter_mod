// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenseaNFTTrait extends fih<knj>
{
    @JsonField(name = { "display_type" })
    public String a;
    @JsonField(name = { "value" })
    public String b;
    @JsonField(name = { "trait_type" })
    public String c;
    
    public final Object s() {
        return new knj(this.a, this.c, this.b);
    }
}
