// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfDataReference extends tih<cdj>
{
    @JsonField
    public ttr a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        Object a = this.a;
        if (a == null) {
            final String b = this.b;
            if (b != null) {
                a = new ilr(b);
            }
            else {
                a = null;
            }
        }
        return a;
    }
}
