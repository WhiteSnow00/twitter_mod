// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFeatureSwitchesImpression extends fih<ysa>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public Integer c;
    
    public final Object s() {
        final String a = this.a;
        if (a != null && this.b != null) {
            final Integer c = this.c;
            if (c != null) {
                return new ysa(a, (int)c, this.b);
            }
        }
        return null;
    }
}
