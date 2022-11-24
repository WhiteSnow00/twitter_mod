// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonApiAspectRatio extends tih<ne0>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    
    @Override
    public final Object s() {
        return new ne0(this.a, this.b);
    }
}
