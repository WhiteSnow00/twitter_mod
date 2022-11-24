// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.timeline.wtf.JsonHeaderAvatar;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonHeaderContext extends nge
{
    @JsonField
    public List<JsonHeaderAvatar> a;
}
