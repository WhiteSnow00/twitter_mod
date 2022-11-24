// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelinePlace extends tih<qwv>
{
    @JsonField
    public String a;
    
    @Override
    public final Object s() {
        qwv qwv;
        if (flr.g((CharSequence)this.a)) {
            qwv = new qwv(this.a);
        }
        else {
            qwv = null;
        }
        return qwv;
    }
}
