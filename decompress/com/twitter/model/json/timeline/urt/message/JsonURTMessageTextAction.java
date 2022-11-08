// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTMessageTextAction extends aih<fpv>
{
    @JsonField
    public String a;
    @JsonField
    public apv b;
    
    @Override
    public final Object s() {
        final String a = this.a;
        Object o;
        if (a == null) {
            xpa.p("JsonURTMessageTextAction has no text");
            o = null;
        }
        else {
            o = new fpv(a, this.b);
        }
        return o;
    }
}
