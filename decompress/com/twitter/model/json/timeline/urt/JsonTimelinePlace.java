// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelinePlace extends aih<kvv>
{
    @JsonField
    public String a;
    
    @Override
    public final Object s() {
        kvv kvv;
        if (pjr.g((CharSequence)this.a)) {
            kvv = new kvv(this.a);
        }
        else {
            kvv = null;
        }
        return kvv;
    }
}
