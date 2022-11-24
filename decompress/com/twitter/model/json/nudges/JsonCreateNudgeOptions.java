// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreateNudgeOptions extends nge
{
    @JsonField
    public boolean a;
    @JsonField
    public List<String> b;
    @JsonField
    public boolean c;
}
