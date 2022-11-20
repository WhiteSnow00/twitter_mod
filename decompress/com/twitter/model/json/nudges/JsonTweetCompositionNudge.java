// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetCompositionNudge extends fih<bfu>
{
    @JsonField
    public b0j.b a;
    
    public final Object s() {
        final b0j.b a = this.a;
        Object o;
        if (a == null) {
            o = null;
        }
        else {
            o = new bfu(a);
        }
        return o;
    }
}
