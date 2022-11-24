// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineReaction extends tih<s2t>
{
    @JsonField
    public t2t a;
    @JsonField
    public Integer b;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final s2t t() {
        final t2t a = this.a;
        if (a != null) {
            final Integer b = this.b;
            int max;
            if (b == null) {
                max = Integer.MAX_VALUE;
            }
            else {
                max = Math.max(0, b);
            }
            return new s2t(a, max);
        }
        return null;
    }
}
