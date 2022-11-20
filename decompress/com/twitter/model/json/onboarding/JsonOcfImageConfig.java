// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfImageConfig extends fih<pdj>
{
    @JsonField
    public odj a;
    @JsonField(typeConverter = w7d.class)
    public int b;
    
    public final Object s() {
        final pdj$a pdj$a = new pdj$a();
        pdj$a.a = this.a;
        pdj$a.b = this.b;
        return ((n4j)pdj$a).e();
    }
}
