// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTMessageTextAction extends tih<nqv>
{
    @JsonField
    public String a;
    @JsonField
    public iqv b;
    
    @Override
    public final Object s() {
        final String a = this.a;
        Object o;
        if (a == null) {
            mqb.o("JsonURTMessageTextAction has no text");
            o = null;
        }
        else {
            o = new nqv(a, this.b);
        }
        return o;
    }
}
