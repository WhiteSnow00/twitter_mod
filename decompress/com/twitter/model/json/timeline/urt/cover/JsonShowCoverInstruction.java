// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonShowCoverInstruction extends aih<q3q>
{
    @JsonField
    public qnv a;
    @JsonField
    public qzo b;
    
    @Override
    public final Object s() {
        final qnv a = this.a;
        q3q q3q;
        if (a != null) {
            q3q = new q3q(a, this.b);
        }
        else {
            q3q = null;
        }
        return q3q;
    }
}
