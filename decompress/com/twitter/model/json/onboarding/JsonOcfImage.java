// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfImage extends fih<odj>
{
    @JsonField
    public z6d a;
    @JsonField
    public String b;
    
    public final Object s() {
        final odj$a odj$a = new odj$a();
        odj$a.a = this.a;
        odj$a.b = this.b;
        return ((n4j)odj$a).j();
    }
}
