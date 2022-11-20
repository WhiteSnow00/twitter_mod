// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSettingVersionDetails extends fih<vnp>
{
    @JsonField(name = { "experiments" })
    public String a;
    @JsonField(name = { "feature_switches" })
    public String b;
    @JsonField(name = { "settings" })
    public String c;
    
    public final Object s() {
        final String a = this.a;
        if (a != null) {
            final String b = this.b;
            if (b != null) {
                return new vnp(a, b, this.c);
            }
        }
        return null;
    }
}
