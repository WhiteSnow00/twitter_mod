// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.replyvoting;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonReplyVotingPerspective extends nge
{
    @JsonField
    public boolean a;
}
