// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTerminateTimelineInstruction extends tih<ves>
{
    @JsonField
    public ues a;
    
    @Override
    public final Object s() {
        ues a = this.a;
        final ues h0 = ues.H0;
        if (a == null) {
            a = h0;
        }
        return new ves(a);
    }
}
