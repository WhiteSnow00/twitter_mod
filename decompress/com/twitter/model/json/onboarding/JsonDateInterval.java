// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonDateInterval extends tih<ua8>
{
    @JsonField
    public sa8 a;
    @JsonField
    public sa8 b;
    
    @Override
    public final Object s() {
        final ua8.a a = new ua8.a();
        a.a = this.a;
        a.b = this.b;
        return a.e();
    }
}
