// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonDismissBehavior extends aih<snv$b>
{
    @JsonField
    public xwm a;
    
    @Override
    public final Object s() {
        final xwm a = this.a;
        final xwm g0 = xwm.G0;
        xwm xwm = a;
        if (a == null) {
            xwm = g0;
        }
        return new snv$b(xwm);
    }
}
