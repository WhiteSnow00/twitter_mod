// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetCompositionNudge extends tih<qfu>
{
    @JsonField
    public o0j$b a;
    
    @Override
    public final Object s() {
        final o0j$b a = this.a;
        Object o;
        if (a == null) {
            o = null;
        }
        else {
            o = new qfu(a);
        }
        return o;
    }
}
