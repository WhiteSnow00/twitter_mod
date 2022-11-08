// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.reactions;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetReactionTimelineEntry extends aih<dou>
{
    @JsonField
    public rhw a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        return new dou(ffa.e(this.a), zyl.Companion.a(this.b));
    }
}
