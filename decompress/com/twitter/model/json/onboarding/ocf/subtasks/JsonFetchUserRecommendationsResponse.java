// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFetchUserRecommendationsResponse extends tih<gxa>
{
    @JsonField
    public nhw a;
    @JsonField
    public boolean b;
    
    @Override
    public final Object s() {
        return new gxa(this.a, this.b);
    }
}
