// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.reactions;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetReactionTimelineEntry extends fih<xou>
{
    @JsonField
    public kiw a;
    @JsonField
    public String b;
    
    public final Object s() {
        return new xou(toe.d(this.a), ozl.Companion.a(this.b));
    }
}
