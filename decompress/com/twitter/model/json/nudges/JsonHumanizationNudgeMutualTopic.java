// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonHumanizationNudgeMutualTopic extends qhh<nsc>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public final n4j t() {
        final nsc$b nsc$b = new nsc$b();
        nsc$b.a = this.a;
        nsc$b.b = this.b;
        return (n4j)nsc$b;
    }
}
