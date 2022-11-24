// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUserReactiveTrigger extends tih<n0m.c>
{
    @JsonField
    public s2t a;
    
    @Override
    public final Object s() {
        final s2t a = this.a;
        n0m n0m;
        if (a != null) {
            n0m = new n0m.c(a);
        }
        else {
            n0m = null;
        }
        return n0m;
    }
}
