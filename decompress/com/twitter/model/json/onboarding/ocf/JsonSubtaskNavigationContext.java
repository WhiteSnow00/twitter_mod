// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSubtaskNavigationContext extends tih<vtr>
{
    @JsonField(typeConverter = wtr.class)
    public int a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        final int a = this.a;
        Object o;
        if (a == 0) {
            o = null;
        }
        else {
            o = new vtr(a, this.b);
        }
        return o;
    }
}
