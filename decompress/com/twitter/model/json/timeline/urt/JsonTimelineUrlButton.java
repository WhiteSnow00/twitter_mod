// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineUrlButton extends aih<r7t>
{
    @JsonField
    public String a;
    @JsonField
    public q7t b;
    
    @Override
    public final Object s() {
        r7t r7t;
        if (pjr.g((CharSequence)this.a) && this.b != null) {
            r7t = new r7t(this.a, this.b);
        }
        else {
            r7t = null;
        }
        return r7t;
    }
}
