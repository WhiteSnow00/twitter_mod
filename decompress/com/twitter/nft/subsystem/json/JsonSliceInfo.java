// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSliceInfo extends fih<teq>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public final Object s() {
        return new teq(this.a, this.b);
    }
}
