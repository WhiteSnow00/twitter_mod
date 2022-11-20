// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreatePreemptiveNudgeResponse extends qhh<k47>
{
    @JsonField
    public duk a;
    
    public final n4j t() {
        final k47$a k47$a = new k47$a();
        k47$a.a = this.a;
        return (n4j)k47$a;
    }
}
