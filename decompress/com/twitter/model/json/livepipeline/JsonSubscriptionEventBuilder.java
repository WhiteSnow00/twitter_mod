// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSubscriptionEventBuilder extends qhh<nnr>
{
    @JsonField
    public mnr[] a;
    
    public final n4j t() {
        final nnr$a nnr$a = new nnr$a();
        nnr$a.c = this.a;
        return (n4j)nnr$a;
    }
}
