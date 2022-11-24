// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.media.JsonOriginalInfo;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTypeaheadPrimaryImage extends nge
{
    @JsonField
    public JsonOriginalInfo a;
}
