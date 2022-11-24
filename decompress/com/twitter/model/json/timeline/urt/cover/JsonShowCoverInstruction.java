// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonShowCoverInstruction extends tih<e5q>
{
    @JsonField
    public apv a;
    @JsonField
    public b1p b;
    
    @Override
    public final Object s() {
        final apv a = this.a;
        e5q e5q;
        if (a != null) {
            e5q = new e5q(a, this.b);
        }
        else {
            e5q = null;
        }
        return e5q;
    }
}
