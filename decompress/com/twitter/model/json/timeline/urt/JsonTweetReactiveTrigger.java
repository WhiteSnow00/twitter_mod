// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetReactiveTrigger extends tih<n0m.b>
{
    @JsonField(typeConverter = pke.class)
    public n0m$b$a a;
    @JsonField
    public s2t b;
    
    @Override
    public final Object s() {
        final s2t b = this.b;
        n0m n0m;
        if (b != null) {
            n0m = new n0m.b(this.a, b);
        }
        else {
            n0m = null;
        }
        return n0m;
    }
}
