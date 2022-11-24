// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineInterestTopic extends tih<sxs>
{
    @JsonField
    public String a;
    @JsonField
    public lxd b;
    @JsonField(typeConverter = ent.class)
    public int c;
    @JsonField(typeConverter = smt.class)
    public int d;
    
    @Override
    public final Object s() {
        if (this.b != null) {
            y4c.d().o(this.b);
            this.a = this.b.a;
        }
        sxs sxs;
        if (flr.g((CharSequence)this.a)) {
            sxs = new sxs(this.a, this.c, this.d);
        }
        else {
            sxs = null;
        }
        return sxs;
    }
}
