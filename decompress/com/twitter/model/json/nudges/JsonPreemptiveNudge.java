// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPreemptiveNudge extends qhh<duk>
{
    @JsonField(typeConverter = ahe.class)
    public cvk a;
    @JsonField
    public String b;
    
    public final n4j t() {
        final duk$b duk$b = new duk$b();
        duk$b.b = this.a;
        duk$b.a = this.b;
        return (n4j)duk$b;
    }
}
