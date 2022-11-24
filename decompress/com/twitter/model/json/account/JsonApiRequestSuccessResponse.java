// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonApiRequestSuccessResponse extends tih<jh0>
{
    @JsonField
    public boolean a;
    
    @Override
    public final Object s() {
        return new jh0(this.a);
    }
}
