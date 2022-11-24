// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineUrlButton extends tih<d9t>
{
    @JsonField
    public String a;
    @JsonField
    public c9t b;
    
    @Override
    public final Object s() {
        d9t d9t;
        if (flr.g((CharSequence)this.a) && this.b != null) {
            d9t = new d9t(this.a, this.b);
        }
        else {
            d9t = null;
        }
        return d9t;
    }
}
