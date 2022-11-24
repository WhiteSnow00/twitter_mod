// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfImageConfig extends tih<cej>
{
    @JsonField
    public bej a;
    @JsonField(typeConverter = y8d.class)
    public int b;
    
    @Override
    public final Object s() {
        final cej.a a = new cej.a();
        a.a = this.a;
        a.b = this.b;
        return a.e();
    }
}
