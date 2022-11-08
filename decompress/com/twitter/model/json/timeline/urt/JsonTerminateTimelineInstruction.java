// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTerminateTimelineInstruction extends aih<ids>
{
    @JsonField
    public hds a;
    
    @Override
    public final Object s() {
        final hds a = this.a;
        hds e0 = hds.E0;
        if (a != null) {
            e0 = a;
        }
        return new ids(e0);
    }
}
