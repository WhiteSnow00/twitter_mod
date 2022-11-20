// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonDateInterval extends fih<q98>
{
    @JsonField
    public o98 a;
    @JsonField
    public o98 b;
    
    public final Object s() {
        final q98.a a = new q98.a();
        a.a = this.a;
        a.b = this.b;
        return a.e();
    }
}
