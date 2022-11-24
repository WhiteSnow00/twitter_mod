// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTimelineQuery extends nge
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public static p2t s(final JsonTimelineQuery jsonTimelineQuery) {
        if (jsonTimelineQuery != null && flr.g((CharSequence)jsonTimelineQuery.a)) {
            return new p2t(jsonTimelineQuery.a, jsonTimelineQuery.b);
        }
        return null;
    }
}
