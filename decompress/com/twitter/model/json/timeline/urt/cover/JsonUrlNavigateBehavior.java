// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUrlNavigateBehavior extends tih<cpv.d>
{
    @JsonField
    public c9t a;
    
    @Override
    public final Object s() {
        final c9t a = this.a;
        Object o;
        if (a != null) {
            o = new cpv.d(a);
        }
        else {
            o = null;
        }
        return o;
    }
}
