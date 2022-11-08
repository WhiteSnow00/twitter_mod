// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreatePreemptiveNudgeResponse extends lhh<g57>
{
    @JsonField
    public utk a;
    
    @Override
    public final h4j t() {
        final g57.a a = new g57.a();
        a.a = this.a;
        return a;
    }
}
