// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineInterestTopic extends aih<kws>
{
    @JsonField
    public String a;
    @JsonField
    public gxd b;
    @JsonField(typeConverter = vlt.class)
    public int c;
    @JsonField(typeConverter = jlt.class)
    public int d;
    
    @Override
    public final Object s() {
        if (this.b != null) {
            u4c.d().o(this.b);
            this.a = this.b.a;
        }
        kws kws;
        if (pjr.g((CharSequence)this.a)) {
            kws = new kws(this.a, this.c, this.d);
        }
        else {
            kws = null;
        }
        return kws;
    }
}
