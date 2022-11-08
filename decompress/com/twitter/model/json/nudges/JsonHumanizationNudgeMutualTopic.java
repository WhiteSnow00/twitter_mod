// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonHumanizationNudgeMutualTopic extends lhh<jtc>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final h4j t() {
        final jtc$b jtc$b = new jtc$b();
        jtc$b.a = this.a;
        jtc$b.b = this.b;
        return (h4j)jtc$b;
    }
}
