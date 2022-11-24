// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSubscriptionError extends tih<jor>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        return new jor(this.a, this.b, this.c);
    }
}
