// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreateNudgeResponse extends qhh<i47>
{
    @JsonField
    public yzi a;
    @JsonField
    public yzi b;
    
    public final n4j t() {
        final i47.a a = new i47.a();
        a.a = this.a;
        a.b = this.b;
        return a;
    }
}
