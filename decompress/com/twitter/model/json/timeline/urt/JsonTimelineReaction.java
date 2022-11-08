// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineReaction extends aih<j1t>
{
    @JsonField
    public k1t a;
    @JsonField
    public Integer b;
    
    public final j1t t() {
        final k1t a = this.a;
        if (a != null) {
            final Integer b = this.b;
            int max;
            if (b == null) {
                max = Integer.MAX_VALUE;
            }
            else {
                max = Math.max(0, b);
            }
            return new j1t(a, max);
        }
        return null;
    }
}
