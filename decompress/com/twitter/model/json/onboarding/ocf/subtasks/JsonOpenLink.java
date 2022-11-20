// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenLink extends qhh<omj>
{
    @JsonField
    public ssv a;
    @JsonField
    public String b;
    
    public final n4j t() {
        final omj$a omj$a = new omj$a();
        final ssv a = this.a;
        jee.l((Object)a);
        omj$a.k = a;
        omj$a.l = this.b;
        return (n4j)omj$a;
    }
}
