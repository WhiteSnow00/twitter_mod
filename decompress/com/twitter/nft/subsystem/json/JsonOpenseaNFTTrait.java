// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenseaNFTTrait extends tih<aoj>
{
    @JsonField(name = { "display_type" })
    public String a;
    @JsonField(name = { "value" })
    public String b;
    @JsonField(name = { "trait_type" })
    public String c;
    
    @Override
    public final Object s() {
        return new aoj(this.a, this.c, this.b);
    }
}
