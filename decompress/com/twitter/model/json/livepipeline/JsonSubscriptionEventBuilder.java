// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSubscriptionEventBuilder extends lhh<umr>
{
    @JsonField
    public tmr[] a;
    
    @Override
    public final h4j t() {
        final umr.a a = new umr.a();
        a.c = this.a;
        return (h4j)a;
    }
}
